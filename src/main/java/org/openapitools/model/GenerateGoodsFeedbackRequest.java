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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации отчета. 
 */
@JsonPropertyOrder({
  GenerateGoodsFeedbackRequest.JSON_PROPERTY_BUSINESS_ID
})
@JsonTypeName("GenerateGoodsFeedbackRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GenerateGoodsFeedbackRequest {
    public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
    private Long businessId;

    public GenerateGoodsFeedbackRequest(Long businessId) {
        this.businessId = businessId;
    }

    public GenerateGoodsFeedbackRequest businessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * Идентификатор бизнеса.
     * @return businessId
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getBusinessId() {
        return businessId;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = (GenerateGoodsFeedbackRequest) o;
        return Objects.equals(this.businessId, generateGoodsFeedbackRequest.businessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateGoodsFeedbackRequest {\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
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

