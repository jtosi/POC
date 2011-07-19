package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.samples.domain.Claim;

@WebService()
public class ValidateClaimService {

	@WebMethod()
	public String validateClaim(Claim claimToValidate)
	{
	    System.out.println("VALIDATING CLAIM: " + claimToValidate.toString());
	    try
	    {
	    	System.out.println("SLEEPING FOR 5 SECONDS");
	    	Thread.sleep(5000);
	    	System.out.println("AWOKEN, RETURNING");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace(System.out);
	    }
	    return "CLAIM VALIDATED";
	}
}
