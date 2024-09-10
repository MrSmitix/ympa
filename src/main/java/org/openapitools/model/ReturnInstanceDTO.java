package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ReturnInstanceStatusType;
import org.openapitools.model.ReturnInstanceStockType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Логистическая информация по возврату.
 */

@Schema(name = "ReturnInstanceDTO", description = "Логистическая информация по возврату.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnInstanceDTO {

  private ReturnInstanceStockType stockType;

  private ReturnInstanceStatusType status;

  private String cis;

  private String imei;

  public ReturnInstanceDTO stockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
    return this;
  }

  /**
   * Get stockType
   * @return stockType
   */
  @Valid 
  @Schema(name = "stockType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stockType")
  public ReturnInstanceStockType getStockType() {
    return stockType;
  }

  public void setStockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
  }

  public ReturnInstanceDTO status(ReturnInstanceStatusType status) {
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
  public ReturnInstanceStatusType getStatus() {
    return status;
  }

  public void setStatus(ReturnInstanceStatusType status) {
    this.status = status;
  }

  public ReturnInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

  /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
   * @return cis
   */
  
  @Schema(name = "cis", description = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cis")
  public String getCis() {
    return cis;
  }

  public void setCis(String cis) {
    this.cis = cis;
  }

  public ReturnInstanceDTO imei(String imei) {
    this.imei = imei;
    return this;
  }

  /**
   * Международный идентификатор мобильного оборудования.
   * @return imei
   */
  
  @Schema(name = "imei", description = "Международный идентификатор мобильного оборудования.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imei")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnInstanceDTO returnInstanceDTO = (ReturnInstanceDTO) o;
    return Objects.equals(this.stockType, returnInstanceDTO.stockType) &&
        Objects.equals(this.status, returnInstanceDTO.status) &&
        Objects.equals(this.cis, returnInstanceDTO.cis) &&
        Objects.equals(this.imei, returnInstanceDTO.imei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockType, status, cis, imei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnInstanceDTO {\n");
    sb.append("    stockType: ").append(toIndentedString(stockType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cis: ").append(toIndentedString(cis)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
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

