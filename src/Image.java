import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Image{

	public static BufferedImage load(String location){
		return ImageIO.read(Image.class.getResource(location));
	}
}