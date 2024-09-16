package com.vagner.Picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vagner.Picpay.entities.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long>{

}
