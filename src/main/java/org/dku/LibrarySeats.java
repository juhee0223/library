package org.dku;

public class LibrarySeats {
    int[] seatArray;

    public LibrarySeats(int size){
        int[] seatArray = new int[size];
    }

    public void occupySeat(int seatNumber){
        seatArray[seatNumber-1]= 1;
    }

    public void vacateSeat(int seatNumber) {
        seatArray[seatNumber-1]= 0;
    }

    public boolean hasSeat() {
        if (LibraryMember.seatNumber != 0) {

        }
    }
    //스카인건가? ㄴㄴ
    //displaySeats 필요?
}


