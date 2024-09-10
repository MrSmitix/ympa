package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OfferSellingProgramStatusType;
import org.openapitools.model.SellingProgramType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */

@Schema(name = "OfferSellingProgramDTO", description = "Информация о том, по каким моделям можно продавать товар, а по каким нельзя.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferSellingProgramDTO {

  private SellingProgramType sellingProgram;

  private OfferSellingProgramStatusType status;

  public OfferSellingProgramDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferSellingProgramDTO(SellingProgramType sellingProgram, OfferSellingProgramStatusType status) {
    this.sellingProgram = sellingProgram;
    this.status = status;
  }

  public OfferSellingProgramDTO sellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
    return this;
  }

  /**
   * Get sellingProgram
   * @return sellingProgram
   */
  @NotNull @Valid 
  @Schema(name = "sellingProgram", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sellingProgram")
  public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }

  public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

  public OfferSellingProgramDTO status(OfferSellingProgramStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public OfferSellingProgramStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferSellingProgramStatusType status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferSellingProgramDTO offerSellingProgramDTO = (OfferSellingProgramDTO) o;
    return Objects.equals(this.sellingProgram, offerSellingProgramDTO.sellingProgram) &&
        Objects.equals(this.status, offerSellingProgramDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingProgram, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferSellingProgramDTO {\n");
    sb.append("    sellingProgram: ").append(toIndentedString(sellingProgram)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

