package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Время последнего обновления.
 */

@Schema(name = "UpdateTimeDTO", description = "Время последнего обновления.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateTimeDTO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updatedAt;

  public UpdateTimeDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateTimeDTO(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UpdateTimeDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Время последнего обновления.
   * @return updatedAt
   */
  @NotNull @Valid 
  @Schema(name = "updatedAt", description = "Время последнего обновления.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimeDTO updateTimeDTO = (UpdateTimeDTO) o;
    return Objects.equals(this.updatedAt, updateTimeDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimeDTO {\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

