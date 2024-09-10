package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BriefOrderItemInstanceDTO   {
  
  private String cis;
  private String uin;
  private String rnpt;
  private String gtd;

  public BriefOrderItemInstanceDTO () {

  }

  public BriefOrderItemInstanceDTO (String cis, String uin, String rnpt, String gtd) {
    this.cis = cis;
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
    BriefOrderItemInstanceDTO briefOrderItemInstanceDTO = (BriefOrderItemInstanceDTO) o;
    return Objects.equals(cis, briefOrderItemInstanceDTO.cis) &&
        Objects.equals(uin, briefOrderItemInstanceDTO.uin) &&
        Objects.equals(rnpt, briefOrderItemInstanceDTO.rnpt) &&
        Objects.equals(gtd, briefOrderItemInstanceDTO.gtd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cis, uin, rnpt, gtd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BriefOrderItemInstanceDTO {\n");
    
    sb.append("    cis: ").append(toIndentedString(cis)).append("\n");
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
