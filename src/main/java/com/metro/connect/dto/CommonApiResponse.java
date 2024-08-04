package com.metro.connect.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonApiResponse {
	
	private String responseMessage;
	
	private HttpStatus status;
	
	private boolean isSuccess;  

}
