package dto;

import lombok.Data;

@Data
public class FarmerLoginRespDto {

	private String email;
	private String role;
	private boolean isLoggedIn;
}