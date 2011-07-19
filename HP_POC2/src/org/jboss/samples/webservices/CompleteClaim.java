package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.samples.domain.Claim;

@WebService()
public class CompleteClaim {
	@WebMethod()
	public String completeClaim(Claim claimToValidate)
	{
	    System.out.println("COMPLETING CLAIM: " + claimToValidate.toString());
	    return "COMPLETION CODE";
	}
}
