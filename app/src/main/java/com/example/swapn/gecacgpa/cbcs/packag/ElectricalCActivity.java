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

public class ElectricalCActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_electrical_c);
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


                one.setText("Engg. Mathematics-III");
                two.setText("Environmental Studies");
                three.setText("Electromagnetic Field");
                four.setText("Network Analysis");
                five.setText("Analog Electronics");
                six.setText("Commputer Programming");
                seven.setText("Lab: Network Analysis");
                eight.setText("Lab:Analog Electronics");
                nine.setText("Lab:Computer Programming");


                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 3;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;


                break;
            }
            case 4:
            {

                one.setText("Optional HSS Subject");
                two.setText("Electrical Machines-I");
                three.setText("Electrical Measurement and Instrumentation");
                four.setText("Power System I");
                five.setText("Linear IC and Applications");
                six.setText("Optional ES Courses");
                seven.setText("Optional Mandatory Courses");
                eight.setText("Lab:Electrical Machines-I");
                nine.setText("Lab:Electrical Measurement and Instrumentation");
                ten.setText("Lab:Linear IC and Applications");


                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 0;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;

                sp11.setVisibility(View.INVISIBLE);


                break;
            }
            case 5:
            {
                one.setText("Optional HSS");
                two.setText("Reneweable Energy Technology");
                three.setText("Electrical Machines-II");
                four.setText("Digital Electronics");
                five.setText("Power System II");
                six.setText("Control Systems");
                seven.setText("Mandatory Subject:");
                eight.setText("Lab:Electrical Machines-II");
                nine.setText("Lab:Digital Electronics");
                ten.setText("Lab:Power System II");
                eleven.setText("Lab:Control Systems");

                cr_subjone = 2;
                cr_subjtwo = 3;
                cr_subjthree = 4;
                cr_subjfour = 3;
                cr_subjfive = 3;
                cr_subjsix = 3;
                cr_subjseven = 0;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;
                cr_subjeleve = 1;


                break;
            }
            case 6:
            {
                one.setText("Open Elective I");
                two.setText("Switchgear and Protection");
                three.setText("Microprocessor and Microcontroller");
                four.setText("Power Electronics");
                five.setText("Advanced Power Electronics");
                six.setText("Advanced Control Systems");
                seven.setText("Lab:Switchgear and Protection");
                eight.setText("Lab:Microprocessor and Microcontroller");
                nine.setText("Lab:Power Electronics");


                cr_subjone = 3;
                cr_subjtwo = 3;
                cr_subjthree = 3;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 3;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                break;
            }
            case 7:
            {
                one.setText("Open Elective II");
                two.setText("Open Elective III");
                three.setText("Electric Drives");
                four.setText("Professional Elective -I");
                five.setText("Professional Elective -II");
                six.setText("Lab: Elective Drives");
                seven.setText("Lab:Innvocation/MinProject");
                eight.setText("Lab:Project Phase I");
                nine.setText("Lab:Internship");


                cr_subjone = 3;
                cr_subjtwo = 3;
                cr_subjthree = 3;
                cr_subjfour = 4;
                cr_subjfive = 4;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 2;
                cr_subjnine = 1;
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);

                break;
            }
            case 8:
            {
                one.setText("Open Elective IV");
                two.setText("Professional Elective-III");
                three.setText("Professional Elective-IV");
                four.setText("Professional Elective-V");
                five.setText("Project Phase II");
                six.setText("Electrical Equipment Specifications Lab");


                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 6;
                cr_subjsix = 1;

                sp7.setVisibility(View.INVISIBLE);
                sp8.setVisibility(View.INVISIBLE);
                sp9.setVisibility(View.INVISIBLE);
                sp10.setVisibility(View.INVISIBLE);
                sp11.setVisibility(View.INVISIBLE);


                break;
            }
            default:{
                Intent intent = new Intent(ElectricalCActivity.this,CbcsMech.class);
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
