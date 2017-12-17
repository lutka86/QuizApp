package com.example.android.theworldsinventions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        String nameOfPerson = nameEditText.getText().toString();

        //when field for name is empty
        if (nameOfPerson.equals("")){
            nameOfPerson = getString(R.string.stranger);
        }

        int score = 0;

        //Question 1 - Check which radio button is checked - when answer is correct - add 1 point to score
        RadioGroup radioGroup1 = findViewById(R.id.radio_group_1);
        int checked1RadioButtonId = radioGroup1.getCheckedRadioButtonId();
        if (checked1RadioButtonId == R.id.true_radio1_biro_brothers) {
            score = score + 1;
        }

        //Question 2 - Check which radio button is checked - when answer is correct - add 1 point to score
        RadioGroup radioGroup2 = findViewById(R.id.radio_group_2);
        int checked2RadioButtonId = radioGroup2.getCheckedRadioButtonId();

        if (checked2RadioButtonId == R.id.true_radio2_marie_curie) {
            score = score + 1;
        }

        //Question 3 - Get text from EditText and check if answer is correct - if correct - add 1 point to score
        EditText answer3EditText = findViewById(R.id.edit_text_galileo);
        String answer3 = answer3EditText.getText().toString();

        if (answer3.equals(getString(R.string.thermometer)) || answer3.equals(getString(R.string.Thermometer))) {
            score = score + 1;
        }

        //Question 4 - Check which checkboxes are checked - when all correct checkboxes are checked - add 1 point to score
        CheckBox hygrometerCheckBox = (CheckBox) findViewById(R.id.checkbox_hygrometer);
        boolean answerHygrometer = hygrometerCheckBox.isChecked();

        CheckBox swivelChairCheckBox = (CheckBox) findViewById(R.id.true_checkbox_swivel_chair);
        boolean answerSwivelChair = swivelChairCheckBox.isChecked();

        CheckBox sphericalSundialCheckBox = (CheckBox) findViewById(R.id.true_checkbox_spherical_sundial);
        boolean answerSphericalSundial = sphericalSundialCheckBox.isChecked();

        CheckBox moldboardPlowCheckBox = (CheckBox) findViewById(R.id.true_checkbox_moldboard_plow);
        boolean answerMoldboardPlow = moldboardPlowCheckBox.isChecked();

        CheckBox radioCheckBox = (CheckBox) findViewById(R.id.checkbox_radio);
        boolean answerRadio = radioCheckBox.isChecked();

        CheckBox cipherWheelCheckBox = (CheckBox) findViewById(R.id.true_checkbox_cipher_wheel);
        boolean answerCipherWheel = cipherWheelCheckBox.isChecked();

        if (answerSwivelChair & answerSphericalSundial & answerMoldboardPlow & answerCipherWheel & answerHygrometer == false & answerRadio == false) {
            score = score + 1;
        }

        //Question 5 - Check which radio button is checked - when answer is correct - add 1 point to score
        RadioGroup radioGroup5 = findViewById(R.id.radio_group_5);
        int checked5RadioButtonId = radioGroup5.getCheckedRadioButtonId();

        if (checked5RadioButtonId == R.id.true_radio5_rotary_steam_engine) {
            score = score + 1;
        }

        //Question 6 - Check which radio button is checked - when answer is correct - add 1 point to score
        RadioGroup radioGroup6 = findViewById(R.id.radio_group_6);
        int checked6RadioButtonId = radioGroup6.getCheckedRadioButtonId();

        if (checked6RadioButtonId == R.id.true_radio6_parachute) {
            score = score + 1;
        }

        //Question 7 - Check which radio button is checked - when answer is correct - add 1 point to score
        RadioGroup radioGroup7 = findViewById(R.id.radio_group_7);
        int checked7RadioButtonId = radioGroup7.getCheckedRadioButtonId();

        if (checked7RadioButtonId == R.id.true_radio7_1870) {
            score = score + 1;
        }

        //Question 8 - Check which checkboxes are checked - when all correct checkboxes are checked - add 1 point to score
        CheckBox bifocalSpectaclesCheckBox = (CheckBox) findViewById(R.id.true_checkbox_bifocal_spectacles);
        boolean answerBifocalSpectacles = bifocalSpectaclesCheckBox.isChecked();

        CheckBox radio2CheckBox = (CheckBox) findViewById(R.id.checkbox_radio_2);
        boolean answerRadio2 = radio2CheckBox.isChecked();

        CheckBox barometerCheckBox = (CheckBox) findViewById(R.id.checkbox_barometer);
        boolean answerBarometer = barometerCheckBox.isChecked();

        CheckBox hygrometer2CheckBox = (CheckBox) findViewById(R.id.checkbox_hygrometer_2);
        boolean answerHygrometer2 = hygrometer2CheckBox.isChecked();

        CheckBox lightningRodCheckBox = (CheckBox) findViewById(R.id.true_checkbox_lightning_rod);
        boolean answerLightningRod = lightningRodCheckBox.isChecked();

        CheckBox rockingChairCheckBox = (CheckBox) findViewById(R.id.true_checkbox_rocking_chair);
        boolean answerRockingChair = rockingChairCheckBox.isChecked();

        if (answerBifocalSpectacles & answerLightningRod & answerRockingChair & answerRadio2 == false & answerHygrometer2 == false & answerBarometer == false) {
            score = score + 1;
        }

        //Question 9 - Check which radio button is checked - when answer is correct - add 1 point to score
        RadioGroup radioGroup9 = findViewById(R.id.radio_group_9);
        int checked9RadioButtonId = radioGroup9.getCheckedRadioButtonId();

        if (checked9RadioButtonId == R.id.true_radio9_1930) {
            score = score + 1;
        }

        //Question 10 - Get text from EditText and check if answer is correct - if correct - add 1 point to score
        EditText answer10EditText = findViewById(R.id.edit_text_yoyo);
        String answer10 = answer10EditText.getText().toString();

        if (answer10.equals(getString(R.string.Philippines)) || answer10.equals(getString(R.string.philippines))) {
            score = score + 1;
        }

       displayToast(nameOfPerson, score);
    }

    private void displayToast(String nameOfPerson, int score) {

        if (score == 10) {
            Toast.makeText(this, getString(R.string.hey) + " " + nameOfPerson + getString(R.string.you_get) + " " + String.valueOf(score) + getString(R.string.ten) + " " + getString(R.string.congratulations), Toast.LENGTH_LONG).show();
        } else {
            if (score == 0) {
                Toast.makeText(this, getString(R.string.hey) + " " + nameOfPerson + getString(R.string.unfortunately) + " " + String.valueOf(score) + getString(R.string.ten) + " " + getString(R.string.try_again), Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, getString(R.string.hey) + " " + nameOfPerson + getString(R.string.you_get) + " " + String.valueOf(score) + getString(R.string.ten) + " " + getString(R.string.maximum_points), Toast.LENGTH_LONG).show();
            }
        }
    }
    }







