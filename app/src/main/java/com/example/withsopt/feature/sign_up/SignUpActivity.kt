package com.example.withsopt.feature.sign_up

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.withsopt.R
import com.example.withsopt.feature.follower_list.FollowerListActivity

class SignUpActivity : AppCompatActivity() {

    private var edtSignUpName: EditText? = null
    private var edtSignUpId: EditText? = null
    private var edtSignUpPw: EditText? = null
    private var edtSignUpPwCk: EditText? = null
    private var btnSignUpSummit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        edtSignUpName = findViewById(R.id.edtSignUpName)
        edtSignUpId = findViewById(R.id.edtSignUpId)
        edtSignUpPw = findViewById(R.id.edtSignUpPw)
        edtSignUpPwCk = findViewById(R.id.edtSignUpPwCk)
        btnSignUpSummit = findViewById(R.id.btnSignUpSubmmit)

        // 회원가입완료 버튼 클릭
        btnSignUpSummit?.setOnClickListener {
            val name = edtSignUpName?.text.toString()
            val id = edtSignUpId?.text.toString()
            val pw = edtSignUpPw?.text.toString()
            val pwCk = edtSignUpPwCk?.text.toString()

            // 빈 곳 있는지 체크
            if (name.isEmpty() || id.isEmpty() || pw.isEmpty() || pwCk.isEmpty()) {
                Toast.makeText(this, "빈칸없이 모두 작성해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 비밀번호와 비밀번호 확인이 일치하는지 체크
            if (pw != pwCk) {
                Toast.makeText(this, "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 회원가입 요청
            val response = requestSignup(name, id, pw)

            // 회원가입 성공
            if (response) {

                val intent = Intent()
                // 회원가입 성공한 아이디 전달
                intent.putExtra("Id", id)
                intent.putExtra("Pw", pw)
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            else { // 회원가입 실패
                Toast.makeText(this, "회원가입에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun requestSignup(name: String, id: String, pw:String): Boolean {
        return true
    }
}
