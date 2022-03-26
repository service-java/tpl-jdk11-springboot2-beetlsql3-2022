package com.ibeetl.test101.entity;
import java.time.LocalDateTime;
import org.beetl.sql.annotation.entity.*;
/*
* 
* @Date 2022-03-26
*/

@Table(name="user")
public class User implements java.io.Serializable {
	/**
	 * ID
	 */
	@AutoID
	private Long id ;
	/**
	 * 姓名
	 */
	private String name ;
	/**
	 * 年龄
	 */
	private Integer age ;
	/**
	 * 创建时间
	 */
	private LocalDateTime createTime ;
	/**
	 * 更新时间
	 */
	private LocalDateTime updateTime ;

	public User() {
	}

	/**
	* ID
	*@return
	*/
	public Long getId(){
		return  id;
	}
	/**
	* ID
	*@param  id
	*/
	public void setId(Long id ){
		this.id = id;
	}
	/**
	* 姓名
	*@return
	*/
	public String getName(){
		return  name;
	}
	/**
	* 姓名
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	/**
	* 年龄
	*@return
	*/
	public Integer getAge(){
		return  age;
	}
	/**
	* 年龄
	*@param  age
	*/
	public void setAge(Integer age ){
		this.age = age;
	}
	/**
	* 创建时间
	*@return
	*/
	public LocalDateTime getCreateTime(){
		return  createTime;
	}
	/**
	* 创建时间
	*@param  createTime
	*/
	public void setCreateTime(LocalDateTime createTime ){
		this.createTime = createTime;
	}
	/**
	* 更新时间
	*@return
	*/
	public LocalDateTime getUpdateTime(){
		return  updateTime;
	}
	/**
	* 更新时间
	*@param  updateTime
	*/
	public void setUpdateTime(LocalDateTime updateTime ){
		this.updateTime = updateTime;
	}

}