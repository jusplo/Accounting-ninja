package pl.sdacademy.course.AccountingNinja;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cost implements Serializable {

	private static final long serialVersionUID = 1L;
	private int date;
	private String description;
	private BigDecimal cost;
	private double VAT;
	private String type;

	public Cost(int date, String description, BigDecimal cost, double VAT, String type) {
		this.date = date;
		this.description = description;
		this.cost = cost;
		this.VAT = VAT;
		this.type = type;

	}

	public Cost() {
	}

	public int getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public double getVAT() {
		return VAT;
	}

	public String getType() {
		return type;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public void setVAT(double vAT) {
		VAT = vAT;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Cost [date=" + date + ", description=" + description + ", cost=" + cost + ", VAT=" + VAT + ", type="
				+ type + "]";
	}

}
