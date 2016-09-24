package com.java.excel;

import java.util.List;

import com.java.db.DBHelper;
import com.java.entity.Stu;
import com.java.service.StuService;


public class TestExcelToDB {
    public static void main(String[] args) {
        //�õ���������е�����
        List<Stu> listExcel=StuService.getAllByExcel("C://book.xls");
        /*//�õ����ݿ�������е�����
        List<StuEntity> listDb=StuService.getAllByDb();*/
        
        DBHelper db=new DBHelper();
        
        for (Stu stuEntity : listExcel) {
            int id=stuEntity.getId();
            if (!StuService.isExist(id)) {
                //�����ھ����
                String sql="insert into stu (id,name,sex,num) values(?,?,?,?)";
                String[] str=new String[]{stuEntity.getId()+"",stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+""};
                db.AddU(sql, str);
            }else {
                //���ھ͸���
                String sql="update stu set name=?,sex=?,num=? where id=?";
                String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+"",id+""};
                db.AddU(sql, str);
            }
        }
    }
}