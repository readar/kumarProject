/**
 *
 */
package com.mytraining.custom.facade;

import com.mytraining.facades.product.data.HybrisProductData;


/**
 * @author m.farooq.ahmed.shaik
 *
 */
public interface HybrisProductFacade
{
	HybrisProductData getHybrisProductById(final String clientId);
}
