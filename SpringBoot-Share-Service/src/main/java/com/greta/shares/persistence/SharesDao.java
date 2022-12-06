package com.greta.shares.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greta.shares.entity.Shares;

@Repository
public interface SharesDao extends JpaRepository<Shares, Integer> {

}