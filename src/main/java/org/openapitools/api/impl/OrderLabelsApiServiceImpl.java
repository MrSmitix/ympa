package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import java.io.File;
import org.openapitools.model.GetOrderLabelsDataResponse;
import org.openapitools.model.PageFormatType;

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
public class OrderLabelsApiServiceImpl implements OrderLabelsApi {
    /**
     * Готовый ярлык‑наклейка для коробки в заказе
     *
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     */
    @Override
    public File generateOrderLabel(Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Готовые ярлыки‑наклейки на все коробки в одном заказе
     *
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     */
    @Override
    public File generateOrderLabels(Long campaignId, Long orderId, PageFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Данные для самостоятельного изготовления ярлыков
     *
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     *
     */
    @Override
    public GetOrderLabelsDataResponse getOrderLabelsData(Long campaignId, Long orderId) {
        // TODO: Implement...
        return null;
    }

}
