import java.awt.*;
import java.awt.event.*;

public class Menu extends Frame implements ActionListener{
  String msg=" ";
  Button list[]=new Button[5];
  public Menu(){


    Button changeMacAddress=new Button("Change Mac Address");
    Button networkScanner=new Button("Network Scanner");
    Button packetSniffer =new Button("Packet Sniffer");
    Button fileInterceptor =new Button("File Interceptor");
    Button vulnerabilityScanner =new Button("Vulnerability Scanner");


    list[0]=(Button)add(changeMacAddress);
    list[1]=(Button)add(networkScanner);
    list[2]=(Button)add(packetSniffer);
    list[3]=(Button)add(fileInterceptor);
    list[4]=(Button)add(vulnerabilityScanner);

    for(int i=0;i<5;i++){
      list[i].addActionListener(this);
    }

    addWindowListener(new MyWindowAdaptor());



  }

  public static void main(String args[]){
    Menu aa=new Menu();
    aa.setSize(new Dimension(250,150));
    aa.setVisible(true);
    aa.setTitle("Net-Mon");
  }
}

class MyWindowAdaptor extends WindowAdaptor{
  public void windowClosing(WindowEvent we){
    System.exit(0);
  }
}
