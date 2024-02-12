/*
* AMRIT – Accessible Medical Records via Integrated Technology
* Integrated EHR (Electronic Health Records) Solution
*
* Copyright (C) "Piramal Swasthya Management and Research Institute"
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.helpline104.data.snomedct;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import com.google.gson.annotations.Expose;
import com.iemr.helpline104.utils.mapper.OutputMapper;

@Entity
@Table(name = "sct_description")
public class SCTDescription {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	@Column(name = "sctDesID")
	private Long sctDesID; 
	
	/*
	@Expose
	@Column(name = "sctCode")
	private String sctCode; */
	
	@Expose
	@Column(name = "Active")
	private String active;
	
	@Expose
	@Column(name = "ConceptID")
	private String conceptID;
	
	@Expose
	@Column(name = "Term")
	private String term;
	
	@Expose
	@Column(name = "CaseSignificanceID")
	private String caseSignificanceID;	
	

	public SCTDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SCTDescription(String conceptID,String term) {
		super();
		this.conceptID = conceptID;
		this.term = term;
	}

	public String getTerm() {
		return term;
	}

	private void setTerm(String term) {
		this.term = term;
	}
	
	public String getCaseSignificanceID() {
		return caseSignificanceID;
	}

	public void setCaseSignificanceID(String caseSignificanceID) {
		this.caseSignificanceID = caseSignificanceID;
	}
	
	@Transient
	private OutputMapper outputMapper = new OutputMapper();

	@Override
	public String toString()
	{
		return outputMapper.gson().toJson(this);
	}

}
