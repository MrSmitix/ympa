package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OutletLicenseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на создание или изменение лицензий для точек продаж.
 */
public class UpdateOutletLicenseRequest   {

    private List<@Valid OutletLicenseDTO> licenses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateOutletLicenseRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOutletLicenseRequest.
     *
     * @param licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
     */
    public UpdateOutletLicenseRequest(
        List<@Valid OutletLicenseDTO> licenses
    ) {
        this.licenses = licenses;
    }



    /**
     * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
     * @return licenses
     */
    public List<@Valid OutletLicenseDTO> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<@Valid OutletLicenseDTO> licenses) {
        this.licenses = licenses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOutletLicenseRequest {\n");
        
        sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
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

