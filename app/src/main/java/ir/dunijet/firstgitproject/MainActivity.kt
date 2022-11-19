package ir.dunijet.firstgitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "hello to all after first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number1", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number2", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number3", Toast.LENGTH_SHORT).show()

        Toast.makeText(this, "i am in develop branch", Toast.LENGTH_SHORT).show()
    }
}