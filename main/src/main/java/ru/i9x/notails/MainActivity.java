/*
 * Copyright (c) 2012-2017 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */

package ru.i9x.notails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import de.blinkt.openvpn.LaunchVPN;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(getApplicationContext(), LaunchVPN.class);
        intent.putExtra(LaunchVPN.EXTRA_KEY, "bc144d00-d34a-47ab-8069-470a70d10cdb");
        intent.setAction(Intent.ACTION_MAIN);
        startActivity(intent);
    }
}
