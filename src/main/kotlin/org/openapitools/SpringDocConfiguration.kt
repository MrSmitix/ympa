package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Партнерский API Маркета")
                    .description("API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. ")
                    .license(
                        License()
                            .name("BSD 3-Clause")
                            .url("https://opensource.org/license/bsd-3-clause/")
                    )
                    .version("LATEST")
            )
            .components(
                Components()
                    .addSecuritySchemes("OAuth", SecurityScheme()
                        .type(SecurityScheme.Type.OAUTH2)
                    )
            )
    }
}
