package com.example.swapn.gecacgpa.noncbcs.packag;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.swapn.gecacgpa.OldMech;
import com.example.swapn.gecacgpa.R;

public class EtcNcFinal extends AppCompatActivity {

    Spinner sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, sp11,sp12;
    TextView one, two, three, four, five, six, seven, eight, nine, ten, eleven,twel;
    Button btnResult;
    String gsp1,gsp2,gsp3,gsp4,gsp5,gsp6,gsp7,gsp8,gsp9,gsp10,gsp11,gsp12="E";
    int cr_subjone,cr_subjtwo,cr_subjthree,cr_subjfour,cr_subjfive,cr_subjsix,cr_subjseven,cr_subjeight,cr_subjnine,cr_subjten,cr_subjeleve,cr_subjtwel=0;
    float total_credits,pointer = 0.0f;
    float own_marks=0.0f;
    int gp1,gp2,gp3,gp4,gp5,gp6,gp7,gp8,gp9,gp10,gp11,gp12=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc_nc_final);
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
        twel = findViewById(R.id.lb_subj_twel);

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
        sp12 = findViewById(R.id.sp_subj_twel);



        /*sp1.setOnItemClickListener(new V);*/






        btnResult = findViewById(R.id.btn_calculate);

        // Logic For Selecting Semester For Each Semester

        switch(OldMech.ncbranch_sem) {
            case 1: {



                one.setText("Engineering Mathematics-I");
                two.setText("Engineering Chemistry");
                three.setText("Engineering Graphics");
                four.setText("Engineering Mechanics");
                five.setText("BCOMPIT/BECE");
                six.setText("Lab:Engineering Chemistry");
                seven.setText("Lab:Engineering Graphics");
                eight.setText("Lab:Engineering Mechanics");
                nine.setText("BCOMPIT/BECE");
                ten.setText("Lab:Workshop-I");

                sp11.setVisibility(View.INVISIBLE);
                sp12.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 2;
                cr_subjnine = 1;




                break;
            }

            case 2: {
                one.setText("Engineering Mathematics-II");
                two.setText("Engineering Physics");
                three.setText("Communication Skills");
                four.setText("Biology");
                five.setText("COMP/IT/ECE");
                six.setText("Lab:Engineering Physics");
                seven.setText("Lab:Communication Skills");
                eight.setText("LAb:COMP/IT/ECE");
                nine.setText("Lab:Workshop-II");

                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);
                sp12.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 2;
                cr_subjnine = 1;


                break;
            }
            case 3:{


                one.setText("Environmental Studies");
                two.setText("Engineering Mathematics-III ");
                three.setText("Electronic Devices &  Circuits");
                four.setText("Signals & Systems");
                five.setText("Digital Electronics");
                six.setText("C Programming");
                seven.setText("Lab:Electronic Devices & Circuits");
                eight.setText("Lab:Signals & Systems");
                nine.setText("Lab:Digital Electronics");
                ten.setText("Lab:C Programming");

                sp11.setVisibility(View.INVISIBLE);
                sp12.setVisibility(View.INVISIBLE);

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 3;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 2;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 2;

                break;
            }
            case 4:
            {

                one.setText("Engineering Mathematics-IV");
                two.setText("Basics of Electronics Engineering");
                three.setText("Industrial Economics and Telecommunication Regulation");
                four.setText("Network &Lines");
                five.setText("Analog Communication Theory");
                six.setText("Lab:Network & Lines");
                seven.setText("Lab:Linear Integrated Circuits");
                eight.setText("Lab:Analog Communication Theory");
                nine.setText("Electronic Workshop - I");


                cr_subjone = 4;
                cr_subjtwo = 3;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 2;
                cr_subjeight = 1;
                cr_subjnine = 2;


                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);
                sp12.setVisibility(View.INVISIBLE);
                break;
            }
            case 5:
            {
                one.setText("Instrumentation Measurement");
                two.setText("Microprocessor & Peripherals ");
                three.setText("Digital Signal Processing");
                four.setText("Digital Communication");
                five.setText("Object Oriented Programming");
                six.setText("Lab :Instrumentation Measurement & OOP");
                seven.setText("Lab:Microprocessor Peripherals");
                eight.setText("Lab:Digital Signal Processing ");
                nine.setText("Lab:Digital Communication");
                ten.setText("Electronics Workshop - II");


                cr_subjone = 3;
                cr_subjtwo = 3;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 4;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
               cr_subjten = 1;
               sp11.setVisibility(View.INVISIBLE);
                sp12.setVisibility(View.INVISIBLE);

                break;
            }
            case 6:
            {
                one.setText("Microcontroller Systems");
                two.setText("Control Systems");
                three.setText("Electronics Design Technology");
                four.setText("Electromagnetic Engineering");
                five.setText("Elective I");
                six.setText("Lab:Microcontroller Systems");
                seven.setText("Lab:Control Systems");
                eight.setText("Lab:Electronics Design Technology");
                nine.setText("Lab:Elective I");
                ten.setText("Open Source Software");


                sp11.setVisibility(View.INVISIBLE);
                sp12.setVisibility(View.INVISIBLE);

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 1;
                cr_subjseven =1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 2;

                break;
            }
            case 7:
            {
                one.setText("Power Electronics");
                two.setText("Embedded Systems");
                three.setText("Microwave Engineering");
                four.setText("Computer Network ");
                five.setText("Elective II ");
               /* six.setText("Digital Image Processing");
                seven.setText("Information Theory & Coding");
                eight.setText("Radar & Satellite Communication");*/
                six.setText("Lab:Power Electronics ");
                seven.setText("Lab:Embedded Systems");
                eight.setText("Lab:Microwave Engineering");
                nine.setText("Lab:Computer Network ");
                ten.setText("Lab:Elective II");
                eleven.setText("Project Part I");
                sp12.setVisibility(View.INVISIBLE);

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;
                cr_subjeleve = 1;


                break;
            }
            case 8:
            {
                one.setText("Wireless Communication ");
                two.setText("Industrial Automation ");
                three.setText("Optical Fiber Communication");
                four.setText("Android Applications Developmen");
                five.setText("Elective III ");
                six.setText("Lab:Wireless Communication");
                seven.setText("Lab:Industrial Automation n");
                eight.setText("Lab:Optical Fiber Communication");
                nine.setText("Lab:Elective III ");
                ten.setText("Project Part II ");

                sp11.setVisibility(View.INVISIBLE);

                sp12.setVisibility(View.INVISIBLE);


                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 2;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 2;


                break;
            }
            default:{
                Intent intent = new Intent(EtcNcFinal.this,OldMech.class);
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
                gsp12 = sp12.getSelectedItem().toString();


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
                gp12 = gobj.getGrade(gsp12);

                total_credits = cr_subjone+cr_subjtwo+cr_subjthree+cr_subjfour+cr_subjfive+cr_subjsix+cr_subjseven+cr_subjeight+cr_subjnine+cr_subjten+cr_subjeleve+cr_subjtwel;

                own_marks = (float)((cr_subjone*gp1) + (cr_subjtwo*gp2) + (cr_subjthree*gp3)+(cr_subjfour*gp4)+(cr_subjfive*gp5)+(cr_subjsix*gp6)+(cr_subjseven*gp7)+(cr_subjeight*gp8)+(cr_subjnine*gp9)+((cr_subjten*gp10))+((cr_subjeleve*gp11))+((cr_subjtwel*gp12)));

                pointer =own_marks/total_credits;


                String res  = String.valueOf(pointer);

                Snackbar.make(v,"SGPA : " +res,Snackbar.LENGTH_INDEFINITE).show();
            }
        });
    }
}
