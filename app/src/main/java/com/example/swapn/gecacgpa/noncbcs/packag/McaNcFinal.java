package com.example.swapn.gecacgpa.noncbcs.packag;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.swapn.gecacgpa.CbcsMech;
import com.example.swapn.gecacgpa.OldMech;
import com.example.swapn.gecacgpa.R;

public class McaNcFinal extends AppCompatActivity {

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
        setContentView(R.layout.activity_mca_nc_final);

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




        btnResult = findViewById(R.id.btn_calculate);

        // Logic For Selecting Semester For Each Semester

        switch(OldMech.ncbranch_sem) {
            case 1: {


                one.setText("Discrete Mathematics");
                two.setText("Computer Programming");
                three.setText("Web Technology");
                four.setText("Data Structures");
                five.setText("Communication Skills");
                six.setText("Lab: Computer Programming");
                seven.setText("Lab: Web Technology");
                eight.setText("Lab: Data Structures");
                nine.setText("Lab: Communication Skills");

                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 2;
                cr_subjseven = 2;
                cr_subjeight = 1;
                cr_subjnine = 1;
                break;
            }


            case 2: {
                one.setText("Object Oriented Programming ");
                two.setText("Computer Graphics");
                three.setText("RDBMS");
                four.setText("Software Engineering");
                five.setText("NSM");
                six.setText("LAB:OOP");
                seven.setText("LAB:CG");
                eight.setText("LAB:RDBMS");
                nine.setText("LAB:NSM");


                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 3;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 2;
                cr_subjnine = 1;


                break;
            }
            case 3:{


                one.setText("Core Java");
                two.setText("Design & Analysis of Algorithm");
                three.setText("Computer Network");
                four.setText("Operating System");
                five.setText("MFI");
                six.setText("Lab- Core Java");
                seven.setText("Lab- Design & Analysis of Algorithm ");
                eight.setText("Lab- Operating System");
                nine.setText("Lab-Advanced Development Tools-I");
                sp10.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 2;

                break;
            }
            case 4:
            {

                one.setText("Advanced Java ");
                two.setText("Software Testing Techniques");
                three.setText("Cyber Security & Cyber Laws ");
                four.setText("Data Mining Techniques");
                five.setText("Software Project Management ");
                six.setText("Lab- Advanced Java ");
                seven.setText("Lab- Software Testing Techniques");
                eight.setText("Seminar ");
                nine.setText("Lab-Advanced Development Tools-II ");
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 3;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 2;


                break;
            }
            case 5:
            {
                one.setText("Mobile Computing");
                two.setText("ADBMS");
                three.setText("Big Data Analytics");
                four.setText("Elective");
                five.setText("Lab: Mobile Computing");
                six.setText("Lab:ADBMS");
                seven.setText("Lab: Big Data Analytics");
                eight.setText("Lab: Elective");
                nine.setText("Lab:Software Project Development");
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 5;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 2;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 2;


                break;
            }
            case 6:
            {
                six.setText("In This semester only Desertation is Being Conducted");
                six.setGravity(Gravity.CENTER);
                six.setTextSize(20);
                sp1.setVisibility(View.INVISIBLE);
                sp2.setVisibility(View.INVISIBLE);
                sp3.setVisibility(View.INVISIBLE);
                sp4.setVisibility(View.INVISIBLE);
                sp5.setVisibility(View.INVISIBLE);
                sp6.setVisibility(View.INVISIBLE);
                sp7.setVisibility(View.INVISIBLE);
                sp8.setVisibility(View.INVISIBLE);
                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);
                btnResult.setVisibility(View.INVISIBLE);
                break;
            }
            case 7:
            {
                six.setText("MCA is OF Only Six Semesters");
                six.setGravity(Gravity.CENTER);
                six.setTextSize(20);
                sp1.setVisibility(View.INVISIBLE);
                sp2.setVisibility(View.INVISIBLE);
                sp3.setVisibility(View.INVISIBLE);
                sp4.setVisibility(View.INVISIBLE);
                sp5.setVisibility(View.INVISIBLE);
                sp6.setVisibility(View.INVISIBLE);
                sp7.setVisibility(View.INVISIBLE);
                sp8.setVisibility(View.INVISIBLE);
                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                btnResult.setVisibility(View.INVISIBLE);
            }
            case 8:
            {
                six.setText("MCA is OF Only Six Semesters");
                six.setGravity(Gravity.CENTER);
                six.setTextSize(20);
                sp1.setVisibility(View.INVISIBLE);
                sp2.setVisibility(View.INVISIBLE);
                sp3.setVisibility(View.INVISIBLE);
                sp4.setVisibility(View.INVISIBLE);
                sp5.setVisibility(View.INVISIBLE);
                sp6.setVisibility(View.INVISIBLE);
                sp7.setVisibility(View.INVISIBLE);
                sp8.setVisibility(View.INVISIBLE);
                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);
                btnResult.setVisibility(View.INVISIBLE);
                break;
            }
            default:{
                Intent intent = new Intent(McaNcFinal.this,CbcsMech.class);
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

