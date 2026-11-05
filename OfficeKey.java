package sample2;

public class OfficeKey extends Items{
	private static final long serialVersionUID = 1L;
	private boolean usedTool;
	
	public OfficeKey() {
		super("officekey");
		usedTool=false;
	}

	@Override
	public void use() {
		if (game1.currentRoom.getName().equals("Office")) {
			if (usedTool) {
				game1.print("attic door already opened");
			}else {
				game1.currentRoom.getExit(3).setLocked(false);
				usedTool=true;
				game1.print("using key, you are able to unlock other room doors");
			}
		}else {
			game1.print("no way of using key to unlock other things");
		}
	}
}
	
