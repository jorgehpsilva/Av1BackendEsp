package com.example.gateway.Gateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@Component
public class LogFilter extends AbstractGatewayFilterFactory<LogFilter.Config> {
    private static final AtomicInteger COUNT_CALL_GATEWAY = new AtomicInteger(0) ;
    private static final Logger log = Logger.getLogger(LogFilter.class.getName());
    public LogFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config){
        return (exchange, chain) -> {
            log.info("Path requested: " + exchange.getRequest().getPath());
            log.info("Recieve calls: " + COUNT_CALL_GATEWAY.incrementAndGet() + " times");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("Time response: " + Calendar.getInstance().getTime());
            }));
        };
    }
    public static class Config {

    }
}