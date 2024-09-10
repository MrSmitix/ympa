package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for StocksController
 */
@MicronautTest
public class StocksControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    StocksController controller;

    /**
     * This test is used to validate the implementation of getStocks() method
     *
     * The method should: Информация об остатках и оборачиваемости
     *
     * Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getStocksMethodTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetWarehouseStocksRequest getWarehouseStocksRequest = new GetWarehouseStocksRequest();

        // when
        GetWarehouseStocksResponse result = controller.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/offers/stocks' to the features of getStocks() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getStocksClientApiTest() throws IOException {
        // given
        GetWarehouseStocksRequest body = new GetWarehouseStocksRequest();
        String uri = UriTemplate.of("/campaigns/{campaignId}/offers/stocks").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1e92420f");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetWarehouseStocksResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateStocks() method
     *
     * The method should: Передача информации об остатках
     *
     * Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateStocksMethodTest() {
        // given
        Long campaignId = 56L;
        UpdateStocksRequest updateStocksRequest = new UpdateStocksRequest(new HashSet<>());

        // when
        EmptyApiResponse result = controller.updateStocks(campaignId, updateStocksRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/offers/stocks' to the features of updateStocks() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateStocksClientApiTest() throws IOException {
        // given
        UpdateStocksRequest body = new UpdateStocksRequest(new HashSet<>());
        String uri = UriTemplate.of("/campaigns/{campaignId}/offers/stocks").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("[Ljava.lang.String;@32dca84b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
