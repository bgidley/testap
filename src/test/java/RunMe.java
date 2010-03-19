import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * Created by IntelliJ IDEA. User: ben Date: Jan 25, 2010 Time: 3:12:33 PM
 */
public class RunMe {
	public static void main(String[] args) throws Exception {
        Server server = new Server();
        Connector connector = new SelectChannelConnector();
        connector.setHeaderBufferSize(16192);
        connector.setPort(Integer.getInteger("jetty.port", 8080));

        String jetty_home = System.getProperty("jetty.home", "./");

        server.setConnectors(new Connector[]{connector});

        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar(jetty_home + "src/main/webapp");

        webapp.setServerClasses(new String[]{"-org.mortbay.jetty.plus.jaas.",
                "org.mortbay.jetty."});

        server.setHandler(webapp);

        server.start();
        server.join();
    }

}
