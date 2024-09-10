package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetQualityRatingDetailsResponse;
import org.openapitools.model.GetQualityRatingRequest;
import org.openapitools.model.GetQualityRatingResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for RatingsApi
 */
@MicronautTest
public class RatingsApiTest {

    @Inject
    RatingsApi api;

    
    /**
     * Заказы, которые повлияли на индекс качества
     *
     * Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getQualityRatingDetailsTest() {
        // given
        Long campaignId = 56L;

        // when
        GetQualityRatingDetailsResponse body = api.getQualityRatingDetails(campaignId).block();

        // then
        // TODO implement the getQualityRatingDetailsTest()
    }

    
    /**
     * Индекс качества магазинов
     *
     * Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getQualityRatingsTest() {
        // given
        Long businessId = 56L;
        GetQualityRatingRequest getQualityRatingRequest = new GetQualityRatingRequest(new HashSet<>());

        // when
        GetQualityRatingResponse body = api.getQualityRatings(businessId, getQualityRatingRequest).block();

        // then
        // TODO implement the getQualityRatingsTest()
    }

    
}
