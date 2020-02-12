/**
 *
 */
package com.mytraining.custom.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.mytraining.core.model.HybrisProductModel;
import com.mytraining.facades.product.data.HybrisProductData;


/**
 * @author m.farooq.ahmed.shaik
 *
 */
public class HybrisProductPopulator implements Populator<HybrisProductModel, HybrisProductData>
{

	@Override
	public void populate(final HybrisProductModel source, final HybrisProductData target) throws ConversionException
	{
		target.setClientId("test");
		target.setClientInfo("test1");
		target.setClientName("name");
		/*
		 * target.setClientType("gold"); target.setRevenue("revenue");
		 */

	}

}
