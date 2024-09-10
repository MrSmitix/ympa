package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ReturnInstanceStatusType;
import org.openapitools.model.ReturnInstanceStockType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Логистическая информация по возврату.
 */
@ApiModel(description="Логистическая информация по возврату.")

public class ReturnInstanceDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ReturnInstanceStockType stockType;

  @ApiModelProperty(value = "")
  @Valid
  private ReturnInstanceStatusType status;

 /**
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  */
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).")
  private String cis;

 /**
  * Международный идентификатор мобильного оборудования.
  */
  @ApiModelProperty(value = "Международный идентификатор мобильного оборудования.")
  private String imei;
 /**
  * Get stockType
  * @return stockType
  */
  @JsonProperty("stockType")
  public ReturnInstanceStockType getStockType() {
    return stockType;
  }

  /**
   * Sets the <code>stockType</code> property.
   */
 public void setStockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
  }

  /**
   * Sets the <code>stockType</code> property.
   */
  public ReturnInstanceDTO stockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public ReturnInstanceStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(ReturnInstanceStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public ReturnInstanceDTO status(ReturnInstanceStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  * @return cis
  */
  @JsonProperty("cis")
  public String getCis() {
    return cis;
  }

  /**
   * Sets the <code>cis</code> property.
   */
 public void setCis(String cis) {
    this.cis = cis;
  }

  /**
   * Sets the <code>cis</code> property.
   */
  public ReturnInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

 /**
  * Международный идентификатор мобильного оборудования.
  * @return imei
  */
  @JsonProperty("imei")
  public String getImei() {
    return imei;
  }

  /**
   * Sets the <code>imei</code> property.
   */
 public void setImei(String imei) {
    this.imei = imei;
  }

  /**
   * Sets the <code>imei</code> property.
   */
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

