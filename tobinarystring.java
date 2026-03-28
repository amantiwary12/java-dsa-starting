class tobinarystring{
    public static void main(String[] args ){
        int a = 5;
        int b= 3;
        // System.out.println(a+b);
        System.out.println("to bnary AND of 5 and 3: " + (a & b ));
        System.out.println("to bnary AND of 5 and 3: " + Integer.toBinaryString (a & b ));

        System.out.println("to bnary OR of 5 and 3: " + Integer.toBinaryString (a | b ));

        System.out.println("to bnary Xor of 5 and 3: " + Integer.toBinaryString (a ^ b ));

        System.out.println("to bnary NOT of 5 and 3: " + Integer.toBinaryString (~b ));

        System.out.println("to bnary RIGHT SHIFT of 5 and 3: " + Integer.toBinaryString (b<<1 ));

        System.out.println("to bnary LEFT SHIFT of 5 and 3: " + Integer.toBinaryString (b>>1 ));
    }
}