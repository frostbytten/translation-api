package org.agmip.api.translate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TranslateApiConfig extends Configuration {
	private static final Logger LOGGER = LoggerFactory.getLogger(TranslateApiConfig.class);

	@NotEmpty
	private String fileStore;

	@JsonProperty
	public String getFileStore() {
		return this.fileStore;
	}

	@JsonProperty
	public void setFileStore(String fileStore) {
		this.fileStore = fileStore;
	}

	public void createFileStore() throws IOException {
		Path p = this.getFileStorePath();
		if (!Files.exists(p)) {
			Files.createDirectories(p);
			LOGGER.info("Created {} for file storage", p.toString());
		}
	}

	public Path getFileStorePath() {
		return Paths.get(this.fileStore).normalize().toAbsolutePath();
	}
	
}
