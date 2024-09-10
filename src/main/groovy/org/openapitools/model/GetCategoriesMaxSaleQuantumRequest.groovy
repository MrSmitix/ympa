package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;

@Canonical
class GetCategoriesMaxSaleQuantumRequest {
    /* Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. */
    Set<Long> marketCategoryIds = new LinkedHashSet<>()
}
