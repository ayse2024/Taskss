package JD04;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel=8;
        String result;
        if (gradeLevel>0 && gradeLevel<=5){result="Elementary school";}
        else if (gradeLevel>5 && gradeLevel<=8){result="Middle school";}
        else if (gradeLevel>8 && gradeLevel<=12){result="High school";}
        else if (gradeLevel>12 && gradeLevel<=16){result="College";}
        else if (gradeLevel>16 && gradeLevel<=18){result="Middle school";}
        else  result="Invalid grade level." ;
        System.out.println(result);

    }
}
