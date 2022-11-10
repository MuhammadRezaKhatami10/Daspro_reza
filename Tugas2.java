import java.util.Scanner;

public class Tugas2 {
	public static void main(String args[]){

		Scanner input = new Scanner (System.in);

		int umur;

		System.out.println("Masukkan umur anda: ");
		umur = input.nextInt();

		if (umur>=17){
			System.out.println("Boleh berkendara");
		}
		else {
			System.out.println("Tidak boleh berkendara");
		}

	}

}