package sample;

import io.zhudy.duic.config.ConfigUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@RestController
public class TestController {

    @Value("${k1.string}")
    private String k1;

    @GetMapping("/config")
    public Object query() {
        // 使用 duic 提供的 api 获取配置对象
        return ConfigUtils.get("k1");
    }

    @GetMapping("/config/k1")
    public String queryK1() {
        return k1;
    }
}
