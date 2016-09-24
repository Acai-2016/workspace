package com.java.excel;

import java.util.List;

import com.java.db.DBHelper;
import com.java.entity.Stu;
import com.java.service.StuService;


public class TestExcelToDB {
    public static void main(String[] args) {
        //得到表格中所有的数据
        List<Stu> listExcel=StuService.getAllByExcel("C://book.xls");
        /*//得到数据库表中所有的数据
        List<StuEntity> listDb=StuService.getAllByDb();*/
        
        DBHelper db=new DBHelper();
        
        for (Stu stuEntity : listExcel) {
            int id=stuEntity.getId();
            if (!StuService.isExist(id)) {
                //不存在就添加
                String sql="insert into stu (id,name,sex,num) values(?,?,?,?)";
                String[] str=new String[]{stuEntity.getId()+"",stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+""};
                db.AddU(sql, str);
            }else {
                //存在就更新
                String sql="update stu set name=?,sex=?,num=? where id=?";
                String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+"",id+""};
                db.AddU(sql, str);
            }
        }
    }
}