/**
 * 
 */
package com.mytraining.custom.populator;

import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

/**
 * @author kumar
 *
 */
public class CustomProductPopulator extends ProductPopulator
{

	/* (non-Javadoc)
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(ProductModel source, ProductData target) throws ConversionException
	{
		super.populate(source, target);
		target.setProductShortInfo(source.getProductShortInfo());	
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setFullName(source.getFullName());
	}

}
