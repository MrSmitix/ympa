package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Характеристика товара.
 **/
@ApiModel(description = "Характеристика товара.")
@JsonTypeName("CategoryParameterDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterDTO   {
  private Long id;
  private String name;
  private ParameterType type;
  private CategoryParameterUnitDTO unit;
  private String description;
  private @Valid List<OfferCardRecommendationType> recommendationTypes;
  private Boolean required;
  private Boolean filtering;
  private Boolean distinctive;
  private Boolean multivalue;
  private Boolean allowCustomValues;
  private @Valid List<@Valid ParameterValueOptionDTO> values;
  private ParameterValueConstraintsDTO constraints;
  private @Valid List<@Valid ValueRestrictionDTO> valueRestrictions;

  /**
   * Идентификатор характеристики.
   **/
  public CategoryParameterDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор характеристики.")
  @JsonProperty("id")
  @NotNull public Long getId() {
    return id;
  }

  @JsonProperty("id")
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

  @JsonProperty("name")
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
  @NotNull public ParameterType getType() {
    return type;
  }

  @JsonProperty("type")
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
  @Valid public CategoryParameterUnitDTO getUnit() {
    return unit;
  }

  @JsonProperty("unit")
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

  @JsonProperty("description")
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

  @JsonProperty("recommendationTypes")
  public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

  public CategoryParameterDTO addRecommendationTypesItem(OfferCardRecommendationType recommendationTypesItem) {
    if (this.recommendationTypes == null) {
      this.recommendationTypes = new ArrayList<>();
    }

    this.recommendationTypes.add(recommendationTypesItem);
    return this;
  }

  public CategoryParameterDTO removeRecommendationTypesItem(OfferCardRecommendationType recommendationTypesItem) {
    if (recommendationTypesItem != null && this.recommendationTypes != null) {
      this.recommendationTypes.remove(recommendationTypesItem);
    }

    return this;
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
  @NotNull public Boolean getRequired() {
    return required;
  }

  @JsonProperty("required")
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
  @NotNull public Boolean getFiltering() {
    return filtering;
  }

  @JsonProperty("filtering")
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
  @NotNull public Boolean getDistinctive() {
    return distinctive;
  }

  @JsonProperty("distinctive")
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
  @NotNull public Boolean getMultivalue() {
    return multivalue;
  }

  @JsonProperty("multivalue")
  public void setMultivalue(Boolean multivalue) {
    this.multivalue = multivalue;
  }

  /**
   * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.
   **/
  public CategoryParameterDTO allowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.")
  @JsonProperty("allowCustomValues")
  @NotNull public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }

  @JsonProperty("allowCustomValues")
  public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
  }

  /**
   * Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.
   **/
  public CategoryParameterDTO values(List<@Valid ParameterValueOptionDTO> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "Список допустимых значений параметра. Только для характеристик типа `ENUM`.")
  @JsonProperty("values")
  @Valid public List<@Valid ParameterValueOptionDTO> getValues() {
    return values;
  }

  @JsonProperty("values")
  public void setValues(List<@Valid ParameterValueOptionDTO> values) {
    this.values = values;
  }

  public CategoryParameterDTO addValuesItem(ParameterValueOptionDTO valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }

    this.values.add(valuesItem);
    return this;
  }

  public CategoryParameterDTO removeValuesItem(ParameterValueOptionDTO valuesItem) {
    if (valuesItem != null && this.values != null) {
      this.values.remove(valuesItem);
    }

    return this;
  }
  /**
   **/
  public CategoryParameterDTO constraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("constraints")
  @Valid public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }

  @JsonProperty("constraints")
  public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
  }

  /**
   * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.
   **/
  public CategoryParameterDTO valueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
    return this;
  }

  
  @ApiModelProperty(value = "Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.")
  @JsonProperty("valueRestrictions")
  @Valid public List<@Valid ValueRestrictionDTO> getValueRestrictions() {
    return valueRestrictions;
  }

  @JsonProperty("valueRestrictions")
  public void setValueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = valueRestrictions;
  }

  public CategoryParameterDTO addValueRestrictionsItem(ValueRestrictionDTO valueRestrictionsItem) {
    if (this.valueRestrictions == null) {
      this.valueRestrictions = new ArrayList<>();
    }

    this.valueRestrictions.add(valueRestrictionsItem);
    return this;
  }

  public CategoryParameterDTO removeValueRestrictionsItem(ValueRestrictionDTO valueRestrictionsItem) {
    if (valueRestrictionsItem != null && this.valueRestrictions != null) {
      this.valueRestrictions.remove(valueRestrictionsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

