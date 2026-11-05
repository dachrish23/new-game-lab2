package sample2;

public class Safe extends Items{
	private static final long serialVersionUID = 1L;
	private boolean opens;
	private boolean closes;
	
	public Safe() {
		super("safe");
		opens=true;
		closes=true;
	}
	
	@Override
	public void open() {
		if (opens) {
			game1.print("you open the safe firmly, a notebook sits");
			Items notebook=new Notebook();
			World.buildWorld().addItem(notebook);
			}
		}
	
	
	@Override
	public void close() {
		if (closes) {
			game1.print("you have closed the safe quietly");
			}
		}
	}

