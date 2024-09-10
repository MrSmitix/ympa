package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FullOutletLicenseDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 */

@Schema(name = "OutletLicensesResponseDTO", description = "Ответ на запрос информации о лицензиях для точек продаж.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletLicensesResponseDTO {

  @Valid
  private List<@Valid FullOutletLicenseDTO> licenses = new ArrayList<>();

  public OutletLicensesResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OutletLicensesResponseDTO(List<@Valid FullOutletLicenseDTO> licenses) {
    this.licenses = licenses;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "licenses", description = "Список лицензий.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("licenses")
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

