package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Характеристика товара.
 */
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
    private List<@Valid ParameterValueOptionDTO> values;
    private ParameterValueConstraintsDTO constraints;
    private List<@Valid ValueRestrictionDTO> valueRestrictions;

    /**
     * Default constructor.
     */
    public CategoryParameterDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CategoryParameterDTO.
     *
     * @param id Идентификатор характеристики.
     * @param name Название характеристики.
     * @param type type
     * @param unit unit
     * @param description Описание характеристики.
     * @param recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
     * @param required Обязательность характеристики.
     * @param filtering Используется ли характеристика в фильтре.
     * @param distinctive Является ли характеристика особенностью варианта.
     * @param multivalue Можно ли передать сразу несколько значений.
     * @param allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.
     * @param values Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.
     * @param constraints constraints
     * @param valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.
     */
    public CategoryParameterDTO(
        Long id, 
        String name, 
        ParameterType type, 
        CategoryParameterUnitDTO unit, 
        String description, 
        List<OfferCardRecommendationType> recommendationTypes, 
        Boolean required, 
        Boolean filtering, 
        Boolean distinctive, 
        Boolean multivalue, 
        Boolean allowCustomValues, 
        List<@Valid ParameterValueOptionDTO> values, 
        ParameterValueConstraintsDTO constraints, 
        List<@Valid ValueRestrictionDTO> valueRestrictions
    ) {
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



    /**
     * Идентификатор характеристики.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название характеристики.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get type
     * @return type
     */
    public ParameterType getType() {
        return type;
    }

    public void setType(ParameterType type) {
        this.type = type;
    }

    /**
     * Get unit
     * @return unit
     */
    public CategoryParameterUnitDTO getUnit() {
        return unit;
    }

    public void setUnit(CategoryParameterUnitDTO unit) {
        this.unit = unit;
    }

    /**
     * Описание характеристики.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
     * @return recommendationTypes
     */
    public List<OfferCardRecommendationType> getRecommendationTypes() {
        return recommendationTypes;
    }

    public void setRecommendationTypes(List<OfferCardRecommendationType> recommendationTypes) {
        this.recommendationTypes = recommendationTypes;
    }

    /**
     * Обязательность характеристики.
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * Используется ли характеристика в фильтре.
     * @return filtering
     */
    public Boolean getFiltering() {
        return filtering;
    }

    public void setFiltering(Boolean filtering) {
        this.filtering = filtering;
    }

    /**
     * Является ли характеристика особенностью варианта.
     * @return distinctive
     */
    public Boolean getDistinctive() {
        return distinctive;
    }

    public void setDistinctive(Boolean distinctive) {
        this.distinctive = distinctive;
    }

    /**
     * Можно ли передать сразу несколько значений.
     * @return multivalue
     */
    public Boolean getMultivalue() {
        return multivalue;
    }

    public void setMultivalue(Boolean multivalue) {
        this.multivalue = multivalue;
    }

    /**
     * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
     * @return allowCustomValues
     */
    public Boolean getAllowCustomValues() {
        return allowCustomValues;
    }

    public void setAllowCustomValues(Boolean allowCustomValues) {
        this.allowCustomValues = allowCustomValues;
    }

    /**
     * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
     * @return values
     */
    public List<@Valid ParameterValueOptionDTO> getValues() {
        return values;
    }

    public void setValues(List<@Valid ParameterValueOptionDTO> values) {
        this.values = values;
    }

    /**
     * Get constraints
     * @return constraints
     */
    public ParameterValueConstraintsDTO getConstraints() {
        return constraints;
    }

    public void setConstraints(ParameterValueConstraintsDTO constraints) {
        this.constraints = constraints;
    }

    /**
     * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
     * @return valueRestrictions
     */
    public List<@Valid ValueRestrictionDTO> getValueRestrictions() {
        return valueRestrictions;
    }

    public void setValueRestrictions(List<@Valid ValueRestrictionDTO> valueRestrictions) {
        this.valueRestrictions = valueRestrictions;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

