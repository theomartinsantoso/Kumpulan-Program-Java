//Superclass
class hewan{
   
    String jenis;
    int umur;
    
    //Konstruktor dengan Parameter pada Class Hewan
    public hewan(String jenis, int umur){
        //Variable jenis dan umur Mendapatkan Nilai dari Parameter
        this.jenis = jenis;
        this.umur = umur;
    }
    
    String getJenis(){
        return jenis;
    }
    int getUmur(){
        return umur;
    }
}

//Subclass/Kelas Anak
public class karnivora extends hewan{
    
    String jenis = "Anjing";
    int umur = 5;
    
    public karnivora(String jenis, int umur) {
        //Mengalihkan Nilai pada Konstruktor hewan
        super("Domba", 7);
    }
    
    public static void main(String[] args){
        karnivora data = new karnivora("",0); //Beri Nilai Default
        System.out.println("==== Mengambil Nilai Dari Class Hewan ========");
        data.getData();

        System.out.println("==== Mengambil Nilai Dari Class Karnivora ====");
        //Menjalankan 2 Buah Method yang Terdapat pada Subclass (Tanpa super)
        System.out.println("Jenis Hewan: "+data.getJenis());
        System.out.println("Usia Hewan: "+data.getUmur());
    }
    
    void getData(){
        //Menjalankan 2 Buah Method yang Terdapat pada Superclass (super)
        System.out.println("Jenis Hewan: "+super.getJenis());
        System.out.println("Usia Hewan: "+super.getUmur());
    }
    
    String getJenis(){
        return jenis;
    }
    int getUmur(){
        return umur;
    }


}
