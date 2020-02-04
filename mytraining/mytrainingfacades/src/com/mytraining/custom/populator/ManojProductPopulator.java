/**
 * 
 */
package com.mytraining.custom.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.core.convert.converter.Converter;

import com.mytraining.core.model.ManojCategoryModel;
import com.mytraining.core.model.ManojProductModel;
import com.mytraining.facades.product.data.ManojCategoryData;
import com.mytraining.facades.product.data.ManojProductData;

/**
 * @author kumar
 *
 */
public class ManojProductPopulator implements Populator<ManojProductModel, ManojProductData>
{

	private Converter<ManojCategoryModel, ManojCategoryData> manojCategoryConverter;
	
	/* (non-Javadoc)
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(ManojProductModel source, ManojProductData target) throws ConversionException
	{
		target.setProductId(String.valueOf(source.getProductId()));
		target.setProductName(source.getProductName());
		target.setProductInfo(source.getProductInfo());
		target.setProductPrice(source.getProductPrice());
		target.setManojCategoryData(manojCategoryConverter.convert(source.getManojCategory()));
	}

	/**
	 * @return the manojCategoryConverter
	 */
	public Converter<ManojCategoryModel, ManojCategoryData> getManojCategoryConverter()
	{
		return manojCategoryConverter;
	}

	/**
	 * @param manojCategoryConverter the manojCategoryConverter to set
	 */
	public void setManojCategoryConverter(Converter<ManojCategoryModel, ManojCategoryData> manojCategoryConverter)
	{
		this.manojCategoryConverter = manojCategoryConverter;
	}

}
