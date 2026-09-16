import java.util.Scanner;

public class PINATM
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Deklarasi dan inisialisasi variabel
        int correctPIN = 123456; 
        int inputPIN;
        int attempts = 3;
        boolean loginSuccess = false;
        
        // Perulangan selama percobaan masih ada dan belum berhasil login
        while (attempts > 0 && loginSuccess == false) {
            System.out.println("Masukkan PIN Anda");
            inputPIN = scanner.nextInt();
            
            // Pengecekan PIN
            if (inputPIN == correctPIN) {
                System.out.println("Login Berhasil!");
                loginSuccess = true;
            } else {
                attempts = attempts - 1;
                
                if (attempts > 0) {
                    System.out.println("PIN Salah. Sisa Percobaan: " + attempts);
                } else {
                    System.out.println("Akun Terblokir");
                }
            }
        }
        
        scanner.close();
    }
}