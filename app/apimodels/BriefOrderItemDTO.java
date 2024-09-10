package apimodels;

import apimodels.OrderItemInstanceDTO;
import apimodels.OrderVatType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о маркированном товаре.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BriefOrderItemDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("vat")
  @Valid

  private OrderVatType vat;

  @JsonProperty("count")
  
  private Integer count;

  @JsonProperty("price")
  @Valid

  private BigDecimal price;

  @JsonProperty("offerName")
  
  private String offerName;

  @JsonProperty("offerId")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("instances")
  @Valid

  private List<@Valid OrderItemInstanceDTO> instances = null;

  public BriefOrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BriefOrderItemDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  public OrderVatType getVat() {
    return vat;
  }

  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  public BriefOrderItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество единиц товара.
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BriefOrderItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
   * @return price
  **/
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BriefOrderItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

   /**
   * Название товара.
   * @return offerName
  **/
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public BriefOrderItemDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public BriefOrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public BriefOrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Переданные вами коды маркировки.
   * @return instances
  **/
  public List<@Valid OrderItemInstanceDTO> getInstances() {
    return instances;
  }

  public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BriefOrderItemDTO briefOrderItemDTO = (BriefOrderItemDTO) o;
    return Objects.equals(id, briefOrderItemDTO.id) &&
        Objects.equals(vat, briefOrderItemDTO.vat) &&
        Objects.equals(count, briefOrderItemDTO.count) &&
        Objects.equals(price, briefOrderItemDTO.price) &&
        Objects.equals(offerName, briefOrderItemDTO.offerName) &&
        Objects.equals(offerId, briefOrderItemDTO.offerId) &&
        Objects.equals(instances, briefOrderItemDTO.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vat, count, price, offerName, offerId, instances);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BriefOrderItemDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

