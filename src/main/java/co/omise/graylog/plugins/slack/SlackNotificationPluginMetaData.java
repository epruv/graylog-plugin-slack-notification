package co.omise.graylog.plugins.slack;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

public class SlackNotificationPluginMetaData implements PluginMetaData {
	private static final String PLUGIN_PROPERTIES = "co.omise.graylog.plugins.slack/graylog-plugin.properties";

	@Override
	public String getUniqueId() {
		return SlackNotificationPlugin.class.getCanonicalName();
	}

	@Override
	public String getName() {
		return "Slack Notification Plugin";
	}

	@Override
	public String getAuthor() {
		return "Omise";
	}

	@Override
	public URI getURL() {
		return URI.create("https://github.com/omise/graylog-plugin-slack-notification");
	}

	@Override
	public Version getVersion() {
		return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(3, 1, 0, ""));
	}

	@Override
	public String getDescription() {
		return "Slack plugin to forward messages or write alarms to Slack chat rooms.";
	}

	@Override
	public Version getRequiredVersion() {
		return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(3, 1, 0, ""));
	}

	@Override
	public Set<ServerStatus.Capability> getRequiredCapabilities() {
		return Collections.emptySet();
	}
}