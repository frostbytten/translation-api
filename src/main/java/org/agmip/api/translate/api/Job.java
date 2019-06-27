package org.agmip.api.translate.api;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Job {
	private final String id;	
	private JobStatus status;

	public Job() {
		this.id = UUID.randomUUID().toString();
		this.status = JobStatus.PENDING;
	}

	@JsonCreator
	public Job(String id) {
		this.id = id;
	}

	@JsonProperty
	public String getId() {
		return this.id;
	}
}
