package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemInstanceDTO   {
  
  private String cis;
  private String cisFull;
  private String uin;
  private String rnpt;
  private String gtd;

  public OrderItemInstanceDTO () {

  }

  public OrderItemInstanceDTO (String cis, String cisFull, String uin, String rnpt, String gtd) {
    this.cis = cis;
    this.cisFull = cisFull;
    this.uin = uin;
    this.rnpt = rnpt;
    this.gtd = gtd;
  }

    
  @JsonProperty("cis")
  public String getCis() {
    return cis;
  }
  public void setCis(String cis) {
    this.cis = cis;
  }

    
  @JsonProperty("cisFull")
  public String getCisFull() {
    return cisFull;
  }
  public void setCisFull(String cisFull) {
    this.cisFull = cisFull;
  }

    
  @JsonProperty("uin")
  public String getUin() {
    return uin;
  }
  public void setUin(String uin) {
    this.uin = uin;
  }

    
  @JsonProperty("rnpt")
  public String getRnpt() {
    return rnpt;
  }
  public void setRnpt(String rnpt) {
    this.rnpt = rnpt;
  }

    
  @JsonProperty("gtd")
  public String getGtd() {
    return gtd;
  }
  public void setGtd(String gtd) {
    this.gtd = gtd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemInstanceDTO orderItemInstanceDTO = (OrderItemInstanceDTO) o;
    return Objects.equals(cis, orderItemInstanceDTO.cis) &&
        Objects.equals(cisFull, orderItemInstanceDTO.cisFull) &&
        Objects.equals(uin, orderItemInstanceDTO.uin) &&
        Objects.equals(rnpt, orderItemInstanceDTO.rnpt) &&
        Objects.equals(gtd, orderItemInstanceDTO.gtd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cis, cisFull, uin, rnpt, gtd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemInstanceDTO {\n");
    
    sb.append("    cis: ").append(toIndentedString(cis)).append("\n");
    sb.append("    cisFull: ").append(toIndentedString(cisFull)).append("\n");
    sb.append("    uin: ").append(toIndentedString(uin)).append("\n");
    sb.append("    rnpt: ").append(toIndentedString(rnpt)).append("\n");
    sb.append("    gtd: ").append(toIndentedString(gtd)).append("\n");
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
