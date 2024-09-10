package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.model.GetReturnResponse;
import org.openapitools.model.GetReturnsResponse;
import java.time.LocalDate;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnType;
import org.openapitools.model.SetReturnDecisionRequest;
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
 * API tests for ReturnsApi
 */
@MicronautTest
public class ReturnsApiTest {

    @Inject
    ReturnsApi api;

    
    /**
     * Информация о невыкупе или возврате
     *
     * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReturnTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;

        // when
        GetReturnResponse body = api.getReturn(campaignId, orderId, returnId).block();

        // then
        // TODO implement the getReturnTest()
    }

    
    /**
     * Получение заявления на возврат
     *
     * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReturnApplicationTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;

        // when
        File body = api.getReturnApplication(campaignId, orderId, returnId).block();

        // then
        // TODO implement the getReturnApplicationTest()
    }

    
    /**
     * Получение фотографии возврата
     *
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReturnPhotoTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;
        Long itemId = 56L;
        String imageHash = "example";

        // when
        File body = api.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash).block();

        // then
        // TODO implement the getReturnPhotoTest()
    }

    
    /**
     * Список невыкупов и возвратов
     *
     * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReturnsTest() {
        // given
        Long campaignId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        List<Long> orderIds = Arrays.asList();
        List<RefundStatusType> statuses = Arrays.asList();
        ReturnType type = ReturnType.fromValue("UNREDEEMED");
        LocalDate fromDate = LocalDate.of(2001, 2, 3);
        LocalDate toDate = LocalDate.of(2001, 2, 3);
        LocalDate fromDate2 = LocalDate.of(2001, 2, 3);
        LocalDate toDate2 = LocalDate.of(2001, 2, 3);

        // when
        GetReturnsResponse body = api.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2).block();

        // then
        // TODO implement the getReturnsTest()
    }

    
    /**
     * Принятие или изменение решения по возврату
     *
     * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void setReturnDecisionTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;
        SetReturnDecisionRequest setReturnDecisionRequest = new SetReturnDecisionRequest(56L, org.openapitools.model.ReturnRequestDecisionType.fromValue("REFUND_MONEY"));

        // when
        EmptyApiResponse body = api.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest).block();

        // then
        // TODO implement the setReturnDecisionTest()
    }

    
    /**
     * Подтверждение решения по возврату
     *
     * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void submitReturnDecisionTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long returnId = 56L;

        // when
        EmptyApiResponse body = api.submitReturnDecision(campaignId, orderId, returnId).block();

        // then
        // TODO implement the submitReturnDecisionTest()
    }

    
}
