package com.Repo.JPA_DB;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;


@Embeddable
public class TngPropertyAddressPK implements Serializable{

	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name="dmti_uaid", insertable=false, updatable=false)
	private String dmtiUaid;

	@Column(name="dmti_uuaid", insertable=false, updatable=false)
	private String dmtiUuaid;

	public TngPropertyAddressPK() {
	}
	public String getDmtiUaid() {
		return this.dmtiUaid;
	}
	public void setDmtiUaid(String dmtiUaid) {
		System.out.println(dmtiUaid);
		this.dmtiUaid = dmtiUaid;
	}
	public String getDmtiUuaid() {
		return this.dmtiUuaid;
	}
	public void setDmtiUuaid(String dmtiUuaid) {
		this.dmtiUuaid = dmtiUuaid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TngPropertyAddressPK)) {
			return false;
		}
		TngPropertyAddressPK castOther = (TngPropertyAddressPK)other;
		return 
			this.dmtiUaid.equals(castOther.dmtiUaid)
			&& this.dmtiUuaid.equals(castOther.dmtiUuaid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dmtiUaid.hashCode();
		hash = hash * prime + this.dmtiUuaid.hashCode();
		
		return hash;
	}


}
