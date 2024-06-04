class FinallyKeyword{
    public static void main(String[] args) {
        try{
            long date []=new long[1000000000];
        }

        catch(Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("finally block will execute always.");
        }
    }
}