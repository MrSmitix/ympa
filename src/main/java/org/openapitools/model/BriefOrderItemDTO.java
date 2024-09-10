package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderItemInstanceDTO;
import org.openapitools.model.OrderVatType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о маркированном товаре.
 */

@Schema(name = "BriefOrderItemDTO", description = "Информация о маркированном товаре.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BriefOrderItemDTO {

  private Long id;

  private OrderVatType vat;

  private Integer count;

  private BigDecimal price;

  private String offerName;

  private String offerId;

  @Valid
  private JsonNullable<List<@Valid OrderItemInstanceDTO>> instances = JsonNullable.<List<@Valid OrderItemInstanceDTO>>undefined();

  public BriefOrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  @Valid 
  @Schema(name = "vat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vat")
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
   */
  
  @Schema(name = "count", description = "Количество единиц товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
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
   */
  @Valid 
  @Schema(name = "price", description = "Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
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
   */
  
  @Schema(name = "offerName", description = "Название товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerName")
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
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public BriefOrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = JsonNullable.of(instances);
    return this;
  }

  public BriefOrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    if (this.instances == null || !this.instances.isPresent()) {
      this.instances = JsonNullable.of(new ArrayList<>());
    }
    this.instances.get().add(instancesItem);
    return this;
  }

  /**
   * Переданные вами коды маркировки.
   * @return instances
   */
  @Valid 
  @Schema(name = "instances", description = "Переданные вами коды маркировки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instances")
  public JsonNullable<List<@Valid OrderItemInstanceDTO>> getInstances() {
    return instances;
  }

  public void setInstances(JsonNullable<List<@Valid OrderItemInstanceDTO>> instances) {
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
    return Objects.equals(this.id, briefOrderItemDTO.id) &&
        Objects.equals(this.vat, briefOrderItemDTO.vat) &&
        Objects.equals(this.count, briefOrderItemDTO.count) &&
        Objects.equals(this.price, briefOrderItemDTO.price) &&
        Objects.equals(this.offerName, briefOrderItemDTO.offerName) &&
        Objects.equals(this.offerId, briefOrderItemDTO.offerId) &&
        equalsNullable(this.instances, briefOrderItemDTO.instances);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vat, count, price, offerName, offerId, hashCodeNullable(instances));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

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

