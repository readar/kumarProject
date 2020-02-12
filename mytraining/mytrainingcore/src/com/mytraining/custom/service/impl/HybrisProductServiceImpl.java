/**
 *
 */
package com.mytraining.custom.service.impl;

import com.mytraining.core.model.HybrisProductModel;
import com.mytraining.custom.dao.HybrisProductDao;
import com.mytraining.custom.service.HybrisProductService;


/**
 * @author m.farooq.ahmed.shaik
 *
 */
public class HybrisProductServiceImpl implements HybrisProductService
{

	private HybrisProductDao hybrisProductDao;

	/**
	 * @return the hybrisProductDao
	 */
	public HybrisProductDao getHybrisProductDao()
	{
		return hybrisProductDao;
	}

	/**
	 * @param hybrisProductDao
	 *           the hybrisProductDao to set
	 */
	public void setHybrisProductDao(final HybrisProductDao hybrisProductDao)
	{
		this.hybrisProductDao = hybrisProductDao;
	}

	@Override
	public HybrisProductModel getHybrisProductById(final String clientId)
	{
		// XXX Auto-generated method stub
		return hybrisProductDao.getHybrisProduct(clientId);
	}

}
