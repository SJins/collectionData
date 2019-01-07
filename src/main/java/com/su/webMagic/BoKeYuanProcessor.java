package com.su.webMagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class BoKeYuanProcessor implements PageProcessor {
   private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    @Override
    public void process(Page page) {
        System.out.println(page.getHtml());
        page.getHtml().links().all();
        //获取路径名称
        List<String> imgurl=page.getHtml().xpath("div[@class='m_Level2Category']/ul/li/div[@class='hd']/a/@href").all();
        //获取路径地址
       /* List<String> urls=page.getHtml().xpath("div[@class='link-content']/ul/li/a/@href").all();*/
        for(int i=0;i<imgurl.size();i++){
            System.out.println("名称："+imgurl.get(i));
            /*System.out.println("连接："+urls.get(i));*/
            System.out.println("-----------");
        }
    }

    @Override
    public Site getSite() {
        return site;
    }
}
