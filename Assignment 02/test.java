public class test {
  public static void main( String args[] ) {
    char[] list = {'m', 'e', 'y'};

    String some = "";

    for (int i = 0; (i < list.length); i++) {
        if (list[i] == 'e') {
            some = some.concat("" + list[i]);
        }

        System.out.print(some);
    }

    
  }
}