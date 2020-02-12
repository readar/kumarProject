/**
 *
 */
package com.mytraining.custom.dao;

import com.mytraining.core.model.HybrisProductModel;


/**
 * @author m.farooq.ahmed.shaik
 *
 */
public interface HybrisProductDao
{

	HybrisProductModel getHybrisProduct(String clientId);
}
