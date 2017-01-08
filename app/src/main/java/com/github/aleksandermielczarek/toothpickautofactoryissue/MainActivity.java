package com.github.aleksandermielczarek.toothpickautofactoryissue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;

/**
 * Created by Aleksander Mielczarek on 08.01.2017.
 */

public class MainActivity extends AppCompatActivity {

    @Inject
    protected ItemFactory itemFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Scope scope = Toothpick.openScope(this);
        super.onCreate(savedInstanceState);
        Toothpick.inject(this, scope);
    }

    @Override
    protected void onDestroy() {
        Toothpick.closeScope(this);
        super.onDestroy();
    }
}
