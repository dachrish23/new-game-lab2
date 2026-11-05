package sample2;

public class Flashlight extends Items{
	private static final long serialVersionUID = 1L;
	private boolean found;
	
	public Flashlight() {
		super("flash");
		found=false;
	}
	@Override
	public void use() {
		if (found) {
			game1.print("you start using the found flashlight but unable to use it");
		}else {
			found=true;
			game1.print("you are now able to use this flashlight");
			Items key=new Items("key");
			World.buildWorld().addItem(key);
			}
		}
	}
