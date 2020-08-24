package com.ggmanz.co.nz.bigHaoSS.mapper;

//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;

import com.ggmanz.co.nz.bigHaoSS.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mazhuang on 2018/6/29.
 */
@Mapper
public interface UserInfoMapper {

    @Select("Select * from USERINFO")
    List<UserInfo> getUsers();

    @Select("Select * from USERINFO WHERE NAME = #{name}")
    UserInfo getUserByName(@Param("name") String name);

    @Select("Select * from USERINFO WHERE id = #{id}")
    UserInfo getUserById(@Param("id") int id);

    @Insert("INSERT INTO USERINFO (groupid, name,gender,picture,idnum,phonenum," +
            "school,distribute,performance,report,elanguage,training,atpl," +
            "newmenber,cbt,fixed,motorial,now,remark) " +
            "VALUES (#{groupId}, #{name}, #{gender}, #{picture},#{idnum}, #{phonenum}," +
            "#{school}, #{distribute},#{performance}, #{report}),#{elanguage}, #{training}," +
            "#{atpl}, #{newmenber},#{cbt}, #{fixed},#{motorial}, #{now},#{remark})")
    int insert(@Param("groupId") int groupId, @Param("id") String name,
               @Param("gender") String gender, @Param("avatar") String avatar,
               @Param("idNum") String idNum, @Param("phoneNum") String phoneNum,
               @Param("school") String school, @Param("distributing") String distributing,
               @Param("highPerformance") String highPerformance, @Param("registerDate") String registerDate,
               @Param("english") String english, @Param("circle") String circle,
               @Param("aptl") String aptl, @Param("newEmployee") String newEmployee,
               @Param("cbt") String cbt, @Param("fixedModule") String fixedModule,
               @Param("movedModule") String movedModule, @Param("thisField") String thisField,
               @Param("remark") String remark);

}
