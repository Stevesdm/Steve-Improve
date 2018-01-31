package com.steve.app;

import com.steve.model.DiskInfo;
import com.steve.model.HardwareInfo;
import com.thoughtworks.xstream.XStream;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/31 下午3:19
 */
public class Demo {

    public static void main(String[] args) {
        DiskInfo disk1 = new DiskInfo();
        disk1.setName("D:\\");
        disk1.setTotalSize(100);
        disk1.setUsedSize(20);
        disk1.setAvilableSize(80);
        DiskInfo disk2 = new DiskInfo();
        disk2.setName("E:\\");
        disk1.setTotalSize(100);
        disk1.setUsedSize(20);
        disk2.setAvilableSize(160);

        ArrayList<DiskInfo> diskInfos = new ArrayList<DiskInfo>();
        diskInfos.add(disk1);
        diskInfos.add(disk2);

        HardwareInfo hwInfo = new HardwareInfo();
        hwInfo.setCpuInfo("cpu info is ...");
        hwInfo.setNetworkInfo("network info is ...");
        hwInfo.setDiskInfos(diskInfos);

        XStream xStream = new XStream();
        xStream.autodetectAnnotations(true);
        String xml = xStream.toXML(hwInfo);
        System.out.println(xml);

        HardwareInfo info2 = (HardwareInfo) xStream.fromXML(xml);
        System.out.println(info2);
    }
}
