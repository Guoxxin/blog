package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @author:jobs
 * @date:2018/11/27 10:20
 * @description:
 */
//继承JpaRepositoryspring data jpa 默认预先生成了一些基本的CURD的方法，例如：增、删、改等等
//User为实体类，Integer为主键类型
public interface UserRepository extends JpaRepository<User, Integer> {
    //注意：条件的属性名称与个数要与参数的位置与个数一一对应。要注意的是：条件属性以首字母大写。
//findByUserDepUuid()-->findBy+User+dep+uuid()
    //从右往左截取第一个大写字母开头的字符串(此处为Uuid)，然后检查剩下的字符串是否为查询实体的一个属性
//通过debug信息，我们看到输出的sql语句是select * from user where name = ? and password = ?
    public List<User> findByUserNameAndPassWord(String username, String password);
    public User findByUserName(String username);
    public User findByUserId(Integer userId);


//    T save(T entity);//保存单个实体
//    Iterable<T> save(Iterable<? extends T> entities);//保存集合
//    T findOne(ID id);//根据id查找实体
//    boolean exists(ID id);//根据id判断实体是否存在
//    Iterable<T> findAll();//查询所有实体,不用或慎用!
//    long count();//查询实体数量
//    void delete(ID id);//根据Id删除实体
//    void delete(T entity);//删除一个实体
//    void delete(Iterable<? extends T> entities);//删除一个实体的集合
//    void deleteAll();//删除所有实体,不用或慎用!

//    使用@Query自定义查询，这种查询可以声明在Repository方法中，摆脱像命名查询那样的约束，将查询直接在响应的接口方法中声明，结构更为清晰，这是Spring data的特有实现。
    //为 @Query 注解传递参数的方式1: 命名参数的方式.
//    @Query("SELECT p FROM Person p WHERE p.lastName = :lastName AND p.email = :email")
//    List<Person> testQueryAnnotationParams2(@Param("email") String email, @Param("lastName") String lastName);
}