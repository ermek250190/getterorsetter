package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//   Car mashina=new Car();
//   mashina.aty="furgon";
//   mashina.tusu="kara";
//   mashina.jili= 2020;
//   mashina.kuchu=500;
//   mashina.obemu=5.0;
//   mashina.complektaciya="lux";
//
//
//           System.out.println(mashina.aty);
//        System.out.println(mashina.tusu);
//        System.out.println(mashina.jili);
//        System.out.println(mashina.kuchu);
//        System.out.println(mashina.obemu);
//        System.out.println(mashina.complektaciya);
//
//     Kurs kurs=new Kurs();
//     kurs.setname("peaksoft");
//     kurs.setsabaktinAti("Java");
//     kurs.setmugalim("Muhammed Allanov");
//     kurs.setnomeri(777);
//
//        System.out.println();
//
//
//   Person person=new Person();
//
//   person.setName("Tarzan");
//   person.setAge(55);
//   person.setGodRojenie(1900);
//   person.setRost(1.90);
//   person.setVes((short) 55);
//        System.out.println(person.getname());
//
//    }

        Lapton nout=new Lapton();
        nout.setColor("chernyi");
        nout.setNoutname("Asus");
        nout.setMemory(500);
        nout.setProcessor("cor i7");




        Lapton nout2=new Lapton();
        nout.setColor("chernyi");
        nout.setNoutname("Asus");
        nout.setMemory(500);
        nout.setProcessor("cor i7");
       Lapton [] lapton={nout,nout2};



        Student student =new Student();

        student.setName("Ermek");
        student.setSurname("Bolotbekuulu");
        student.setAge(32);
        student.setLapton(lapton);
        student.getinfostudent();


    }
}

