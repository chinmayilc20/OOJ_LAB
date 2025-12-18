package SEE;
import CIE.*;

public class External extends Personal {
    public int[] seeMarks = new int[5];
    public int[] cieMarks = new int[5];

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void setCieMarks(int[] cie) {
        for (int i = 0; i < 5; i++) {
            cieMarks[i] = cie[i];
        }
    }

    public void setSeeMarks(int[] see) {
        for (int i = 0; i < 5; i++) {
            seeMarks[i] = see[i];
        }
    }
    
    public void displayResults() {
        display();
        System.out.println("Final Marks : ");
        for (int i = 0; i<5; i++){
            int finalMark = cieMarks[i] + (seeMarks[i]/2);
            System.out.println("Subject " + (i+1) + ": " + finalMark);
        }
        System.out.println("----------------------------");
    }
}
