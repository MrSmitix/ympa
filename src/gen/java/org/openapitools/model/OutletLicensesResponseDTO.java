package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FullOutletLicenseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 */
@ApiModel(description="Ответ на запрос информации о лицензиях для точек продаж.")

public class OutletLicensesResponseDTO  {
  
 /**
  * Список лицензий.
  */
  @ApiModelProperty(required = true, value = "Список лицензий.")
  @Valid
  private List<@Valid FullOutletLicenseDTO> licenses = new ArrayList<>();
 /**
  * Список лицензий.
  * @return licenses
  */
  @JsonProperty("licenses")
  @NotNull
  public List<@Valid FullOutletLicenseDTO> getLicenses() {
    return licenses;
  }

  /**
   * Sets the <code>licenses</code> property.
   */
 public void setLicenses(List<@Valid FullOutletLicenseDTO> licenses) {
    this.licenses = licenses;
  }

  /**
   * Sets the <code>licenses</code> property.
   */
  public OutletLicensesResponseDTO licenses(List<@Valid FullOutletLicenseDTO> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * Adds a new item to the <code>licenses</code> list.
   */
  public OutletLicensesResponseDTO addLicensesItem(FullOutletLicenseDTO licensesItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

