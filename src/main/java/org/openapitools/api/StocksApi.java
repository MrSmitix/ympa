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
public class StocksApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        POST /campaigns/{campaignId}/offers/stocks : Информация об остатках и оборачиваемости
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .post("/campaigns/{campaignId}/offers/stocks")
                .description("Информация об остатках и оборачиваемости")
                .id("getStocksApi")
                .produces("application/json")
                .outType(GetWarehouseStocksResponse.class)
                .consumes("application/json")
                .type(GetWarehouseStocksRequest.class)
                
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .param()
                    .name("pageToken")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")
                .endParam()
                .param()
                    .name("limit")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Количество значений на одной странице. ")
                .endParam()
                .param()
                    .name("getWarehouseStocksRequest")
                    .type(RestParamType.body)
                    .required(false)
                .endParam()
                .to("direct:getStocks");
        

        /**
        PUT /campaigns/{campaignId}/offers/stocks : Передача информации об остатках
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .put("/campaigns/{campaignId}/offers/stocks")
                .description("Передача информации об остатках")
                .id("updateStocksApi")
                .produces("application/json")
                .outType(EmptyApiResponse.class)
                .consumes("application/json")
                .type(UpdateStocksRequest.class)
                
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .param()
                    .name("updateStocksRequest")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:updateStocks");
        
    }
}
