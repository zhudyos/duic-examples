package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@RestController
public class TestController {

    @Autowired
    private Config config;

    /**
     * 使用 `spring` 提供的 `@Value` 注入配置。
     */
    @Value("${k1.string}")
    private String k1;

    @GetMapping("/config")
    public Object query() {
        return config;
    }

    @GetMapping("/config/k1")
    public Object queryK1() {
        return k1;
    }


}
