package com.ninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ninja.model.ExchangeData;
import com.ninja.service.ReportingSPI;

@Service
public class ReportingImpl implements ReportingSPI {

	@Override
	public List<ExchangeData> downloadData() {
		List<ExchangeData> exchangeDataList = new ArrayList<ExchangeData>();
		// TODO Auto-generated method stub
		return exchangeDataList;
	}

}
