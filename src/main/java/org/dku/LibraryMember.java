package org.dku;
import java.util.Scanner;

public class LibraryMember {
    String name;
    String phoneNumber;
    static int seatNumber;
    String school;


    public LibraryMember(String name, String phoneNumber, String school){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.school = school;
        this.seatNumber = 0;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void vacateSeats() {
        this.seatNumber = 0;
    }

    public void setMemberProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력>>");
        name = scanner.next();
        System.out.println("전화번호 입력>>");
        phoneNumber = scanner.next();
        System.out.println("학교 입력>>");
        school = scanner.next();
    }

    public void updateProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌석번호 입력>>");
        seatNumber = scanner.nextInt();
    }

    public void displayProfile() {

    }


}

