/**
 * 
 */
package com.mytraining.custom.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.mytraining.core.model.ManojCategoryModel;
import com.mytraining.facades.product.data.ManojCategoryData;

/**
 * @author kumar
 *
 */
public class ManojCategoryPopulator implements Populator<ManojCategoryModel, ManojCategoryData>
{

	/* (non-Javadoc)
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(ManojCategoryModel source, ManojCategoryData target) throws ConversionException
	{
		target.setCategoryCode(String.valueOf(source.getCategoryId()));
		target.setCategoryInfo(source.getCategoryInfo());
		target.setCategoryName(source.getCategoryName());
	}

}
