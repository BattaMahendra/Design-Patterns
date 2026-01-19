package Design.Patterns.structural.proxy.practice;

import java.util.Arrays;
import java.util.List;

class ProxyInternet implements Internet {

    private Internet realInternet = new RealInternet();

    // example of blocked sites
    private static final List<String> BLOCKED_SITES = 
        Arrays.asList("facebook.com", "instagram.com");

    @Override
    public void connectTo(String host) {
        if (BLOCKED_SITES.contains(host.toLowerCase())) {
            System.out.println("Access denied to " + host);
        } else {
            realInternet.connectTo(host);
        }
    }
}
