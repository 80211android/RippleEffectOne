package com.example.mycustomrippleone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.appcompat.widget.AppCompatCheckBox
import com.rodolfonavalon.shaperipplelibrary.ShapeRipple
import com.rodolfonavalon.shaperipplelibrary.model.Circle

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

//    private val ripple: ShapeRipple? = null
    private lateinit var ripple: ShapeRipple
    private lateinit var button1: AppCompatCheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ripple_simple)

        init()
        setRippleColor()

//        initListeners()
    }

    private fun init() {

        ripple = findViewById<View>(R.id.ripple) as ShapeRipple
        ripple.setRippleShape(Circle())
//        button1 = findViewById(R.id.enable_color_transition)

//        ripple.post {
////            rippleCount.setMax(ripple.rippleCount * 2)
////            rippleCount.setProgress(ripple.rippleCount)
////            rippleMaxSize.setMax(ripple.rippleMaximumRadius.toInt() * 3)
////            rippleMaxSize.setProgress(ripple.rippleMaximumRadius.toInt())
////            rippleMaxSize.setMin((ripple.rippleMaximumRadius * 0.25).toInt())
//        }
        initRipple()
    }

    fun initRipple() {
        ripple.setRippleDuration(3000);
        ripple.setRippleCount(15);
        ripple.setRippleMaximumRadius(600F);
    }

    fun setRippleColor() {
        ripple.setRippleColor(R.color.black);
//        ripple.setRippleFromColor(R.color.my_green_color);
//        ripple.setEnableRandomColor(true);
    }

    fun initListeners() {
        button1.setOnCheckedChangeListener { buttonView, b ->

            val id = buttonView.getId();
            when (id) {
                R.id.enable_color_transition -> {
                    ripple.setEnableColorTransition(buttonView.isChecked());
                }
                R.id.enable_single_ripple -> {
                    ripple.setEnableSingleRipple(buttonView.isChecked())
                }
                R.id.enable_stroke_ripple -> {
                    ripple.setEnableStrokeStyle(buttonView.isChecked());
                }
            }
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton, p1: Boolean) {
        val id = buttonView.getId();

        when (id) {
            R.id.enable_color_transition -> {
                ripple.setEnableColorTransition(buttonView.isChecked());
            }
            R.id.enable_single_ripple -> {
                ripple.setEnableSingleRipple(buttonView.isChecked())
            }
            R.id.enable_stroke_ripple -> {
                ripple.setEnableStrokeStyle(buttonView.isChecked());
            }
        }



//        switch (id) {
//            case R.id.enable_color_transition:
//            ripple.setEnableColorTransition(buttonView.isChecked());
//            break;
//            case R.id.enable_single_ripple:
//            ripple.setEnableSingleRipple(buttonView.isChecked());
//            break;
//            case R.id.enable_random_position:
//            ripple.setEnableRandomPosition(buttonView.isChecked());
//            break;
//            case R.id.enable_random_color:
//            ripple.setEnableRandomColor(buttonView.isChecked());
//            break;
//            case R.id.enable_stroke_ripple:
//            ripple.setEnableStrokeStyle(buttonView.isChecked());
//            break;
//            default:
//
//        }
    }
}