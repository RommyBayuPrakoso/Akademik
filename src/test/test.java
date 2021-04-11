
package test;

import perkuliahan.Penilaian;

public class test {
    public static void main(String[] args) {
    Penilaian penilaian = new Penilaian ();
    
    String nilaiDalamHuruf;
    
    //test cese 1
    nilaiDalamHuruf = penilaian.hitungNilaiHuruf(65,100,80,95,100);
    System.out.println(nilaiDalamHuruf);
    
    //test cese 2
    nilaiDalamHuruf = penilaian.hitungNilaiHuruf(80,90,90,90,95);
    System.out.println(nilaiDalamHuruf);
    
    //test cese 3
    nilaiDalamHuruf = penilaian.hitungNilaiHuruf(95,90,95,100,80);
    System.out.println(nilaiDalamHuruf);
    
    //test cese 4
    nilaiDalamHuruf = penilaian.hitungNilaiHuruf(75,65,85,70,55);
    System.out.println(nilaiDalamHuruf);
    
    //test cese 5
    nilaiDalamHuruf = penilaian.hitungNilaiHuruf(60,60,65,60,60);
    System.out.println(nilaiDalamHuruf);
    
    //test cese 6
    nilaiDalamHuruf = penilaian.hitungNilaiHuruf(50,70,50,50,50);
    System.out.println(nilaiDalamHuruf);
    }
}
