package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FullOutletDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос информации о точке продаж.
 */

@Schema(name = "GetOutletResponse", description = "Ответ на запрос информации о точке продаж.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOutletResponse {

  private FullOutletDTO outlet;

  public GetOutletResponse outlet(FullOutletDTO outlet) {
    this.outlet = outlet;
    return this;
  }

  /**
   * Get outlet
   * @return outlet
   */
  @Valid 
  @Schema(name = "outlet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outlet")
  public FullOutletDTO getOutlet() {
    return outlet;
  }

  public void setOutlet(FullOutletDTO outlet) {
    this.outlet = outlet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOutletResponse getOutletResponse = (GetOutletResponse) o;
    return Objects.equals(this.outlet, getOutletResponse.outlet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOutletResponse {\n");
    sb.append("    outlet: ").append(toIndentedString(outlet)).append("\n");
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

