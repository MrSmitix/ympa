package org.openapitools.api;

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
 * API tests for OutletLicensesApi
 */
@MicronautTest
public class OutletLicensesApiTest {

    @Inject
    OutletLicensesApi api;

    
    /**
     * Удаление лицензий для точек продаж
     *
     * Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteOutletLicensesTest() {
        // given
        Long campaignId = 56L;
        Set<Long> ids = new HashSet<>();

        // when
        EmptyApiResponse body = api.deleteOutletLicenses(campaignId, ids).block();

        // then
        // TODO implement the deleteOutletLicensesTest()
    }

    
    /**
     * Информация о лицензиях для точек продаж
     *
     * Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getOutletLicensesTest() {
        // given
        Long campaignId = 56L;
        Set<Long> outletIds = new HashSet<>();
        Set<Long> ids = new HashSet<>();

        // when
        GetOutletLicensesResponse body = api.getOutletLicenses(campaignId, outletIds, ids).block();

        // then
        // TODO implement the getOutletLicensesTest()
    }

    
    /**
     * Создание и изменение лицензий для точек продаж
     *
     * Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateOutletLicensesTest() {
        // given
        Long campaignId = 56L;
        UpdateOutletLicenseRequest updateOutletLicenseRequest = new UpdateOutletLicenseRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.updateOutletLicenses(campaignId, updateOutletLicenseRequest).block();

        // then
        // TODO implement the updateOutletLicensesTest()
    }

    
}
