package com.MartinK07;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class CommandAlarmCallbackMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "com.MartinK07.graylog-plugin-command-alarmcallback/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "com.MartinK07.CommandAlarmCallbackPlugin";
    }

    @Override
    public String getName() {
        return "CommandAlarmCallback";
    }

    @Override
    public String getAuthor() {
        return "Martin Kaufmann <martinkaufmann@tuta.io>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/MartinK07/graylog-plugin-command-alarmcallback");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public String getDescription() {
        // TODO Insert correct plugin description
        return "Description of CommandAlarmCallback plugin";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
