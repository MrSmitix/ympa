package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OutletLicenseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос на создание или изменение лицензий для точек продаж.
 */
@ApiModel(description="Запрос на создание или изменение лицензий для точек продаж.")

public class UpdateOutletLicenseRequest  {
  
 /**
  * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
  */
  @ApiModelProperty(required = true, value = "Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. ")
  @Valid
  private List<@Valid OutletLicenseDTO> licenses = new ArrayList<>();
 /**
  * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
  * @return licenses
  */
  @JsonProperty("licenses")
  @NotNull
 @Size(min=1)  public List<@Valid OutletLicenseDTO> getLicenses() {
    return licenses;
  }

  /**
   * Sets the <code>licenses</code> property.
   */
 public void setLicenses(List<@Valid OutletLicenseDTO> licenses) {
    this.licenses = licenses;
  }

  /**
   * Sets the <code>licenses</code> property.
   */
  public UpdateOutletLicenseRequest licenses(List<@Valid OutletLicenseDTO> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * Adds a new item to the <code>licenses</code> list.
   */
  public UpdateOutletLicenseRequest addLicensesItem(OutletLicenseDTO licensesItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

