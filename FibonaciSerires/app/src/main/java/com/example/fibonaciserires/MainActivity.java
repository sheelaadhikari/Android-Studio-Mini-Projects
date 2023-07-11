package  com.example.fibonaciserires;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    class Numbers {
        int num;

        // Perfect Square
        public boolean isPerfectSquare()
        {
            double sqRoot = (int)Math.sqrt(num);
            return sqRoot * sqRoot == num;
        }

        // Print fibonacci series
        public boolean isFibonaaciNumber()
        {
            this.num = 5 * num * num + 4;
            boolean var1 = isPerfectSquare();
            this.num = 5 * num * num - 4;
            boolean var2 = isPerfectSquare();
            return (var1 || var2);
        }
    }

    public void onButtonClick(View view)
    {

        EditText editText
                = findViewById(R.id.editTextTextPersonName);
        Numbers myNum = new Numbers();
        myNum.num = Integer.parseInt(
                editText.getText().toString());
        String message = editText.getText().toString();

        if (myNum.isPerfectSquare()
                && myNum.isFibonaaciNumber()) {
            message += " is square and Fibonacci ";
        }
        else if (myNum.isPerfectSquare()) {

            message += "is square but not Fibonacci";
        }
        else if (myNum.isFibonaaciNumber()) {
            message += "is Fibonacci but not square";
        }

        else {
            message += "neither Fibonacci nor square";
        }

        Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
