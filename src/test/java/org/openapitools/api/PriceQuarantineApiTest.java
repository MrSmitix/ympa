package org.openapitools.api;

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
 * API tests for PriceQuarantineApi
 */
@MicronautTest
public class PriceQuarantineApiTest {

    @Inject
    PriceQuarantineApi api;

    
    /**
     * Удаление товара из карантина по цене в кабинете
     *
     * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void confirmBusinessPricesTest() {
        // given
        Long businessId = 56L;
        ConfirmPricesRequest confirmPricesRequest = new ConfirmPricesRequest(Arrays.asList("example"));

        // when
        EmptyApiResponse body = api.confirmBusinessPrices(businessId, confirmPricesRequest).block();

        // then
        // TODO implement the confirmBusinessPricesTest()
    }

    
    /**
     * Удаление товара из карантина по цене в магазине
     *
     * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void confirmCampaignPricesTest() {
        // given
        Long campaignId = 56L;
        ConfirmPricesRequest confirmPricesRequest = new ConfirmPricesRequest(Arrays.asList("example"));

        // when
        EmptyApiResponse body = api.confirmCampaignPrices(campaignId, confirmPricesRequest).block();

        // then
        // TODO implement the confirmCampaignPricesTest()
    }

    
    /**
     * Список товаров, находящихся в карантине по цене в кабинете
     *
     * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getBusinessQuarantineOffersTest() {
        // given
        Long businessId = 56L;
        GetQuarantineOffersRequest getQuarantineOffersRequest = new GetQuarantineOffersRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetQuarantineOffersResponse body = api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit).block();

        // then
        // TODO implement the getBusinessQuarantineOffersTest()
    }

    
    /**
     * Список товаров, находящихся в карантине по цене в магазине
     *
     * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignQuarantineOffersTest() {
        // given
        Long campaignId = 56L;
        GetQuarantineOffersRequest getQuarantineOffersRequest = new GetQuarantineOffersRequest();
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetQuarantineOffersResponse body = api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit).block();

        // then
        // TODO implement the getCampaignQuarantineOffersTest()
    }

    
}
