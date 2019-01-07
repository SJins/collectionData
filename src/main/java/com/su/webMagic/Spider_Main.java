package com.su.webMagic;

import us.codecraft.webmagic.Spider;

public class Spider_Main {
    private static String url1="https://list.mogujie.com/book/boyfriend/51716?acm=3.mce.1_10_1ko5c.132244.0.sPJDrremrPtw2.pos_9-m_482180-sd_119&ptp=1.n5T00._head.0.lUxILyUW";
    private static String url2="http://tech.huanqiu.com/internet/";

    public static void main(String[] args) {
        Spider.create(new BoKeYuanProcessor()).
                addUrl(url1).thread(3).run();
    }
}
