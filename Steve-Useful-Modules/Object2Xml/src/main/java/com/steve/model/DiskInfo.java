package com.steve.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/31 下午3:18
 */
@Data
@NoArgsConstructor
@XStreamAlias("DiskInfo")
public class DiskInfo {

    @XStreamAsAttribute
    @XStreamAlias("diskName")
    private String name;
    private int totalSize;
    private int avilableSize;
    private int usedSize;
}
