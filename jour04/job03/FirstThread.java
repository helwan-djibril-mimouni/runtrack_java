package jour04.job03;

import java.io.OutputStream;

public class FirstThread extends Thread {
    public char c;
    public OutputStream os;

    public FirstThread(OutputStream os){
        this.c = ' ';
        this.os = os;
    }

    public void changeChar(char c){
        this.c = c;
    }

    @Override
    public void run() {
        try{
            os.write(c);
        }
        catch (Exception ex) {  
            ex.printStackTrace();  
        }
    }
}
