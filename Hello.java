public class Hello
{
 public static void main( String argv[] )
 {//Default is "World"
 String name = "World";
	//This is a bad comment. We want to revert it.
 if ( argv.length != 0 )
 {
 name = argv[0];
 }
 System.out.println( "Hello, " + name + "!" );
 }
}

