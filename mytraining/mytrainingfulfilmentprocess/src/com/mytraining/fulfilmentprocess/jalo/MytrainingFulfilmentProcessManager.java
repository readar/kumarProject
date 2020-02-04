/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.mytraining.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.mytraining.fulfilmentprocess.constants.MytrainingFulfilmentProcessConstants;

public class MytrainingFulfilmentProcessManager extends GeneratedMytrainingFulfilmentProcessManager
{
	public static final MytrainingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MytrainingFulfilmentProcessManager) em.getExtension(MytrainingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
