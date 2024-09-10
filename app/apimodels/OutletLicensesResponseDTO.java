package apimodels;

import apimodels.FullOutletLicenseDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OutletLicensesResponseDTO   {
  @JsonProperty("licenses")
  @NotNull
@Valid

  private List<@Valid FullOutletLicenseDTO> licenses = new ArrayList<>();

  public OutletLicensesResponseDTO licenses(List<@Valid FullOutletLicenseDTO> licenses) {
    this.licenses = licenses;
    return this;
  }

  public OutletLicensesResponseDTO addLicensesItem(FullOutletLicenseDTO licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }
    this.licenses.add(licensesItem);
    return this;
  }

   /**
   * Список лицензий.
   * @return licenses
  **/
  public List<@Valid FullOutletLicenseDTO> getLicenses() {
    return licenses;
  }

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
    return Objects.equals(licenses, outletLicensesResponseDTO.licenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenses);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

