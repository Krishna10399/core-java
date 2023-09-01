package Kna;

public interface gst {

    public class client implements gst{
        public void getgst() {

            System.out.println(230);

        }

        public static void main(String[] args) {
            client c = new client();
            c.getgst();
        }
    }

}
