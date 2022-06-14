package Constructor;

public class PhoneConstructor {
	
	public PhoneConstructor(String name) {
		System.out.println("Phone Model:" + name);
	
	}
	

	public PhoneConstructor(int Capacity) {
		System.out.println("Phone RAM" + Capacity);
	
	}

	public PhoneConstructor(double CameraSize , int Pixel) {
		System.out.println("Phone Camera" + Pixel);
	
	}

	public static void main(String[] args) {
		PhoneConstructor cellPhone  = new PhoneConstructor("REDMI");
		PhoneConstructor memory = new PhoneConstructor(4);
		PhoneConstructor pixel = new PhoneConstructor(3.3, 32);

	}
}
