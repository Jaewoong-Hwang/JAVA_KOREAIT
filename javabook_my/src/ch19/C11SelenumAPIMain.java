package ch19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C11SelenumAPIMain {
	
	private static final String WEB_DRIVER_ID="";
	private static final String WEB_DRIVER_PATH="src/Drivers/chromedriver.exe";
	
	
	public static void main(String[] args) {
		
		//브라우져 옵션
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");		//백그라운드에서 실행
		//options.addArguments("--no-sandbox");		//리눅스환경 sandbox 사용여부
		
		
		//브라우저 동작
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naver.com");
		
		//특정 위치 요소 선택(키워드 입력하기)
		WebElement searchEl = driver.findElement(By.id("query"));
		
		//키워드 입력
		searchEl.sendKeys("노트븍");
		
		//엔터키 전달
		searchEl.sendKeys(Keys.RETURN);
		
		//쇼핑 버튼 클릭
		WebElement shoppingBtnEl = driver.findElement(By.cssSelector(".api_pcpg_wrap .tab:nth-child(1)"));
		//target_blank(새창열기) 제거
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('target')", shoppingBtnEl);
		
		shoppingBtnEl.click();
		
	
		
		
	}
}
