package com.vagner.Picpay.services;

import org.springframework.stereotype.Service;

import com.vagner.Picpay.controllers.dto.CreateWalletDto;
import com.vagner.Picpay.entities.Wallet;
import com.vagner.Picpay.exceptions.WalletDataAlreadyExistsException;
import com.vagner.Picpay.repositories.WalletRepository;

@Service
public class WalletService {

	private WalletRepository walletRepository;

	public WalletService(WalletRepository walletRepository) {
		this.walletRepository = walletRepository;
	}
	
	public Wallet createWallet(CreateWalletDto dto) {
		
		var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(),dto.email());
		
		if(walletDb.isPresent()) {
			throw new WalletDataAlreadyExistsException("CpfCnpj or Email already exists");
		}
		
		return walletRepository.save(dto.toWallet());
	}
	
}
