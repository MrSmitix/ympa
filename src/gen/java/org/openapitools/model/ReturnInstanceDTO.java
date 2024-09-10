package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ReturnInstanceStatusType;
import org.openapitools.model.ReturnInstanceStockType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Логистическая информация по возврату.
 **/
@ApiModel(description="Логистическая информация по возврату.")

public class ReturnInstanceDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ReturnInstanceStockType stockType;

  @ApiModelProperty(value = "")
  @Valid
  private ReturnInstanceStatusType status;

  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).")
 /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  **/
  private String cis;

  @ApiModelProperty(value = "Международный идентификатор мобильного оборудования.")
 /**
   * Международный идентификатор мобильного оборудования.
  **/
  private String imei;
 /**
   * Get stockType
   * @return stockType
  **/
  @JsonProperty("stockType")
  public ReturnInstanceStockType getStockType() {
    return stockType;
  }

  public void setStockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
  }

  public ReturnInstanceDTO stockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ReturnInstanceStatusType getStatus() {
    return status;
  }

  public void setStatus(ReturnInstanceStatusType status) {
    this.status = status;
  }

  public ReturnInstanceDTO status(ReturnInstanceStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
   * @return cis
  **/
  @JsonProperty("cis")
  public String getCis() {
    return cis;
  }

  public void setCis(String cis) {
    this.cis = cis;
  }

  public ReturnInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

 /**
   * Международный идентификатор мобильного оборудования.
   * @return imei
  **/
  @JsonProperty("imei")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public ReturnInstanceDTO imei(String imei) {
    this.imei = imei;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

