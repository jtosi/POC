package org.jboss.samples.domain;

import java.util.List;

public class ClaimItem
{
	private long claimItemId;
	private String productNumber;
	private int quantity;
	private double rebateAmount;
	private List<Validation> validationResults;
	public long getClaimItemId() {
		return claimItemId;
	}
	public void setClaimItemId(long claimItemId) {
		this.claimItemId = claimItemId;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getRebateAmount() {
		return rebateAmount;
	}
	public void setRebateAmount(double rebateAmount) {
		this.rebateAmount = rebateAmount;
	}
	public List<Validation> getValidationResults() {
		return validationResults;
	}
	public void setValidationResults(List<Validation> validationResults) {
		this.validationResults = validationResults;
	}
}
