package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OutletLicenseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос на создание или изменение лицензий для точек продаж.
 **/
@ApiModel(description = "Запрос на создание или изменение лицензий для точек продаж.")
@JsonTypeName("UpdateOutletLicenseRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOutletLicenseRequest   {
  private @Valid List<@Valid OutletLicenseDTO> licenses = new ArrayList<>();

  /**
   * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
   **/
  public UpdateOutletLicenseRequest licenses(List<@Valid OutletLicenseDTO> licenses) {
    this.licenses = licenses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. ")
  @JsonProperty("licenses")
  @NotNull @Valid  @Size(min=1)public List<@Valid OutletLicenseDTO> getLicenses() {
    return licenses;
  }

  @JsonProperty("licenses")
  public void setLicenses(List<@Valid OutletLicenseDTO> licenses) {
    this.licenses = licenses;
  }

  public UpdateOutletLicenseRequest addLicensesItem(OutletLicenseDTO licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }

    this.licenses.add(licensesItem);
    return this;
  }

  public UpdateOutletLicenseRequest removeLicensesItem(OutletLicenseDTO licensesItem) {
    if (licensesItem != null && this.licenses != null) {
      this.licenses.remove(licensesItem);
    }

    return this;
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

