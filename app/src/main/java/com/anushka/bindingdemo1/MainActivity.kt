package com.anushka.bindingdemo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo1.databinding.ActivityMainBinding
import com.anushka.bindingdemo1.model.Student

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.student = getStudent()

//        val student = getStudent()
//        binding.tvName.text = student.name
//        binding.tvEmail.text = student.email
    }

    private fun getStudent(): Student {
        return Student(1, "Alex", "john.mckinley@examplepetstore.com")
    }
}