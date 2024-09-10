package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OrderCourierDTO;
import org.openapitools.server.api.model.OrderDeliveryAddressDTO;
import org.openapitools.server.api.model.OrderDeliveryDatesDTO;
import org.openapitools.server.api.model.OrderDeliveryDispatchType;
import org.openapitools.server.api.model.OrderDeliveryEacType;
import org.openapitools.server.api.model.OrderDeliveryPartnerType;
import org.openapitools.server.api.model.OrderDeliveryType;
import org.openapitools.server.api.model.OrderLiftType;
import org.openapitools.server.api.model.OrderShipmentDTO;
import org.openapitools.server.api.model.OrderTrackDTO;
import org.openapitools.server.api.model.OrderVatType;
import org.openapitools.server.api.model.RegionDTO;

/**
 * Информация о доставке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private List<OrderTrackDTO> tracks;
  private List<OrderShipmentDTO> shipments;
  private Boolean estimated;
  private OrderDeliveryEacType eacType;
  private String eacCode;

  public OrderDeliveryDTO () {

  }

  public OrderDeliveryDTO (String id, OrderDeliveryType type, String serviceName, BigDecimal price, OrderDeliveryPartnerType deliveryPartnerType, OrderCourierDTO courier, OrderDeliveryDatesDTO dates, RegionDTO region, OrderDeliveryAddressDTO address, OrderVatType vat, Long deliveryServiceId, OrderLiftType liftType, BigDecimal liftPrice, String outletCode, String outletStorageLimitDate, OrderDeliveryDispatchType dispatchType, List<OrderTrackDTO> tracks, List<OrderShipmentDTO> shipments, Boolean estimated, OrderDeliveryEacType eacType, String eacCode) {
    this.id = id;
    this.type = type;
    this.serviceName = serviceName;
    this.price = price;
    this.deliveryPartnerType = deliveryPartnerType;
    this.courier = courier;
    this.dates = dates;
    this.region = region;
    this.address = address;
    this.vat = vat;
    this.deliveryServiceId = deliveryServiceId;
    this.liftType = liftType;
    this.liftPrice = liftPrice;
    this.outletCode = outletCode;
    this.outletStorageLimitDate = outletStorageLimitDate;
    this.dispatchType = dispatchType;
    this.tracks = tracks;
    this.shipments = shipments;
    this.estimated = estimated;
    this.eacType = eacType;
    this.eacCode = eacCode;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public OrderDeliveryType getType() {
    return type;
  }
  public void setType(OrderDeliveryType type) {
    this.type = type;
  }

    
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("deliveryPartnerType")
  public OrderDeliveryPartnerType getDeliveryPartnerType() {
    return deliveryPartnerType;
  }
  public void setDeliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
    this.deliveryPartnerType = deliveryPartnerType;
  }

    
  @JsonProperty("courier")
  public OrderCourierDTO getCourier() {
    return courier;
  }
  public void setCourier(OrderCourierDTO courier) {
    this.courier = courier;
  }

    
  @JsonProperty("dates")
  public OrderDeliveryDatesDTO getDates() {
    return dates;
  }
  public void setDates(OrderDeliveryDatesDTO dates) {
    this.dates = dates;
  }

    
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }
  public void setRegion(RegionDTO region) {
    this.region = region;
  }

    
  @JsonProperty("address")
  public OrderDeliveryAddressDTO getAddress() {
    return address;
  }
  public void setAddress(OrderDeliveryAddressDTO address) {
    this.address = address;
  }

    
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }
  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

    
  @JsonProperty("deliveryServiceId")
  public Long getDeliveryServiceId() {
    return deliveryServiceId;
  }
  public void setDeliveryServiceId(Long deliveryServiceId) {
    this.deliveryServiceId = deliveryServiceId;
  }

    
  @JsonProperty("liftType")
  public OrderLiftType getLiftType() {
    return liftType;
  }
  public void setLiftType(OrderLiftType liftType) {
    this.liftType = liftType;
  }

    
  @JsonProperty("liftPrice")
  public BigDecimal getLiftPrice() {
    return liftPrice;
  }
  public void setLiftPrice(BigDecimal liftPrice) {
    this.liftPrice = liftPrice;
  }

    
  @JsonProperty("outletCode")
  public String getOutletCode() {
    return outletCode;
  }
  public void setOutletCode(String outletCode) {
    this.outletCode = outletCode;
  }

    
  @JsonProperty("outletStorageLimitDate")
  public String getOutletStorageLimitDate() {
    return outletStorageLimitDate;
  }
  public void setOutletStorageLimitDate(String outletStorageLimitDate) {
    this.outletStorageLimitDate = outletStorageLimitDate;
  }

    
  @JsonProperty("dispatchType")
  public OrderDeliveryDispatchType getDispatchType() {
    return dispatchType;
  }
  public void setDispatchType(OrderDeliveryDispatchType dispatchType) {
    this.dispatchType = dispatchType;
  }

    
  @JsonProperty("tracks")
  public List<OrderTrackDTO> getTracks() {
    return tracks;
  }
  public void setTracks(List<OrderTrackDTO> tracks) {
    this.tracks = tracks;
  }

    
  @JsonProperty("shipments")
  public List<OrderShipmentDTO> getShipments() {
    return shipments;
  }
  public void setShipments(List<OrderShipmentDTO> shipments) {
    this.shipments = shipments;
  }

    
  @JsonProperty("estimated")
  public Boolean getEstimated() {
    return estimated;
  }
  public void setEstimated(Boolean estimated) {
    this.estimated = estimated;
  }

    
  @JsonProperty("eacType")
  public OrderDeliveryEacType getEacType() {
    return eacType;
  }
  public void setEacType(OrderDeliveryEacType eacType) {
    this.eacType = eacType;
  }

    
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
