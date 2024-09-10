package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 */
@ApiModel(description = "Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BriefOrderItemInstanceDTO   {
  @JsonProperty("cis")
  private String cis;

  @JsonProperty("uin")
  private String uin;

  @JsonProperty("rnpt")
  private String rnpt;

  @JsonProperty("gtd")
  private String gtd;

  public BriefOrderItemInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

  /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 
   * @return cis
   */
  @ApiModelProperty(value = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} ")
  public String getCis() {
    return cis;
  }

  public void setCis(String cis) {
    this.cis = cis;
  }

  public BriefOrderItemInstanceDTO uin(String uin) {
    this.uin = uin;
    return this;
  }

  /**
   * Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
   * @return uin
   */
  @ApiModelProperty(value = "Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. ")
  public String getUin() {
    return uin;
  }

  public void setUin(String uin) {
    this.uin = uin;
  }

  public BriefOrderItemInstanceDTO rnpt(String rnpt) {
    this.rnpt = rnpt;
    return this;
  }

  /**
   * Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
   * @return rnpt
   */
  @ApiModelProperty(value = "Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. ")
  public String getRnpt() {
    return rnpt;
  }

  public void setRnpt(String rnpt) {
    this.rnpt = rnpt;
  }

  public BriefOrderItemInstanceDTO gtd(String gtd) {
    this.gtd = gtd;
    return this;
  }

  /**
   * Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
   * @return gtd
   */
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

