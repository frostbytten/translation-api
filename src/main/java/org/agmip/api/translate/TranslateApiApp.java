package org.agmip.api.translate;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.agmip.api.translate.resources.CapabilitiesResource;

public class TranslateApiApp extends Application<TranslateApiConfig>{
	private static final Logger LOGGER = LoggerFactory.getLogger(TranslateApiApp.class);

	public static void main(String[] args) throws Exception {
		new TranslateApiApp().run(args);
	}

	@Override
	public String getName() {
		return "agmip-translation-api";
	}

	@Override
	public void initialize(Bootstrap<TranslateApiConfig> bootstrap) {}

	@Override
	public void run(TranslateApiConfig config, Environment env) throws Exception {
		LOGGER.info("Checking for valid fileStore: {}", config.getFileStorePath().toString());
		config.createFileStore();
		env.jersey().register(new CapabilitiesResource());
	}
}
