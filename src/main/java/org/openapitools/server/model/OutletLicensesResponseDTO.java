package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FullOutletLicenseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 */
public class OutletLicensesResponseDTO   {

    private List<@Valid FullOutletLicenseDTO> licenses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OutletLicensesResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OutletLicensesResponseDTO.
     *
     * @param licenses Список лицензий.
     */
    public OutletLicensesResponseDTO(
        List<@Valid FullOutletLicenseDTO> licenses
    ) {
        this.licenses = licenses;
    }



    /**
     * Список лицензий.
     * @return licenses
     */
    public List<@Valid FullOutletLicenseDTO> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<@Valid FullOutletLicenseDTO> licenses) {
        this.licenses = licenses;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

