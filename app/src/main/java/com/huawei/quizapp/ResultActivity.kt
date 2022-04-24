package com.huawei.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val intent = getIntent()
        val tvScore = findViewById<TextView>(R.id.tv_score)
        val btnFinish = findViewById<TextView>(R.id.btn_finish)
        val CORRECT_ANSWERS = intent.getIntExtra("correct_answers", 0)
        tvScore.text = "You scored $CORRECT_ANSWERS out of 9"
        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
