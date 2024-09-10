package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



/**
 * Характеристика товара.
 **/

@ApiModel(description = "Характеристика товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  /**
   * Идентификатор характеристики.
   **/
  public CategoryParameterDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор характеристики.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название характеристики.
   **/
  public CategoryParameterDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Название характеристики.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CategoryParameterDTO type(ParameterType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public ParameterType getType() {
    return type;
  }
  public void setType(ParameterType type) {
    this.type = type;
  }

  /**
   **/
  public CategoryParameterDTO unit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unit")
  public CategoryParameterUnitDTO getUnit() {
    return unit;
  }
  public void setUnit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
  }

  /**
   * Описание характеристики.
   **/
  public CategoryParameterDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Описание характеристики.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
   **/
  public CategoryParameterDTO recommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
    return this;
  }

  
  @ApiModelProperty(value = "Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.")
  @JsonProperty("recommendationTypes")
  public List<OfferCardRecommendationType> getRecommendationTypes() {
    return recommendationTypes;
  }
  public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

  /**
   * Обязательность характеристики.
   **/
  public CategoryParameterDTO required(Boolean required) {
    this.required = required;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Обязательность характеристики.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * Используется ли характеристика в фильтре.
   **/
  public CategoryParameterDTO filtering(Boolean filtering) {
    this.filtering = filtering;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Используется ли характеристика в фильтре.")
  @JsonProperty("filtering")
  public Boolean getFiltering() {
    return filtering;
  }
  public void setFiltering(Boolean filtering) {
    this.filtering = filtering;
  }

  /**
   * Является ли характеристика особенностью варианта.
   **/
  public CategoryParameterDTO distinctive(Boolean distinctive) {
    this.distinctive = distinctive;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Является ли характеристика особенностью варианта.")
  @JsonProperty("distinctive")
  public Boolean getDistinctive() {
    return distinctive;
  }
  public void setDistinctive(Boolean distinctive) {
    this.distinctive = distinctive;
  }

  /**
   * Можно ли передать сразу несколько значений.
   **/
  public CategoryParameterDTO multivalue(Boolean multivalue) {
    this.multivalue = multivalue;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Можно ли передать сразу несколько значений.")
  @JsonProperty("multivalue")
  public Boolean getMultivalue() {
    return multivalue;
  }
  public void setMultivalue(Boolean multivalue) {
    this.multivalue = multivalue;
  }

  /**
   * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
   **/
  public CategoryParameterDTO allowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.")
  @JsonProperty("allowCustomValues")
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }
  public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
  }

  /**
   * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
   **/
  public CategoryParameterDTO values(List<ParameterValueOptionDTO> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "Список допустимых значений параметра. Только для характеристик типа `ENUM`.")
  @JsonProperty("values")
  public List<ParameterValueOptionDTO> getValues() {
    return values;
  }
  public void setValues(List<ParameterValueOptionDTO> values) {
    this.values = values;
  }

  /**
   **/
  public CategoryParameterDTO constraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("constraints")
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }
  public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
  }

  /**
   * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
   **/
  public CategoryParameterDTO valueRestrictions(List<ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
    return this;
  }

  
  @ApiModelProperty(value = "Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.")
  @JsonProperty("valueRestrictions")
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
    return Objects.equals(id, categoryParameterDTO.id) &&
        Objects.equals(name, categoryParameterDTO.name) &&
        Objects.equals(type, categoryParameterDTO.type) &&
        Objects.equals(unit, categoryParameterDTO.unit) &&
        Objects.equals(description, categoryParameterDTO.description) &&
        Objects.equals(recommendationTypes, categoryParameterDTO.recommendationTypes) &&
        Objects.equals(required, categoryParameterDTO.required) &&
        Objects.equals(filtering, categoryParameterDTO.filtering) &&
        Objects.equals(distinctive, categoryParameterDTO.distinctive) &&
        Objects.equals(multivalue, categoryParameterDTO.multivalue) &&
        Objects.equals(allowCustomValues, categoryParameterDTO.allowCustomValues) &&
        Objects.equals(values, categoryParameterDTO.values) &&
        Objects.equals(constraints, categoryParameterDTO.constraints) &&
        Objects.equals(valueRestrictions, categoryParameterDTO.valueRestrictions);
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

