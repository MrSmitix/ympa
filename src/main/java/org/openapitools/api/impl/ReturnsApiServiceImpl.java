package org.openapitools.api.impl;

import org.openapitools.api.*;
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
import org.joda.time.LocalDate;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnType;
import org.openapitools.model.SetReturnDecisionRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
public class ReturnsApiServiceImpl implements ReturnsApi {
    /**
     * Информация о невыкупе или возврате
     *
     * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    public GetReturnResponse getReturn(Long campaignId, Long orderId, Long returnId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Получение заявления на возврат
     *
     * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    public File getReturnApplication(Long campaignId, Long orderId, Long returnId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Получение фотографии возврата
     *
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    public File getReturnPhoto(Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash) {
        // TODO: Implement...

        return null;
    }

    /**
     * Список невыкупов и возвратов
     *
     * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    public GetReturnsResponse getReturns(Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, LocalDate fromDate, LocalDate toDate, LocalDate fromDate2, LocalDate toDate2) {
        // TODO: Implement...

        return null;
    }

    /**
     * Принятие или изменение решения по возврату
     *
     * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    public EmptyApiResponse setReturnDecision(Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Подтверждение решения по возврату
     *
     * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
     *
     */
    public EmptyApiResponse submitReturnDecision(Long campaignId, Long orderId, Long returnId) {
        // TODO: Implement...

        return null;
    }

}
