package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.FullOutletLicenseDTO;

/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutletLicensesResponseDTO   {
  
  private List<FullOutletLicenseDTO> licenses = new ArrayList<>();

  public OutletLicensesResponseDTO () {

  }

  public OutletLicensesResponseDTO (List<FullOutletLicenseDTO> licenses) {
    this.licenses = licenses;
  }

    
  @JsonProperty("licenses")
  public List<FullOutletLicenseDTO> getLicenses() {
    return licenses;
  }
  public void setLicenses(List<FullOutletLicenseDTO> licenses) {
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
    return Objects.equals(licenses, outletLicensesResponseDTO.licenses);
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
