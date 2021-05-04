    import java.net.InetAddress;
    import java.net.UnknownHostException;
    import java.util.Scanner;
    import javax.naming.directory.Attributes;
    import javax.naming.directory.InitialDirContext;
    import javax.naming.NamingEnumeration;
    import javax.naming.NamingException;
    public class DNSLookup
    {
      public static void main(String args[]) {
          InetAddress inetAddress;
          Scanner sc = new Scanner(System.in);
          System.out.print("Masukkan Domain: ");
          String domain = sc.nextLine();
          try {
            if (Character.isDigit(domain.charAt(0))) {
              byte[] b = new byte[4];
              String[] bytes = domain.split("[.]");
              for (int i = 0; i < bytes.length; i++) {
                b[i] = new Integer(bytes[i]).byteValue();
              }
              inetAddress = InetAddress.getByAddress(b);
            } else {
              inetAddress = InetAddress.getByName(domain);
            }
            System.out.println("===============================");
            System.out.println(inetAddress.getHostName() + "/" + inetAddress.getHostAddress());
            InitialDirContext iDirC = new InitialDirContext();
            Attributes attributes = iDirC.getAttributes("dns:/" + inetAddress.getHostName());
            NamingEnumeration attributeEnumeration = attributes.getAll();
            System.out.println("\nInformasi DNS:");
            while (attributeEnumeration.hasMore()) {
              System.out.println("\n" + attributeEnumeration.next());
            }
            
            attributeEnumeration.close();
        }
        catch (UnknownHostException exception) {
          System.err.println("error: Domain tidak diketahui '" + domain + "'");
        }
        catch (NamingException exception) {
          System.err.println("error: Tidak ada Record DNS di Domain '" + domain + "'");
        }
      }
    }
