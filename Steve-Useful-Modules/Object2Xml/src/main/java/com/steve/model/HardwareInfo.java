package com.steve.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/31 下午3:18
 */
@Data
@NoArgsConstructor
@XStreamAlias("HardwareInfo")
public class HardwareInfo {
    private String cpuInfo;
    private String networkInfo;
    private List<DiskInfo> diskInfos;

}
