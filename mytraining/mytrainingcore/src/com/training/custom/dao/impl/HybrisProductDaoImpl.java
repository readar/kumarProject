/**
 *
 */
package com.training.custom.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.apache.commons.collections.CollectionUtils;

import com.mytraining.core.model.HybrisProductModel;
import com.mytraining.custom.dao.HybrisProductDao;


/**
 * @author m.farooq.ahmed.shaik
 *
 */
public class HybrisProductDaoImpl implements HybrisProductDao
{

	private FlexibleSearchService flexibleSearchService;

	@Override
	public HybrisProductModel getHybrisProduct(final String clientId)
	{
		final String query = "SELECT {pk} , {clientId}from {HybrisProduct} where {clientId} =?clientId";
		final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
		searchQuery.addQueryParameter(clientId, clientId);

		final SearchResult<HybrisProductModel> result = getFlexibleSearchService().search(query);
		//return result.getResult().get(0);
		if (result != null)
		{
			return result.getResult().get(0);

		}
		return (HybrisProductModel) CollectionUtils.EMPTY_COLLECTION;

	}

	/**
	 * @return
	 */
	private FlexibleSearchService getFlexibleSearchService()
	{

		return flexibleSearchService;
	}

}
