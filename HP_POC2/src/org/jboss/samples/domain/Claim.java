package org.jboss.samples.domain;

import java.util.Date;
import java.util.List;

public class Claim
{
	private long claimID;
	private Date claimDate;
	private String partnerInfo;
	private List <ClaimItem> claimItems;
	
	public long getClaimID() {
		return claimID;
	}
	public void setClaimID(long claimID) {
		this.claimID = claimID;
	}
	public Date getClaimDate() {
		return claimDate;
	}
	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}
	public String getPartnerInfo() {
		return partnerInfo;
	}
	public void setPartnerInfo(String partnerInfo) {
		this.partnerInfo = partnerInfo;
	}
	public List<ClaimItem> getClaimItems() {
		return claimItems;
	}
	public void setClaimItems(List<ClaimItem> claimItems) {
		this.claimItems = claimItems;
	}
	public String toString()
	{
		return "claimId: " + claimID + " claimDate: " + claimDate;
	}
}
