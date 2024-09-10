/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */
@ApiModel(description = "Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. ")
@JsonPropertyOrder({
  OrderItemInstanceDTO.JSON_PROPERTY_CIS,
  OrderItemInstanceDTO.JSON_PROPERTY_CIS_FULL,
  OrderItemInstanceDTO.JSON_PROPERTY_UIN,
  OrderItemInstanceDTO.JSON_PROPERTY_RNPT,
  OrderItemInstanceDTO.JSON_PROPERTY_GTD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemInstanceDTO   {
  public static final String JSON_PROPERTY_CIS = "cis";
  @JsonProperty(JSON_PROPERTY_CIS)
  private String cis;

  public static final String JSON_PROPERTY_CIS_FULL = "cisFull";
  @JsonProperty(JSON_PROPERTY_CIS_FULL)
  private String cisFull;

  public static final String JSON_PROPERTY_UIN = "uin";
  @JsonProperty(JSON_PROPERTY_UIN)
  private String uin;

  public static final String JSON_PROPERTY_RNPT = "rnpt";
  @JsonProperty(JSON_PROPERTY_RNPT)
  private String rnpt;

  public static final String JSON_PROPERTY_GTD = "gtd";
  @JsonProperty(JSON_PROPERTY_GTD)
  private String gtd;

  public OrderItemInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

  /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
   * @return cis
   **/
  @JsonProperty(value = "cis")
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.")
  
  public String getCis() {
    return cis;
  }

  public void setCis(String cis) {
    this.cis = cis;
  }

  public OrderItemInstanceDTO cisFull(String cisFull) {
    this.cisFull = cisFull;
    return this;
  }

  /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
   * @return cisFull
   **/
  @JsonProperty(value = "cisFull")
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.")
  
  public String getCisFull() {
    return cisFull;
  }

  public void setCisFull(String cisFull) {
    this.cisFull = cisFull;
  }

  public OrderItemInstanceDTO uin(String uin) {
    this.uin = uin;
    return this;
  }

  /**
   * УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
   * @return uin
   **/
  @JsonProperty(value = "uin")
  @ApiModelProperty(value = "УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. ")
  
  public String getUin() {
    return uin;
  }

  public void setUin(String uin) {
    this.uin = uin;
  }

  public OrderItemInstanceDTO rnpt(String rnpt) {
    this.rnpt = rnpt;
    return this;
  }

  /**
   * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
   * @return rnpt
   **/
  @JsonProperty(value = "rnpt")
  @ApiModelProperty(value = "Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. ")
  
  public String getRnpt() {
    return rnpt;
  }

  public void setRnpt(String rnpt) {
    this.rnpt = rnpt;
  }

  public OrderItemInstanceDTO gtd(String gtd) {
    this.gtd = gtd;
    return this;
  }

  /**
   * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
   * @return gtd
   **/
  @JsonProperty(value = "gtd")
  @ApiModelProperty(value = "Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. ")
  
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
    return Objects.equals(this.cis, orderItemInstanceDTO.cis) &&
        Objects.equals(this.cisFull, orderItemInstanceDTO.cisFull) &&
        Objects.equals(this.uin, orderItemInstanceDTO.uin) &&
        Objects.equals(this.rnpt, orderItemInstanceDTO.rnpt) &&
        Objects.equals(this.gtd, orderItemInstanceDTO.gtd);
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

