package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderCourierDTO;
import org.openapitools.model.OrderDeliveryAddressDTO;
import org.openapitools.model.OrderDeliveryDatesDTO;
import org.openapitools.model.OrderDeliveryDispatchType;
import org.openapitools.model.OrderDeliveryEacType;
import org.openapitools.model.OrderDeliveryPartnerType;
import org.openapitools.model.OrderDeliveryType;
import org.openapitools.model.OrderLiftType;
import org.openapitools.model.OrderShipmentDTO;
import org.openapitools.model.OrderTrackDTO;
import org.openapitools.model.OrderVatType;
import org.openapitools.model.RegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о доставке.
 */
@ApiModel(description="Информация о доставке.")

public class OrderDeliveryDTO  {
  
 /**
  * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
  */
  @ApiModelProperty(value = "Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). ")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryType type;

 /**
  * Наименование службы доставки.
  */
  @ApiModelProperty(value = "Наименование службы доставки.")
  private String serviceName;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. ")
  @Valid
  private BigDecimal price;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryPartnerType deliveryPartnerType;

  @ApiModelProperty(value = "")
  @Valid
  private OrderCourierDTO courier;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryDatesDTO dates;

  @ApiModelProperty(value = "")
  @Valid
  private RegionDTO region;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryAddressDTO address;

  @ApiModelProperty(value = "")
  @Valid
  private OrderVatType vat;

 /**
  * Идентификатор службы доставки.
  */
  @ApiModelProperty(value = "Идентификатор службы доставки.")
  private Long deliveryServiceId;

  @ApiModelProperty(value = "")
  @Valid
  private OrderLiftType liftType;

 /**
  * Стоимость подъема на этаж.
  */
  @ApiModelProperty(value = "Стоимость подъема на этаж.")
  @Valid
  private BigDecimal liftPrice;

 /**
  * Идентификатор пункта самовывоза, присвоенный магазином.
  */
  @ApiModelProperty(value = "Идентификатор пункта самовывоза, присвоенный магазином.")
  private String outletCode;

 /**
  * Формат даты: `ДД-ММ-ГГГГ`. 
  */
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  private String outletStorageLimitDate;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryDispatchType dispatchType;

 /**
  * Информация для отслеживания перемещений посылки.
  */
  @ApiModelProperty(value = "Информация для отслеживания перемещений посылки.")
  @Valid
  private List<@Valid OrderTrackDTO> tracks;

 /**
  * Информация о посылках.
  */
  @ApiModelProperty(value = "Информация о посылках.")
  @Valid
  private List<@Valid OrderShipmentDTO> shipments;

 /**
  * Приблизительная ли дата доставки.
  */
  @ApiModelProperty(value = "Приблизительная ли дата доставки.")
  private Boolean estimated;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryEacType eacType;

 /**
  * Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
  */
  @ApiModelProperty(value = "Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). ")
  private String eacCode;
 /**
  * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrderDeliveryDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public OrderDeliveryType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OrderDeliveryType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OrderDeliveryDTO type(OrderDeliveryType type) {
    this.type = type;
    return this;
  }

 /**
  * Наименование службы доставки.
  * @return serviceName
  */
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Sets the <code>serviceName</code> property.
   */
 public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Sets the <code>serviceName</code> property.
   */
  public OrderDeliveryDTO serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа. 
  * @return price
  */
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public OrderDeliveryDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
  * Get deliveryPartnerType
  * @return deliveryPartnerType
  */
  @JsonProperty("deliveryPartnerType")
  public OrderDeliveryPartnerType getDeliveryPartnerType() {
    return deliveryPartnerType;
  }

  /**
   * Sets the <code>deliveryPartnerType</code> property.
   */
 public void setDeliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
    this.deliveryPartnerType = deliveryPartnerType;
  }

  /**
   * Sets the <code>deliveryPartnerType</code> property.
   */
  public OrderDeliveryDTO deliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
    this.deliveryPartnerType = deliveryPartnerType;
    return this;
  }

 /**
  * Get courier
  * @return courier
  */
  @JsonProperty("courier")
  public OrderCourierDTO getCourier() {
    return courier;
  }

  /**
   * Sets the <code>courier</code> property.
   */
 public void setCourier(OrderCourierDTO courier) {
    this.courier = courier;
  }

  /**
   * Sets the <code>courier</code> property.
   */
  public OrderDeliveryDTO courier(OrderCourierDTO courier) {
    this.courier = courier;
    return this;
  }

 /**
  * Get dates
  * @return dates
  */
  @JsonProperty("dates")
  public OrderDeliveryDatesDTO getDates() {
    return dates;
  }

  /**
   * Sets the <code>dates</code> property.
   */
 public void setDates(OrderDeliveryDatesDTO dates) {
    this.dates = dates;
  }

  /**
   * Sets the <code>dates</code> property.
   */
  public OrderDeliveryDTO dates(OrderDeliveryDatesDTO dates) {
    this.dates = dates;
    return this;
  }

 /**
  * Get region
  * @return region
  */
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }

  /**
   * Sets the <code>region</code> property.
   */
 public void setRegion(RegionDTO region) {
    this.region = region;
  }

  /**
   * Sets the <code>region</code> property.
   */
  public OrderDeliveryDTO region(RegionDTO region) {
    this.region = region;
    return this;
  }

 /**
  * Get address
  * @return address
  */
  @JsonProperty("address")
  public OrderDeliveryAddressDTO getAddress() {
    return address;
  }

  /**
   * Sets the <code>address</code> property.
   */
 public void setAddress(OrderDeliveryAddressDTO address) {
    this.address = address;
  }

  /**
   * Sets the <code>address</code> property.
   */
  public OrderDeliveryDTO address(OrderDeliveryAddressDTO address) {
    this.address = address;
    return this;
  }

 /**
  * Get vat
  * @return vat
  */
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
 public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
  public OrderDeliveryDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

 /**
  * Идентификатор службы доставки.
  * @return deliveryServiceId
  */
  @JsonProperty("deliveryServiceId")
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }

  /**
   * Sets the <code>deliveryServiceId</code> property.
   */
 public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  /**
   * Sets the <code>deliveryServiceId</code> property.
   */
  public OrderDeliveryDTO deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

 /**
  * Get liftType
  * @return liftType
  */
  @JsonProperty("liftType")
  public OrderLiftType getLiftType() {
    return liftType;
  }

  /**
   * Sets the <code>liftType</code> property.
   */
 public void setLiftType(OrderLiftType liftType) {
    this.liftType = liftType;
  }

  /**
   * Sets the <code>liftType</code> property.
   */
  public OrderDeliveryDTO liftType(OrderLiftType liftType) {
    this.liftType = liftType;
    return this;
  }

 /**
  * Стоимость подъема на этаж.
  * @return liftPrice
  */
  @JsonProperty("liftPrice")
  public BigDecimal getLiftPrice() {
    return liftPrice;
  }

  /**
   * Sets the <code>liftPrice</code> property.
   */
 public void setLiftPrice(BigDecimal liftPrice) {
    this.liftPrice = liftPrice;
  }

  /**
   * Sets the <code>liftPrice</code> property.
   */
  public OrderDeliveryDTO liftPrice(BigDecimal liftPrice) {
    this.liftPrice = liftPrice;
    return this;
  }

 /**
  * Идентификатор пункта самовывоза, присвоенный магазином.
  * @return outletCode
  */
  @JsonProperty("outletCode")
  public String getOutletCode() {
    return outletCode;
  }

  /**
   * Sets the <code>outletCode</code> property.
   */
 public void setOutletCode(String outletCode) {
    this.outletCode = outletCode;
  }

  /**
   * Sets the <code>outletCode</code> property.
   */
  public OrderDeliveryDTO outletCode(String outletCode) {
    this.outletCode = outletCode;
    return this;
  }

 /**
  * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
  * @return outletStorageLimitDate
  */
  @JsonProperty("outletStorageLimitDate")
  public String getOutletStorageLimitDate() {
    return outletStorageLimitDate;
  }

  /**
   * Sets the <code>outletStorageLimitDate</code> property.
   */
 public void setOutletStorageLimitDate(String outletStorageLimitDate) {
    this.outletStorageLimitDate = outletStorageLimitDate;
  }

  /**
   * Sets the <code>outletStorageLimitDate</code> property.
   */
  public OrderDeliveryDTO outletStorageLimitDate(String outletStorageLimitDate) {
    this.outletStorageLimitDate = outletStorageLimitDate;
    return this;
  }

 /**
  * Get dispatchType
  * @return dispatchType
  */
  @JsonProperty("dispatchType")
  public OrderDeliveryDispatchType getDispatchType() {
    return dispatchType;
  }

  /**
   * Sets the <code>dispatchType</code> property.
   */
 public void setDispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
  }

  /**
   * Sets the <code>dispatchType</code> property.
   */
  public OrderDeliveryDTO dispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
    return this;
  }

 /**
  * Информация для отслеживания перемещений посылки.
  * @return tracks
  */
  @JsonProperty("tracks")
  public List<@Valid OrderTrackDTO> getTracks() {
    return tracks;
  }

  /**
   * Sets the <code>tracks</code> property.
   */
 public void setTracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  /**
   * Sets the <code>tracks</code> property.
   */
  public OrderDeliveryDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  /**
   * Adds a new item to the <code>tracks</code> list.
   */
  public OrderDeliveryDTO addTracksItem(OrderTrackDTO tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

 /**
  * Информация о посылках.
  * @return shipments
  */
  @JsonProperty("shipments")
  public List<@Valid OrderShipmentDTO> getShipments() {
    return shipments;
  }

  /**
   * Sets the <code>shipments</code> property.
   */
 public void setShipments(List<@Valid OrderShipmentDTO> shipments) {
    this.shipments = shipments;
  }

  /**
   * Sets the <code>shipments</code> property.
   */
  public OrderDeliveryDTO shipments(List<@Valid OrderShipmentDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  /**
   * Adds a new item to the <code>shipments</code> list.
   */
  public OrderDeliveryDTO addShipmentsItem(OrderShipmentDTO shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

 /**
  * Приблизительная ли дата доставки.
  * @return estimated
  */
  @JsonProperty("estimated")
  public Boolean getEstimated() {
    return estimated;
  }

  /**
   * Sets the <code>estimated</code> property.
   */
 public void setEstimated(Boolean estimated) {
    this.estimated = estimated;
  }

  /**
   * Sets the <code>estimated</code> property.
   */
  public OrderDeliveryDTO estimated(Boolean estimated) {
    this.estimated = estimated;
    return this;
  }

 /**
  * Get eacType
  * @return eacType
  */
  @JsonProperty("eacType")
  public OrderDeliveryEacType getEacType() {
    return eacType;
  }

  /**
   * Sets the <code>eacType</code> property.
   */
 public void setEacType(OrderDeliveryEacType eacType) {
    this.eacType = eacType;
  }

  /**
   * Sets the <code>eacType</code> property.
   */
  public OrderDeliveryDTO eacType(OrderDeliveryEacType eacType) {
    this.eacType = eacType;
    return this;
  }

 /**
  * Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;). 
  * @return eacCode
  */
  @JsonProperty("eacCode")
  public String getEacCode() {
    return eacCode;
  }

  /**
   * Sets the <code>eacCode</code> property.
   */
 public void setEacCode(String eacCode) {
    this.eacCode = eacCode;
  }

  /**
   * Sets the <code>eacCode</code> property.
   */
  public OrderDeliveryDTO eacCode(String eacCode) {
    this.eacCode = eacCode;
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
    OrderDeliveryDTO orderDeliveryDTO = (OrderDeliveryDTO) o;
    return Objects.equals(this.id, orderDeliveryDTO.id) &&
        Objects.equals(this.type, orderDeliveryDTO.type) &&
        Objects.equals(this.serviceName, orderDeliveryDTO.serviceName) &&
        Objects.equals(this.price, orderDeliveryDTO.price) &&
        Objects.equals(this.deliveryPartnerType, orderDeliveryDTO.deliveryPartnerType) &&
        Objects.equals(this.courier, orderDeliveryDTO.courier) &&
        Objects.equals(this.dates, orderDeliveryDTO.dates) &&
        Objects.equals(this.region, orderDeliveryDTO.region) &&
        Objects.equals(this.address, orderDeliveryDTO.address) &&
        Objects.equals(this.vat, orderDeliveryDTO.vat) &&
        Objects.equals(this.deliveryServiceId, orderDeliveryDTO.deliveryServiceId) &&
        Objects.equals(this.liftType, orderDeliveryDTO.liftType) &&
        Objects.equals(this.liftPrice, orderDeliveryDTO.liftPrice) &&
        Objects.equals(this.outletCode, orderDeliveryDTO.outletCode) &&
        Objects.equals(this.outletStorageLimitDate, orderDeliveryDTO.outletStorageLimitDate) &&
        Objects.equals(this.dispatchType, orderDeliveryDTO.dispatchType) &&
        Objects.equals(this.tracks, orderDeliveryDTO.tracks) &&
        Objects.equals(this.shipments, orderDeliveryDTO.shipments) &&
        Objects.equals(this.estimated, orderDeliveryDTO.estimated) &&
        Objects.equals(this.eacType, orderDeliveryDTO.eacType) &&
        Objects.equals(this.eacCode, orderDeliveryDTO.eacCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, serviceName, price, deliveryPartnerType, courier, dates, region, address, vat, deliveryServiceId, liftType, liftPrice, outletCode, outletStorageLimitDate, dispatchType, tracks, shipments, estimated, eacType, eacCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    deliveryPartnerType: ").append(toIndentedString(deliveryPartnerType)).append("\n");
    sb.append("    courier: ").append(toIndentedString(courier)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    deliveryServiceId: ").append(toIndentedString(deliveryServiceId)).append("\n");
    sb.append("    liftType: ").append(toIndentedString(liftType)).append("\n");
    sb.append("    liftPrice: ").append(toIndentedString(liftPrice)).append("\n");
    sb.append("    outletCode: ").append(toIndentedString(outletCode)).append("\n");
    sb.append("    outletStorageLimitDate: ").append(toIndentedString(outletStorageLimitDate)).append("\n");
    sb.append("    dispatchType: ").append(toIndentedString(dispatchType)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    estimated: ").append(toIndentedString(estimated)).append("\n");
    sb.append("    eacType: ").append(toIndentedString(eacType)).append("\n");
    sb.append("    eacCode: ").append(toIndentedString(eacCode)).append("\n");
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

