package com.zhoujl.reptile;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description TODO 写点类描述吧！！
 * @Author zhoujl
 * @Date 2020/3/23 0023 上午 11:14
 * @Version 1.0
 **/
public class JsoupHttpClient {

    public static void main(String[] args) throws ClientProtocolException, IOException {

        // 创建httpclient实例
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 创建httpget实例
//        HttpGet httpget = new HttpGet("https://piao.ctrip.com/ticket/dest/t43811.html");
        HttpGet httpget = new HttpGet("https://piao.qunar.com/ticket/list_%E9%87%8D%E5%BA%86.html?from=mps_search_suggest&page=2");
        HttpGet httpChildGet = new HttpGet("https://search.piao.qunar.com/list/child/getChildSightById.jsonp?callback=jQuery172003444459701239411_1584951237917&sightId=2802914982&_=1584954780667");

        // 执行get请求
        CloseableHttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        // 获取返回实体
        String content = EntityUtils.toString(entity, "utf-8");

        // 解析网页 得到文档对象
        Document doc = Jsoup.parse(content);
        // 获取指定的 <img />
        Elements elements = doc.getElementsByClass("sight_item sight_itempos");

        for (int i = 0; i < 15; i++) {
            Element element = elements.get(i);
            // 获取 <img /> 的 src
            String url = element.attr("data-sight-img-u-r-l");

            // 再发请求最简单了，并由于该链接是没有 https:开头的，得人工补全 ✔

            HttpGet PicturehttpGet = new HttpGet(url.contains("https://")? url: "https:"+url);
            CloseableHttpResponse pictureResponse = httpclient.execute(PicturehttpGet);
            HttpEntity pictureEntity = pictureResponse.getEntity();
            InputStream inputStream = pictureEntity.getContent();

            // 使用 common-io 下载图片到本地，注意图片名不能重复 ✔
            FileUtils.copyToFile(inputStream, new File("G://LLLLLLLLLLLLLLLLLLL//imagesTest//" + i + ".jpg"));
            pictureResponse.close(); // pictureResponse关闭

        }

        response.close(); // response关闭
        httpclient.close(); // httpClient关闭

    }

}
