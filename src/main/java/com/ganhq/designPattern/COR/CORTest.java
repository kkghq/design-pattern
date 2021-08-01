package com.ganhq.designPattern.COR;

import com.ganhq.designPattern.COR.pojo.*;

/**
 * 修改批准测试
 */
public class CORTest {
    public static void main(String[] args) {
        leaveApprovalTest();

    }

    /**
     * 休假批准测试：假如规定学生请假
     *              小于或等于 2 天，班主任可以批准；
     *              小于或等于 7 天，系主任可以批准；
     *              小于或等于 10 天，院长可以批准；
     *              其他情况不予批准；
     */
    private static void leaveApprovalTest() {
        //组装责任链
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();
        Leader teacher4=new DeanOfStudies();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(15);
    }
}
