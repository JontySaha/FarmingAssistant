package dto;

import lombok.Data;

@Data
public class FarmerLoginDto {
	
	private String email;
	private String password;
	private String role;

}