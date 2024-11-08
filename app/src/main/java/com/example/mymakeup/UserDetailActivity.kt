package com.example.mymakeup

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.mymakeup.databinding.ActivityUserDetailBinding
import com.example.mymakeup.model.Permit

class UserDetailActivity : AppCompatActivity() {
    companion object {
        const val USER_PERMIT = "user_permit"
        private const val TAG = "UserDetailActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        try {
            val binding: ActivityUserDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_detail)

            val permit: Permit = intent.getParcelableExtra(USER_PERMIT) ?: Permit()
            Log.d(TAG, "Received Permit object: $permit")

            binding.permit = permit
        } catch (e: Exception) {
            Log.e(TAG, "Error in onCreate(): ", e)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
