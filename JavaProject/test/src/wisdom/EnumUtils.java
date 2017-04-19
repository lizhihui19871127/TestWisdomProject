package wisdom;

public enum EnumUtils {
	Boy(new EnumDemo(),1),Girl(new EnumDemo(),2);
	
	private EnumDemo name;
	
	private int id;
	
	private EnumUtils(EnumDemo name,int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"-"+id;
	}
	
	public static void main(String[] args) {
		String result = EnumUtils.Boy.toString();
		System.out.println(result);
		
		System.out.println(EnumUtils.Boy.id);
	}
	
	
	
	

}
