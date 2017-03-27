package com.hyh.rxjavademos;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import rx.Observable;
import rx.Subscriber;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String tag="hhh";
        Observable observable = Observable.create(new Observable.OnSubscribe() {
            @Override
            public void call(Object o) {
               Log.d(tag,"call"+o);
            }
        });
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String o) {
                Log.d(tag,"hello world" );
            }
        };
        observable.subscribe(subscriber);
    }




}
