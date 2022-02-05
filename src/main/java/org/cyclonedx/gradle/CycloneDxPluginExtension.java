package org.cyclonedx.gradle;

import java.util.Collection;

import java.util.ArrayList;
import org.cyclonedx.CycloneDxSchema;

public class CycloneDxPluginExtension {
    CycloneDxSchema.Version schemaVersion = CycloneDxSchema.Version.VERSION_13;
    Collection<String> includeConfigs = new ArrayList<String>();
    Collection<String> skipConfigs = new ArrayList<String>();
}