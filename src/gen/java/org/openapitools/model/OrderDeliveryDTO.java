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
 **/

@ApiModel(description = "Информация о доставке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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
  private List<OrderTrackDTO> tracks = null;

  @JsonProperty("shipments")
  private List<OrderShipmentDTO> shipments = null;

  @JsonProperty("estimated")
  private Boolean estimated;

  @JsonProperty("eacType")
  private OrderDeliveryEacType eacType;

  @JsonProperty("eacCode")
  private String eacCode;

  /**
   * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
   **/
  public OrderDeliveryDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). ")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public OrderDeliveryDTO type(OrderDeliveryType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public OrderDeliveryType getType() {
    return type;
  }
  public void setType(OrderDeliveryType type) {
    this.type = type;
  }

  /**
   * Наименование службы доставки.
   **/
  public OrderDeliveryDTO serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  
  @ApiModelProperty(value = "Наименование службы доставки.")
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
   **/
  public OrderDeliveryDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. ")
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   **/
  public OrderDeliveryDTO deliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
    this.deliveryPartnerType = deliveryPartnerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveryPartnerType")
  public OrderDeliveryPartnerType getDeliveryPartnerType() {
    return deliveryPartnerType;
  }
  public void setDeliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
    this.deliveryPartnerType = deliveryPartnerType;
  }

  /**
   **/
  public OrderDeliveryDTO courier(OrderCourierDTO courier) {
    this.courier = courier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("courier")
  public OrderCourierDTO getCourier() {
    return courier;
  }
  public void setCourier(OrderCourierDTO courier) {
    this.courier = courier;
  }

  /**
   **/
  public OrderDeliveryDTO dates(OrderDeliveryDatesDTO dates) {
    this.dates = dates;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dates")
  public OrderDeliveryDatesDTO getDates() {
    return dates;
  }
  public void setDates(OrderDeliveryDatesDTO dates) {
    this.dates = dates;
  }

  /**
   **/
  public OrderDeliveryDTO region(RegionDTO region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }
  public void setRegion(RegionDTO region) {
    this.region = region;
  }

  /**
   **/
  public OrderDeliveryDTO address(OrderDeliveryAddressDTO address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public OrderDeliveryAddressDTO getAddress() {
    return address;
  }
  public void setAddress(OrderDeliveryAddressDTO address) {
    this.address = address;
  }

  /**
   **/
  public OrderDeliveryDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }
  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  /**
   * Идентификатор службы доставки.
   **/
  public OrderDeliveryDTO deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор службы доставки.")
  @JsonProperty("deliveryServiceId")
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }
  public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

  /**
   **/
  public OrderDeliveryDTO liftType(OrderLiftType liftType) {
    this.liftType = liftType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("liftType")
  public OrderLiftType getLiftType() {
    return liftType;
  }
  public void setLiftType(OrderLiftType liftType) {
    this.liftType = liftType;
  }

  /**
   * Стоимость подъема на этаж.
   **/
  public OrderDeliveryDTO liftPrice(BigDecimal liftPrice) {
    this.liftPrice = liftPrice;
    return this;
  }

  
  @ApiModelProperty(value = "Стоимость подъема на этаж.")
  @JsonProperty("liftPrice")
  public BigDecimal getLiftPrice() {
    return liftPrice;
  }
  public void setLiftPrice(BigDecimal liftPrice) {
    this.liftPrice = liftPrice;
  }

  /**
   * Идентификатор пункта самовывоза, присвоенный магазином.
   **/
  public OrderDeliveryDTO outletCode(String outletCode) {
    this.outletCode = outletCode;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор пункта самовывоза, присвоенный магазином.")
  @JsonProperty("outletCode")
  public String getOutletCode() {
    return outletCode;
  }
  public void setOutletCode(String outletCode) {
    this.outletCode = outletCode;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  public OrderDeliveryDTO outletStorageLimitDate(String outletStorageLimitDate) {
    this.outletStorageLimitDate = outletStorageLimitDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022", value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("outletStorageLimitDate")
  public String getOutletStorageLimitDate() {
    return outletStorageLimitDate;
  }
  public void setOutletStorageLimitDate(String outletStorageLimitDate) {
    this.outletStorageLimitDate = outletStorageLimitDate;
  }

  /**
   **/
  public OrderDeliveryDTO dispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dispatchType")
  public OrderDeliveryDispatchType getDispatchType() {
    return dispatchType;
  }
  public void setDispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
  }

  /**
   * Информация для отслеживания перемещений посылки.
   **/
  public OrderDeliveryDTO tracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  
  @ApiModelProperty(value = "Информация для отслеживания перемещений посылки.")
  @JsonProperty("tracks")
  public List<OrderTrackDTO> getTracks() {
    return tracks;
  }
  public void setTracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  /**
   * Информация о посылках.
   **/
  public OrderDeliveryDTO shipments(List<OrderShipmentDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  
  @ApiModelProperty(value = "Информация о посылках.")
  @JsonProperty("shipments")
  public List<OrderShipmentDTO> getShipments() {
    return shipments;
  }
  public void setShipments(List<OrderShipmentDTO> shipments) {
    this.shipments = shipments;
  }

  /**
   * Приблизительная ли дата доставки.
   **/
  public OrderDeliveryDTO estimated(Boolean estimated) {
    this.estimated = estimated;
    return this;
  }

  
  @ApiModelProperty(value = "Приблизительная ли дата доставки.")
  @JsonProperty("estimated")
  public Boolean getEstimated() {
    return estimated;
  }
  public void setEstimated(Boolean estimated) {
    this.estimated = estimated;
  }

  /**
   **/
  public OrderDeliveryDTO eacType(OrderDeliveryEacType eacType) {
    this.eacType = eacType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eacType")
  public OrderDeliveryEacType getEacType() {
    return eacType;
  }
  public void setEacType(OrderDeliveryEacType eacType) {
    this.eacType = eacType;
  }

  /**
   * Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
   **/
  public OrderDeliveryDTO eacCode(String eacCode) {
    this.eacCode = eacCode;
    return this;
  }

  
  @ApiModelProperty(value = "Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). ")
  @JsonProperty("eacCode")
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
    return Objects.equals(id, orderDeliveryDTO.id) &&
        Objects.equals(type, orderDeliveryDTO.type) &&
        Objects.equals(serviceName, orderDeliveryDTO.serviceName) &&
        Objects.equals(price, orderDeliveryDTO.price) &&
        Objects.equals(deliveryPartnerType, orderDeliveryDTO.deliveryPartnerType) &&
        Objects.equals(courier, orderDeliveryDTO.courier) &&
        Objects.equals(dates, orderDeliveryDTO.dates) &&
        Objects.equals(region, orderDeliveryDTO.region) &&
        Objects.equals(address, orderDeliveryDTO.address) &&
        Objects.equals(vat, orderDeliveryDTO.vat) &&
        Objects.equals(deliveryServiceId, orderDeliveryDTO.deliveryServiceId) &&
        Objects.equals(liftType, orderDeliveryDTO.liftType) &&
        Objects.equals(liftPrice, orderDeliveryDTO.liftPrice) &&
        Objects.equals(outletCode, orderDeliveryDTO.outletCode) &&
        Objects.equals(outletStorageLimitDate, orderDeliveryDTO.outletStorageLimitDate) &&
        Objects.equals(dispatchType, orderDeliveryDTO.dispatchType) &&
        Objects.equals(tracks, orderDeliveryDTO.tracks) &&
        Objects.equals(shipments, orderDeliveryDTO.shipments) &&
        Objects.equals(estimated, orderDeliveryDTO.estimated) &&
        Objects.equals(eacType, orderDeliveryDTO.eacType) &&
        Objects.equals(eacCode, orderDeliveryDTO.eacCode);
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

