package org.agmip.api.translate.api;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Capabilities {
	private List<String> inputs;
	private List<String> outputs;

	public Capabilities() {
		this.inputs = new ArrayList<String>();
		this.outputs = new ArrayList<String>();

		// Hardcoded for now, will use a different mechanism to dynamically load these.
		this.inputs.add("aceb");
		this.outputs.add("dssat");
	}

	@JsonProperty
	public List<String> getInputs() {
		return this.inputs;
	}

	@JsonProperty
	public List<String> getOutputs() {
		return this.outputs;
	}
}
