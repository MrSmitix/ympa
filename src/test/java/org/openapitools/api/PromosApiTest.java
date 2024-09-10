package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeletePromoOffersRequest;
import org.openapitools.model.DeletePromoOffersResponse;
import org.openapitools.model.GetPromoOffersRequest;
import org.openapitools.model.GetPromoOffersResponse;
import org.openapitools.model.GetPromosRequest;
import org.openapitools.model.GetPromosResponse;
import org.openapitools.model.UpdatePromoOffersRequest;
import org.openapitools.model.UpdatePromoOffersResponse;
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
 * API tests for PromosApi
 */
@MicronautTest
public class PromosApiTest {

    @Inject
    PromosApi api;

    
    /**
     * Удаление товаров из акции
     *
     * Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deletePromoOffersTest() {
        // given
        Long businessId = 56L;
        DeletePromoOffersRequest deletePromoOffersRequest = new DeletePromoOffersRequest("example");

        // when
        DeletePromoOffersResponse body = api.deletePromoOffers(businessId, deletePromoOffersRequest).block();

        // then
        // TODO implement the deletePromoOffersTest()
    }

    
    /**
     * Получение списка товаров, которые участвуют или могут участвовать в акции
     *
     * Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPromoOffersTest() {
        // given
        Long businessId = 56L;
        GetPromoOffersRequest getPromoOffersRequest = new GetPromoOffersRequest("example");
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetPromoOffersResponse body = api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit).block();

        // then
        // TODO implement the getPromoOffersTest()
    }

    
    /**
     * Получение списка акций
     *
     * Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getPromosTest() {
        // given
        Long businessId = 56L;
        GetPromosRequest getPromosRequest = new GetPromosRequest();

        // when
        GetPromosResponse body = api.getPromos(businessId, getPromosRequest).block();

        // then
        // TODO implement the getPromosTest()
    }

    
    /**
     * Добавление товаров в акцию или изменение их цен
     *
     * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updatePromoOffersTest() {
        // given
        Long businessId = 56L;
        UpdatePromoOffersRequest updatePromoOffersRequest = new UpdatePromoOffersRequest("example", Arrays.asList());

        // when
        UpdatePromoOffersResponse body = api.updatePromoOffers(businessId, updatePromoOffersRequest).block();

        // then
        // TODO implement the updatePromoOffersTest()
    }

    
}
