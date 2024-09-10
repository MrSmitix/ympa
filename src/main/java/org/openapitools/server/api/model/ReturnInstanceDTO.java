package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.ReturnInstanceStatusType;
import org.openapitools.server.api.model.ReturnInstanceStockType;

/**
 * Логистическая информация по возврату.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReturnInstanceDTO   {
  
  private ReturnInstanceStockType stockType;
  private ReturnInstanceStatusType status;
  private String cis;
  private String imei;

  public ReturnInstanceDTO () {

  }

  public ReturnInstanceDTO (ReturnInstanceStockType stockType, ReturnInstanceStatusType status, String cis, String imei) {
    this.stockType = stockType;
    this.status = status;
    this.cis = cis;
    this.imei = imei;
  }

    
  @JsonProperty("stockType")
  public ReturnInstanceStockType getStockType() {
    return stockType;
  }
  public void setStockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
  }

    
  @JsonProperty("status")
  public ReturnInstanceStatusType getStatus() {
    return status;
  }
  public void setStatus(ReturnInstanceStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("cis")
  public String getCis() {
    return cis;
  }
  public void setCis(String cis) {
    this.cis = cis;
  }

    
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
    return Objects.equals(stockType, returnInstanceDTO.stockType) &&
        Objects.equals(status, returnInstanceDTO.status) &&
        Objects.equals(cis, returnInstanceDTO.cis) &&
        Objects.equals(imei, returnInstanceDTO.imei);
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
