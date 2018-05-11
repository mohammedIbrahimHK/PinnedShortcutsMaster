package com.example.mohammedi.pinnedshortcutsmaster;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShortcutInfo shortcutInfo = new ShortcutInfo.Builder(this, "shortcut1")
                .setIcon(Icon.createWithResource(this, R.drawable.ic_launcher_background)) // icon which display in shortcut
                .setLongLabel("Search throgh google") // Lable for shortcut specify action name
                .setShortLabel("Shortcut_label")
                .setIntent(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))) // Intent action to perform
                .build();

        ShortcutManager sm = (ShortcutManager)getSystemService(SHORTCUT_SERVICE);

        ArrayList<ShortcutInfo> shortcutInfoList = new ArrayList<ShortcutInfo>();
        shortcutInfoList.add(shortcutInfo);
        sm.setDynamicShortcuts(shortcutInfoList);

    }
}
