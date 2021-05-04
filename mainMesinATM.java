import java.util.Scanner;

public class mainMesinATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        mesinATM user[] = new mesinATM[3];
        user[0] = new mesinATM("654651621651","lionelmessi", "100592");
        user[1] = new mesinATM("665465421651","delldelldell", "120697");
        user[2] = new mesinATM("321656516516","claudiofcb", "362514");
        int pilihan;
        do {
System.out.println("===============================================");
            System.out.println("*********");
            System.out.println("** ATM **");
            System.out.println("*********");
            System.out.print("Masukkan id  : ");
            String nmr = in.next();
            System.out.print("Masukkan pin : ");
            String pass = in.next();
            System.out.print("Masukkan rekening : ");
            String rek = in.next();
System.out.println("===============================================");
            mesinATM userX = new mesinATM(rek, nmr, pass);
            for (int i = 0; i < user.length; i++) {
                if (user[i].noRekening.equals(userX.noRekening)) {
                    userX = user[i];
                }
            }
            boolean check = userX.loginCheck();
            if (check == false) {
                break;
            }
            do {
System.out.println("===============================================");
                System.out.println("1. Info Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Transfer");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu : ");
                pilihan = in.nextInt();
                switch (pilihan) {
                    case 1: {
                        userX.lihatSaldo();
                        System.out.println("");
                        break;
                    }
                    case 2: {
                        userX.tarikUang();
                        System.out.println("");
                        break;
                    }
                    case 3: {
                        System.out.print("Masukkan nomor rekening yang dituju : ");
                        String nomor = in.next();
                        for (int j = 0; j < user.length; j++) {
                                userX.transferUang(user[j]);
                                System.out.println("");
                                break;
                        }
                    }
                }
            } while (pilihan != 4);
        } while (pilihan != 0);
    }
}

class mesinATM {
    public String nama;
    public String[] id = new String[3];
	public String[] noRekening = new String[3];
    private long saldo;
    private String[] pin = new String[3];
    public mesinATM() {
    }
    public mesinATM(String rekening, String idPengguna, String pass) {
        id[0] = "lionelmessi";
        pin[0] = "100592";
        noRekening[0] = "654651621651";
        id[1] = "delldelldell";
        pin[1] = "120697";
        noRekening[1] = "665465421651";
        id[2] = "claudiofcb";
        pin[2] = "362514";
        noRekening[2] = "321656516516";
        for (int i = 0; i < id.length; i++) {
            if (idPengguna.equalsIgnoreCase(id[i]) && pass.equals(pin[i]) && rekening.equals(noRekening[i])) {
                if (i == 0) {
                    nama = "Lionel Messi";
                    saldo = 400000000;
                } else if (i == 1) {
                    nama = "Dell Dell Dell";
                    saldo = 3000000;
                    saldo = 1250000;
                } else if (i == 2) {
                    nama = "Claudio Bravo";
                    saldo = 25690000;
                }
            }
        }
    }
    public long getSaldo(long saldo){
    this.saldo = saldo;
    return this.saldo;
    }
    public boolean loginCheck() {
        if (nama != null) {
            System.out.println("Login berhasil!");
            System.out.println("Selamat datang " + nama);
            return true;
        } else {
            System.out.println("Nomor Rekening atau Password salah!");
            return false;
        }
    }
    public void lihatSaldo() {
        System.out.println("Saldo anda Rp " + saldo);
    }
    public void tarikUang() {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Rp  50.000     4. Rp  500.000");
        System.out.println("2. Rp 100.000     5. Rp 1.000.000");
        System.out.println("3. Rp 200.000     6. Rp 2.000.000");
        System.out.print("Masukkan pilihan: ");
        byte pil = in.nextByte();
        this.setNominal(pil);
    }
    public void transferUang(mesinATM A) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang akan ditransfer : Rp ");
        long uang = in.nextInt();
        System.out.println("Anda telah mentransfer uang sebesar Rp " + uang);
        saldo = saldo - uang;
        A.saldo = A.saldo + uang;
        this.getSaldo(saldo);
    }
    public void setNominal(byte pil) {
        if (pil == 1) {
            saldo = saldo - 50000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 2) {
            saldo = saldo - 100000;
        System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 3) {
            saldo = saldo - 200000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 4) {
            saldo = saldo - 500000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 5) {
            saldo = saldo - 1000000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 6) {
            saldo = saldo - 2000000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else {
            System.out.println("ERROR!");
        }
    }
}
