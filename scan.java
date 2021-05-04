import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
 
/**
 *
 * @author Theo
 */
public class scan {
    public static void main(String[] hx) throws UnknownHostException{
        String[][] port = new String[][] {
            {"21","FTP Server"},
            {"22","SSH Secure Shell"},
            {"23","Telnet"},
            {"25","SMTP(Simple Mail Transport Protokol)"},
            {"80","Web Server"},
            {"81","Web Server Alternatif"},
            {"110","POP Server"},
            {"111","Portmap"},
            {"119","News (NNTP) Server"},
            {"143","IMAP4 Server"},
            {"389","LDAP Server"},
            {"443","HTTP Secure Sockets Layer (SSL) Server"},
            {"445","SMB over IP, File Sharing"},
            {"1503","Microsoft NetMeeting and VOIP"},
            {"1720","Microsoft NetMeeting and VOIP"},
            {"2525","SMTP (Alternate Server)"},
            {"3306","Mysql Database"},
            {"3389","Remote Desktop"},
            {"5631","PCAnywhere"},
            {"5432","Postgre Database"},
            {"5900","Virtual Network Computing (VNC)"}
        };
 
  if(hx.length>0){
   ipcheck(hx,port);
  }
 
  //atau dengan inisialisasi sendiri
  //String ip[] = {"173.194.38.165","google.com","192.168.44.3","192.168.44.4"};
  //ipcheck(ip,port);
    }
 
    // IP Scan
    static void ipcheck(String[] ip,String[][] port) throws UnknownHostException{
        for(int a=0; a<ip.length; a++){
   if(!isIPv4(ip[a]).equals("nop")){
    System.out.print("IP "+ip[a]);
    InetAddress tar = InetAddress.getByName(ip[a]);
    try{
     if(tar.isReachable(3000)){
      System.out.println(" [Active].");
      System.out.println("==================");
      portcheck(tar,port);
     }else{
      System.out.println(" -down-.");
      System.out.println("==================");
     }
    }catch(Exception e){}
   }else{
    System.out.println(ip[a]+" <== Invalid IP Address.");
   }
   System.out.println();
        }
    }
 
    // Port Scan
    static void portcheck(InetAddress ip,String[][] port){
        for(int a=0; a<port.length; a++){
            try{
                Socket sock = new Socket(ip,Integer.valueOf(port[a][0]));
                if(sock.isConnected()){
                    System.out.println("Port "+port[a][0]+" [OPEN]"+" ("+port[a][1]+")");
                }
            }catch(Exception sd){
                System.out.println("Port "+port[a][0]+" -closed-");
            }
        }
    }
 
    // untuk validasi IP Address versi 4
    static String isIPv4(String ip) throws UnknownHostException{
        String[] place = ip.split("\\.");
        if(place.length != 4){
   try{
    ip = String.valueOf(InetAddress.getByName(ip));
    place = ip.split("/");
    ip = place[1];
    place = place[1].split("\\.");
    if(place.length != 4) return "nop";
   }catch(Exception asd){
    return "nop";
   }
  }
 
        for (int d=0; d<place.length; d++) {
   int i;
   try{
    i = Integer.parseInt(place[d]);
   }catch(Exception s){
    return "nop";
   }
   if ((i < 0) || (i > 255)) return "nop";
        }
        return ip;
    }
}
