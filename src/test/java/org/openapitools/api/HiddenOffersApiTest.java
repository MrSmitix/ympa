package org.openapitools.api;

import org.openapitools.model.AddHiddenOffersRequest;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeleteHiddenOffersRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetHiddenOffersResponse;
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
 * API tests for HiddenOffersApi
 */
@MicronautTest
public class HiddenOffersApiTest {

    @Inject
    HiddenOffersApi api;

    
    /**
     * Скрытие товаров и настройки скрытия
     *
     * Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void addHiddenOffersTest() {
        // given
        Long campaignId = 56L;
        AddHiddenOffersRequest addHiddenOffersRequest = new AddHiddenOffersRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.addHiddenOffers(campaignId, addHiddenOffersRequest).block();

        // then
        // TODO implement the addHiddenOffersTest()
    }

    
    /**
     * Возобновление показа товаров
     *
     * Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteHiddenOffersTest() {
        // given
        Long campaignId = 56L;
        DeleteHiddenOffersRequest deleteHiddenOffersRequest = new DeleteHiddenOffersRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest).block();

        // then
        // TODO implement the deleteHiddenOffersTest()
    }

    
    /**
     * Информация о скрытых вами товарах
     *
     * Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getHiddenOffersTest() {
        // given
        Long campaignId = 56L;
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerId = Arrays.asList("example");
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        Integer offset = 56;
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetHiddenOffersResponse body = api.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize).block();

        // then
        // TODO implement the getHiddenOffersTest()
    }

    
}
