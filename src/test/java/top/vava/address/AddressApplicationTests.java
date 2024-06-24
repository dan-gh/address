package top.vava.address;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class AddressApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    public static void main(String[] args) {
        String address= "北京市";
        String substring = address.substring(0, 2);
        System.out.println(substring);
    }
}
