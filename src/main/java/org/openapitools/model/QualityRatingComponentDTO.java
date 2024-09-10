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
import org.openapitools.model.QualityRatingComponentType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Составляющая индекса качества.
 */
@Schema(name = "QualityRatingComponentDTO", description = "Составляющая индекса качества.")
@JsonPropertyOrder({
  QualityRatingComponentDTO.JSON_PROPERTY_VALUE,
  QualityRatingComponentDTO.JSON_PROPERTY_COMPONENT_TYPE
})
@JsonTypeName("QualityRatingComponentDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class QualityRatingComponentDTO {
    public static final String JSON_PROPERTY_VALUE = "value";
    private Double value;

    public static final String JSON_PROPERTY_COMPONENT_TYPE = "componentType";
    private QualityRatingComponentType componentType;

    public QualityRatingComponentDTO(Double value, QualityRatingComponentType componentType) {
        this.value = value;
        this.componentType = componentType;
    }

    public QualityRatingComponentDTO value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Значение составляющей в процентах.
     * minimum: 0
     * maximum: 100
     * @return value
     */
    @NotNull
    @DecimalMin("0")
    @DecimalMax("100")
    @Schema(name = "value", description = "Значение составляющей в процентах.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Double getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValue(Double value) {
        this.value = value;
    }

    public QualityRatingComponentDTO componentType(QualityRatingComponentType componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * Get componentType
     * @return componentType
     */
    @NotNull
    @Schema(name = "componentType", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_COMPONENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public QualityRatingComponentType getComponentType() {
        return componentType;
    }

    @JsonProperty(JSON_PROPERTY_COMPONENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setComponentType(QualityRatingComponentType componentType) {
        this.componentType = componentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityRatingComponentDTO qualityRatingComponentDTO = (QualityRatingComponentDTO) o;
        return Objects.equals(this.value, qualityRatingComponentDTO.value) &&
            Objects.equals(this.componentType, qualityRatingComponentDTO.componentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, componentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityRatingComponentDTO {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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

