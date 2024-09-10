package apimodels;

import apimodels.OrderCourierDTO;
import apimodels.OrderDeliveryAddressDTO;
import apimodels.OrderDeliveryDatesDTO;
import apimodels.OrderDeliveryDispatchType;
import apimodels.OrderDeliveryEacType;
import apimodels.OrderDeliveryPartnerType;
import apimodels.OrderDeliveryType;
import apimodels.OrderLiftType;
import apimodels.OrderShipmentDTO;
import apimodels.OrderTrackDTO;
import apimodels.OrderVatType;
import apimodels.RegionDTO;
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
 * Информация о доставке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderDeliveryDTO   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("type")
  @Valid

  private OrderDeliveryType type;

  @JsonProperty("serviceName")
  
  private String serviceName;

  @JsonProperty("price")
  @Valid

  private BigDecimal price;

  @JsonProperty("deliveryPartnerType")
  @Valid

  private OrderDeliveryPartnerType deliveryPartnerType;

  @JsonProperty("courier")
  @Valid

  private OrderCourierDTO courier;

  @JsonProperty("dates")
  @Valid

  private OrderDeliveryDatesDTO dates;

  @JsonProperty("region")
  @Valid

  private RegionDTO region;

  @JsonProperty("address")
  @Valid

  private OrderDeliveryAddressDTO address;

  @JsonProperty("vat")
  @Valid

  private OrderVatType vat;

  @JsonProperty("deliveryServiceId")
  
  private Long deliveryServiceId;

  @JsonProperty("liftType")
  @Valid

  private OrderLiftType liftType;

  @JsonProperty("liftPrice")
  @Valid

  private BigDecimal liftPrice;

  @JsonProperty("outletCode")
  
  private String outletCode;

  @JsonProperty("outletStorageLimitDate")
  
  private String outletStorageLimitDate;

  @JsonProperty("dispatchType")
  @Valid

  private OrderDeliveryDispatchType dispatchType;

  @JsonProperty("tracks")
  @Valid

  private List<@Valid OrderTrackDTO> tracks = null;

  @JsonProperty("shipments")
  @Valid

  private List<@Valid OrderShipmentDTO> shipments = null;

  @JsonProperty("estimated")
  
  private Boolean estimated;

  @JsonProperty("eacType")
  @Valid

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
      this.tracks = new ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * Информация для отслеживания перемещений посылки.
   * @return tracks
  **/
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
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Информация о посылках.
   * @return shipments
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

