public class previous {
    public static void main(String[] args) {
        String str="XYXYXY";
        char previous='0';
        char current;
        int remove=0;
        for (int i = 0; i < str.length(); i++) {
            current=str.charAt(i);
            if(current==previous) remove++;
            else previous=current;
        }
        System.out.println(remove);

    }
}
