package com.greta.shares.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greta.shares.entity.Shares;
import com.greta.shares.persistence.SharesDao;

@Service
public class SharesServiceImpl implements SharesService {

	@Autowired
	private SharesDao sharesDao;
	
	@Override
	public Shares searchSharesById(int id) {
		return sharesDao.findById(id).orElse(null);
	}

}