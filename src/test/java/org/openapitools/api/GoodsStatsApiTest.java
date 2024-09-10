package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetGoodsStatsRequest;
import org.openapitools.model.GetGoodsStatsResponse;
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
 * API tests for GoodsStatsApi
 */
@MicronautTest
public class GoodsStatsApiTest {

    @Inject
    GoodsStatsApi api;

    
    /**
     * Отчет по товарам
     *
     * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getGoodsStatsTest() {
        // given
        Long campaignId = 56L;
        GetGoodsStatsRequest getGoodsStatsRequest = new GetGoodsStatsRequest(new HashSet<>());

        // when
        GetGoodsStatsResponse body = api.getGoodsStats(campaignId, getGoodsStatsRequest).block();

        // then
        // TODO implement the getGoodsStatsTest()
    }

    
}
