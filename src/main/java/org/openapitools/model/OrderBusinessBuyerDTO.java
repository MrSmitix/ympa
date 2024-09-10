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
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о покупателе. 
 */
@Schema(name = "OrderBusinessBuyerDTO", description = "Информация о покупателе. ")
@JsonPropertyOrder({
  OrderBusinessBuyerDTO.JSON_PROPERTY_INN,
  OrderBusinessBuyerDTO.JSON_PROPERTY_KPP,
  OrderBusinessBuyerDTO.JSON_PROPERTY_ORGANIZATION_NAME,
  OrderBusinessBuyerDTO.JSON_PROPERTY_ORGANIZATION_JUR_ADDRESS
})
@JsonTypeName("OrderBusinessBuyerDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrderBusinessBuyerDTO {
    public static final String JSON_PROPERTY_INN = "inn";
    private String inn;

    public static final String JSON_PROPERTY_KPP = "kpp";
    private String kpp;

    public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organizationName";
    private String organizationName;

    public static final String JSON_PROPERTY_ORGANIZATION_JUR_ADDRESS = "organizationJurAddress";
    private String organizationJurAddress;

    public OrderBusinessBuyerDTO() {
    }

    public OrderBusinessBuyerDTO inn(String inn) {
        this.inn = inn;
        return this;
    }

    /**
     * ИНН.
     * @return inn
     */
    @Nullable
    @Schema(name = "inn", description = "ИНН.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getInn() {
        return inn;
    }

    @JsonProperty(JSON_PROPERTY_INN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInn(String inn) {
        this.inn = inn;
    }

    public OrderBusinessBuyerDTO kpp(String kpp) {
        this.kpp = kpp;
        return this;
    }

    /**
     * КПП.
     * @return kpp
     */
    @Nullable
    @Schema(name = "kpp", description = "КПП.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_KPP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getKpp() {
        return kpp;
    }

    @JsonProperty(JSON_PROPERTY_KPP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public OrderBusinessBuyerDTO organizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Наименование юридического лица.
     * @return organizationName
     */
    @Nullable
    @Schema(name = "organizationName", description = "Наименование юридического лица.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public OrderBusinessBuyerDTO organizationJurAddress(String organizationJurAddress) {
        this.organizationJurAddress = organizationJurAddress;
        return this;
    }

    /**
     * Юридический адрес.
     * @return organizationJurAddress
     */
    @Nullable
    @Schema(name = "organizationJurAddress", description = "Юридический адрес.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ORGANIZATION_JUR_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOrganizationJurAddress() {
        return organizationJurAddress;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_JUR_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganizationJurAddress(String organizationJurAddress) {
        this.organizationJurAddress = organizationJurAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderBusinessBuyerDTO orderBusinessBuyerDTO = (OrderBusinessBuyerDTO) o;
        return Objects.equals(this.inn, orderBusinessBuyerDTO.inn) &&
            Objects.equals(this.kpp, orderBusinessBuyerDTO.kpp) &&
            Objects.equals(this.organizationName, orderBusinessBuyerDTO.organizationName) &&
            Objects.equals(this.organizationJurAddress, orderBusinessBuyerDTO.organizationJurAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inn, kpp, organizationName, organizationJurAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBusinessBuyerDTO {\n");
        sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
        sb.append("    kpp: ").append(toIndentedString(kpp)).append("\n");
        sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
        sb.append("    organizationJurAddress: ").append(toIndentedString(organizationJurAddress)).append("\n");
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

