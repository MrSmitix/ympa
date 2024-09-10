package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferSellingProgramStatusType;
import org.openapitools.model.SellingProgramType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 **/
@ApiModel(description = "Информация о том, по каким моделям можно продавать товар, а по каким нельзя.")
@JsonTypeName("OfferSellingProgramDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferSellingProgramDTO   {
  private SellingProgramType sellingProgram;
  private OfferSellingProgramStatusType status;

  /**
   **/
  public OfferSellingProgramDTO sellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sellingProgram")
  @NotNull public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }

  @JsonProperty("sellingProgram")
  public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

  /**
   **/
  public OfferSellingProgramDTO status(OfferSellingProgramStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull public OfferSellingProgramStatusType getStatus() {
    return status;
  }

  @JsonProperty("status")
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

