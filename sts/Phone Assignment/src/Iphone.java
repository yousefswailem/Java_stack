
public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String unlock() {
		return "unlocking via passcode";
        // your code here
    }
    @Override
    public void displayInfo() {
        System.out.println(getCarrier());           
    }
	@Override
	public String Ring() {
		// TODO Auto-generated method stub
		return getRingTone();
	}
}