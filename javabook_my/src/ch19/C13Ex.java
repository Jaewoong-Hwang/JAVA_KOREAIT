package ch19;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class C13Ex {

	public static void main(String[] args) throws IOException, InterruptedException {
		// OPENWEATHER MAP API 를 이용해서 날씨 정보 받아옵니다
		// (https://openweathermap.org/api/one-call-3)
//https://api.openweathermap.org/data/3.0/onecall?lat=33.44&lon=-94.04&exclude=hourly,daily&appid={API key}
		
		
		
		String url = "http://api.openweathermap.org/data/2.5/air_pollution/forecast?lat="+args[0]+"&lon="+args[1]+"&appid=0d2f2d65295ca893f8ec33b19579f8af";
	
		String appid = "0d2f2d65295ca893f8ec33b19579f8af";
	

		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		HttpClient httpClient = HttpClient.newHttpClient();

		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
//		ObjectMapper objectMapper = new ObjectMapper();

//		ResponseObject responseObject = objectMapper.readValue(response.body(), ResponseObject.class);
//		System.out.println("Status : " + responseObject.getStatus());
	}



}
