package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import java.io.File;
import org.openapitools.model.GetOrderLabelsDataResponse;
import org.openapitools.model.PageFormatType;
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
 * API tests for OrderLabelsApi
 */
@MicronautTest
public class OrderLabelsApiTest {

    @Inject
    OrderLabelsApi api;

    
    /**
     * Готовый ярлык‑наклейка для коробки в заказе
     *
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateOrderLabelTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        Long shipmentId = 56L;
        Long boxId = 56L;
        PageFormatType _format = PageFormatType.fromValue("A7");

        // when
        File body = api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, _format).block();

        // then
        // TODO implement the generateOrderLabelTest()
    }

    
    /**
     * Готовые ярлыки‑наклейки на все коробки в одном заказе
     *
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateOrderLabelsTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;
        PageFormatType _format = PageFormatType.fromValue("A7");

        // when
        File body = api.generateOrderLabels(campaignId, orderId, _format).block();

        // then
        // TODO implement the generateOrderLabelsTest()
    }

    
    /**
     * Данные для самостоятельного изготовления ярлыков
     *
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOrderLabelsDataTest() {
        // given
        Long campaignId = 56L;
        Long orderId = 56L;

        // when
        GetOrderLabelsDataResponse body = api.getOrderLabelsData(campaignId, orderId).block();

        // then
        // TODO implement the getOrderLabelsDataTest()
    }

    
}
