package com.vagner.Picpay.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vagner.Picpay.entities.Wallet;

import jakarta.validation.constraints.NotBlank;

public interface WalletRepository extends JpaRepository<Wallet, Long>{

	Optional<Wallet> findByCpfCnpjOrEmail(@NotBlank String cpfCnpj, @NotBlank String email);

}
