package wisdom.rsa;

public class Test {
	static int x;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Test.test1();
		String[] strings = new String[]{"A","B","C"};
		Test.test2(strings, "");
	}
	
	public static void test1(){
		int x =0 ;
		String[] strings = new String[]{"A","B","C"};
		for(int i=0;i<strings.length;i++){
			for(int i2=0;i2<strings.length;i2++){
				for(int i3=0;i3<strings.length;i3++){
					for(int i4=0;i4<strings.length;i4++){
						for(int i5=0;i5<strings.length;i5++){
							for(int i6=0;i6<strings.length;i6++){
								for(int i7=0;i7<strings.length;i7++){
									for(int i8=0;i8<strings.length;i8++){
										x++;
										System.out.println("µÚ"+x+"×é´ð°¸£º"+strings[i]+strings[i2]+strings[i3]+strings[i4]+strings[i5]+strings[i6]+strings[i7]+strings[i8]);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static void test2(String[] strings,String str){
		for(int i=0;i < strings.length;i++){
			if(str.length() == 7){
				x++;
				System.out.println(x+str+strings[i]);
			}
			if(str.length() < 7){
				test2(strings, str+strings[i]);
			}
		}
	}
}
