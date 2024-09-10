package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FeedPublicationFullDTO;
import org.openapitools.model.FeedPublicationPriceAndStockUpdateDTO;
import org.openapitools.model.FeedStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */

@Schema(name = "FeedPublicationDTO", description = "Информация о последней публикации предложений из прайс-листа на Маркете.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedPublicationDTO {

  private FeedStatusType status;

  private FeedPublicationFullDTO full;

  private FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;

  public FeedPublicationDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
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
   */
  @Valid 
  @Schema(name = "full", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full")
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
   */
  @Valid 
  @Schema(name = "priceAndStockUpdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceAndStockUpdate")
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
    return Objects.equals(this.status, feedPublicationDTO.status) &&
        Objects.equals(this.full, feedPublicationDTO.full) &&
        Objects.equals(this.priceAndStockUpdate, feedPublicationDTO.priceAndStockUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, full, priceAndStockUpdate);
  }

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

