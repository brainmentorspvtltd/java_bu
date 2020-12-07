public class B {
    public static void main(String[] args) {
        // Java 1.5
        StringBuilder sb = new StringBuilder("Amit");
        synchronized(sb){
            sb.append("Hi");
        }
        // From Starting
        //StringBuffer sb = new StringBuffer("Amit");
        sb.append(" Srivastava");
        //sb.delete(2, 5);
        String s = "Amit";


    }
}
