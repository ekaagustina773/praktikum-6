import javax.swing.JOptionPane;

public class DemoJOptionPane1 {

    public static void main(String[] args) {
        String nim="", nama="", tempat="", tgllahir="";

        nim = JOptionPane.showInputDialog("Inputkan Nim Anda : ");
        nama = JOptionPane.showInputDialog("Inputkan Nama Anda : ");
        tempat = JOptionPane.showInputDialog("Inputkan Tempat Lahir Anda : ");
        tgllahir = JOptionPane.showInputDialog("Inputkan tgllahir Anda : ");

        String msg = "Selamat datang " + nama + " ! \nNIM : " + nim + "\nTempat Lahir : "
          + tempat + "\nTanggal Lahir : " + tgllahir;
        JOptionPane.showMessageDialog(null, msg); 
    }
}