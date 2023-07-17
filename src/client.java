// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class client {
    public static void main(String[] args) {

        Student.Builder bt=Student.getBuilder().setname("Pulkit").setage(25);
        Student st=bt.build();
        st.getage();
        st.getname();



        }
    }
