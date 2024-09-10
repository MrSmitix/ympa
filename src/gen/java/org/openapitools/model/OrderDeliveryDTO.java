package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о доставке.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о доставке.")
public class OrderDeliveryDTO   {
  
  private String id;

  private OrderDeliveryType type;

  private String serviceName;

  private BigDecimal price;

  private OrderDeliveryPartnerType deliveryPartnerType;

  private OrderCourierDTO courier;

  private OrderDeliveryDatesDTO dates;

  private RegionDTO region;

  private OrderDeliveryAddressDTO address;

  private OrderVatType vat;

  private Long deliveryServiceId;

  private OrderLiftType liftType;

  private BigDecimal liftPrice;

  private String outletCode;

  private String outletStorageLimitDate;

  private OrderDeliveryDispatchType dispatchType;

  private List<@Valid OrderTrackDTO> tracks;

  private List<@Valid OrderShipmentDTO> shipments;

  private Boolean estimated;

  private OrderDeliveryEacType eacType;

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
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа. 
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
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
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
  public OrderDeliveryDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
    return this;
  }

  
  @ApiModelProperty(value = "Информация для отслеживания перемещений посылки.")
  @JsonProperty("tracks")
  public List<@Valid OrderTrackDTO> getTracks() {
    return tracks;
  }
  public void setTracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

  public OrderDeliveryDTO addTracksItem(OrderTrackDTO tracksItem) {
    if (this.tracks == null) {
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }


  /**
   * Информация о посылках.
   **/
  public OrderDeliveryDTO shipments(List<@Valid OrderShipmentDTO> shipments) {
    this.shipments = shipments;
    return this;
  }

  
  @ApiModelProperty(value = "Информация о посылках.")
  @JsonProperty("shipments")
  public List<@Valid OrderShipmentDTO> getShipments() {
    return shipments;
  }
  public void setShipments(List<@Valid OrderShipmentDTO> shipments) {
    this.shipments = shipments;
  }

  public OrderDeliveryDTO addShipmentsItem(OrderShipmentDTO shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
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
   * Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;). 
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

