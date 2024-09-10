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
import org.openapitools.model.AffectedOrderQualityRatingComponentType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о заказе, который повлиял на индекс качества.
 */
@Schema(name = "QualityRatingAffectedOrderDTO", description = "Информация о заказе, который повлиял на индекс качества.")
@JsonPropertyOrder({
  QualityRatingAffectedOrderDTO.JSON_PROPERTY_ORDER_ID,
  QualityRatingAffectedOrderDTO.JSON_PROPERTY_DESCRIPTION,
  QualityRatingAffectedOrderDTO.JSON_PROPERTY_COMPONENT_TYPE
})
@JsonTypeName("QualityRatingAffectedOrderDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class QualityRatingAffectedOrderDTO {
    public static final String JSON_PROPERTY_ORDER_ID = "orderId";
    private Long orderId;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_COMPONENT_TYPE = "componentType";
    private AffectedOrderQualityRatingComponentType componentType;

    public QualityRatingAffectedOrderDTO(Long orderId, String description, AffectedOrderQualityRatingComponentType componentType) {
        this.orderId = orderId;
        this.description = description;
        this.componentType = componentType;
    }

    public QualityRatingAffectedOrderDTO orderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Идентификатор заказа.
     * minimum: 0
     * @return orderId
     */
    @NotNull
    @Min(0L)
    @Schema(name = "orderId", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getOrderId() {
        return orderId;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public QualityRatingAffectedOrderDTO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Описание проблемы.
     * @return description
     */
    @NotNull
    @Schema(name = "description", description = "Описание проблемы.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDescription(String description) {
        this.description = description;
    }

    public QualityRatingAffectedOrderDTO componentType(AffectedOrderQualityRatingComponentType componentType) {
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
    public AffectedOrderQualityRatingComponentType getComponentType() {
        return componentType;
    }

    @JsonProperty(JSON_PROPERTY_COMPONENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setComponentType(AffectedOrderQualityRatingComponentType componentType) {
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
        QualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO = (QualityRatingAffectedOrderDTO) o;
        return Objects.equals(this.orderId, qualityRatingAffectedOrderDTO.orderId) &&
            Objects.equals(this.description, qualityRatingAffectedOrderDTO.description) &&
            Objects.equals(this.componentType, qualityRatingAffectedOrderDTO.componentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, description, componentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityRatingAffectedOrderDTO {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

