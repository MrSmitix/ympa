package apimodels;

import apimodels.FeedPublicationFullDTO;
import apimodels.FeedPublicationPriceAndStockUpdateDTO;
import apimodels.FeedStatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedPublicationDTO   {
  @JsonProperty("status")
  @Valid

  private FeedStatusType status;

  @JsonProperty("full")
  @Valid

  private FeedPublicationFullDTO full;

  @JsonProperty("priceAndStockUpdate")
  @Valid

  private FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;

  public FeedPublicationDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public FeedStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedPublicationDTO full(FeedPublicationFullDTO full) {
    this.full = full;
    return this;
  }

   /**
   * Get full
   * @return full
  **/
  public FeedPublicationFullDTO getFull() {
    return full;
  }

  public void setFull(FeedPublicationFullDTO full) {
    this.full = full;
  }

  public FeedPublicationDTO priceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
    return this;
  }

   /**
   * Get priceAndStockUpdate
   * @return priceAndStockUpdate
  **/
  public FeedPublicationPriceAndStockUpdateDTO getPriceAndStockUpdate() {
    return priceAndStockUpdate;
  }

  public void setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedPublicationDTO feedPublicationDTO = (FeedPublicationDTO) o;
    return Objects.equals(status, feedPublicationDTO.status) &&
        Objects.equals(full, feedPublicationDTO.full) &&
        Objects.equals(priceAndStockUpdate, feedPublicationDTO.priceAndStockUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, full, priceAndStockUpdate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPublicationDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    priceAndStockUpdate: ").append(toIndentedString(priceAndStockUpdate)).append("\n");
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

