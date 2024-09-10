package apimodels;

import apimodels.OutletLicenseDTO;
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
 * Запрос на создание или изменение лицензий для точек продаж.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOutletLicenseRequest   {
  @JsonProperty("licenses")
  @NotNull
@Size(min=1)
@Valid

  private List<@Valid OutletLicenseDTO> licenses = new ArrayList<>();

  public UpdateOutletLicenseRequest licenses(List<@Valid OutletLicenseDTO> licenses) {
    this.licenses = licenses;
    return this;
  }

  public UpdateOutletLicenseRequest addLicensesItem(OutletLicenseDTO licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }
    this.licenses.add(licensesItem);
    return this;
  }

   /**
   * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
   * @return licenses
  **/
  public List<@Valid OutletLicenseDTO> getLicenses() {
    return licenses;
  }

  public void setLicenses(List<@Valid OutletLicenseDTO> licenses) {
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
    UpdateOutletLicenseRequest updateOutletLicenseRequest = (UpdateOutletLicenseRequest) o;
    return Objects.equals(licenses, updateOutletLicenseRequest.licenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenses);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

