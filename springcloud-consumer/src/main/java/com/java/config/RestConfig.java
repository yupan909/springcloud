package com.java.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate注入
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 20:14
 */
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced  // 开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 选择Ribbon负载均衡策略规则：
     *
     * （1）RoundRobinRule
     *      轮询选择， 轮询index，选择index对应位置的Server
     *
     *（ 2）RandomRule
     *      随机选择一个Server
     *
     * （3）RetryRule
     *      对选定的负载均衡策略机上重试机制，在一个配置时间段内当选择Server不成功，则一直尝试使用subRule的方式
     *    选择一个可用的server。
     *
     * （4）WeightedResponseTimeRule
     *      根据响应时间分配一个weight(权重)，响应时间越长，weight越小，被选中的可能性越低。
     *
     * （5）BestAvailabl
     *      选择一个最小的并发请求的Server，逐个考察Server，如果Server被tripped了，则跳过。
     *
     * （6）AvailabilityFilteringRule
     *      过滤掉那些一直连接失败的被标记为circuit tripped的后端Server，并过滤掉那些高并发的的后端Server或者
     *    使用一个AvailabilityPredicate来包含过滤server的逻辑，其实就就是检查status里记录的各个Server的运行状态。
     *
     * （7）ZoneAvoidanceRule
     *      复合判断Server所在区域的性能和Server的可用性选择Server。
     */
    @Bean
    public IRule myRule(){
        // 默认轮询，这里设置为随机
        return new RandomRule();
    }
}
