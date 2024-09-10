package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OutletLicenseDTO;



/**
 * Запрос на создание или изменение лицензий для точек продаж.
 **/

@ApiModel(description = "Запрос на создание или изменение лицензий для точек продаж.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOutletLicenseRequest   {
  @JsonProperty("licenses")
  private List<OutletLicenseDTO> licenses = new ArrayList<>();

  /**
   * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
   **/
  public UpdateOutletLicenseRequest licenses(List<OutletLicenseDTO> licenses) {
    this.licenses = licenses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. ")
  @JsonProperty("licenses")
  public List<OutletLicenseDTO> getLicenses() {
    return licenses;
  }
  public void setLicenses(List<OutletLicenseDTO> licenses) {
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

