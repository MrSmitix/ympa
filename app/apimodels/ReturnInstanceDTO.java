package apimodels;

import apimodels.ReturnInstanceStatusType;
import apimodels.ReturnInstanceStockType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Логистическая информация по возврату.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReturnInstanceDTO   {
  @JsonProperty("stockType")
  @Valid

  private ReturnInstanceStockType stockType;

  @JsonProperty("status")
  @Valid

  private ReturnInstanceStatusType status;

  @JsonProperty("cis")
  
  private String cis;

  @JsonProperty("imei")
  
  private String imei;

  public ReturnInstanceDTO stockType(ReturnInstanceStockType stockType) {
    this.stockType = stockType;
    return this;
  }

   /**
   * Get stockType
   * @return stockType
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

