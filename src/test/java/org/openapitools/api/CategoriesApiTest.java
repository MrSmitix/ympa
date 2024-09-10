package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.model.GetCategoriesRequest;
import org.openapitools.model.GetCategoriesResponse;
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
 * API tests for CategoriesApi
 */
@MicronautTest
public class CategoriesApiTest {

    @Inject
    CategoriesApi api;

    
    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCategoriesMaxSaleQuantumTest() {
        // given
        GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = new GetCategoriesMaxSaleQuantumRequest(new HashSet<>());

        // when
        GetCategoriesMaxSaleQuantumResponse body = api.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest).block();

        // then
        // TODO implement the getCategoriesMaxSaleQuantumTest()
    }

    
    /**
     * Дерево категорий
     *
     * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCategoriesTreeTest() {
        // given
        GetCategoriesRequest getCategoriesRequest = new GetCategoriesRequest();

        // when
        GetCategoriesResponse body = api.getCategoriesTree(getCategoriesRequest).block();

        // then
        // TODO implement the getCategoriesTreeTest()
    }

    
}
