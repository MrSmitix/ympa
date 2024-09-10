package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CategoryParameterUnitDTO;
import com.prokarma.pkmst.model.OfferCardRecommendationType;
import com.prokarma.pkmst.model.ParameterType;
import com.prokarma.pkmst.model.ParameterValueConstraintsDTO;
import com.prokarma.pkmst.model.ParameterValueOptionDTO;
import com.prokarma.pkmst.model.ValueRestrictionDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Характеристика товара.
 */
@ApiModel(description = "Характеристика товара.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private ParameterType type;

  @JsonProperty("unit")
  private CategoryParameterUnitDTO unit;

  @JsonProperty("description")
  private String description;

  @JsonProperty("recommendationTypes")
  
  private List<OfferCardRecommendationType> recommendationTypes = null;

  @JsonProperty("required")
  private Boolean required;

  @JsonProperty("filtering")
  private Boolean filtering;

  @JsonProperty("distinctive")
  private Boolean distinctive;

  @JsonProperty("multivalue")
  private Boolean multivalue;

  @JsonProperty("allowCustomValues")
  private Boolean allowCustomValues;

  @JsonProperty("values")
  
  private List<ParameterValueOptionDTO> values = null;

  @JsonProperty("constraints")
  private ParameterValueConstraintsDTO constraints;

  @JsonProperty("valueRestrictions")
  
  private List<ValueRestrictionDTO> valueRestrictions = null;

  public CategoryParameterDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор характеристики.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор характеристики.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CategoryParameterDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название характеристики.
   * @return name
   */
  @ApiModelProperty(value = "Название характеристики.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryParameterDTO type(ParameterType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public ParameterType getType() {
    return type;
  }

  public void setType(ParameterType type) {
    this.type = type;
  }

  public CategoryParameterDTO unit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @ApiModelProperty(value = "")
  public CategoryParameterUnitDTO getUnit() {
    return unit;
  }

  public void setUnit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
  }

  public CategoryParameterDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание характеристики.
   * @return description
   */
  @ApiModelProperty(value = "Описание характеристики.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
   * @return recommendationTypes
   */
  @ApiModelProperty(value = "Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.")
  public List<OfferCardRecommendationType> getRecommendationTypes() {
    return recommendationTypes;
  }

  public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

  public CategoryParameterDTO required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Обязательность характеристики.
   * @return required
   */
  @ApiModelProperty(required = true, value = "Обязательность характеристики.")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CategoryParameterDTO filtering(Boolean filtering) {
    this.filtering = filtering;
    return this;
  }

  /**
   * Используется ли характеристика в фильтре.
   * @return filtering
   */
  @ApiModelProperty(required = true, value = "Используется ли характеристика в фильтре.")
  public Boolean getFiltering() {
    return filtering;
  }

  public void setFiltering(Boolean filtering) {
    this.filtering = filtering;
  }

  public CategoryParameterDTO distinctive(Boolean distinctive) {
    this.distinctive = distinctive;
    return this;
  }

  /**
   * Является ли характеристика особенностью варианта.
   * @return distinctive
   */
  @ApiModelProperty(required = true, value = "Является ли характеристика особенностью варианта.")
  public Boolean getDistinctive() {
    return distinctive;
  }

  public void setDistinctive(Boolean distinctive) {
    this.distinctive = distinctive;
  }

  public CategoryParameterDTO multivalue(Boolean multivalue) {
    this.multivalue = multivalue;
    return this;
  }

  /**
   * Можно ли передать сразу несколько значений.
   * @return multivalue
   */
  @ApiModelProperty(required = true, value = "Можно ли передать сразу несколько значений.")
  public Boolean getMultivalue() {
    return multivalue;
  }

  public void setMultivalue(Boolean multivalue) {
    this.multivalue = multivalue;
  }

  public CategoryParameterDTO allowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
    return this;
  }

  /**
   * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
   * @return allowCustomValues
   */
  @ApiModelProperty(required = true, value = "Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.")
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }

  public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
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
   * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
   * @return values
   */
  @ApiModelProperty(value = "Список допустимых значений параметра. Только для характеристик типа `ENUM`.")
  public List<ParameterValueOptionDTO> getValues() {
    return values;
  }

  public void setValues(List<ParameterValueOptionDTO> values) {
    this.values = values;
  }

  public CategoryParameterDTO constraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Get constraints
   * @return constraints
   */
  @ApiModelProperty(value = "")
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }

  public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
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
   * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
   * @return valueRestrictions
   */
  @ApiModelProperty(value = "Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.")
  public List<ValueRestrictionDTO> getValueRestrictions() {
    return valueRestrictions;
  }

  public void setValueRestrictions(List<ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

