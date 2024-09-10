package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryParameterUnitDTO;
import org.openapitools.model.OfferCardRecommendationType;
import org.openapitools.model.ParameterType;
import org.openapitools.model.ParameterValueConstraintsDTO;
import org.openapitools.model.ParameterValueOptionDTO;
import org.openapitools.model.ValueRestrictionDTO;

@Canonical
class CategoryParameterDTO {
    /* Идентификатор характеристики. */
    Long id
    /* Название характеристики. */
    String name
    
    ParameterType type
    
    CategoryParameterUnitDTO unit
    /* Описание характеристики. */
    String description
    /* Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. */
    List<OfferCardRecommendationType> recommendationTypes
    /* Обязательность характеристики. */
    Boolean required
    /* Используется ли характеристика в фильтре. */
    Boolean filtering
    /* Является ли характеристика особенностью варианта. */
    Boolean distinctive
    /* Можно ли передать сразу несколько значений. */
    Boolean multivalue
    /* Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. */
    Boolean allowCustomValues
    /* Список допустимых значений параметра. Только для характеристик типа `ENUM`. */
    List<ParameterValueOptionDTO> values
    
    ParameterValueConstraintsDTO constraints
    /* Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. */
    List<ValueRestrictionDTO> valueRestrictions
}
