package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	FullTimeEmployee ivanov = new FullTimeEmployee("Ivanov",1277.3);
        FullTimeEmployee petrov = new FullTimeEmployee("Petrov",1923.3);
        FullTimeEmployee denisov = new FullTimeEmployee("Denisov",5277.3);

        List<FullTimeEmployee> FullTimelist = Stream.of(ivanov,petrov,denisov).collect(Collectors.toList());
double summa = FullTimelist.stream().mapToDouble(item->item.getSalary()).sum();
System.out.println(summa);
        EmployeePartTime devops = new EmployeePartTime("devops", 12, 32 );
        EmployeePartTime backEndDev = new EmployeePartTime("backEndDev", 35, 176);
        EmployeePartTime frontEndDev = new EmployeePartTime("frontEndDev", 25,85);
        EmployeePartTime designer = new EmployeePartTime("designer",50,30);
        EmployeePartTime tester = new EmployeePartTime("tester",20,176);

        List<EmployeePartTime> partTimeList = Stream.of(devops,backEndDev,frontEndDev,designer,tester)
                .collect(Collectors.toList());
//

                double partTimeTotalSalary = 0;
        for (EmployeePartTime item: partTimeList){
            partTimeTotalSalary += item.getHours() * item.getRate();
        }
        System.out.println("------");
        System.out.println(partTimeTotalSalary);
        System.out.println("------");

        double total = summa + partTimeTotalSalary;
        System.out.println(total);

        List<IAccounting> totalList = new ArrayList<>();
        Arrays.asList(ivanov,petrov,denisov,devops,backEndDev,frontEndDev,designer,tester);

        totalList.add(ivanov);
        totalList.add(petrov);
        totalList.add(denisov);
        totalList.add(devops);
        totalList.add(backEndDev );
        totalList.add(frontEndDev);
        totalList.add(designer);
        totalList.add(tester);

        double totalSalary = totalList.stream().mapToDouble(item-> item.getMounthSalary()).sum();
        System.out.println(totalSalary);
        IAccounting patheticLoser = totalList.stream()

                .min(Comparator.comparing(IAccounting::getMounthSalary))
                .orElse(null);

        IAccounting geek = totalList.stream()

                .max(Comparator.comparing(IAccounting::getMounthSalary))
                .orElse(null);
        System.out.println(patheticLoser+" neuda4naik");
        System.out.println(geek+" Zadrot");

    }
}
