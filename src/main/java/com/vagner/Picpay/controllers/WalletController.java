package com.vagner.Picpay.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vagner.Picpay.entities.Wallet;
import com.vagner.Picpay.services.WalletService;

@RestController
public class WalletController {

	private WalletService walletService;

	public WalletController(WalletService walletService) {
		this.walletService = walletService;
	} 
	
	@PostMapping ("/wallets")
	public ResponseEntity<Wallet> createWallet(@RequestBody Wallet wallet){
		var newWallet = walletService.createWallet(wallet);
		return ResponseEntity.ok(newWallet);
	}
	
}
