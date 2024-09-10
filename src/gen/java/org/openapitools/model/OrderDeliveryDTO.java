package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * Информация о доставке.
 */
@ApiModel(description = "Информация о доставке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryDTO   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private OrderDeliveryType type;

  @JsonProperty("serviceName")
  private String serviceName;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("deliveryPartnerType")
  private OrderDeliveryPartnerType deliveryPartnerType;

  @JsonProperty("courier")
  private OrderCourierDTO courier;

  @JsonProperty("dates")
  private OrderDeliveryDatesDTO dates;

  @JsonProperty("region")
  private RegionDTO region;

  @JsonProperty("address")
  private OrderDeliveryAddressDTO address;

  @JsonProperty("vat")
  private OrderVatType vat;

  @JsonProperty("deliveryServiceId")
  private Long deliveryServiceId;

  @JsonProperty("liftType")
  private OrderLiftType liftType;

  @JsonProperty("liftPrice")
  private BigDecimal liftPrice;

  @JsonProperty("outletCode")
  private String outletCode;

  @JsonProperty("outletStorageLimitDate")
  private String outletStorageLimitDate;

  @JsonProperty("dispatchType")
  private OrderDeliveryDispatchType dispatchType;

  @JsonProperty("tracks")
  private List<@Valid OrderTrackDTO> tracks = null;

  @JsonProperty("shipments")
  private List<@Valid OrderShipmentDTO> shipments = null;

  @JsonProperty("estimated")
  private Boolean estimated;

  @JsonProperty("eacType")
  private OrderDeliveryEacType eacType;

  @JsonProperty("eacCode")
  private String eacCode;

  public OrderDeliveryDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderDeliveryDTO type(OrderDeliveryType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public OrderDeliveryType getType() {
    return type;
  }

  public void setType(OrderDeliveryType type) {
    this.type = type;
  }

  public OrderDeliveryDTO serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Наименование службы доставки.
   * @return serviceName
  **/
  @ApiModelProperty(value = "Наименование службы доставки.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public OrderDeliveryDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
   * @return price
  **/
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. ")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrderDeliveryDTO deliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
    this.deliveryPartnerType = deliveryPartnerType;
    return this;
  }

   /**
   * Get deliveryPartnerType
   * @return deliveryPartnerType
  **/
  @ApiModelProperty(value = "")
  public OrderDeliveryPartnerType getDeliveryPartnerType() {
    return deliveryPartnerType;
  }

  public void setDeliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
    this.deliveryPartnerType = deliveryPartnerType;
  }

  public OrderDeliveryDTO courier(OrderCourierDTO courier) {
    this.courier = courier;
    return this;
  }

   /**
   * Get courier
   * @return courier
  **/
  @ApiModelProperty(value = "")
  public OrderCourierDTO getCourier() {
    return courier;
  }

  public void setCourier(OrderCourierDTO courier) {
    this.courier = courier;
  }

  public OrderDeliveryDTO dates(OrderDeliveryDatesDTO dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @ApiModelProperty(value = "")
  public OrderDeliveryDatesDTO getDates() {
    return dates;
  }

  public void setDates(OrderDeliveryDatesDTO dates) {
    this.dates = dates;
  }

  public OrderDeliveryDTO region(RegionDTO region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public RegionDTO getRegion() {
    return region;
  }

  public void setRegion(RegionDTO region) {
    this.region = region;
  }

  public OrderDeliveryDTO address(OrderDeliveryAddressDTO address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public OrderDeliveryAddressDTO getAddress() {
    return address;
  }

  public void setAddress(OrderDeliveryAddressDTO address) {
    this.address = address;
  }

  public OrderDeliveryDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @ApiModelProperty(value = "")
  public OrderVatType getVat() {
    return vat;
  }

  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  public OrderDeliveryDTO deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

   /**
   * Идентификатор службы доставки.
   * @return deliveryServiceId
  **/
  @ApiModelProperty(value = "Идентификатор службы доставки.")
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }

  public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  public OrderDeliveryDTO liftType(OrderLiftType liftType) {
    this.liftType = liftType;
    return this;
  }

   /**
   * Get liftType
   * @return liftType
  **/
  @ApiModelProperty(value = "")
  public OrderLiftType getLiftType() {
    return liftType;
  }

  public void setLiftType(OrderLiftType liftType) {
    this.liftType = liftType;
  }

  public OrderDeliveryDTO liftPrice(BigDecimal liftPrice) {
    this.liftPrice = liftPrice;
    return this;
  }

   /**
   * Стоимость подъема на этаж.
   * @return liftPrice
  **/
  @ApiModelProperty(value = "Стоимость подъема на этаж.")
  public BigDecimal getLiftPrice() {
    return liftPrice;
  }

  public void setLiftPrice(BigDecimal liftPrice) {
    this.liftPrice = liftPrice;
  }

  public OrderDeliveryDTO outletCode(String outletCode) {
    this.outletCode = outletCode;
    return this;
  }

   /**
   * Идентификатор пункта самовывоза, присвоенный магазином.
   * @return outletCode
  **/
  @ApiModelProperty(value = "Идентификатор пункта самовывоза, присвоенный магазином.")
  public String getOutletCode() {
    return outletCode;
  }

  public void setOutletCode(String outletCode) {
    this.outletCode = outletCode;
  }

  public OrderDeliveryDTO outletStorageLimitDate(String outletStorageLimitDate) {
    this.outletStorageLimitDate = outletStorageLimitDate;
    return this;
  }

   /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   * @return outletStorageLimitDate
  **/
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  public String getOutletStorageLimitDate() {
    return outletStorageLimitDate;
  }

  public void setOutletStorageLimitDate(String outletStorageLimitDate) {
    this.outletStorageLimitDate = outletStorageLimitDate;
  }

  public OrderDeliveryDTO dispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
    return this;
  }

   /**
   * Get dispatchType
   * @return dispatchType
  **/
  @ApiModelProperty(value = "")
  public OrderDeliveryDispatchType getDispatchType() {
    return dispatchType;
  }

  public void setDispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
  }

  public OrderDeliveryDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  public OrderDeliveryDTO addTracksItem(OrderTrackDTO tracksItem) {
    if (this.tracks == null) {
      this.tracks = ;
    }
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * Информация для отслеживания перемещений посылки.
   * @return tracks
  **/
  @ApiModelProperty(value = "Информация для отслеживания перемещений посылки.")
  public List<@Valid OrderTrackDTO> getTracks() {
    return tracks;
  }

  public void setTracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  public OrderDeliveryDTO shipments(List<@Valid OrderShipmentDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  public OrderDeliveryDTO addShipmentsItem(OrderShipmentDTO shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = ;
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Информация о посылках.
   * @return shipments
  **/
  @ApiModelProperty(value = "Информация о посылках.")
  public List<@Valid OrderShipmentDTO> getShipments() {
    return shipments;
  }

  public void setShipments(List<@Valid OrderShipmentDTO> shipments) {
    this.shipments = shipments;
  }

  public OrderDeliveryDTO estimated(Boolean estimated) {
    this.estimated = estimated;
    return this;
  }

   /**
   * Приблизительная ли дата доставки.
   * @return estimated
  **/
  @ApiModelProperty(value = "Приблизительная ли дата доставки.")
  public Boolean getEstimated() {
    return estimated;
  }

  public void setEstimated(Boolean estimated) {
    this.estimated = estimated;
  }

  public OrderDeliveryDTO eacType(OrderDeliveryEacType eacType) {
    this.eacType = eacType;
    return this;
  }

   /**
   * Get eacType
   * @return eacType
  **/
  @ApiModelProperty(value = "")
  public OrderDeliveryEacType getEacType() {
    return eacType;
  }

  public void setEacType(OrderDeliveryEacType eacType) {
    this.eacType = eacType;
  }

  public OrderDeliveryDTO eacCode(String eacCode) {
    this.eacCode = eacCode;
    return this;
  }

   /**
   * Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
   * @return eacCode
  **/
  @ApiModelProperty(value = "Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). ")
  public String getEacCode() {
    return eacCode;
  }

  public void setEacCode(String eacCode) {
    this.eacCode = eacCode;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

