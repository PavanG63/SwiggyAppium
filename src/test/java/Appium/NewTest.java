package Appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;


@Listeners(Listener.class)
public class NewTest {
	static AndroidDriver driver;
	static Lib lib;

	@BeforeClass
	public void beforeMethod() {
		lib = new Lib();
		
		URL URL;
		try {
			
			URL = new URL("http://127.0.0.1:4723/wd/hub");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "11");
			caps.setCapability("appPackage", "in.swiggy.android");
			caps.setCapability("appActivity", "in.swiggy.android.activities.HomeActivity");
			
			

//			AndroidDriver driver = new AndroidDriver(URL, caps);
			driver = new AndroidDriver(URL, caps);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			System.out.println(driver.getSessionId());
				
			
			driver.findElement(By.id("in.swiggy.android:id/full_width_button_label")).click();
			driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Choose an Account\"]/android.widget.LinearLayout/android.widget.Button")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='10 digit mobile number']")).sendKeys("6301855136");
			driver.findElement(By.id("in.swiggy.android:id/full_width_button_label")).click();
			
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Continue,Button\"]/android.widget.TextView")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Enter Location Manually']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("(//android.widget.TextView)[4]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Search for restaurant, item or more']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("(//android.widget.EditText)[1]")).sendKeys("Chicken Biryani");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("(//android.widget.TextView)[1]")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

    @Test
	public void Restaurant() {
    	this.driver = driver;

		System.out.println("Test Starting");
		
		
		List<WebElement> LOE = driver.findElements(By.xpath("//android.widget.TextView"));
		System.out.println(LOE.size());
		
		for (WebElement x : LOE) {
			System.out.println(x.getAttribute("text"));
			System.out.println(x.getText());
				
		}
		
		driver.hideKeyboard();
		
		for (WebElement x : LOE) {
			
			if (x.getAttribute("text").equals("Chicken Biryani")) {
				x.click();
				break;
				
			}
			
		}
				
        String[] lst1 = {"Anandha Biryani House","Meghana Foods","Hyderabad Biryaani House","The Bengal Club","Kritunga Restaurant"};  
		
		int c1=0;
		int c2=0;

		String text = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text);
        if (lst1[0].equals(text)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			System.out.println("Restaurant  name doesn't matches");
			c1+=1;
			
		}

        lib.scrollUp(driver);
//        lib.scrollHorizontal(driver);
        String text1 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text1);
        if (lst1[1].equals(text1)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			System.out.println("Restaurant  name doesn't matches");
		}


        lib.scrollUp(driver);
//        lib.scrollHorizontal(driver);
        String text2 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text2);
        if (lst1[2].equals(text2)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			System.out.println("Restaurant  name doesn't matches");
		}

        
        lib.scrollUp(driver);
//        lib.scrollHorizontal(driver);
        String text3 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text3);
        if (lst1[3].equals(text3)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			
			System.out.println("Restaurant  name doesn't matches");
		}

        
        
        lib.scrollUp(driver);
//        lib.scrollHorizontal(driver);
        String text4 = driver.findElement(By.id("in.swiggy.android:id/textView_restaurant_name")).getText();
        System.out.println(text4);
        if (lst1[4].equals(text4)) {
        	c1+=1;
        	c2+=1;
        	System.out.println("Restaurant  name matches");
			
		}else {
			c1+=1;
			System.out.println("Restaurant  name doesn't matches");
		}

        
        lib.scrollUp(driver);
        lib.scrollDown(driver);
        lib.scrollDown(driver);
        lib.scrollDown(driver);
        lib.scrollDown(driver);
        lib.scrollDown(driver);
        
//        WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabadi Chicken Biryani']"));
//        
//        int x = element.getLocation().getX();
//        int y = element.getLocation().getY();
//        
//        System.out.println("printing startsX" + x);
//		System.out.println("printing startsY" + y);
//		int width = element.getSize().getWidth();
//		System.out.println("printing width " + width); 
//		int px = (int) (0.2*width);
//		
//		TouchAction touchAction = new TouchAction(driver);
//		// TODO Auto-generated method stub
//		touchAction
//		
//		.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(x, y)))
//		.moveTo(PointOption.point(px, y))
//		.release()
//		.perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		lib.scrollUp(driver);
		
		String PricebeforeAddToCart = driver.findElement(By.id("in.swiggy.android:id/horizontal_item_price")).getAttribute("text");
		System.out.println(PricebeforeAddToCart);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabadi Chicken Biryani']")).click();
		driver.findElement(By.id("in.swiggy.android:id/quantity_text_1")).click();
//		try {
//			driver.findElement(By.xpath("//android.widget.Button[@text='Add Item to Cart']")).click();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		driver.findElement(By.id("in.swiggy.android:id/increment_button_touch_target")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='Repeat']")).click();

		driver.findElement(By.id("in.swiggy.android:id/increment_button_touch_target")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='Repeat']")).click();

		driver.findElement(By.id("in.swiggy.android:id/decrement_button")).click();
		driver.findElement(By.id("in.swiggy.android:id/decrement_button")).click();
		
//		driver.findElement(By.id("in.swiggy.android:id/bottom_stack_gradient")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text='₹320']")).click();

		String PriceafterAddToCart = driver.findElement(By.id("in.swiggy.android:id/itemPrice")).getAttribute("text");
		System.out.println(PriceafterAddToCart);

		if (PricebeforeAddToCart.equals(PriceafterAddToCart)) {
			System.out.println("Price is validated");
			
		}else {
			System.out.println("Price doesn't validated");
		}

		driver.findElement(By.id("in.swiggy.android:id/checkoutText")).click();
		

//		System.out.println("Value of C1 "+c1 + "  value of C2  " + c2);
//		assertEquals(c1, c2);
		
	}
          
	@AfterMethod
	public void afterMethod() {
	}
}
