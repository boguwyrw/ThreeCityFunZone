package pl.threecityfunzone.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class FunZoneUser extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long funUserId;

    @NotNull
    private String funUserName;
    @NotNull
    private String funUserPassword;

}
