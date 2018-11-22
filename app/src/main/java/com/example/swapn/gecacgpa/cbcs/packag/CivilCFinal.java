package com.example.swapn.gecacgpa.cbcs.packag;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.swapn.gecacgpa.CbcsMech;
import com.example.swapn.gecacgpa.R;
import com.example.swapn.gecacgpa.noncbcs.packag.NcGrades;

public class CivilCFinal extends AppCompatActivity {

    Spinner sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, sp11;
    TextView one, two, three, four, five, six, seven, eight, nine, ten, eleven;
    Button btnResult;
    String gsp1,gsp2,gsp3,gsp4,gsp5,gsp6,gsp7,gsp8,gsp9,gsp10,gsp11="E";
    int cr_subjone,cr_subjtwo,cr_subjthree,cr_subjfour,cr_subjfive,cr_subjsix,cr_subjseven,cr_subjeight,cr_subjnine,cr_subjten,cr_subjeleve=0;
    float total_credits,pointer = 0.0f;
    float own_marks=0.0f;
    int gp1,gp2,gp3,gp4,gp5,gp6,gp7,gp8,gp9,gp10,gp11=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_cfinal);
        one = findViewById(R.id.lb_subj_one);
        two = findViewById(R.id.lb_subj_two);
        three = findViewById(R.id.lb_subj_three);
        four = findViewById(R.id.lb_subj_four);
        five = findViewById(R.id.lb_subj_five);
        six = findViewById(R.id.lb_subj_six);
        seven = findViewById(R.id.lb_sub_seven);
        eight = findViewById(R.id.lb_subj_eight);
        nine = findViewById(R.id.lb_subj_nine);
        ten = findViewById(R.id.lb_subj_ten);
        eleven = findViewById(R.id.lb_subj_ele);

        sp1 = findViewById(R.id.sp_subj_one);
        sp2 = findViewById(R.id.sp_subj_two);
        sp3 = findViewById(R.id.sp_subj_three);
        sp4 = findViewById(R.id.sp_subj_four);
        sp5 = findViewById(R.id.sp_subj_five);
        sp6 = findViewById(R.id.sp_subj_six);
        sp7 = findViewById(R.id.sp_subj_seven);
        sp8 = findViewById(R.id.sp_subj_eight);
        sp9 = findViewById(R.id.sp_subj_nine);
        sp10 = findViewById(R.id.sp_subj_ten);
        sp11 = findViewById(R.id.sp_subj_ele);



        /*sp1.setOnItemClickListener(new V);*/






        btnResult = findViewById(R.id.btn_calculate);

        // Logic For Selecting Semester For Each Semester

        switch(CbcsMech.branch_sem) {
            case 1: {


                one.setText("Engineering Mathematics-I");
                two.setText("Engineering Physics");
                three.setText("Communication Skills");
                four.setText("Biology");
                five.setText("BCE");
                six.setText("Lab:Engineering Physics");
                seven.setText("Lab:Communication Skills");
                eight.setText("Lab:BCE");
                nine.setText("Lab:Workshop-I");


                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 3;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;



                break;
            }

            case 2: {
                one.setText("Engineering Mathematics-II");
                two.setText("Engineering Chemistry");
                three.setText("Engineering Graphics");
                four.setText("Engineering Mechanics");
                five.setText("BCE");
                six.setText("Lab:Engineering Chemistry");
                seven.setText("Lab:Engineering Graphics");
                eight.setText("Lab:Engineering Mechanics");
                nine.setText("Lab:BCE");
                ten.setText("Lab:Workshop-II");

                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 3;
                cr_subjthree = 3;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;

                break;
            }
            case 3:{


                one.setText("Environmental  Studies");
                two.setText("Engineering Mathematics-III ");
                three.setText("Solid Mechanics ");
                four.setText("Fluid Mechanics");
                five.setText("Surveying-I ");
                six.setText("Lab-Solid Mechanics");
                seven.setText("Lab-Fluid Mechanics");
                eight.setText("Lab-Surveying-I ");

                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;

                break;
            }
            case 4:
            {

                one.setText("Civil Engineering Materials ");
                two.setText("Structural Analysis ");
                three.setText("Building Planning and Design");
                four.setText("Surveying-II");
                five.setText("Lab-Civil Engineering Materials ");
                six.setText("Lab-Building Planning and Design ");
                seven.setText("Lab-Surveying-II");
                eight.setText("Open Elective-I ");


                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 3;
                cr_subjfive = 1;
                cr_subjsix = 2;
                cr_subjseven = 2;
                cr_subjeight = 3;

                break;
            }
            case 5:
            {
                one.setText("Engineering Economics");
                two.setText("Design of Steel Structures");
                three.setText("Transportation Engineering");
                four.setText("Environmental Engineering");
                five.setText("Geotechnical and Foundation Engineering");
                six.setText("Lab:Transportation Engineering");
                seven.setText("Lab:Environmental Engineering");
                eight.setText("Lab:Geotechnical and Foundation Engineering");
                nine.setText("Lab:Open Elective-II");
                //ten.setText("Lab:Industrial Organization and Management");
                //eleven.setText("Basic of Product Survey");

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 3;

                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                break;
            }
            case 6:
            {
                one.setText("Constitution Of India & Professional ethics");
                two.setText("Design of RCC structures");
                three.setText("Water Resources Engineering");
                four.setText("Engineering Geology");
                five.setText("Lab: Water Resources Engineering");
                six.setText("Lab: Engineering Geology");
                seven.setText("Lab:Structural Design and Drawing");
                eight.setText("Lab:Seminar");
                nine.setText("Lab:Open Elective -III");

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 1;
                cr_subjsix = 1;
                cr_subjseven = 2;
                cr_subjeight = 1;
                cr_subjnine = 3;
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                break;
            }
            case 7:
            {
                one.setText("Construction Management");
                two.setText("Lab: Construction Management");
                three.setText("Lab-Structural Design and Drawing II");
                four.setText("Mini Project");
                five.setText("Professionnal Elective I");
                six.setText("Professionnal Elective I");
                seven.setText("Professionnal Elective III");
                eight.setText("Lab:Professionnal Elective I");
                nine.setText("Lab:Professionnal Elective II");
                ten.setText("Lab:Professionnal Elective III");
                eleven.setText("Estimating and Costing");

                cr_subjone = 3;
                cr_subjtwo = 1;
                cr_subjthree = 2;
                cr_subjfour = 1;
                cr_subjfive = 3;
                cr_subjsix = 3;
                cr_subjseven = 3;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;
                cr_subjeleve = 3;


                break;
            }
            case 8:
            {
                one.setText("Project");
                two.setText("Lab-Estimating and Costing");
                three.setText("Professionnal Elective IV");
                four.setText("Professionnal Elective V");
                five.setText("Lab:Professionnal Elective IV");
                six.setText("Lab:Professionnal Elective V");

                cr_subjone = 6;
                cr_subjtwo = 2;
                cr_subjthree = 3;
                cr_subjfour = 3;
                cr_subjfive = 1;
                cr_subjsix = 1;



                sp7.setVisibility(View.INVISIBLE);
                sp8.setVisibility(View.INVISIBLE);
                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);



                break;
            }
            default:{
                Intent intent = new Intent(CivilCFinal.this,CbcsMech.class);
                startActivity(intent);
            }

        }

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NcGrades gobj = new NcGrades();





                // Retrieving Grades From Spinner
                gsp1 = sp1.getSelectedItem().toString();
                gsp2 = sp2.getSelectedItem().toString();
                gsp3 = sp3.getSelectedItem().toString();
                gsp4 = sp4.getSelectedItem().toString();
                gsp5 = sp5.getSelectedItem().toString();
                gsp6 = sp6.getSelectedItem().toString();
                gsp7 = sp7.getSelectedItem().toString();
                gsp8 = sp8.getSelectedItem().toString();
                gsp9 = sp9.getSelectedItem().toString();
                gsp10 = sp10.getSelectedItem().toString();
                gsp11 = sp11.getSelectedItem().toString();


                gp1 = gobj.getGrade(gsp1);
                gp2 = gobj.getGrade(gsp2);
                gp3 = gobj.getGrade(gsp3);
                gp4 = gobj.getGrade(gsp4);
                gp5 = gobj.getGrade(gsp5);
                gp6 = gobj.getGrade(gsp6);
                gp7 = gobj.getGrade(gsp7);
                gp8 = gobj.getGrade(gsp8);
                gp9 = gobj.getGrade(gsp9);
                gp10 = gobj.getGrade(gsp10);
                gp11 = gobj.getGrade(gsp11);

                total_credits = cr_subjone+cr_subjtwo+cr_subjthree+cr_subjfour+cr_subjfive+cr_subjsix+cr_subjseven+cr_subjeight+cr_subjnine+cr_subjten+cr_subjeleve;

                own_marks = (float)((cr_subjone*gp1) + (cr_subjtwo*gp2) + (cr_subjthree*gp3)+(cr_subjfour*gp4)+(cr_subjfive*gp5)+(cr_subjsix*gp6)+(cr_subjseven*gp7)+(cr_subjeight*gp8)+(cr_subjnine*gp9)+((cr_subjten*gp10))+((cr_subjeleve*gp11)));

                pointer =own_marks/total_credits;


                String res  = String.valueOf(pointer);

                Snackbar.make(v,"SGPA : " +res,Snackbar.LENGTH_INDEFINITE).show();
            }
        });

    }

}
