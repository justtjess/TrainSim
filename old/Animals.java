import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Animals{

	private BufferedImage sprite;

	public Animals(BufferedImage image){
		this.sprite = image;
	}

	public BufferedImage image(int x, int y, int width, int height){
		return sprite.getSubimage(x,y,width,height);		
	}

}