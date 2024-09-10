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
public class ReturnsApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} : Информация о невыкупе или возврате
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}")
                .description("Информация о невыкупе или возврате")
                .id("getReturnApi")
                .produces("application/json")
                .outType(GetReturnResponse.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .param()
                    .name("orderId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор заказа.")
                .endParam()
                .param()
                    .name("returnId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор возврата.")
                .endParam()
                .to("direct:getReturn");
        

        /**
        GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application : Получение заявления на возврат
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application")
                .description("Получение заявления на возврат")
                .id("getReturnApplicationApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("application/octet-stream, application/json")
                .outType(org.springframework.core.io.Resource.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .param()
                    .name("orderId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор заказа.")
                .endParam()
                .param()
                    .name("returnId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор возврата.")
                .endParam()
                .to("direct:getReturnApplication");
        

        /**
        GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} : Получение фотографии возврата
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}")
                .description("Получение фотографии возврата")
                .id("getReturnPhotoApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("application/octet-stream, application/json")
                .outType(org.springframework.core.io.Resource.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .param()
                    .name("orderId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор заказа.")
                .endParam()
                .param()
                    .name("returnId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор возврата.")
                .endParam()
                .param()
                    .name("itemId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор товара в возврате.")
                .endParam()
                .param()
                    .name("imageHash")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Хеш ссылки изображения для загрузки.")
                .endParam()
                .to("direct:getReturnPhoto");
        

        /**
        GET /campaigns/{campaignId}/returns : Список невыкупов и возвратов
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .get("/campaigns/{campaignId}/returns")
                .description("Список невыкупов и возвратов")
                .id("getReturnsApi")
                .produces("application/json")
                .outType(GetReturnsResponse.class)
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
                    .name("orderIds")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. ")
                .endParam()
                .param()
                    .name("statuses")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. ")
                .endParam()
                .param()
                    .name("type")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. ")
                .endParam()
                .param()
                    .name("fromDate")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. ")
                .endParam()
                .param()
                    .name("toDate")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. ")
                .endParam()
                .param()
                    .name("fromDate2")
                    .type(RestParamType.query)
                    .required(false)
                    .description("{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. ")
                .endParam()
                .param()
                    .name("toDate2")
                    .type(RestParamType.query)
                    .required(false)
                    .description("{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. ")
                .endParam()
                .to("direct:getReturns");
        

        /**
        POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision : Принятие или изменение решения по возврату
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .post("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision")
                .description("Принятие или изменение решения по возврату")
                .id("setReturnDecisionApi")
                .produces("application/json")
                .outType(EmptyApiResponse.class)
                .consumes("application/json")
                .type(SetReturnDecisionRequest.class)
                
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .param()
                    .name("orderId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор заказа.")
                .endParam()
                .param()
                    .name("returnId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор возврата.")
                .endParam()
                .param()
                    .name("setReturnDecisionRequest")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:setReturnDecision");
        

        /**
        POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit : Подтверждение решения по возврату
        **/
        rest()
            .securityDefinitions()
                .oauth2("OAuth")
                    .flow("implicit")
                    .authorizationUrl("https://oauth.yandex.ru/authorize")
                        .withScope("market:partner-api","API Яндекс.Маркета / Поиска по товарам для партнеров")
                
            .endSecurityDefinition()
            .post("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit")
                .description("Подтверждение решения по возврату")
                .id("submitReturnDecisionApi")
                .produces("application/json")
                .outType(EmptyApiResponse.class)
                .param()
                    .name("campaignId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ")
                .endParam()
                .param()
                    .name("orderId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор заказа.")
                .endParam()
                .param()
                    .name("returnId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Идентификатор возврата.")
                .endParam()
                .to("direct:submitReturnDecision");
        
    }
}
