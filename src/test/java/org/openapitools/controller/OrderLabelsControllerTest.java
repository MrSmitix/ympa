package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.GetOrderLabelsDataResponse;
import org.openapitools.model.PageFormatType;
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
 * API tests for OrderLabelsController
 */
@MicronautTest
public class OrderLabelsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    OrderLabelsController controller;

    /**
     * This test is used to validate the implementation of generateOrderLabel() method
     *
     * The method should: Готовый ярлык‑наклейка для коробки в заказе
     *
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateOrderLabelMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long shipmentId = 56L;
        Long boxId = 56L;
        PageFormatType _format = PageFormatType.fromValue("A7");

        // when
        CompletedFileUpload result = controller.generateOrderLabel(campaignId, orderId, shipmentId, boxId, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label' to the features of generateOrderLabel() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateOrderLabelClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
            put("shipmentId", 56L);
            put("boxId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4136d4da")
            .accept("[Ljava.lang.String;@4136d4da");
        request.getParameters()
            .add("format", String.valueOf(PageFormatType.fromValue("A7"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateOrderLabels() method
     *
     * The method should: Готовые ярлыки‑наклейки на все коробки в одном заказе
     *
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateOrderLabelsMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        PageFormatType _format = PageFormatType.fromValue("A7");

        // when
        CompletedFileUpload result = controller.generateOrderLabels(campaignId, orderId, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/delivery/labels' to the features of generateOrderLabels() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateOrderLabelsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/delivery/labels").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1ed8d18c")
            .accept("[Ljava.lang.String;@1ed8d18c");
        request.getParameters()
            .add("format", String.valueOf(PageFormatType.fromValue("A7"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getOrderLabelsData() method
     *
     * The method should: Данные для самостоятельного изготовления ярлыков
     *
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderLabelsDataMethodTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetOrderLabelsDataResponse result = controller.getOrderLabelsData(campaignId, orderId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data' to the features of getOrderLabelsData() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOrderLabelsDataClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
            put("orderId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2e7d71d9");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetOrderLabelsDataResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
