package com.redhat.dm7.dmn.kieserver.client;

import java.util.List;

import org.kie.dmn.api.core.DMNContext;
import org.kie.dmn.api.core.DMNDecisionResult;
import org.kie.dmn.api.core.DMNResult;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.CredentialsProvider;
import org.kie.server.client.DMNServicesClient;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.credentials.EnteredCredentialsProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainSolution.class);

	private static final String SERVER_URL = "http://rhdm7-install-kieserver-rhdm7-install-developer.127.0.0.1.xip.io/services/rest/server";
	
	private static final String KIE_USER = "kieserver";
	private static final String KIE_PASSWORD = "kieserver1!";
	
	private static final String CONTAINER_ID = "dm7-dmn-demo_0.0.1-SNAPSHOT";
	
	private static final String DMN_MODEL_NAMESPACE = "http://www.trisotech.com/definitions/_bb8b9304-b29f-462e-9f88-03d0d868aec5";
	private static final String DMN_MODEL_NAME = "Insurance Pricing";
	
	public static void main(String[] args) {
		
		CredentialsProvider credentialsProvider = new EnteredCredentialsProvider(KIE_USER, KIE_PASSWORD);
		
		KieServicesConfiguration kieServicesConfig = KieServicesFactory.newRestConfiguration(SERVER_URL, credentialsProvider);
		
		KieServicesClient kieServicesClient = KieServicesFactory.newKieServicesClient(kieServicesConfig);
		
		/*
		 * Create a new DMNServicesClient.
		 */
		//DMNServicesClient dmnServicesClient = ...
		
		
		/*
		 *  Create a DMNContext and set the "Age" and "had previous incidents".
		 *  The "Age" should be set to 23, "had previous incidents" should be set to false.
		 */
		//DMNContext dmnContext = ...
		
		
		/*
		 * Retrieve the DMNResult by evaluating the DMN Model.
		 */
		//ServiceResponse<DMNResult> dmnResultResponse = ... 
		
		
		/*
		 * Retrieve the DMNDecisionResult "Insurance Total Price"
		 */
		//DMNDecisionResult decisionResult = ...
		

		/*
		 * Print the result:
		 */
		
	}
	
}
