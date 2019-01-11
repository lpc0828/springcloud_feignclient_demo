package com.rocway.springcloud_feignclient_demo.controller;

import com.rocway.springcloud_feignclient_demo.feign.vo.ApiResult;
import com.rocway.springcloud_feignclient_demo.feign.vo.DemoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("feign/demo")
@RestController
public class FeignTestController {

    @RequestMapping(value = "total.do", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    ApiResult<DemoDTO> total(@CookieValue(value = "cookie", required = false) String cookie,
                             @RequestHeader(value = "header", required = false) String header,
                             @RequestParam(value = "value", required = false) Integer value,
                             @RequestParam(value = "array", required = false) Integer[] array,
                             @RequestParam(value = "list", required = false) List<Integer> list) {
        ApiResult<DemoDTO> result = new ApiResult<>();
        DemoDTO dto = new DemoDTO();
        dto.setCookie(cookie);
        dto.setHeader(header);
        dto.setValue(value);
        dto.setArray(array);
        dto.setList(list);
        result.setMessage("success");
        result.setStatus(0);
        result.setData(dto);
        return result;
    }
}
