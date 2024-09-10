package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderItemInstanceDTO   {
  @JsonProperty("cis")
  
  private String cis;

  @JsonProperty("cisFull")
  
  private String cisFull;

  @JsonProperty("uin")
  
  private String uin;

  @JsonProperty("rnpt")
  
  private String rnpt;

  @JsonProperty("gtd")
  
  private String gtd;

  public OrderItemInstanceDTO cis(String cis) {
    this.cis = cis;
    return this;
  }

   /**
   * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
   * @return cis
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

