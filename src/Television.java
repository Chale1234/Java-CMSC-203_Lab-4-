/** lab # 6
 * 
 * @author Enchalew Abebe
 * Due date 4/27/2022
 *
 */
public class Television{
	
private final String MANUFACTURER;

	// create an instance field  for screen size, power on, Channel, and volume
	private final int SCREEN_Size;

	private boolean powerOn;    
	private int channel;		 
	private int volume;			 

	/** create a constructor for brand and size of the television.
	 * 
	 * @param brand  The brand of the television
	 * @param size   The size of the television
	 */
	public Television(String Brand, int Size) {
		MANUFACTURER = Brand;
		SCREEN_Size = Size;
		channel = 0;
		volume = 30;
		powerOn = false;
	}

	/** create a set method for channel and parametrize with channel
	 * 
	 * @param station The channel to change to
	 */
	public void setChannel(int station) {
		channel = station;
	}

	
	public void power() {
		powerOn = !powerOn;
	}

	 /** Increases the volume of the TV */
	public void increaseVolume() {
		volume++;
	}

	/** Decreases the volume of the TV */ 
	public void decreaseVolume() {
		volume--;
	}

	/** Get the current channel
	 * 
	 * @return the currently set channel
	 */
	public int getChannel() {
		return channel;
	}

	/** Get the current volume
	 * 
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}

	/** Get manufacturer
	 * 
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}

	/** get Screen size
	 * 
	 * @return the TV size
	 */
	public int getScreenSize() {
		return SCREEN_Size;
	}
}