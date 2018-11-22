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
import com.example.swapn.gecacgpa.noncbcs.packag.CseNcFinal;
import com.example.swapn.gecacgpa.noncbcs.packag.NcGrades;

public class CseCFinal extends AppCompatActivity {

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
        setContentView(R.layout.activity_cse_cfinal);
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
                two.setText("Engineering Chemistry");
                three.setText("Engineering Graphics");
                four.setText("Engineering Mechanics");
                five.setText("BCOMP&IT/BECE");
                six.setText("Lab- Engineering Chemistr");
                seven.setText("Lab: Engineering Graphics ");
                eight.setText("Lab: Engineering Mechanics");
                nine.setText("Lab: BCOMP&IT/BECE ");
                ten.setText("Lab: Workshop-I");



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

            case 2: {
                one.setText("Engineering Mathematics-II");
                two.setText("Engineering Physics");
                three.setText("Communication Skills");
                four.setText("Biology");
                five.setText("BCOMP&IT/BECE");
                six.setText("Lab: Engineering Physics ");
                seven.setText("Lab:Communication Skills");
                eight.setText("Lab:BCOMP&IT/BECE ");
                nine.setText("Lab:Workshop-II");


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
            case 3:{


                one.setText("Engg. Mathematics-III");
                two.setText("Environmental Studies");
                three.setText("Object Oriented Programming");
                four.setText("Database Management System ");
                five.setText("Engineering Science(DMS) ");
                six.setText("Group Discussion");
                seven.setText("Lab:Database Management System");
                eight.setText("Lab:Object Oriented Programming ");
                nine.setText("Lab:Adv C & C++");
                ten.setText("Lab:Web Technology ");

                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 0;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;

                break;
            }
            case 4:
            {

                one.setText("Data Structure");
                two.setText("Computer Organization");
                three.setText("Microprocessor & Interfacing");
                four.setText("Engineering Science(OSST) ");
                five.setText("Open Elective -I");
                six.setText("Lab:Adv. Web Techmology");
                seven.setText("Lab: Data Structure");
                eight.setText("Lab: Microprocessor & Interfacing");
                nine.setText("Lab: Java Programming");


                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 2;
                cr_subjfive = 3;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 2;

                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);
                break;
            }
            case 5:
            {
                one.setText("Design & Analysis of Algorithm");
                two.setText("Operating System");
                three.setText("Theory of Computatation");
                four.setText("Software Engineering ");
                five.setText("Data Mining & Warehousing");
                six.setText("Lab:Design & Analysis of Algorithm");
                seven.setText("Lab:Operating System");
                eight.setText("Lab:Data Mining & Warehousing ");
                nine.setText("Mini Project");
                //eleven.setText("Basic of Product Survey");

                cr_subjone = 4;
                cr_subjtwo = 3;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 2;

                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                break;
            }
            case 6:
            {
                one.setText("Computer Network");
                two.setText("System Programming & Compiler Construction");
                three.setText("Advanced Algorithm");
                four.setText("Data Science");
                five.setText("Open Elective-I");
                six.setText("Lab:Addvanced Development Tool");
                seven.setText("Lab:Computer Network");
                eight.setText("Lab:Advanced Algorithm");
                nine.setText("Lab:Data Sccience");
                ten.setText("Seminar");


                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;

                break;
            }
            case 7:
            {
                one.setText("Big Data Analytics");
                two.setText("Humanity and Social Science");
                three.setText("Professional Elective I");
                four.setText("Professional Elective II");
                five.setText("Open Elective III");
                six.setText("Lab:Professional Elective I");
                seven.setText("Lab:Professional Elective II");
                eight.setText("Project I");


                cr_subjone = 3;
                cr_subjtwo = 2;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 2;

                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                break;
            }
            case 8:
            {
                one.setText("Humanity and Social Science");
                two.setText("Professional Elective III");
                three.setText("Professional Elective IV");
                four.setText("Open Elective IV");
                five.setText("Lab:Professional Elective III");
                six.setText("Lab:Professional Elective IV");
                seven.setText("Project II");


                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 1;
                cr_subjsix = 1;
                cr_subjseven = 6;

                sp8.setVisibility(View.INVISIBLE);
                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);



                break;
            }
            default:{
                Intent intent = new Intent(CseCFinal.this,CbcsMech.class);
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
