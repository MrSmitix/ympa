package org.openapitools.controller;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ConfirmPricesRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetQuarantineOffersRequest;
import org.openapitools.model.GetQuarantineOffersResponse;
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
 * API tests for PriceQuarantineController
 */
@MicronautTest
public class PriceQuarantineControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    PriceQuarantineController controller;

    /**
     * This test is used to validate the implementation of confirmBusinessPrices() method
     *
     * The method should: Удаление товара из карантина по цене в кабинете
     *
     * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void confirmBusinessPricesMethodTest() {
        // given
        Long businessId = 56L;
        ConfirmPricesRequest confirmPricesRequest = new ConfirmPricesRequest(Arrays.asList("example"));

        // when
        EmptyApiResponse result = controller.confirmBusinessPrices(businessId, confirmPricesRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/price-quarantine/confirm' to the features of confirmBusinessPrices() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void confirmBusinessPricesClientApiTest() throws IOException {
        // given
        ConfirmPricesRequest body = new ConfirmPricesRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{businessId}/price-quarantine/confirm").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4a8cddf5");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of confirmCampaignPrices() method
     *
     * The method should: Удаление товара из карантина по цене в магазине
     *
     * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void confirmCampaignPricesMethodTest() {
        // given
        Long campaignId = 56L;
        ConfirmPricesRequest confirmPricesRequest = new ConfirmPricesRequest(Arrays.asList("example"));

        // when
        EmptyApiResponse result = controller.confirmCampaignPrices(campaignId, confirmPricesRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/price-quarantine/confirm' to the features of confirmCampaignPrices() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void confirmCampaignPricesClientApiTest() throws IOException {
        // given
        ConfirmPricesRequest body = new ConfirmPricesRequest(Arrays.asList("example"));
        String uri = UriTemplate.of("/campaigns/{campaignId}/price-quarantine/confirm").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@16ec2ffa");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EmptyApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getBusinessQuarantineOffers() method
     *
     * The method should: Список товаров, находящихся в карантине по цене в кабинете
     *
     * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessQuarantineOffersMethodTest() {
        // given
        Long businessId = 56L;
        GetQuarantineOffersRequest getQuarantineOffersRequest = new GetQuarantineOffersRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetQuarantineOffersResponse result = controller.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{businessId}/price-quarantine' to the features of getBusinessQuarantineOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getBusinessQuarantineOffersClientApiTest() throws IOException {
        // given
        GetQuarantineOffersRequest body = new GetQuarantineOffersRequest();
        String uri = UriTemplate.of("/businesses/{businessId}/price-quarantine").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("businessId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@38128db7");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetQuarantineOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getCampaignQuarantineOffers() method
     *
     * The method should: Список товаров, находящихся в карантине по цене в магазине
     *
     * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignQuarantineOffersMethodTest() {
        // given
        Long campaignId = 56L;
        GetQuarantineOffersRequest getQuarantineOffersRequest = new GetQuarantineOffersRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetQuarantineOffersResponse result = controller.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/campaigns/{campaignId}/price-quarantine' to the features of getCampaignQuarantineOffers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getCampaignQuarantineOffersClientApiTest() throws IOException {
        // given
        GetQuarantineOffersRequest body = new GetQuarantineOffersRequest();
        String uri = UriTemplate.of("/campaigns/{campaignId}/price-quarantine").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("campaignId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@212667ae");
        request.getParameters()
            .add("page_token", "eyBuZXh0SWQ6IDIzNDIgfQ==") // The query parameter format should be 
            .add("limit", String.valueOf(20)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetQuarantineOffersResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
