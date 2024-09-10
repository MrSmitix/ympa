package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OutletLicenseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Запрос на создание или изменение лицензий для точек продаж.
 */
@ApiModel(description = "Запрос на создание или изменение лицензий для точек продаж.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOutletLicenseRequest   {
  @JsonProperty("licenses")
  
  private List<OutletLicenseDTO> licenses = new ArrayList<>();

  public UpdateOutletLicenseRequest licenses(List<OutletLicenseDTO> licenses) {
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
   */
  @ApiModelProperty(required = true, value = "Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. ")
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
    return Objects.equals(this.licenses, updateOutletLicenseRequest.licenses);
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

