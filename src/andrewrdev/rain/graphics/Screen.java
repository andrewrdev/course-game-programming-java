package andrewrdev.rain.graphics;

public class Screen {
	private int width;
	private int height;
	private int[] pixels;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		this.pixels = new int[width*height];
	}
}
