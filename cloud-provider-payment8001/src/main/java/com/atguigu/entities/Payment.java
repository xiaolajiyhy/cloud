package com.atguigu.entities;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@TableName
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    @TableId(type=IdType.AUTO)
    private  Integer id;
    private  String serial;
}
