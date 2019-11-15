public class Hello{
	public static void ain(String[] args){
		String name = "World";

		if(args.length != 0){
			name=args[0];
		}

		System.out.println("Hello, "+name+"!");
	}
}

