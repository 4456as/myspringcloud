package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)//������ʽд��
public class Dept implements Serializable{//���л��������紫��
	private Long  deptno;   //����
	private String  dname;   //��������
	private String  db_source;//�����Ǹ����ݿ⣬��Ϊ΢����ܹ�����һ�������Ӧһ�����ݿ⣬ͬһ����Ϣ���洢����ͬ���ݿ�	  
}
