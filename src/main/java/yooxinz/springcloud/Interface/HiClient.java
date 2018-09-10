package yooxinz.springcloud.Interface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by star on 2018/9/9.
 */
@FeignClient("local")
public interface HiClient {

    @GetMapping("/hi")
    String consumer();
}
