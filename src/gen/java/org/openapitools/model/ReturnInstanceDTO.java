package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ReturnInstanceStatusType;
import org.openapitools.model.ReturnInstanceStockType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Логистическая информация по возврату.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnInstanceDTO   {
  
  private ReturnInstanceStockType stockType;
  private ReturnInstanceStatusType status;
  private String cis;
  private String imei;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stockType")
  public ReturnInstanceStockType getStockType() {
    return stockType;
  }
  public void setStockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ReturnInstanceStatusType getStatus() {
    return status;
  }
  public void setStatus(ReturnInstanceStatusType status) {
    this.status = status;
  }

  /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
   **/
  
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).")
  @JsonProperty("cis")
  public String getCis() {
    return cis;
  }
  public void setCis(String cis) {
    this.cis = cis;
  }

  /**
   * Международный идентификатор мобильного оборудования.
   **/
  
  @ApiModelProperty(value = "Международный идентификатор мобильного оборудования.")
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

