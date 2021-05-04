public class Peluru {

    public static void main(String[] args) {
        double kecepatan, sudut, jarak;

        kecepatan = 32;
		sudut = 40;
		
		jarak = 2 * kecepatan * kecepatan *
		    Math.sin(Math.toRadians(sudut)) *
			Math.cos(Math.toRadians(sudut)) / 9.8;

        System.out.println("Jarak: " + jarak);
    }
}
