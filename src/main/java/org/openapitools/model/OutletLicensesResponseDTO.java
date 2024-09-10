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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FullOutletLicenseDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 */
@JsonPropertyOrder({
  OutletLicensesResponseDTO.JSON_PROPERTY_LICENSES
})
@JsonTypeName("OutletLicensesResponseDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OutletLicensesResponseDTO {
    public static final String JSON_PROPERTY_LICENSES = "licenses";
    private List<@Valid FullOutletLicenseDTO> licenses = new ArrayList<>();

    public OutletLicensesResponseDTO(List<@Valid FullOutletLicenseDTO> licenses) {
        this.licenses = licenses;
    }

    public OutletLicensesResponseDTO licenses(List<@Valid FullOutletLicenseDTO> licenses) {
        this.licenses = licenses;
        return this;
    }

    public OutletLicensesResponseDTO addLicensesItem(FullOutletLicenseDTO licensesItem) {
        this.licenses.add(licensesItem);
        return this;
    }

    /**
     * Список лицензий.
     * @return licenses
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_LICENSES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid FullOutletLicenseDTO> getLicenses() {
        return licenses;
    }

    @JsonProperty(JSON_PROPERTY_LICENSES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLicenses(List<@Valid FullOutletLicenseDTO> licenses) {
        this.licenses = licenses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutletLicensesResponseDTO outletLicensesResponseDTO = (OutletLicensesResponseDTO) o;
        return Objects.equals(this.licenses, outletLicensesResponseDTO.licenses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licenses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutletLicensesResponseDTO {\n");
        sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
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

