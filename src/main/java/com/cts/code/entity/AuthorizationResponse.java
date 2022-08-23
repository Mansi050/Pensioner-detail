package com.cts.code.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class AuthorizationResponse {
		@Id
		@JsonProperty
	    private boolean validStatus;
	}

