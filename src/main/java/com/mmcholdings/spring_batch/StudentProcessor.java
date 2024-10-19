package com.mmcholdings.spring_batch;

import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student item) throws Exception {
        //item.setId(null); Will cause a new ID to be generated
        return item;
    }
}
