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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о доставке.
 */

@Schema(name = "OrderDeliveryDTO", description = "Информация о доставке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryDTO {

  private String id;

  private OrderDeliveryType type;

  private String serviceName;

  @Deprecated
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

  @Valid
  private JsonNullable<List<@Valid OrderTrackDTO>> tracks = JsonNullable.<List<@Valid OrderTrackDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OrderShipmentDTO>> shipments = JsonNullable.<List<@Valid OrderShipmentDTO>>undefined();

  private Boolean estimated;

  private OrderDeliveryEacType eacType;

  private String eacCode;

  public OrderDeliveryDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  
  @Schema(name = "serviceName", description = "Наименование службы доставки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
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
   * @deprecated
   */
  @Valid 
  @Schema(name = "price", description = "{% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  @Deprecated
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * @deprecated
   */
  @Deprecated
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
   */
  @Valid 
  @Schema(name = "deliveryPartnerType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryPartnerType")
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
   */
  @Valid 
  @Schema(name = "courier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("courier")
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
   */
  @Valid 
  @Schema(name = "dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dates")
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
   */
  @Valid 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
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
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
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

  public OrderDeliveryDTO deliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
    return this;
  }

  /**
   * Идентификатор службы доставки.
   * @return deliveryServiceId
   */
  
  @Schema(name = "deliveryServiceId", description = "Идентификатор службы доставки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryServiceId")
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
   */
  @Valid 
  @Schema(name = "liftType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liftType")
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
   */
  @Valid 
  @Schema(name = "liftPrice", description = "Стоимость подъема на этаж.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liftPrice")
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
   */
  
  @Schema(name = "outletCode", description = "Идентификатор пункта самовывоза, присвоенный магазином.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outletCode")
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
   */
  
  @Schema(name = "outletStorageLimitDate", example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outletStorageLimitDate")
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
   */
  @Valid 
  @Schema(name = "dispatchType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dispatchType")
  public OrderDeliveryDispatchType getDispatchType() {
    return dispatchType;
  }

  public void setDispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
  }

  public OrderDeliveryDTO tracks(List<@Valid OrderTrackDTO> tracks) {
    this.tracks = JsonNullable.of(tracks);
    return this;
  }

  public OrderDeliveryDTO addTracksItem(OrderTrackDTO tracksItem) {
    if (this.tracks == null || !this.tracks.isPresent()) {
      this.tracks = JsonNullable.of(new ArrayList<>());
    }
    this.tracks.get().add(tracksItem);
    return this;
  }

  /**
   * Информация для отслеживания перемещений посылки.
   * @return tracks
   */
  @Valid 
  @Schema(name = "tracks", description = "Информация для отслеживания перемещений посылки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracks")
  public JsonNullable<List<@Valid OrderTrackDTO>> getTracks() {
    return tracks;
  }

  public void setTracks(JsonNullable<List<@Valid OrderTrackDTO>> tracks) {
    this.tracks = tracks;
  }

  public OrderDeliveryDTO shipments(List<@Valid OrderShipmentDTO> shipments) {
    this.shipments = JsonNullable.of(shipments);
    return this;
  }

  public OrderDeliveryDTO addShipmentsItem(OrderShipmentDTO shipmentsItem) {
    if (this.shipments == null || !this.shipments.isPresent()) {
      this.shipments = JsonNullable.of(new ArrayList<>());
    }
    this.shipments.get().add(shipmentsItem);
    return this;
  }

  /**
   * Информация о посылках.
   * @return shipments
   */
  @Valid 
  @Schema(name = "shipments", description = "Информация о посылках.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipments")
  public JsonNullable<List<@Valid OrderShipmentDTO>> getShipments() {
    return shipments;
  }

  public void setShipments(JsonNullable<List<@Valid OrderShipmentDTO>> shipments) {
    this.shipments = shipments;
  }

  public OrderDeliveryDTO estimated(Boolean estimated) {
    this.estimated = estimated;
    return this;
  }

  /**
   * Приблизительная ли дата доставки.
   * @return estimated
   */
  
  @Schema(name = "estimated", description = "Приблизительная ли дата доставки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated")
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
   */
  @Valid 
  @Schema(name = "eacType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eacType")
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
   */
  
  @Schema(name = "eacCode", description = "Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.tracks, orderDeliveryDTO.tracks) &&
        equalsNullable(this.shipments, orderDeliveryDTO.shipments) &&
        Objects.equals(this.estimated, orderDeliveryDTO.estimated) &&
        Objects.equals(this.eacType, orderDeliveryDTO.eacType) &&
        Objects.equals(this.eacCode, orderDeliveryDTO.eacCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, serviceName, price, deliveryPartnerType, courier, dates, region, address, vat, deliveryServiceId, liftType, liftPrice, outletCode, outletStorageLimitDate, dispatchType, hashCodeNullable(tracks), hashCodeNullable(shipments), estimated, eacType, eacCode);
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

