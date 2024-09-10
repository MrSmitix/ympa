package apimodels;

import apimodels.OfferSellingProgramStatusType;
import apimodels.SellingProgramType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferSellingProgramDTO   {
  @JsonProperty("sellingProgram")
  @NotNull
@Valid

  private SellingProgramType sellingProgram;

  @JsonProperty("status")
  @NotNull
@Valid

  private OfferSellingProgramStatusType status;

  public OfferSellingProgramDTO sellingProgram(SellingProgramType sellingProgram) {
    this.sellingProgram = sellingProgram;
    return this;
  }

   /**
   * Get sellingProgram
   * @return sellingProgram
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

