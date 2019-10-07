package pl.threecityfunzone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FunZoneUserDTO {
    private String funUserName, funUserPassword, confirmFunUserPassword;
}
