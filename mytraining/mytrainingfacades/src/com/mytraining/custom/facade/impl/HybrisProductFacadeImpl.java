/**
 *
 */
package com.mytraining.custom.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.mytraining.core.model.HybrisProductModel;
import com.mytraining.custom.facade.HybrisProductFacade;
import com.mytraining.custom.service.HybrisProductService;
import com.mytraining.facades.product.data.HybrisProductData;


/**
 * @author m.farooq.ahmed.shaik
 *
 */
public class HybrisProductFacadeImpl implements HybrisProductFacade
{

	private HybrisProductService HybrisProductService;
	private Converter<HybrisProductModel, HybrisProductData> hybrisProductConverter;

	/**
	 * @return the hybrisProductService
	 */
	public HybrisProductService getHybrisProductService()
	{
		return HybrisProductService;
	}


	/**
	 * @param hybrisProductService
	 *           the hybrisProductService to set
	 */
	public void setHybrisProductService(final HybrisProductService hybrisProductService)
	{
		HybrisProductService = hybrisProductService;
	}


	/**
	 * @return the hybrisProductConverter
	 */
	public Converter<HybrisProductModel, HybrisProductData> getHybrisProductConverter()
	{
		return hybrisProductConverter;
	}


	/**
	 * @param hybrisProductConverter
	 *           the hybrisProductConverter to set
	 */
	public void setHybrisProductConverter(final Converter<HybrisProductModel, HybrisProductData> hybrisProductConverter)
	{
		this.hybrisProductConverter = hybrisProductConverter;
	}





	@Override
	public HybrisProductData getHybrisProductById(final String clientId)
	{

		final HybrisProductModel hybrisModel = HybrisProductService.getHybrisProductById(clientId);
		final HybrisProductData hybrisData = hybrisProductConverter.convert(hybrisModel);
		return hybrisData;
	}

}
