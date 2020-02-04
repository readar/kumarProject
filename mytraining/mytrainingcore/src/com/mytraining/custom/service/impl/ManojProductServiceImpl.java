/**
 * 
 */
package com.mytraining.custom.service.impl;

import java.util.List;

import com.mytraining.core.model.ManojProductModel;
import com.mytraining.custom.dao.ManojProductDao;
import com.mytraining.custom.service.ManojProductService;

/**
 * @author kumar
 *
 */
public class ManojProductServiceImpl implements ManojProductService
{

	private ManojProductDao manojProductDao;
	
	/* (non-Javadoc)
	 * @see com.mytraining.custom.service.ManojProductService#getManojProducts()
	 */
	@Override
	public List<ManojProductModel> getManojProducts()
	{		
		return manojProductDao.getManojProducts();
	}

	/**
	 * @return the manojProductDao
	 */
	public ManojProductDao getManojProductDao()
	{
		return manojProductDao;
	}

	/**
	 * @param manojProductDao the manojProductDao to set
	 */
	public void setManojProductDao(ManojProductDao manojProductDao)
	{
		this.manojProductDao = manojProductDao;
	}
	

}
