package Lombok;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Telefon {

    private String Brand;
    private String Model;

    private Integer AnFabricatie;
    private String Material;
    private String Camera;


}