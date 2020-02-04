/**
 * 
 */
package com.mytraining.custom.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.mytraining.core.model.ManojProductModel;
import com.mytraining.custom.facade.ManojProductFacade;
import com.mytraining.custom.service.ManojProductService;
import com.mytraining.facades.product.data.ManojProductData;

/**
 * @author kumar
 *
 */
public class ManojProductFacadeImpl implements ManojProductFacade
{

	private ManojProductService manojProductService;
	
	private Converter<ManojProductModel, ManojProductData> manojProductConverter;
	/* (non-Javadoc)
	 * @see com.mytraining.custom.facade.ManojProductFacade#getManojProductsData()
	 */
	@Override
	public List<ManojProductData> getManojProductsData()
	{
		List<ManojProductModel> manojProductModels=manojProductService.getManojProducts();
		return manojProductConverter.convertAll(manojProductModels);
	}
	/**
	 * @return the manojProductService
	 */
	public ManojProductService getManojProductService()
	{
		return manojProductService;
	}
	/**
	 * @param manojProductService the manojProductService to set
	 */
	public void setManojProductService(ManojProductService manojProductService)
	{
		this.manojProductService = manojProductService;
	}
	/**
	 * @return the manojProductConverter
	 */
	public Converter<ManojProductModel, ManojProductData> getManojProductConverter()
	{
		return manojProductConverter;
	}
	/**
	 * @param manojProductConverter the manojProductConverter to set
	 */
	public void setManojProductConverter(Converter<ManojProductModel, ManojProductData> manojProductConverter)
	{
		this.manojProductConverter = manojProductConverter;
	}

}
