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
public class HybrisProductPopulatorSecond implements Populator<HybrisProductModel, HybrisProductData>
{

	@Override
	public void populate(final HybrisProductModel source, final HybrisProductData target) throws ConversionException
	{


		target.setClientType("gold");
		target.setRevenue("revenue");

	}

}
