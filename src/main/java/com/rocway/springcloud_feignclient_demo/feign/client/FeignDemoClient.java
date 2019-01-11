package com.rocway.springcloud_feignclient_demo.feign.client;

import com.rocway.springcloud_feignclient_demo.feign.vo.ApiResult;
import com.rocway.springcloud_feignclient_demo.feign.vo.DemoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "demo", value = "demo", url = "${api.service.host}", fallback = FeignDemoClientFallBack.class)
@RequestMapping("/feign/demo")
public interface FeignDemoClient {

    @RequestMapping("total.do")
    ApiResult<DemoDTO> testTotal(@CookieValue(value = "cookie", required = false) String cookie,
                             @RequestHeader(value = "header", required = false) String header,
                             @RequestParam(value = "value", required = false) Integer value,
                             @RequestParam(value = "array", required = false) Integer[] array,
                             @RequestParam(value = "list", required = false) List<Integer> list);

}

class FeignDemoClientFallBack implements FeignDemoClient {

    @Override
    public ApiResult<DemoDTO> testTotal(String cookie, String header, Integer value, Integer[] array, List<Integer> list) {
        return defaultRes();
    }

    ApiResult<DemoDTO> defaultRes() {
        ApiResult<DemoDTO> result = new ApiResult<>();
        result.setStatus(-1);
        result.setMessage("接口异常");
        return result;
    }
}
