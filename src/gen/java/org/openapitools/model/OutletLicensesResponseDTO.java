package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FullOutletLicenseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Ответ на запрос информации о лицензиях для точек продаж.")
public class OutletLicensesResponseDTO   {
  
  private List<@Valid FullOutletLicenseDTO> licenses = new ArrayList<>();

  /**
   * Список лицензий.
   **/
  public OutletLicensesResponseDTO licenses(List<@Valid FullOutletLicenseDTO> licenses) {
    this.licenses = licenses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список лицензий.")
  @JsonProperty("licenses")
  @NotNull
  public List<@Valid FullOutletLicenseDTO> getLicenses() {
    return licenses;
  }
  public void setLicenses(List<@Valid FullOutletLicenseDTO> licenses) {
    this.licenses = licenses;
  }

  public OutletLicensesResponseDTO addLicensesItem(FullOutletLicenseDTO licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }
    this.licenses.add(licensesItem);
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

