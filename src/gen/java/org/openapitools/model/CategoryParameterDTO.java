package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryParameterUnitDTO;
import org.openapitools.model.OfferCardRecommendationType;
import org.openapitools.model.ParameterType;
import org.openapitools.model.ParameterValueConstraintsDTO;
import org.openapitools.model.ParameterValueOptionDTO;
import org.openapitools.model.ValueRestrictionDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Характеристика товара.
 **/
@ApiModel(description="Характеристика товара.")

public class CategoryParameterDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор характеристики.")
 /**
   * Идентификатор характеристики.
  **/
  private Long id;

  @ApiModelProperty(value = "Название характеристики.")
 /**
   * Название характеристики.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "")
  private ParameterType type;

  @ApiModelProperty(value = "")
  private CategoryParameterUnitDTO unit;

  @ApiModelProperty(value = "Описание характеристики.")
 /**
   * Описание характеристики.
  **/
  private String description;

  @ApiModelProperty(value = "Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.")
 /**
   * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
  **/
  private List<OfferCardRecommendationType> recommendationTypes;

  @ApiModelProperty(required = true, value = "Обязательность характеристики.")
 /**
   * Обязательность характеристики.
  **/
  private Boolean required;

  @ApiModelProperty(required = true, value = "Используется ли характеристика в фильтре.")
 /**
   * Используется ли характеристика в фильтре.
  **/
  private Boolean filtering;

  @ApiModelProperty(required = true, value = "Является ли характеристика особенностью варианта.")
 /**
   * Является ли характеристика особенностью варианта.
  **/
  private Boolean distinctive;

  @ApiModelProperty(required = true, value = "Можно ли передать сразу несколько значений.")
 /**
   * Можно ли передать сразу несколько значений.
  **/
  private Boolean multivalue;

  @ApiModelProperty(required = true, value = "Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.")
 /**
   * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
  **/
  private Boolean allowCustomValues;

  @ApiModelProperty(value = "Список допустимых значений параметра. Только для характеристик типа `ENUM`.")
 /**
   * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
  **/
  private List<ParameterValueOptionDTO> values;

  @ApiModelProperty(value = "")
  private ParameterValueConstraintsDTO constraints;

  @ApiModelProperty(value = "Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.")
 /**
   * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
  **/
  private List<ValueRestrictionDTO> valueRestrictions;
 /**
   * Идентификатор характеристики.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

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
  @JsonProperty("name")
  public String getName() {
    return name;
  }

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
  @JsonProperty("type")
  public ParameterType getType() {
    return type;
  }

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
  @JsonProperty("unit")
  public CategoryParameterUnitDTO getUnit() {
    return unit;
  }

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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

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
  @JsonProperty("recommendationTypes")
  public List<OfferCardRecommendationType> getRecommendationTypes() {
    return recommendationTypes;
  }

  public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

  public CategoryParameterDTO recommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
    return this;
  }

  public CategoryParameterDTO addRecommendationTypesItem(OfferCardRecommendationType recommendationTypesItem) {
    this.recommendationTypes.add(recommendationTypesItem);
    return this;
  }

 /**
   * Обязательность характеристики.
   * @return required
  **/
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

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
  @JsonProperty("filtering")
  public Boolean getFiltering() {
    return filtering;
  }

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
  @JsonProperty("distinctive")
  public Boolean getDistinctive() {
    return distinctive;
  }

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
  @JsonProperty("multivalue")
  public Boolean getMultivalue() {
    return multivalue;
  }

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
  @JsonProperty("allowCustomValues")
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }

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
  @JsonProperty("values")
  public List<ParameterValueOptionDTO> getValues() {
    return values;
  }

  public void setValues(List<ParameterValueOptionDTO> values) {
    this.values = values;
  }

  public CategoryParameterDTO values(List<ParameterValueOptionDTO> values) {
    this.values = values;
    return this;
  }

  public CategoryParameterDTO addValuesItem(ParameterValueOptionDTO valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

 /**
   * Get constraints
   * @return constraints
  **/
  @JsonProperty("constraints")
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }

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
  @JsonProperty("valueRestrictions")
  public List<ValueRestrictionDTO> getValueRestrictions() {
    return valueRestrictions;
  }

  public void setValueRestrictions(List<ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
  }

  public CategoryParameterDTO valueRestrictions(List<ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
    return this;
  }

  public CategoryParameterDTO addValueRestrictionsItem(ValueRestrictionDTO valueRestrictionsItem) {
    this.valueRestrictions.add(valueRestrictionsItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryParameterDTO categoryParameterDTO = (CategoryParameterDTO) o;
    return Objects.equals(this.id, categoryParameterDTO.id) &&
        Objects.equals(this.name, categoryParameterDTO.name) &&
        Objects.equals(this.type, categoryParameterDTO.type) &&
        Objects.equals(this.unit, categoryParameterDTO.unit) &&
        Objects.equals(this.description, categoryParameterDTO.description) &&
        Objects.equals(this.recommendationTypes, categoryParameterDTO.recommendationTypes) &&
        Objects.equals(this.required, categoryParameterDTO.required) &&
        Objects.equals(this.filtering, categoryParameterDTO.filtering) &&
        Objects.equals(this.distinctive, categoryParameterDTO.distinctive) &&
        Objects.equals(this.multivalue, categoryParameterDTO.multivalue) &&
        Objects.equals(this.allowCustomValues, categoryParameterDTO.allowCustomValues) &&
        Objects.equals(this.values, categoryParameterDTO.values) &&
        Objects.equals(this.constraints, categoryParameterDTO.constraints) &&
        Objects.equals(this.valueRestrictions, categoryParameterDTO.valueRestrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, unit, description, recommendationTypes, required, filtering, distinctive, multivalue, allowCustomValues, values, constraints, valueRestrictions);
  }

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

