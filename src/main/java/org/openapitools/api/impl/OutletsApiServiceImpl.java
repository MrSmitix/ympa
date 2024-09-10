package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.ChangeOutletRequest;
import org.openapitools.model.CreateOutletResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetOutletResponse;
import org.openapitools.model.GetOutletsResponse;

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
public class OutletsApiServiceImpl implements OutletsApi {
    /**
     * Создание точки продаж
     *
     * Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     */
    public CreateOutletResponse createOutlet(Long campaignId, ChangeOutletRequest changeOutletRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Удаление точки продаж
     *
     * Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     */
    public EmptyApiResponse deleteOutlet(Long campaignId, Long outletId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Информация об одной точке продаж
     *
     * Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     */
    public GetOutletResponse getOutlet(Long campaignId, Long outletId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Информация о нескольких точках продаж
     *
     * Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     */
    public GetOutletsResponse getOutlets(Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2) {
        // TODO: Implement...

        return null;
    }

    /**
     * Изменение информации о точке продаж
     *
     * Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     *
     */
    public EmptyApiResponse updateOutlet(Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest) {
        // TODO: Implement...

        return null;
    }

}
