package kr.personal.blog.api_server;

import kr.personal.blog.common.exception.BlogInvalidParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/api/sample")
    public String apiSample(@RequestParam(required = false) String testKey) {
        if(testKey.equals("test") == false) {
            throw new BlogInvalidParameterException("잘못된 파라미터 입니다: " + testKey);
        }

        return "call sample test api";
    }
}
