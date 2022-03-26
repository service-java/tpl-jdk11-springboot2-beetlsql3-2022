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
	 * ����
	 */
	private String name ;
	/**
	 * ����
	 */
	private Integer age ;
	/**
	 * ����ʱ��
	 */
	private LocalDateTime createTime ;
	/**
	 * ����ʱ��
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
	* ����
	*@return
	*/
	public String getName(){
		return  name;
	}
	/**
	* ����
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	/**
	* ����
	*@return
	*/
	public Integer getAge(){
		return  age;
	}
	/**
	* ����
	*@param  age
	*/
	public void setAge(Integer age ){
		this.age = age;
	}
	/**
	* ����ʱ��
	*@return
	*/
	public LocalDateTime getCreateTime(){
		return  createTime;
	}
	/**
	* ����ʱ��
	*@param  createTime
	*/
	public void setCreateTime(LocalDateTime createTime ){
		this.createTime = createTime;
	}
	/**
	* ����ʱ��
	*@return
	*/
	public LocalDateTime getUpdateTime(){
		return  updateTime;
	}
	/**
	* ����ʱ��
	*@param  updateTime
	*/
	public void setUpdateTime(LocalDateTime updateTime ){
		this.updateTime = updateTime;
	}

}