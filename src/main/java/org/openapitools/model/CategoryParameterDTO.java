package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Характеристика товара.
 */

@Schema(name = "CategoryParameterDTO", description = "Характеристика товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryParameterDTO {

  private Long id;

  private String name;

  private ParameterType type;

  private CategoryParameterUnitDTO unit;

  private String description;

  @Valid
  private JsonNullable<List<OfferCardRecommendationType>> recommendationTypes = JsonNullable.<List<OfferCardRecommendationType>>undefined();

  private Boolean required;

  private Boolean filtering;

  private Boolean distinctive;

  private Boolean multivalue;

  private Boolean allowCustomValues;

  @Valid
  private JsonNullable<List<@Valid ParameterValueOptionDTO>> values = JsonNullable.<List<@Valid ParameterValueOptionDTO>>undefined();

  private ParameterValueConstraintsDTO constraints;

  @Valid
  private JsonNullable<List<@Valid ValueRestrictionDTO>> valueRestrictions = JsonNullable.<List<@Valid ValueRestrictionDTO>>undefined();

  public CategoryParameterDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CategoryParameterDTO(Long id, ParameterType type, Boolean required, Boolean filtering, Boolean distinctive, Boolean multivalue, Boolean allowCustomValues) {
    this.id = id;
    this.type = type;
    this.required = required;
    this.filtering = filtering;
    this.distinctive = distinctive;
    this.multivalue = multivalue;
    this.allowCustomValues = allowCustomValues;
  }

  public CategoryParameterDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор характеристики.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор характеристики.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  
  @Schema(name = "name", description = "Название характеристики.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
  @Valid 
  @Schema(name = "unit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
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
  
  @Schema(name = "description", description = "Описание характеристики.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CategoryParameterDTO recommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = JsonNullable.of(recommendationTypes);
    return this;
  }

  public CategoryParameterDTO addRecommendationTypesItem(OfferCardRecommendationType recommendationTypesItem) {
    if (this.recommendationTypes == null || !this.recommendationTypes.isPresent()) {
      this.recommendationTypes = JsonNullable.of(new ArrayList<>());
    }
    this.recommendationTypes.get().add(recommendationTypesItem);
    return this;
  }

  /**
   * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
   * @return recommendationTypes
   */
  @Valid 
  @Schema(name = "recommendationTypes", description = "Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendationTypes")
  public JsonNullable<List<OfferCardRecommendationType>> getRecommendationTypes() {
    return recommendationTypes;
  }

  public void setRecommendationTypes(JsonNullable<List<OfferCardRecommendationType>> recommendationTypes) {
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
  @NotNull 
  @Schema(name = "required", description = "Обязательность характеристики.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required")
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
  @NotNull 
  @Schema(name = "filtering", description = "Используется ли характеристика в фильтре.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filtering")
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
  @NotNull 
  @Schema(name = "distinctive", description = "Является ли характеристика особенностью варианта.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("distinctive")
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
  @NotNull 
  @Schema(name = "multivalue", description = "Можно ли передать сразу несколько значений.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("multivalue")
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
  @NotNull 
  @Schema(name = "allowCustomValues", description = "Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allowCustomValues")
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }

  public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
  }

  public CategoryParameterDTO values(List<@Valid ParameterValueOptionDTO> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public CategoryParameterDTO addValuesItem(ParameterValueOptionDTO valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
   * @return values
   */
  @Valid 
  @Schema(name = "values", description = "Список допустимых значений параметра. Только для характеристик типа `ENUM`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public JsonNullable<List<@Valid ParameterValueOptionDTO>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<@Valid ParameterValueOptionDTO>> values) {
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
  @Valid 
  @Schema(name = "constraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("constraints")
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }

  public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
  }

  public CategoryParameterDTO valueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
    this.valueRestrictions = JsonNullable.of(valueRestrictions);
    return this;
  }

  public CategoryParameterDTO addValueRestrictionsItem(ValueRestrictionDTO valueRestrictionsItem) {
    if (this.valueRestrictions == null || !this.valueRestrictions.isPresent()) {
      this.valueRestrictions = JsonNullable.of(new ArrayList<>());
    }
    this.valueRestrictions.get().add(valueRestrictionsItem);
    return this;
  }

  /**
   * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
   * @return valueRestrictions
   */
  @Valid 
  @Schema(name = "valueRestrictions", description = "Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueRestrictions")
  public JsonNullable<List<@Valid ValueRestrictionDTO>> getValueRestrictions() {
    return valueRestrictions;
  }

  public void setValueRestrictions(JsonNullable<List<@Valid ValueRestrictionDTO>> valueRestrictions) {
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
        equalsNullable(this.recommendationTypes, categoryParameterDTO.recommendationTypes) &&
        Objects.equals(this.required, categoryParameterDTO.required) &&
        Objects.equals(this.filtering, categoryParameterDTO.filtering) &&
        Objects.equals(this.distinctive, categoryParameterDTO.distinctive) &&
        Objects.equals(this.multivalue, categoryParameterDTO.multivalue) &&
        Objects.equals(this.allowCustomValues, categoryParameterDTO.allowCustomValues) &&
        equalsNullable(this.values, categoryParameterDTO.values) &&
        Objects.equals(this.constraints, categoryParameterDTO.constraints) &&
        equalsNullable(this.valueRestrictions, categoryParameterDTO.valueRestrictions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, unit, description, hashCodeNullable(recommendationTypes), required, filtering, distinctive, multivalue, allowCustomValues, hashCodeNullable(values), constraints, hashCodeNullable(valueRestrictions));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

