package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.samples.domain.Claim;

@WebService()
public class RebateCalculation {
	@WebMethod()
	public double calculateRebate(Claim calculateRebateAgainst)
	{
	    System.out.println("CALCULATING REBATE: " + calculateRebateAgainst.toString());
	    return 20.12;
	}
}
