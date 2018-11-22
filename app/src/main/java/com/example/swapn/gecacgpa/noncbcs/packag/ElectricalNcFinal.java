package com.example.swapn.gecacgpa.noncbcs.packag;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.swapn.gecacgpa.CbcsMech;
import com.example.swapn.gecacgpa.OldMech;
import com.example.swapn.gecacgpa.R;

public class ElectricalNcFinal extends AppCompatActivity {


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
        setContentView(R.layout.activity_electrical_nc_final);

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


                one.setText(R.string.msemone_first_subject);
                two.setText(R.string.msemone_second_subject);
                three.setText(R.string.msemone_Third_subject);
                four.setText(R.string.msemone_Fourth_subject);
                five.setText(R.string.msemone_Fifth_subject);
                six.setText(R.string.msemone_Sixth_subject);
                seven.setText(R.string.msemone_Seventh_subject);
                eight.setText(R.string.msemone_Eightth_subject);
                nine.setText(R.string.msemone_Nineth_subject);

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

            case 2: {
                one.setText(R.string.msemtwo_first_subject);
                two.setText(R.string.msemtwo_second_subject);
                three.setText(R.string.msemtwo_Third_subject);
                four.setText(R.string.msemtwo_Fourth_subject);
                five.setText(R.string.msemtwo_Fifth_subject);
                six.setText(R.string.msemtwo_Sixth_subject);
                seven.setText(R.string.msemtwo_Seventh_subject);
                eight.setText(R.string.msemtwo_Eightth_subject);
                nine.setText(R.string.msemtwo_Nineth_subject);
                ten.setText(R.string.msemtwo_Tenth_subject);

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


                one.setText("Engineering Mathematics-III ");
                two.setText("Environmental Studies");
                three.setText("Transformers & DC Machines");
                four.setText("Network Analysis ");
                five.setText("Electrical Measurement Instrumentation");
                six.setText("GTADOEP");
                seven.setText("Lab Transformers Machines");
                eight.setText("Lab Network Analysis");
                nine.setText("Lab Electrical Measurement Instrumentation");
                ten.setText("Lab Generation of electrical Energy");

                sp11.setVisibility(View.INVISIBLE);
                sp12.setVisibility(View.INVISIBLE);

                cr_subjone = 4;
                cr_subjtwo = 3;
                cr_subjthree = 3;
                cr_subjfour = 4;
                cr_subjfive = 3;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 2;

                break;
            }
            case 4:
            {

                one.setText("General Elective-II");
                two.setText("Engineering Mathematics-IV");
                three.setText("Asynchronous Machines");
                four.setText("Electromagnetic Field ");
                five.setText("Electronic Devices and Circuits");
                six.setText("Renewable energy Technology");
                seven.setText("Lab:Asynchronous Machines ");
                eight.setText("Lab:Electronic Devices and Circuits");
                nine.setText("Lab Numerical Computational Techniques");
                ten.setText("Lab:Renewable energy Technology");
                eleven.setText("Lab:Electrical workshop");

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 3;
                cr_subjfive = 4;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;
                cr_subjeleve = 1;


                sp12.setVisibility(View.INVISIBLE);
                break;
            }
            case 5:
            {
                one.setText("Synchronous Machines");
                two.setText("Digital Electronics");
                three.setText("Power System Analysis");
                four.setText("Estimation, Testing and Maintenance");
                five.setText("Control Systems I");
                six.setText("Utilization of Electrical energy");
                seven.setText("Lab:Synchronous Machines");
                eight.setText("Lab:Digital Electronics ");
                nine.setText("Lab:Power System Analysis ");
                ten.setText("Lab Estimation, Testing and Maintenance");
                eleven.setText("Lab:Control Systems");
                twel.setText("Mini Project");

                cr_subjone = 3;
                cr_subjtwo = 4;
                cr_subjthree = 3;
                cr_subjfour = 2;
                cr_subjfive = 4;
                cr_subjsix = 2;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 1;
                cr_subjeleve = 1;
                cr_subjtwel = 1;

                break;
            }
            case 6:
            {
                one.setText("Switchgear and Protection");
                two.setText("Control Systems II");
                three.setText("Linear Integrated Circuits and Applications");
                four.setText("Power Electronics");
                five.setText("Microprocessor and Interfacing Techniques");
                six.setText("Lab:Switchgear and Protection");
                seven.setText("Lab:Simulation");
                eight.setText("Lab:Linear Integrated Circuits and Applications");
                nine.setText("Lab:Power Electronics");
                ten.setText("Lab:Microprocessors and Interfacing ");
                eleven.setText("Seminar");
                sp12.setVisibility(View.INVISIBLE);

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
                cr_subjeleve = 2;
                break;
            }
            case 7:
            {
                one.setText("AMM");
                two.setText("Energy Conservation and Management");
                three.setText("Electrical Drives");
                four.setText("Power System Operation and Control");
                five.setText("Electrical Materials");
                six.setText("Elective I");
                seven.setText("Lab:AMM");
                eight.setText("Lab:Electrical drives");
                nine.setText("Lab:Energy");
                ten.setText("Project Phase I");
                eleven.setText("*In-plant Training seminar");
                sp12.setVisibility(View.INVISIBLE);

                cr_subjone = 3;
                cr_subjtwo = 2;
                cr_subjthree = 4;
                cr_subjfour = 4;
                cr_subjfive = 2;
                cr_subjsix = 3;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 2;
                cr_subjeleve = 1;


                break;
            }
            case 8:
            {
                one.setText("Digital Signal Processing ");
                two.setText("High Voltage Engineering");
                three.setText("Industrial Organization and Management ");
                four.setText("Modern Trends in Electrical Engineering ");
                five.setText("Elective II ");
                six.setText("Lab:Digital Signal Processing");
                seven.setText("Lab:Electrical Equipment Specification and Design");
                eight.setText("Lab:soft skill");
                nine.setText("Lab:High Voltage Engineering");
                ten.setText("Project Phase II ");
                eleven.setText("Comprehensive viva voce");

                sp12.setVisibility(View.INVISIBLE);


                cr_subjone = 3;
                cr_subjtwo = 3;
                cr_subjthree = 2;
                cr_subjfour = 2;
                cr_subjfive = 3;
                cr_subjsix = 1;
                cr_subjseven = 1;
                cr_subjeight = 1;
                cr_subjnine = 1;
                cr_subjten = 6;
                cr_subjeleve = 1;


                break;
            }
            default:{
                Intent intent = new Intent(ElectricalNcFinal.this,OldMech.class);
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
