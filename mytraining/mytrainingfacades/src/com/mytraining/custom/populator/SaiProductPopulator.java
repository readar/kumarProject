/**
 * 
 */
package com.mytraining.custom.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.mytraining.facades.product.data.SaiProductData;

/**
 * @author kumar
 *
 */
public class SaiProductPopulator implements Populator<ProductModel, SaiProductData>
{

	/* (non-Javadoc)
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(ProductModel source, SaiProductData target) throws ConversionException
	{
		target.setShortDescription(source.getProductShortInfo());
		target.setProdPrice(Double.valueOf(source.getProductPrice()));
	}

}
