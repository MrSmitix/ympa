/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class CampaignsApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET /campaigns/{campaignId} : Информация о магазине
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}")
                .description("Информация о магазине")
                .id("getCampaignApi")
                .produces("application/json")
                .outType(GetCampaignResponse.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .to("direct:getCampaign");
        

        /**
        GET /campaigns/{campaignId}/logins : Логины, связанные с магазином
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}/logins")
                .description("Логины, связанные с магазином")
                .id("getCampaignLoginsApi")
                .produces("application/json")
                .outType(GetCampaignLoginsResponse.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .to("direct:getCampaignLogins");
        

        /**
        GET /campaigns/{campaignId}/region : Регион магазина
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}/region")
                .description("Регион магазина")
                .id("getCampaignRegionApi")
                .produces("application/json")
                .outType(GetCampaignRegionResponse.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .to("direct:getCampaignRegion");
        

        /**
        GET /campaigns/{campaignId}/settings : Настройки магазина
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}/settings")
                .description("Настройки магазина")
                .id("getCampaignSettingsApi")
                .produces("application/json")
                .outType(GetCampaignSettingsResponse.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .to("direct:getCampaignSettings");
        

        /**
        GET /campaigns : Список магазинов пользователя
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns")
                .description("Список магазинов пользователя")
                .id("getCampaignsApi")
                .produces("application/json")
                .outType(GetCampaignsResponse.class)
                .param()
                    .name("page")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")
                .endParam()
                .to("direct:getCampaigns");
        

        /**
        GET /campaigns/by_login/{login} : Магазины, доступные логину
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/by_login/{login}")
                .description("Магазины, доступные логину")
                .id("getCampaignsByLoginApi")
                .produces("application/json")
                .outType(GetCampaignsResponse.class)
                .param()
                    .name("login")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Логин пользователя.")
                .endParam()
                .param()
                    .name("page")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")
                .endParam()
                .to("direct:getCampaignsByLogin");
        
    }
}
