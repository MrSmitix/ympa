package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CategoryParameterUnitDTO;
import org.openapitools.server.api.model.OfferCardRecommendationType;
import org.openapitools.server.api.model.ParameterType;
import org.openapitools.server.api.model.ParameterValueConstraintsDTO;
import org.openapitools.server.api.model.ParameterValueOptionDTO;
import org.openapitools.server.api.model.ValueRestrictionDTO;

/**
 * Характеристика товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryParameterDTO   {
  
  private Long id;
  private String name;
  private ParameterType type;
  private CategoryParameterUnitDTO unit;
  private String description;
  private List<OfferCardRecommendationType> recommendationTypes;
  private Boolean required;
  private Boolean filtering;
  private Boolean distinctive;
  private Boolean multivalue;
  private Boolean allowCustomValues;
  private List<ParameterValueOptionDTO> values;
  private ParameterValueConstraintsDTO constraints;
  private List<ValueRestrictionDTO> valueRestrictions;

  public CategoryParameterDTO () {

  }

  public CategoryParameterDTO (Long id, String name, ParameterType type, CategoryParameterUnitDTO unit, String description, List<OfferCardRecommendationType> recommendationTypes, Boolean required, Boolean filtering, Boolean distinctive, Boolean multivalue, Boolean allowCustomValues, List<ParameterValueOptionDTO> values, ParameterValueConstraintsDTO constraints, List<ValueRestrictionDTO> valueRestrictions) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.unit = unit;
    this.description = description;
    this.recommendationTypes = recommendationTypes;
    this.required = required;
    this.filtering = filtering;
    this.distinctive = distinctive;
    this.multivalue = multivalue;
    this.allowCustomValues = allowCustomValues;
    this.values = values;
    this.constraints = constraints;
    this.valueRestrictions = valueRestrictions;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("type")
  public ParameterType getType() {
    return type;
  }
  public void setType(ParameterType type) {
    this.type = type;
  }

    
  @JsonProperty("unit")
  public CategoryParameterUnitDTO getUnit() {
    return unit;
  }
  public void setUnit(CategoryParameterUnitDTO unit) {
    this.unit = unit;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("recommendationTypes")
  public List<OfferCardRecommendationType> getRecommendationTypes() {
    return recommendationTypes;
  }
  public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
    this.recommendationTypes = recommendationTypes;
  }

    
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

    
  @JsonProperty("filtering")
  public Boolean getFiltering() {
    return filtering;
  }
  public void setFiltering(Boolean filtering) {
    this.filtering = filtering;
  }

    
  @JsonProperty("distinctive")
  public Boolean getDistinctive() {
    return distinctive;
  }
  public void setDistinctive(Boolean distinctive) {
    this.distinctive = distinctive;
  }

    
  @JsonProperty("multivalue")
  public Boolean getMultivalue() {
    return multivalue;
  }
  public void setMultivalue(Boolean multivalue) {
    this.multivalue = multivalue;
  }

    
  @JsonProperty("allowCustomValues")
  public Boolean getAllowCustomValues() {
    return allowCustomValues;
  }
  public void setAllowCustomValues(Boolean allowCustomValues) {
    this.allowCustomValues = allowCustomValues;
  }

    
  @JsonProperty("values")
  public List<ParameterValueOptionDTO> getValues() {
    return values;
  }
  public void setValues(List<ParameterValueOptionDTO> values) {
    this.values = values;
  }

    
  @JsonProperty("constraints")
  public ParameterValueConstraintsDTO getConstraints() {
    return constraints;
  }
  public void setConstraints(ParameterValueConstraintsDTO constraints) {
    this.constraints = constraints;
  }

    
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
