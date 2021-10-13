package com.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName: Filter1
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/13 19:01
 **/

public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2 前置代码");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter2 后置代码");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
