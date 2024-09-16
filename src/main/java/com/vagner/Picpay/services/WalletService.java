package com.vagner.Picpay.services;

import org.springframework.stereotype.Service;

import com.vagner.Picpay.controllers.dto.CreateWalletDto;
import com.vagner.Picpay.entities.Wallet;
import com.vagner.Picpay.repositories.WalletRepository;

@Service
public class WalletService {

	private WalletRepository walletRepository;

	public WalletService(WalletRepository walletRepository) {
		this.walletRepository = walletRepository;
	}
	
	public Wallet createWallet(CreateWalletDto dto) {
		
		return walletRepository.save(dto.toWallet());
	}
	
}
