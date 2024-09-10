package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferSellingProgramStatusType;
import org.openapitools.model.SellingProgramType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 **/
@ApiModel(description="Информация о том, по каким моделям можно продавать товар, а по каким нельзя.")

public class OfferSellingProgramDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private SellingProgramType sellingProgram;

  @ApiModelProperty(required = true, value = "")
  private OfferSellingProgramStatusType status;
 /**
   * Get sellingProgram
   * @return sellingProgram
  **/
  @JsonProperty("sellingProgram")
  public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }

  public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

  public OfferSellingProgramDTO sellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OfferSellingProgramStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferSellingProgramStatusType status) {
    this.status = status;
  }

  public OfferSellingProgramDTO status(OfferSellingProgramStatusType status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

