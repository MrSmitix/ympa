package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */
@ApiModel(description="Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. ")

public class OrderItemInstanceDTO  {
  
 /**
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
  */
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.")
  private String cis;

 /**
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
  */
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.")
  private String cisFull;

 /**
  * УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
  */
  @ApiModelProperty(value = "УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. ")
  private String uin;

 /**
  * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
  */
  @ApiModelProperty(value = "Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. ")
  private String rnpt;

 /**
  * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
  */
  @ApiModelProperty(value = "Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. ")
  private String gtd;
 /**
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
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
  public OrderItemInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

 /**
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
  * @return cisFull
  */
  @JsonProperty("cisFull")
  public String getCisFull() {
    return cisFull;
  }

  /**
   * Sets the <code>cisFull</code> property.
   */
 public void setCisFull(String cisFull) {
    this.cisFull = cisFull;
  }

  /**
   * Sets the <code>cisFull</code> property.
   */
  public OrderItemInstanceDTO cisFull(String cisFull) {
    this.cisFull = cisFull;
    return this;
  }

 /**
  * УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
  * @return uin
  */
  @JsonProperty("uin")
  public String getUin() {
    return uin;
  }

  /**
   * Sets the <code>uin</code> property.
   */
 public void setUin(String uin) {
    this.uin = uin;
  }

  /**
   * Sets the <code>uin</code> property.
   */
  public OrderItemInstanceDTO uin(String uin) {
    this.uin = uin;
    return this;
  }

 /**
  * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
  * @return rnpt
  */
  @JsonProperty("rnpt")
  public String getRnpt() {
    return rnpt;
  }

  /**
   * Sets the <code>rnpt</code> property.
   */
 public void setRnpt(String rnpt) {
    this.rnpt = rnpt;
  }

  /**
   * Sets the <code>rnpt</code> property.
   */
  public OrderItemInstanceDTO rnpt(String rnpt) {
    this.rnpt = rnpt;
    return this;
  }

 /**
  * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
  * @return gtd
  */
  @JsonProperty("gtd")
  public String getGtd() {
    return gtd;
  }

  /**
   * Sets the <code>gtd</code> property.
   */
 public void setGtd(String gtd) {
    this.gtd = gtd;
  }

  /**
   * Sets the <code>gtd</code> property.
   */
  public OrderItemInstanceDTO gtd(String gtd) {
    this.gtd = gtd;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

