package ie.wit.greetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.timer
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetingButton.setOnClickListener {
            val greetingText = getString(R.string.greeting_text)
            Toast.makeText(this, greetingText, Toast.LENGTH_LONG).show()
        }
        dismissalButton.setOnClickListener {
            val dissmissalText = getString(R.string.leaving_text)
            Toast.makeText(this,dissmissalText,Toast.LENGTH_LONG).show()
            exitProcess(0)
        }
    }

}
