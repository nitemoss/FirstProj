package lesson3;

import java.util.*;


public class Subject {
    public enum SubjectType {
        RUSSIAN,
        LITERATURE,
        MATH,
        SOCIAL,
        DNT
    }

    private SubjectType subjectType;
    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public static void startTest(){
        Scanner scanner = new Scanner (System.in);


        HashMap<SubjectType, String[][]> map = new HashMap<SubjectType, String[][]>();
        map.put(SubjectType.MATH, new String[][]{
                {"9*12", "102"},
                {"Числа египетского треугольника? (ответ в формате трёх чисел через пробел)", "3 4 5"},
                {"Первые две цифры числа pi после запятой?", "14"},
        });
        map.put(SubjectType.RUSSIAN, new String[][]{
                {"'Данное число не ________' делиться/делится ?", "делится"},
                {" ?", "делится"},
                {"Часть речи, отвечающая на вопрос 'какой'?", "прилагательное"}


        });
        map.put(SubjectType.LITERATURE, new String[][]{
                {"Год рождения Льва Толстого?", "1828"},
                {"Название стиха Лермонтова, посвященного Бородинской битве?", "Бородино"},


        });
        map.put(SubjectType.SOCIAL, new String[][]{
                {"Текущий президент Латвии?", "Levits"},
                {"Парламент Латвии?", "Сейм"},
                {"Конституция Латвии?", "Satversme"},


        });
        map.put(SubjectType.DNT, new String[][]{
                {"Станок для изготовки изделий?", "Верстак"},
                {"Парламент Латвии?", "Сейм"},
                {"Конституция Латвии?", "Satversme"},


        });


        SubjectType selectedSubject;
        System.out.println("Subject? math/russian/social/literature/dnt");
        String subject = scanner.nextLine();
        if(subject.equals("math")){
            selectedSubject = SubjectType.MATH;
        } else if(subject.equals("russian")){
            selectedSubject = SubjectType.RUSSIAN;
        } else if(subject.equals("literature")){
            selectedSubject = SubjectType.LITERATURE;
        } else if(subject.equals("dnt")){
            selectedSubject = SubjectType.DNT;
        }else if(subject.equals("social")){
            selectedSubject = SubjectType.SOCIAL;
        } else {
            selectedSubject = SubjectType.MATH;
        }

//        switch (subject.equals()){
//            case "math":
//                selectedSubject = SubjectType.MATH;
//            case "russian":
//                selectedSubject = SubjectType.RUSSIAN;
//            case "literature":
//                selectedSubject = SubjectType.LITERATURE;
//            case "dnt":
//                selectedSubject = SubjectType.DNT;
//            case "social":
//                selectedSubject = SubjectType.SOCIAL;
//            default:
//                selectedSubject = SubjectType.MATH;
//        }


//        System.out.println("map.toString() = " + map.get(selectedSubject).toString());

        int sum = 0;
        for(String[] key: map.get(SubjectType.MATH)){
            System.out.println(key[0]);


            System.out.println(">");
            String answer = scanner.nextLine();


            if(answer.toString().toLowerCase().equals(key[1].toString().toLowerCase())){
                System.out.println("correct");
                sum += 1;

            } else {

                System.out.println("Неверно. Правильный ответ: " + key[1]);
            }

        }

        System.out.println("Your results = " + sum + "/3");
    }

}


