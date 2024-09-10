package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */

@Schema(name = "OrderItemInstanceDTO", description = "Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemInstanceDTO {

  private String cis;

  private String cisFull;

  private String uin;

  private String rnpt;

  private String gtd;

  public OrderItemInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

  /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
   * @return cis
   */
  
  @Schema(name = "cis", description = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cis")
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
   */
  
  @Schema(name = "cisFull", description = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cisFull")
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
   */
  
  @Schema(name = "uin", description = "УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uin")
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
   */
  
  @Schema(name = "rnpt", description = "Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rnpt")
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
   */
  
  @Schema(name = "gtd", description = "Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

