package us.nb9.tij;

import us.nb9.tij.holding.AddingGroups;
import us.nb9.tij.holding.AsListInference;
import us.nb9.tij.holding.PrintingContainers;
import us.nb9.tij.holding.PriorityQueueDemo;
import us.nb9.tij.holding.QueueDemo;
import android.app.Activity;
import android.os.Bundle;

public class TIJAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        runTest();
    }
    
    private void runTest() {
    	new Thread(new Runnable(){

			@Override
			public void run() {
//				ArrayListDisplay.main(null);
//				AddingGroups.main(null);
//				AsListInference.main(null);
//				PrintingContainers.main(null);
//				QueueDemo.main(null);
				PriorityQueueDemo.main(null);
			}
    		
    	}).start();
    }
}
