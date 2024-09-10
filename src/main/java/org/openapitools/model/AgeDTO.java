/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import org.openapitools.model.AgeUnitType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Возраст в заданных единицах измерения.
 */
@Schema(name = "AgeDTO", description = "Возраст в заданных единицах измерения.")
@JsonPropertyOrder({
  AgeDTO.JSON_PROPERTY_VALUE,
  AgeDTO.JSON_PROPERTY_AGE_UNIT
})
@JsonTypeName("AgeDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class AgeDTO {
    public static final String JSON_PROPERTY_VALUE = "value";
    private BigDecimal value;

    public static final String JSON_PROPERTY_AGE_UNIT = "ageUnit";
    private AgeUnitType ageUnit;

    public AgeDTO(BigDecimal value, AgeUnitType ageUnit) {
        this.value = value;
        this.ageUnit = ageUnit;
    }

    public AgeDTO value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * Значение. 
     * minimum: 0
     * @return value
     */
    @NotNull
    @DecimalMin("0")
    @Schema(name = "value", description = "Значение. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public AgeDTO ageUnit(AgeUnitType ageUnit) {
        this.ageUnit = ageUnit;
        return this;
    }

    /**
     * Get ageUnit
     * @return ageUnit
     */
    @NotNull
    @Schema(name = "ageUnit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_AGE_UNIT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public AgeUnitType getAgeUnit() {
        return ageUnit;
    }

    @JsonProperty(JSON_PROPERTY_AGE_UNIT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAgeUnit(AgeUnitType ageUnit) {
        this.ageUnit = ageUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgeDTO ageDTO = (AgeDTO) o;
        return Objects.equals(this.value, ageDTO.value) &&
            Objects.equals(this.ageUnit, ageDTO.ageUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, ageUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgeDTO {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    ageUnit: ").append(toIndentedString(ageUnit)).append("\n");
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

