package com.trongqui.memories.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.media3.common.util.UnstableApi
import com.trongqui.memories.NativeX

@UnstableApi class DownloadBroadcastReceiver : BroadcastReceiver() {
    /**
     * Callback when download is complete
     */
    override fun onReceive(context: Context, intent: Intent) {
        NativeX.dlService?.runDownloadCallback(intent)
    }
}