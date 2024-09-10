package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Характеристика товара.
 */
@ApiModel(description="Характеристика товара.")

public class CategoryParameterDTO  {
  
 /**
  * Идентификатор характеристики.
  */
  @ApiModelProperty(required = true, value = "Идентификатор характеристики.")
  private Long id;

 /**
  * Название характеристики.
  */
  @ApiModelProperty(value = "Название характеристики.")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ParameterType type;

  @ApiModelProperty(value = "")
  @Valid
  private CategoryParameterUnitDTO unit;

 /**
  * Описание характеристики.
  */
  @ApiModelProperty(value = "Описание характеристики.")
  private String description;

 /**
  * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
  */
  @ApiModelProperty(value = "Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.")
  @Valid
  private List<OfferCardRecommendationType> recommendationTypes;

 /**
  * Обязательность характеристики.
  */
  @ApiModelProperty(required = true, value = "Обязательность характеристики.")
  private Boolean required;

 /**
  * Используется ли характеристика в фильтре.
  */
  @ApiModelProperty(required = true, value = "Используется ли характеристика в фильтре.")
  private Boolean filtering;

 /**
  * Является ли характеристика особенностью варианта.
  */
  @ApiModelProperty(required = true, value = "Является ли характеристика особенностью варианта.")
  private Boolean distinctive;

 /**
  * Можно ли передать сразу несколько значений.
  */
  @ApiModelProperty(required = true, value = "Можно ли передать сразу несколько значений.")
  private Boolean multivalue;

 /**
  * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
  */
  @ApiModelProperty(required = true, value = "Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.")
  private Boolean allowCustomValues;

 /**
  * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
  */
  @ApiModelProperty(value = "Список допустимых значений параметра. Только для характеристик типа `ENUM`.")
  @Valid
  private List<@Valid ParameterValueOptionDTO> values;

  @ApiModelProperty(value = "")
  @Valid
  private ParameterValueConstraintsDTO constraints;

 /**
  * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
  */
  @ApiModelProperty(value = "Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.")
  @Valid
  private List<@Valid ValueRestrictionDTO> valueRestrictions;
 /**
  * Идентификатор характеристики.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CategoryParameterDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название характеристики.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CategoryParameterDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public ParameterType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(ParameterType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CategoryParameterDTO type(ParameterType type) {
    this.type = type;
    return this;
  }

 /**
  * Get unit
  * @return unit
  */
  @JsonProperty("unit")
  public CategoryParameterUnitDTO getUnit() {
    return unit;
  }

  /**
   * Sets the <code>unit</code> property.
   */
 public void setUnit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
  }

  /**
   * Sets the <code>unit</code> property.
   */
  public CategoryParameterDTO unit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
    return this;
  }

 /**
  * Описание характеристики.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public CategoryParameterDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
  * @return recommendationTypes
  */
  @JsonProperty("recommendationTypes")
  public List<OfferCardRecommendationType> getRecommendationTypes() {
    return recommendationTypes;
  }

  /**
   * Sets the <code>recommendationTypes</code> property.
   */
 public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

  /**
   * Sets the <code>recommendationTypes</code> property.
   */
  public CategoryParameterDTO recommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>recommendationTypes</code> list.
   */
  public CategoryParameterDTO addRecommendationTypesItem(OfferCardRecommendationType recommendationTypesItem) {
    this.recommendationTypes.add(recommendationTypesItem);
    return this;
  }

 /**
  * Обязательность характеристики.
  * @return required
  */
  @JsonProperty("required")
  @NotNull
  public Boolean getRequired() {
    return required;
  }

  /**
   * Sets the <code>required</code> property.
   */
 public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * Sets the <code>required</code> property.
   */
  public CategoryParameterDTO required(Boolean required) {
    this.required = required;
    return this;
  }

 /**
  * Используется ли характеристика в фильтре.
  * @return filtering
  */
  @JsonProperty("filtering")
  @NotNull
  public Boolean getFiltering() {
    return filtering;
  }

  /**
   * Sets the <code>filtering</code> property.
   */
 public void setFiltering(Boolean filtering) {
    this.filtering = filtering;
  }

  /**
   * Sets the <code>filtering</code> property.
   */
  public CategoryParameterDTO filtering(Boolean filtering) {
    this.filtering = filtering;
    return this;
  }

 /**
  * Является ли характеристика особенностью варианта.
  * @return distinctive
  */
  @JsonProperty("distinctive")
  @NotNull
  public Boolean getDistinctive() {
    return distinctive;
  }

  /**
   * Sets the <code>distinctive</code> property.
   */
 public void setDistinctive(Boolean distinctive) {
    this.distinctive = distinctive;
  }

  /**
   * Sets the <code>distinctive</code> property.
   */
  public CategoryParameterDTO distinctive(Boolean distinctive) {
    this.distinctive = distinctive;
    return this;
  }

 /**
  * Можно ли передать сразу несколько значений.
  * @return multivalue
  */
  @JsonProperty("multivalue")
  @NotNull
  public Boolean getMultivalue() {
    return multivalue;
  }

  /**
   * Sets the <code>multivalue</code> property.
   */
 public void setMultivalue(Boolean multivalue) {
    this.multivalue = multivalue;
  }

  /**
   * Sets the <code>multivalue</code> property.
   */
  public CategoryParameterDTO multivalue(Boolean multivalue) {
    this.multivalue = multivalue;
    return this;
  }

 /**
  * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.
  * @return allowCustomValues
  */
  @JsonProperty("allowCustomValues")
  @NotNull
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }

  /**
   * Sets the <code>allowCustomValues</code> property.
   */
 public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
  }

  /**
   * Sets the <code>allowCustomValues</code> property.
   */
  public CategoryParameterDTO allowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
    return this;
  }

 /**
  * Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.
  * @return values
  */
  @JsonProperty("values")
  public List<@Valid ParameterValueOptionDTO> getValues() {
    return values;
  }

  /**
   * Sets the <code>values</code> property.
   */
 public void setValues(List<@Valid ParameterValueOptionDTO> values) {
    this.values = values;
  }

  /**
   * Sets the <code>values</code> property.
   */
  public CategoryParameterDTO values(List<@Valid ParameterValueOptionDTO> values) {
    this.values = values;
    return this;
  }

  /**
   * Adds a new item to the <code>values</code> list.
   */
  public CategoryParameterDTO addValuesItem(ParameterValueOptionDTO valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

 /**
  * Get constraints
  * @return constraints
  */
  @JsonProperty("constraints")
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }

  /**
   * Sets the <code>constraints</code> property.
   */
 public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
  }

  /**
   * Sets the <code>constraints</code> property.
   */
  public CategoryParameterDTO constraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

 /**
  * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.
  * @return valueRestrictions
  */
  @JsonProperty("valueRestrictions")
  public List<@Valid ValueRestrictionDTO> getValueRestrictions() {
    return valueRestrictions;
  }

  /**
   * Sets the <code>valueRestrictions</code> property.
   */
 public void setValueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
  }

  /**
   * Sets the <code>valueRestrictions</code> property.
   */
  public CategoryParameterDTO valueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
    return this;
  }

  /**
   * Adds a new item to the <code>valueRestrictions</code> list.
   */
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

