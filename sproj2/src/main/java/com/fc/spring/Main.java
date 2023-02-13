package com.fc.spring;

import com.fc.spring.config.Config;
import com.fc.spring.logic.JavaSort;
import com.fc.spring.logic.Sort;
import com.fc.spring.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ct = new AnnotationConfigApplicationContext(Config.class);
        //Sort<String> sort = ct.getBean(Sort.class);
        SortService ss = ct.getBean(SortService.class);
        //Sort<String> sort = new JavaSort<>();

        //System.out.println("[result] " + sort.sort(Arrays.asList(args)));
        System.out.println("[result] " + ss.doSort(Arrays.asList()));
    }
}
