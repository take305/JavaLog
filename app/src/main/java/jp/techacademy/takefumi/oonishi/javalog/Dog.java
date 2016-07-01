package jp.techacademy.takefumi.oonishi.javalog;

import android.util.Log;

/**
 * Created by 剛史 on 2016/07/01.
 */
class Dog {
static  String to_jp="犬";

    String name;
    int age;

    public Dog(String name, int age){
        this.name=name;
        this.age=age;    }

    public static void  introduce(){
        Log.d("javatest","これは犬クラスです。");
    }
    public void say(){
        Log.d("javatest",this.name+"("+this.age+"歳)"+"「ワンワン」");
    }
}

