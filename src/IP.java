import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class IP {

	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		URL url = new URL("https://mail.google.com/mail/u/0/#inbox");
		InetAddress inet = InetAddress.getByName(url.getHost());
		
		
System.out.println(inet.getAddress());
System.out.println(inet.getCanonicalHostName());
System.out.println(inet.getHostAddress());
	}

}
