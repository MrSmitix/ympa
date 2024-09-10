package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetOutletLicensesResponse;
import java.util.Set;
import org.openapitools.model.UpdateOutletLicenseRequest;
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
 * API tests for OutletLicensesController
 */
@MicronautTest
public class OutletLicensesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    OutletLicensesController controller;

    /**
     * This test is used to validate the implementation of deleteOutletLicenses() method
     *
     * The method should: Удаление лицензий для точек продаж
     *
     * Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteOutletLicensesMethodTest() {
        // given
        Long campaignId = 56L;
        Set<Long> ids = new HashSet<>();

        // when
        EmptyApiResponse result = controller.deleteOutletLicenses(campaignId, ids).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/outlets/licenses' to the features of deleteOutletLicenses() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteOutletLicensesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/outlets/licenses").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@3976dacd");
        request.getParameters()
            .add("ids", String.valueOf(new HashSet<>())); // The query parameter format should be csv

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getOutletLicenses() method
     *
     * The method should: Информация о лицензиях для точек продаж
     *
     * Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getOutletLicensesMethodTest() {
        // given
        Long campaignId = 56L;
        Set<Long> outletIds = new HashSet<>();
        Set<Long> ids = new HashSet<>();

        // when
        GetOutletLicensesResponse result = controller.getOutletLicenses(campaignId, outletIds, ids).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/outlets/licenses' to the features of getOutletLicenses() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getOutletLicensesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/campaigns/{campaignId}/outlets/licenses").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5f580241");
        request.getParameters()
            .add("outletIds", String.valueOf(new HashSet<>())) // The query parameter format should be csv
            .add("ids", String.valueOf(new HashSet<>())); // The query parameter format should be csv

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetOutletLicensesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateOutletLicenses() method
     *
     * The method should: Создание и изменение лицензий для точек продаж
     *
     * Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOutletLicensesMethodTest() {
        // given
        Long campaignId = 56L;
        UpdateOutletLicenseRequest updateOutletLicenseRequest = new UpdateOutletLicenseRequest(Arrays.asList());

        // when
        EmptyApiResponse result = controller.updateOutletLicenses(campaignId, updateOutletLicenseRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/outlets/licenses' to the features of updateOutletLicenses() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateOutletLicensesClientApiTest() throws IOException {
        // given
        UpdateOutletLicenseRequest body = new UpdateOutletLicenseRequest(Arrays.asList());
        String uri = UriTemplate.of("/campaigns/{campaignId}/outlets/licenses").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1b1f7781");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
