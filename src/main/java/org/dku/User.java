package org.dku;
import java.util.*;
public class User {

    String userName;
    String phoneNumber;
    String studentId;
    ArrayList<String> friends = new ArrayList<>();
    String userAddress;

    public User(String userName, String phoneNumber) {
        this.userName = userName; //this. 에 할당하여 변수초기화
        this.phoneNumber = phoneNumber;
        this.studentId = "32221902"; //this. 에 할당하여 변수초기화
        this.userAddress = "용인시 수지구";
    }

    public User(String userName, String phoneNumber, String studentId, String userAddress) {
        this.userName = userName; //this. 에 할당하여 변수초기화
        this.phoneNumber = phoneNumber;
        this.studentId = studentId; //this. 에 할당하여 변수초기화
        this.userAddress = userAddress;
    }


}
