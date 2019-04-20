package com.cloud.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@SuppressWarnings({"serial" , "unused" })
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@Getter
@Setter
public class Dept implements Serializable {
	private Long deptNo;
	private String deptName; 
	private String dbName;
	
}
