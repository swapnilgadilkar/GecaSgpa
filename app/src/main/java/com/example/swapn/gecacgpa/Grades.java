package com.example.swapn.gecacgpa;

public class Grades {

    public int getGrade(String gsp)
    {

        int gsubj=0;
        switch (gsp)
        {


            case "A++":{

                gsubj = 10;
                break;


            }
            case "A+":{
                gsubj = 9;
                break;
            }
            case "A":{
                gsubj = 8;
                break;
            }
            case "B+":{
                gsubj = 7;
                break;
            }
            case "B":{
                gsubj = 6;
                break;
            }
            case "C+":{
                gsubj = 5;
                break;
            }
            case "D":{
                gsubj = 0;
                break;
            }


        }

        return gsubj;
    }

}
