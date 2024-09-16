package com.vagner.Picpay.controllers.dto;

import com.vagner.Picpay.entities.Wallet;
import com.vagner.Picpay.entities.WalletType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateWalletDto(@NotBlank String fullName, @NotBlank String cpfCnpj, @NotBlank String email,
		@NotBlank String password, @NotNull WalletType.Enum walletType) {

	public Wallet toWallet() {
		return new Wallet(fullName, cpfCnpj, email, password, walletType.get());
	}

}