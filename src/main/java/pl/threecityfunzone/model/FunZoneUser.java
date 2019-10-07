package pl.threecityfunzone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class FunZoneUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long funUserId;

    @NotNull
    private String funUserName;
    @NotNull
    private String funUserPassword;

}
