package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OfferSellingProgramStatusType;
import org.openapitools.vertxweb.server.model.SellingProgramType;

/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferSellingProgramDTO   {
  
  private SellingProgramType sellingProgram;
  private OfferSellingProgramStatusType status;

  public OfferSellingProgramDTO () {

  }

  public OfferSellingProgramDTO (SellingProgramType sellingProgram, OfferSellingProgramStatusType status) {
    this.sellingProgram = sellingProgram;
    this.status = status;
  }

    
  @JsonProperty("sellingProgram")
  public SellingProgramType getSellingProgram() {
    return sellingProgram;
  }
  public void setSellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
  }

    
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
    return Objects.equals(sellingProgram, offerSellingProgramDTO.sellingProgram) &&
        Objects.equals(status, offerSellingProgramDTO.status);
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
