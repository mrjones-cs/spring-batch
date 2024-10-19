package com.mmcholdings.spring_batch;

import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student item) throws Exception {
        return item;
    }
}
