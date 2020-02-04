/**
 * 
 */
package com.training.custom.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import javax.management.Query;

import com.mytraining.core.model.ManojProductModel;
import com.mytraining.custom.dao.ManojProductDao;

/**
 * @author kumar
 *
 */
public class ManojProductDaoImpl implements ManojProductDao
{

	private FlexibleSearchService flexibleSearchService;
	/* (non-Javadoc)
	 * @see com.mytraining.custom.dao.ManojProductDao#getManojProducts()
	 */
	@Override
	public List<ManojProductModel> getManojProducts()
	{
		FlexibleSearchQuery query=new FlexibleSearchQuery("select {pk} from {ManojProduct}");
		SearchResult<ManojProductModel> searchResult=flexibleSearchService.search(query);
		return searchResult.getResult();
	}
	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}
	/**
	 * @param flexibleSearchService the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

}
