/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetQualityRatingDetailsResponse;
import org.openapitools.model.GetQualityRatingRequest;
import org.openapitools.model.GetQualityRatingResponse;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Client("${openapi-micronaut-client-base-path}")
public interface RatingsApi {
    /**
     * Заказы, которые повлияли на индекс качества
     * Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
     *
     * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @return GetQualityRatingDetailsResponse
     */
    @Post(uri="/campaigns/{campaignId}/ratings/quality/details")
    @Consumes({"application/json"})
    Mono<GetQualityRatingDetailsResponse> getQualityRatingDetails(
        @PathVariable(name="campaignId") @NotNull Long campaignId
    );

    /**
     * Индекс качества магазинов
     * Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     *
     * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
     * @param getQualityRatingRequest  (required)
     * @return GetQualityRatingResponse
     */
    @Post(uri="/businesses/{businessId}/ratings/quality")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<GetQualityRatingResponse> getQualityRatings(
        @PathVariable(name="businessId") @NotNull Long businessId, 
        @Body @NotNull @Valid GetQualityRatingRequest getQualityRatingRequest
    );

}
