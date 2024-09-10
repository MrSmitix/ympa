package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FlippingPagerDTO {
    /* Сколько всего найдено элементов. */
    Integer total
    /* Начальный номер найденного элемента на странице. */
    Integer from
    /* Конечный номер найденного элемента на странице. */
    Integer to
    /* Текущая страница. */
    Integer currentPage
    /* Общее количество страниц. */
    Integer pagesCount
    /* Размер страницы. */
    Integer pageSize
}
