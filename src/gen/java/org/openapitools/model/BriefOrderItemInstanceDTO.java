package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 */
@ApiModel(description="Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). ")

public class BriefOrderItemInstanceDTO  {
  
 /**
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 
  */
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} ")
  private String cis;

 /**
  * Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
  */
  @ApiModelProperty(value = "Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. ")
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
  * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\\\&#x60; и &#x60;\\\&quot;&#x60;  {% endnote %} 
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
  public BriefOrderItemInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

 /**
  * Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
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
  public BriefOrderItemInstanceDTO uin(String uin) {
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
  public BriefOrderItemInstanceDTO rnpt(String rnpt) {
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
  public BriefOrderItemInstanceDTO gtd(String gtd) {
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
    BriefOrderItemInstanceDTO briefOrderItemInstanceDTO = (BriefOrderItemInstanceDTO) o;
    return Objects.equals(this.cis, briefOrderItemInstanceDTO.cis) &&
        Objects.equals(this.uin, briefOrderItemInstanceDTO.uin) &&
        Objects.equals(this.rnpt, briefOrderItemInstanceDTO.rnpt) &&
        Objects.equals(this.gtd, briefOrderItemInstanceDTO.gtd);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

