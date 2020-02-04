/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.mytraining.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.mytraining.core.constants.MytrainingCoreConstants;
import com.mytraining.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class MytrainingCoreManager extends GeneratedMytrainingCoreManager
{
	public static final MytrainingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MytrainingCoreManager) em.getExtension(MytrainingCoreConstants.EXTENSIONNAME);
	}
}
