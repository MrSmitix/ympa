package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetRegionWithChildrenResponse;
import org.openapitools.model.GetRegionsResponse;
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
 * API tests for RegionsApi
 */
@MicronautTest
public class RegionsApiTest {

    @Inject
    RegionsApi api;

    
    /**
     * Информация о дочерних регионах
     *
     * Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void searchRegionChildrenTest() {
        // given
        Long regionId = 56L;
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetRegionWithChildrenResponse body = api.searchRegionChildren(regionId, page, pageSize).block();

        // then
        // TODO implement the searchRegionChildrenTest()
    }

    
    /**
     * Информация о регионе
     *
     * Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void searchRegionsByIdTest() {
        // given
        Long regionId = 56L;

        // when
        GetRegionsResponse body = api.searchRegionsById(regionId).block();

        // then
        // TODO implement the searchRegionsByIdTest()
    }

    
    /**
     * Поиск регионов по их имени
     *
     * Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void searchRegionsByNameTest() {
        // given
        String name = "example";
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetRegionsResponse body = api.searchRegionsByName(name, pageToken, limit).block();

        // then
        // TODO implement the searchRegionsByNameTest()
    }

    
}
