package com.jy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Grade {

    private static final Log LOGGER = LogFactory.getLog(Grade.class);

    private Integer gradeId;
    private String gradeName;

    public Grade(Integer gradeId,String gradeName) {
        LOGGER.info("正在执行 Course 的有参构造方法，参数分别为：gradeId=" + gradeId + ",gradeName=" + gradeName);
        this.gradeId = gradeId;
        this.gradeName = gradeName;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }
}
