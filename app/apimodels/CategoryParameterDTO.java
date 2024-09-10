package apimodels;

import apimodels.CategoryParameterUnitDTO;
import apimodels.OfferCardRecommendationType;
import apimodels.ParameterType;
import apimodels.ParameterValueConstraintsDTO;
import apimodels.ParameterValueOptionDTO;
import apimodels.ValueRestrictionDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Характеристика товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CategoryParameterDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("type")
  @NotNull
@Valid

  private ParameterType type;

  @JsonProperty("unit")
  @Valid

  private CategoryParameterUnitDTO unit;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("recommendationTypes")
  @Valid

  private List<OfferCardRecommendationType> recommendationTypes = null;

  @JsonProperty("required")
  @NotNull

  private Boolean required;

  @JsonProperty("filtering")
  @NotNull

  private Boolean filtering;

  @JsonProperty("distinctive")
  @NotNull

  private Boolean distinctive;

  @JsonProperty("multivalue")
  @NotNull

  private Boolean multivalue;

  @JsonProperty("allowCustomValues")
  @NotNull

  private Boolean allowCustomValues;

  @JsonProperty("values")
  @Valid

  private List<@Valid ParameterValueOptionDTO> values = null;

  @JsonProperty("constraints")
  @Valid

  private ParameterValueConstraintsDTO constraints;

  @JsonProperty("valueRestrictions")
  @Valid

  private List<@Valid ValueRestrictionDTO> valueRestrictions = null;

  public CategoryParameterDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор характеристики.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }

  public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
  }

  public CategoryParameterDTO values(List<@Valid ParameterValueOptionDTO> values) {
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
  **/
  public List<@Valid ParameterValueOptionDTO> getValues() {
    return values;
  }

  public void setValues(List<@Valid ParameterValueOptionDTO> values) {
    this.values = values;
  }

  public CategoryParameterDTO constraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }

  public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
  }

  public CategoryParameterDTO valueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
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
  **/
  public List<@Valid ValueRestrictionDTO> getValueRestrictions() {
    return valueRestrictions;
  }

  public void setValueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

