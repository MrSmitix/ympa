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
import org.openapitools.model.GetPromoPromocodeInfoDTO;
import org.openapitools.model.MechanicsType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о типе акции.
 */
@Schema(name = "GetPromoMechanicsInfoDTO", description = "Информация о типе акции.")
@JsonPropertyOrder({
  GetPromoMechanicsInfoDTO.JSON_PROPERTY_TYPE,
  GetPromoMechanicsInfoDTO.JSON_PROPERTY_PROMOCODE_INFO
})
@JsonTypeName("GetPromoMechanicsInfoDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetPromoMechanicsInfoDTO {
    public static final String JSON_PROPERTY_TYPE = "type";
    private MechanicsType type;

    public static final String JSON_PROPERTY_PROMOCODE_INFO = "promocodeInfo";
    private GetPromoPromocodeInfoDTO promocodeInfo;

    public GetPromoMechanicsInfoDTO(MechanicsType type) {
        this.type = type;
    }

    public GetPromoMechanicsInfoDTO type(MechanicsType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public MechanicsType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(MechanicsType type) {
        this.type = type;
    }

    public GetPromoMechanicsInfoDTO promocodeInfo(GetPromoPromocodeInfoDTO promocodeInfo) {
        this.promocodeInfo = promocodeInfo;
        return this;
    }

    /**
     * Get promocodeInfo
     * @return promocodeInfo
     */
    @Valid
    @Nullable
    @Schema(name = "promocodeInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PROMOCODE_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public GetPromoPromocodeInfoDTO getPromocodeInfo() {
        return promocodeInfo;
    }

    @JsonProperty(JSON_PROPERTY_PROMOCODE_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPromocodeInfo(GetPromoPromocodeInfoDTO promocodeInfo) {
        this.promocodeInfo = promocodeInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO = (GetPromoMechanicsInfoDTO) o;
        return Objects.equals(this.type, getPromoMechanicsInfoDTO.type) &&
            Objects.equals(this.promocodeInfo, getPromoMechanicsInfoDTO.promocodeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, promocodeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoMechanicsInfoDTO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    promocodeInfo: ").append(toIndentedString(promocodeInfo)).append("\n");
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

