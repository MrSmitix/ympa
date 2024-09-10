package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OutletLicenseDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на создание или изменение лицензий для точек продаж.
 */

@Schema(name = "UpdateOutletLicenseRequest", description = "Запрос на создание или изменение лицензий для точек продаж.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOutletLicenseRequest {

  @Valid
  private List<@Valid OutletLicenseDTO> licenses = new ArrayList<>();

  public UpdateOutletLicenseRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOutletLicenseRequest(List<@Valid OutletLicenseDTO> licenses) {
    this.licenses = licenses;
  }

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
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "licenses", description = "Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("licenses")
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

