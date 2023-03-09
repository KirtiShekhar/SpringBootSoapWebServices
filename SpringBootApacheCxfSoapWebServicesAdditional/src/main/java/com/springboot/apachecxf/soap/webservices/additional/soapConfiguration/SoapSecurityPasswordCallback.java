package com.springboot.apachecxf.soap.webservices.additional.soapConfiguration;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class SoapSecurityPasswordCallback implements CallbackHandler 
{
	private Map<String,String> userPasswords = new HashMap<>();
	
	public SoapSecurityPasswordCallback()
	{
		userPasswords.put("kirti", "Kirti@31");
		userPasswords.put("admin", "admin");
		userPasswords.put("soapCxf", "soapWsdlCxf");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException 
	{
		for(Callback passwordCallback:callbacks)
		{
			WSPasswordCallback wsPasswordCallback = (WSPasswordCallback) passwordCallback;
			String userPwd = userPasswords.get(wsPasswordCallback.getIdentifier());
			if(userPwd != null)
			{
				wsPasswordCallback.setPassword(userPwd);
				return;
			}
		}
	}
}
