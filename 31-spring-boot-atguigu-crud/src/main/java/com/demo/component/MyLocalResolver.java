package com.demo.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 自定义的国际化解析器
 *
 * 实现了：页面点击“中文”，使用中文的国际化；页面点击“EN”使用英文的国际化
 *
 * Created by lwx on 2019/6/9.
 */
public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest rq) {
        //http://localhost:8080/index.html?l=zh_CN
        String l = rq.getParameter("l");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(l)) {
            String[] arr = l.split("_");
            locale = new Locale(arr[0],arr[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
