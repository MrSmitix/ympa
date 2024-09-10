package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetWarehouseStocksRequest;
import org.openapitools.model.GetWarehouseStocksResponse;
import org.openapitools.model.UpdateStocksRequest;
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
 * API tests for StocksApi
 */
@MicronautTest
public class StocksApiTest {

    @Inject
    StocksApi api;

    
    /**
     * Информация об остатках и оборачиваемости
     *
     * Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
     */
    @Test
    @Disabled("Not Implemented")
    public void getStocksTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetWarehouseStocksRequest getWarehouseStocksRequest = new GetWarehouseStocksRequest();

        // when
        GetWarehouseStocksResponse body = api.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest).block();

        // then
        // TODO implement the getStocksTest()
    }

    
    /**
     * Передача информации об остатках
     *
     * Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateStocksTest() {
        // given
        Long campaignId = 56L;
        UpdateStocksRequest updateStocksRequest = new UpdateStocksRequest(new HashSet<>());

        // when
        EmptyApiResponse body = api.updateStocks(campaignId, updateStocksRequest).block();

        // then
        // TODO implement the updateStocksTest()
    }

    
}
