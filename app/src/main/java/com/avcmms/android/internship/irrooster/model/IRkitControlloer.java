package com.avcmms.android.internship.irrooster.model;

import android.content.Context;
import android.util.SparseArray;
import android.widget.Toast;

import com.avcmms.android.internship.irrooster.R;
import com.getirkit.irkit.IRKit;
import com.getirkit.irkit.net.IRDeviceAPIService;
import com.getirkit.irkit.net.IRHTTPClient;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import org.apache.commons.lang3.ArrayUtils;


final public class IRkitControlloer {
    private SparseArray<Integer[]> mSparseArray = new SparseArray<Integer[]>();

    private Context mContext;

    private final static float PARAMETER_FREQ = 38.0f;

    public final static int ERR_CODE = -1;

    private final int KEY_CAHNEL_1 = 1;
    private final int KEY_CAHNEL_2 = 2;
    private final int KEY_CAHNEL_3 = 3;
    private final int KEY_CAHNEL_4 = 4;
    private final int KEY_CAHNEL_5 = 5;
    private final int KEY_CAHNEL_6 = 6;
    private final int KEY_CAHNEL_7 = 7;
    private final int KEY_CAHNEL_8 = 8;
    private final int KEY_CAHNEL_9 = 9;
    private final int KEY_CAHNEL_10 = 10;
    private final int KEY_CAHNEL_11 = 11;
    private final int KEY_CAHNEL_12 = 12;
    private final int KEY_UP = 13;
    private final int KEY_LEFT = 14;
    private final int KEY_RIGHT = 15;
    private final int KEY_DOWN = 16;
    private final int KEY_ENTER = 17;
    private final int KEY_EPG = 18;
    private final int KEY_BACK = 19;

    public IRkitControlloer(Context context) {
        if (context == null) {
            return;
        }
        mContext = context;

        // cnl 1
        mSparseArray.put(KEY_CAHNEL_1, new Integer[]{6881, 3341, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 2537, 873});
        // cnl 2
        mSparseArray.put(KEY_CAHNEL_2, new Integer[]{6881, 3341, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 65535, 0, 65535, 0, 18662, 6881, 3341, 904, 815, 815, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 2537, 873});
        // cnl 3
        mSparseArray.put(KEY_CAHNEL_3, new Integer[]{6881, 3341, 904, 815, 904, 2537, 904, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 2537, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 2537, 815, 2537, 815, 815, 815, 815, 815, 2537, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 815, 2537, 815, 815, 815, 815, 815, 815, 815, 815, 815, 2537, 815, 815, 815, 2537, 815, 2537, 815, 815, 815, 2537, 815, 815, 815, 815, 815, 2537, 815, 2537, 815});
        // cnl 4
        mSparseArray.put(KEY_CAHNEL_4, new Integer[]{6881, 3341, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 65535, 0, 65535, 0, 18031, 6881, 3341, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 2451, 935});
        // cnl 5
        mSparseArray.put(KEY_CAHNEL_5, new Integer[]{6881, 3341, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 2537, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 65535, 0, 65535, 0, 18031, 6881, 3341, 904, 815, 815, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 2537, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 2537, 873});
        // cnl 6
        mSparseArray.put(KEY_CAHNEL_6, new Integer[]{6881, 3341, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 904, 2537, 935, 761, 873, 761, 873, 761, 873, 2537, 935, 761, 904, 761, 904, 761, 904, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 2451, 935});
        // cnl 7
        mSparseArray.put(KEY_CAHNEL_7, new Integer[]{6881, 3341, 904, 815, 904, 2537, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 2451, 935, 2451, 935, 815, 935, 815, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2537, 935, 2537, 935, 815, 935, 815, 815, 815, 935, 2537, 935, 761, 935, 2451, 935, 2451, 935, 2451, 935, 2451, 935, 761, 904, 761, 904, 2451, 935, 2451, 935});
        // cnl 8
        mSparseArray.put(KEY_CAHNEL_8, new Integer[]{6881, 3341, 904, 815, 904, 2451, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 904, 2451, 904, 2451, 904, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 904, 761, 904, 2537, 935, 2537, 935, 2537, 935, 761, 873, 761, 873, 2451, 904, 2451, 904, 65535, 0, 65535, 0, 18662, 6881, 3341, 935, 761, 904, 2537, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2537, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2537, 935, 2537, 935, 2537, 935, 761, 935, 761, 935, 761, 935, 2537, 935, 761, 935, 761, 935, 2451, 904, 2451, 904, 2451, 904, 761, 935, 761, 935, 2451, 935, 2451, 935});
        // cnl 9
        mSparseArray.put(KEY_CAHNEL_9, new Integer[]{6881, 3341, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 904, 761, 904, 2451, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 65535, 0, 65535, 0, 18031, 6881, 3341, 935, 761, 935, 2451, 935, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 2537, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 815, 935, 815, 935, 2451, 935, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 2451, 904, 815, 935, 815, 935, 2451, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935});
        // cnl 10
        mSparseArray.put(KEY_CAHNEL_10, new Integer[]{6881, 3341, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 65535, 0, 65535, 0, 18031, 6881, 3341, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 873, 2537, 873, 873, 873, 873, 787, 935, 787, 935, 787, 935, 787, 935, 787, 935, 787, 2626, 787, 2626, 787});
        // cnl 11
        mSparseArray.put(KEY_CAHNEL_11, new Integer[]{6881, 3341, 935, 761, 935, 2451, 935, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 761, 904, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 904, 2451, 904, 761, 904, 761, 904, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 904, 815, 935, 2451, 935, 2451, 935, 761, 904, 761, 904, 761, 904, 761, 904, 2451, 935, 2451, 935});
        // cnl 12
        mSparseArray.put(KEY_CAHNEL_12, new Integer[]{6881, 3341, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 65535, 0, 65535, 0, 18031, 6881, 3341, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 2451, 935, 761, 935, 761, 935, 761, 935, 761, 935, 2451, 935, 2451, 935});
        // epg
        mSparseArray.put(KEY_EPG, new Integer[]{6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 2537, 904, 65535, 0, 65535, 0, 17421, 6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 2537, 904});
        // up
        mSparseArray.put(KEY_UP, new Integer[]{6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 787, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 2537, 904, 65535, 0, 65535, 0, 18031, 6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 2537, 904});
        // left
        mSparseArray.put(KEY_LEFT, new Integer[]{6881, 3341, 904, 787, 904, 2451, 904, 787, 968, 787, 968, 787, 968, 787, 968, 787, 968, 787, 968, 787, 968, 787, 968, 787, 968, 787, 968, 787, 968, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2451, 904, 2451, 904, 2451, 904, 787, 968, 787, 968, 2451, 904, 787, 968, 787, 968, 2451, 968, 2451, 968, 2451, 968, 787, 904, 787, 904, 2451, 904, 2451, 904, 65535, 0, 65535, 0, 18031, 6881, 3341, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 2537, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 2537, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 2537, 904});
        // right
        mSparseArray.put(KEY_RIGHT, new Integer[]{6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 2537, 904, 2537, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 2537, 904, 2537, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 2537, 904, 65535, 0, 65535, 0, 17421, 6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 2537, 904, 2537, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 2537, 904, 2537, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 2537, 904});
        // down
        mSparseArray.put(KEY_DOWN, new Integer[]{6881, 3341, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 2537, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 2537, 904, 2537, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 2537, 904, 65535, 0, 65535, 0, 18031, 6881, 3341, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2537, 904, 2537, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 787, 904, 2537, 904, 2537, 904, 787, 904, 2537, 904, 787, 904, 787, 904, 2537, 904, 2537, 904});
        // enter
        mSparseArray.put(KEY_ENTER, new Integer[]{6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 2537, 904, 65535, 0, 65535, 0, 18031, 6881, 3341, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 815, 904, 815, 904, 2537, 904, 2537, 904});
        // back
        mSparseArray.put(KEY_BACK, new Integer[]{6881, 3341, 968, 735, 968, 2537, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2451, 968, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 2451, 968, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 2451, 968, 735, 968, 2451, 904, 787, 968, 2451, 904, 2451, 904, 787, 968, 787, 968, 2451, 968, 735, 904, 2537, 968, 735, 904, 2537, 968, 735, 968, 65535, 0, 65535, 0, 18031, 6881, 3341, 904, 787, 968, 2451, 968, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 2537, 968, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 735, 904, 2451, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 787, 904, 2451, 904, 787, 968, 2451, 968, 735, 968, 2451, 968, 2451, 968, 735, 904, 735, 904, 2451, 904, 787, 904, 2451, 968, 735, 968, 2451, 968, 735, 968});
    }

    /**
     * id毎に定義されているコマンドをIRkit送信
     *
     * @param id : 指定されたidから定義されているコマンドを引き出す
     **/
    public void sendCommand(int id) {
        if (mContext != null) {
            // id毎に定義されているコマンドをIRHTTPClient経由でIrKitに送信する
            // EndpointはMC-R-012を想定
            // TODO: 利用する機器毎にIPを変更する
            IRHTTPClient httpClient = IRKit.sharedInstance().getHTTPClient();
            httpClient.setDeviceAPIEndpoint(mContext.getString(R.string.target_irkit_ip));
            IRDeviceAPIService deviceAPI = httpClient.getThrottledDeviceAPIService();
            IRDeviceAPIService.PostMessagesRequest req = new IRDeviceAPIService.PostMessagesRequest();

            // see http://getirkit.com/
            // /POST/1/message に習って "raw", "38", dataを設定
            req.format = mContext.getString(R.string.parameter_format);
            req.freq = PARAMETER_FREQ;
            req.data = ArrayUtils.toPrimitive(mSparseArray.get(id));

            deviceAPI.postMessages(req, new Callback<IRDeviceAPIService.PostMessagesResponse>() {
                @Override
                public void success(IRDeviceAPIService.PostMessagesResponse postMessagesResponse, Response response) {
                    Toast.makeText(mContext, mContext.getString(R.string.toast_success), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void failure(RetrofitError error) {
                    Toast.makeText(mContext, mContext.getString(R.string.toast_failure), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public int getChanelId(int btnId) {
        int chId = ERR_CODE;
        switch (btnId) {
            case R.id.btn_cnl1:
                chId = KEY_CAHNEL_1;
                break;
            case R.id.btn_cnl2:
                chId = KEY_CAHNEL_2;
                break;
            case R.id.btn_cnl3:
                chId = KEY_CAHNEL_3;
                break;
            case R.id.btn_cnl4:
                chId = KEY_CAHNEL_4;
                break;
            case R.id.btn_cnl5:
                chId = KEY_CAHNEL_5;
                break;
            case R.id.btn_cnl6:
                chId = KEY_CAHNEL_6;
                break;
            case R.id.btn_cnl7:
                chId = KEY_CAHNEL_7;
                break;
            case R.id.btn_cnl8:
                chId = KEY_CAHNEL_8;
                break;
            case R.id.btn_cnl9:
                chId = KEY_CAHNEL_9;
                break;
            case R.id.btn_cnl10:
                chId = KEY_CAHNEL_10;
                break;
            case R.id.btn_cnl11:
                chId = KEY_CAHNEL_11;
                break;
            case R.id.btn_cnl12:
                chId = KEY_CAHNEL_12;
                break;
            default:
                break;
        }
        return chId;
    }

}