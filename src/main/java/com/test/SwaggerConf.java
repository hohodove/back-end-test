package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;


@Configuration
@EnableSwagger2
public class SwaggerConf {

    @Bean
    public Docket swaggerPlugin() {
        return new Docket(DocumentationType.SWAGGER_2) // SWAGGER_12, SWAGGER_2, SWAGGER_WEBがあるがどれが良いのかあまりわからない
                .select() //ApiSelectorBuilderの生成
                .apis(RequestHandlerSelectors.any()) //ドキュメントの対象となるRequestHandlerを設定
                .build()
                .apiInfo(getApiInfo()); //ApiInfo型でAPIの基本情報設定
    }
          
    private ApiInfo getApiInfo() {
                return new ApiInfoBuilder()
                        .title("Test APIs")
                        .description("テストAPIです。")
                        .version("1.0.0")
                        .build();
    }

}