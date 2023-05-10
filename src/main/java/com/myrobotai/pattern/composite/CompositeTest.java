package com.myrobotai.pattern.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Employee market = new Employee("zhangSan","market");
        Employee hr = new Employee("liSi","hr");

        Employee employee1= new Employee("wangWu","market");
        Employee employee2 =new Employee("zhaoLiu","hr");

        market.add(employee1);
        hr.add(employee2);

        Employee ceo = new Employee("luo","ceo");

        ceo.add(market);
        ceo.add(hr);

        System.out.println(ceo);
        for(Employee e : ceo.getSubordinates()){
            System.out.println(e);
            for(Employee ie:e.getSubordinates()){
                System.out.println(ie);
            }
        }

    }
}
