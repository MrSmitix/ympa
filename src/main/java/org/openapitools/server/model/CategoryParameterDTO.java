/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CategoryParameterUnitDTO;
import org.openapitools.server.model.OfferCardRecommendationType;
import org.openapitools.server.model.ParameterType;
import org.openapitools.server.model.ParameterValueConstraintsDTO;
import org.openapitools.server.model.ParameterValueOptionDTO;
import org.openapitools.server.model.ValueRestrictionDTO;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Характеристика товара.
  */

public class CategoryParameterDTO  {
  
 /**
  * Идентификатор характеристики.
  */
  @JsonbProperty("id")
  private Long id;

 /**
  * Название характеристики.
  */
  @JsonbProperty("name")
  private String name;

  @JsonbProperty("type")
  private ParameterType type;

  @JsonbProperty("unit")
  private CategoryParameterUnitDTO unit;

 /**
  * Описание характеристики.
  */
  @JsonbProperty("description")
  private String description;

 /**
  * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
  */
  @JsonbProperty("recommendationTypes")
  private List<OfferCardRecommendationType> recommendationTypes = null;

 /**
  * Обязательность характеристики.
  */
  @JsonbProperty("required")
  private Boolean required;

 /**
  * Используется ли характеристика в фильтре.
  */
  @JsonbProperty("filtering")
  private Boolean filtering;

 /**
  * Является ли характеристика особенностью варианта.
  */
  @JsonbProperty("distinctive")
  private Boolean distinctive;

 /**
  * Можно ли передать сразу несколько значений.
  */
  @JsonbProperty("multivalue")
  private Boolean multivalue;

 /**
  * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
  */
  @JsonbProperty("allowCustomValues")
  private Boolean allowCustomValues;

 /**
  * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
  */
  @JsonbProperty("values")
  private List<ParameterValueOptionDTO> values = null;

  @JsonbProperty("constraints")
  private ParameterValueConstraintsDTO constraints;

 /**
  * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
  */
  @JsonbProperty("valueRestrictions")
  private List<ValueRestrictionDTO> valueRestrictions = null;

  /**
   * Идентификатор характеристики.
   * @return id
   **/
  public Long getId() {
    return id;
  }

  /**
   * Set id
   */
  public void setId(Long id) {
    this.id = id;
  }

  public CategoryParameterDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Название характеристики.
   * @return name
   **/
  public String getName() {
    return name;
  }

  /**
   * Set name
   */
  public void setName(String name) {
    this.name = name;
  }

  public CategoryParameterDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  public ParameterType getType() {
    return type;
  }

  /**
   * Set type
   */
  public void setType(ParameterType type) {
    this.type = type;
  }

  public CategoryParameterDTO type(ParameterType type) {
    this.type = type;
    return this;
  }

  /**
   * Get unit
   * @return unit
   **/
  public CategoryParameterUnitDTO getUnit() {
    return unit;
  }

  /**
   * Set unit
   */
  public void setUnit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
  }

  public CategoryParameterDTO unit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Описание характеристики.
   * @return description
   **/
  public String getDescription() {
    return description;
  }

  /**
   * Set description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  public CategoryParameterDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
   * @return recommendationTypes
   **/
  public List<OfferCardRecommendationType> getRecommendationTypes() {
    return recommendationTypes;
  }

  /**
   * Set recommendationTypes
   */
  public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

  public CategoryParameterDTO recommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
    return this;
  }

  public CategoryParameterDTO addRecommendationTypesItem(OfferCardRecommendationType recommendationTypesItem) {
    if (this.recommendationTypes == null) {
      this.recommendationTypes = new ArrayList<>();
    }
    this.recommendationTypes.add(recommendationTypesItem);
    return this;
  }

  /**
   * Обязательность характеристики.
   * @return required
   **/
  public Boolean getRequired() {
    return required;
  }

  /**
   * Set required
   */
  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CategoryParameterDTO required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Используется ли характеристика в фильтре.
   * @return filtering
   **/
  public Boolean getFiltering() {
    return filtering;
  }

  /**
   * Set filtering
   */
  public void setFiltering(Boolean filtering) {
    this.filtering = filtering;
  }

  public CategoryParameterDTO filtering(Boolean filtering) {
    this.filtering = filtering;
    return this;
  }

  /**
   * Является ли характеристика особенностью варианта.
   * @return distinctive
   **/
  public Boolean getDistinctive() {
    return distinctive;
  }

  /**
   * Set distinctive
   */
  public void setDistinctive(Boolean distinctive) {
    this.distinctive = distinctive;
  }

  public CategoryParameterDTO distinctive(Boolean distinctive) {
    this.distinctive = distinctive;
    return this;
  }

  /**
   * Можно ли передать сразу несколько значений.
   * @return multivalue
   **/
  public Boolean getMultivalue() {
    return multivalue;
  }

  /**
   * Set multivalue
   */
  public void setMultivalue(Boolean multivalue) {
    this.multivalue = multivalue;
  }

  public CategoryParameterDTO multivalue(Boolean multivalue) {
    this.multivalue = multivalue;
    return this;
  }

  /**
   * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.
   * @return allowCustomValues
   **/
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }

  /**
   * Set allowCustomValues
   */
  public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
  }

  public CategoryParameterDTO allowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
    return this;
  }

  /**
   * Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.
   * @return values
   **/
  public List<ParameterValueOptionDTO> getValues() {
    return values;
  }

  /**
   * Set values
   */
  public void setValues(List<ParameterValueOptionDTO> values) {
    this.values = values;
  }

  public CategoryParameterDTO values(List<ParameterValueOptionDTO> values) {
    this.values = values;
    return this;
  }

  public CategoryParameterDTO addValuesItem(ParameterValueOptionDTO valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get constraints
   * @return constraints
   **/
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }

  /**
   * Set constraints
   */
  public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
  }

  public CategoryParameterDTO constraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.
   * @return valueRestrictions
   **/
  public List<ValueRestrictionDTO> getValueRestrictions() {
    return valueRestrictions;
  }

  /**
   * Set valueRestrictions
   */
  public void setValueRestrictions(List<ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
  }

  public CategoryParameterDTO valueRestrictions(List<ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
    return this;
  }

  public CategoryParameterDTO addValueRestrictionsItem(ValueRestrictionDTO valueRestrictionsItem) {
    if (this.valueRestrictions == null) {
      this.valueRestrictions = new ArrayList<>();
    }
    this.valueRestrictions.add(valueRestrictionsItem);
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryParameterDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recommendationTypes: ").append(toIndentedString(recommendationTypes)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    distinctive: ").append(toIndentedString(distinctive)).append("\n");
    sb.append("    multivalue: ").append(toIndentedString(multivalue)).append("\n");
    sb.append("    allowCustomValues: ").append(toIndentedString(allowCustomValues)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    valueRestrictions: ").append(toIndentedString(valueRestrictions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

