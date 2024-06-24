package top.vava.address.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String provinces;

    private String city;

    private String areas;

    private String Street;

    private String village;

    private String detailAddress;
}
