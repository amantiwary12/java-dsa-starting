public class stringbuilder{
    public static void main(String[] args){
 
        StringBuilder sb = new StringBuilder("aman");

        // System.out.println(sb);
        // System.out.println(sb.charAt(2));

        //   sb.setCharAt(0, 'C');
        //   System.out.println(sb);


        //   to instert a string
        // sb.insert(1, "s");
        // System.out.println(sb);


        // to delete 
        // sb.delete(2, 3);
        // System.out.println(sb);

        // to append 
        sb.append(" ti ");
        sb.append("wa ");
        sb.append("ry ");
        System.out.println(sb);
        System.out.println(sb.length());
 }
}