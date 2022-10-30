package com.ss.Level01.MapTest07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: JavaSE-Practice
 * @ClassName MapTest07
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-22 19:29
 * @Version 1.0
 **/
public class MapTest07 {
    public static void main(String[] args) {
        Student stu01 = new Student("德布劳内",25);
        Student stu02 = new Student("哈兰德",26);
        Student stu03 = new Student("富登",25);
        Student stu04 = new Student("德赫亚",27);
        Student stu05 = new Student("B席",25);
        Student stu06 = new Student("B废",27);
        //创建学生Map
        HashMap<String,Student> hashMap = new HashMap<String,Student>();
        hashMap.put("曼城01", stu01);
        hashMap.put("曼城02", stu02);
        hashMap.put("曼城03", stu03);
        hashMap.put("曼联01", stu04);
        hashMap.put("曼城04", stu05);
        hashMap.put("曼联02", stu06);
        //遍历
        for (String key : hashMap.keySet()) {
            Student p = hashMap.get(key);
            System.out.println(key + "-" + p.getStuName() + "," + p.getStuAge());
        }

        Set<Map.Entry<String, Student>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            Student p = entry.getValue();
            System.out.println(entry.getKey() + "-" + p.getStuName() + "," + p.getStuAge());
        }

    }
}