package com.example.opilane.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //logi jaoks
    private static final String TAG = "MainActivity";
    BluetoothAdapter mBluetoothAdapter;
    ListView lvNewDevices;
    Button btnEnableDisable_Discoverable;
    public ArrayList<BluetoothDevice> mBTDevices = new ArrayList<>();
    public DeviceListAdapter mDeviceListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOnOFF = findViewById(R.id.btnONOFF) ;
        btnEnableDisable_Discoverable = findViewById(R.id.btnDicoverable_on_off) ;
        public ArrayList<BluetoothDevice> mBTDevices = new ArrayList<>();
        public DeviceListAdapter mDeviceListAdapter;

        // broadcastreciver for ACTION_FOUND
        private final BrodcastReciver mBroadcastReciver1 = new BroadCastReciver(){
            @Override
            public void onRecive (Context context, Intent intent){
                String action = intent.getAction();
                // when discovery finds a device
            if (action.equals)(mBluetoothAdapter.ACTION_STATE_CHANGED)) {
                final int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE,
                        mBluetoothAdapter.ERROR);
                switch (state){
                    case BluetoothAdapter.STATE_OFF:
                        String msg;
                        Log.i(TAG, msg:"onRecive: STATE OFF");
                        break;
                        case BluetoothAdapter.STATE_TURNING_OFF;
                        Log.i(TAG, msg:"mBroadcastReciver1: STATE TURNING OFF");
                        break;
                        case BluetoothAdapter.STATE_ON;
                        Log.i(TAG, msg:"mBroadcastReciver1: STATE ON");
                        break;
                        case BluetoothAdapter.S
                }
                }
                public void enableDisableBT(){
                    if ((mBluetoothAdapter) == null){
                        Log.i(TAG, msg:"enableDisableBT: Does not have Bluetooth capabilities.");
                    }
                    if (!mBluetoothAdapter.isEnabled()) {
                        Intent enableBTIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivity(enableBTIntent):

                        IntentFilter BTIntent = new IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED)
                    }
                    @Override
                            public void onRecive(Context context, Intent intent) {
                        final String action = intent.getAction();
                        if (action.equals.(BluetoothAdapter.ACTION_SCAN_MODE_CHANGED)) {
                            int mode = intent.getIntExtra(BluetoothAdapter.EXTRA_SCAN_MODE, BluetoothAdapter.ERROR) ;
                            switch (mode){
                                // device om discovarable mode
                                case BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE:
                                    Log.i(TAG, msg:"mBroadcastReveiver2: Discoverability enabled. " +
                                    "Able to recive connections.");
                                    break;
                                case BluetoothAdapter.SCAN_MODE_NONE:
                                    Log.i(TAG, msg:"mBroadcastReceiver2: Discoverability disabled. " +
                                    "Not able to receive connections") ;
                                    break;
                                case BluetoothAdapter.STATE_CONNECTING:
                                    Log.i(TAG, msg:"mBroadcastReceiver2: Connecting...");
                                    break;
                                case BluetoothAdapter.STATE_CONNECTED:
                                    Log
                            }
                    }
                }
                // muudame bluetoothi avastatavaks
                    public void btnEnableDisable_Discovarable(View view) {
                        Log.i(TAG, "btnDiscover: Looking for unpaired devices.");

                        if (mBluetoothAdapter.isDiscovering()) {
                            mBluetoothAdapter.cancelDiscovery();
                            Log.i(TAG, "btnDiscover: Canceling discovery");
                            //check bluetooth permissions in manifest
                            checkBTPermissions();

                            mBluetoothAdapter.startDiscovery();
                            IntentFilter discoverDevicesInetnt = new IntentFilter(BluetoothDevice.ACTION_FOUND);
                            registerReceiver(mBroadcastReciver3, discoverDevicesInetnt);
                        }
                        if (!mBluetoothAdapter.isDiscovering()) {
                            //check bluetooth permissions in manifest
                            checkBTPermissions();

                            mBluetoothAdapter.startDiscovery();
                            IntentFilter.discoverDevicesIntent = new IntentFilter(BluetoothDevice.ACTION_FOUND);
                            registerReceiver(mBroadcastReciver3, discoverDevicesIntent);
                        }
            }
            }
            }
        }

    }
}
