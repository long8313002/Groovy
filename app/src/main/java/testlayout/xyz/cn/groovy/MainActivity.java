package testlayout.xyz.cn.groovy;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("--->"+"===================");
        new Test().show("hahahah");
        System.out.println("--->"+ "===================");
    }

    public static void putShow(String name,String name2){
    }
}
