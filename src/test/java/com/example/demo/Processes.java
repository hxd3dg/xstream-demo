package com.example.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Mr.Y z
 * @Date 2020/12/3 14:57
 * @ClassName Processes
 */
@Data
@XStreamAlias("processes")
public class Processes implements Serializable {

    @XStreamImplicit(itemFieldName="process")//集合子项名称
    private List<Process> processes;
}
