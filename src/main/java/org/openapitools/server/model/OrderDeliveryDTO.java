package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrderCourierDTO;
import org.openapitools.server.model.OrderDeliveryAddressDTO;
import org.openapitools.server.model.OrderDeliveryDatesDTO;
import org.openapitools.server.model.OrderDeliveryDispatchType;
import org.openapitools.server.model.OrderDeliveryEacType;
import org.openapitools.server.model.OrderDeliveryPartnerType;
import org.openapitools.server.model.OrderDeliveryType;
import org.openapitools.server.model.OrderLiftType;
import org.openapitools.server.model.OrderShipmentDTO;
import org.openapitools.server.model.OrderTrackDTO;
import org.openapitools.server.model.OrderVatType;
import org.openapitools.server.model.RegionDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о доставке.
 */
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
     * Default constructor.
     */
    public OrderDeliveryDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderDeliveryDTO.
     *
     * @param id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
     * @param type type
     * @param serviceName Наименование службы доставки.
     * @param price {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа. 
     * @param deliveryPartnerType deliveryPartnerType
     * @param courier courier
     * @param dates dates
     * @param region region
     * @param address address
     * @param vat vat
     * @param deliveryServiceId Идентификатор службы доставки.
     * @param liftType liftType
     * @param liftPrice Стоимость подъема на этаж.
     * @param outletCode Идентификатор пункта самовывоза, присвоенный магазином.
     * @param outletStorageLimitDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param dispatchType dispatchType
     * @param tracks Информация для отслеживания перемещений посылки.
     * @param shipments Информация о посылках.
     * @param estimated Приблизительная ли дата доставки.
     * @param eacType eacType
     * @param eacCode Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;). 
     */
    public OrderDeliveryDTO(
        String id, 
        OrderDeliveryType type, 
        String serviceName, 
        BigDecimal price, 
        OrderDeliveryPartnerType deliveryPartnerType, 
        OrderCourierDTO courier, 
        OrderDeliveryDatesDTO dates, 
        RegionDTO region, 
        OrderDeliveryAddressDTO address, 
        OrderVatType vat, 
        Long deliveryServiceId, 
        OrderLiftType liftType, 
        BigDecimal liftPrice, 
        String outletCode, 
        String outletStorageLimitDate, 
        OrderDeliveryDispatchType dispatchType, 
        List<@Valid OrderTrackDTO> tracks, 
        List<@Valid OrderShipmentDTO> shipments, 
        Boolean estimated, 
        OrderDeliveryEacType eacType, 
        String eacCode
    ) {
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



    /**
     * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get type
     * @return type
     */
    public OrderDeliveryType getType() {
        return type;
    }

    public void setType(OrderDeliveryType type) {
        this.type = type;
    }

    /**
     * Наименование службы доставки.
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Get deliveryPartnerType
     * @return deliveryPartnerType
     */
    public OrderDeliveryPartnerType getDeliveryPartnerType() {
        return deliveryPartnerType;
    }

    public void setDeliveryPartnerType(OrderDeliveryPartnerType deliveryPartnerType) {
        this.deliveryPartnerType = deliveryPartnerType;
    }

    /**
     * Get courier
     * @return courier
     */
    public OrderCourierDTO getCourier() {
        return courier;
    }

    public void setCourier(OrderCourierDTO courier) {
        this.courier = courier;
    }

    /**
     * Get dates
     * @return dates
     */
    public OrderDeliveryDatesDTO getDates() {
        return dates;
    }

    public void setDates(OrderDeliveryDatesDTO dates) {
        this.dates = dates;
    }

    /**
     * Get region
     * @return region
     */
    public RegionDTO getRegion() {
        return region;
    }

    public void setRegion(RegionDTO region) {
        this.region = region;
    }

    /**
     * Get address
     * @return address
     */
    public OrderDeliveryAddressDTO getAddress() {
        return address;
    }

    public void setAddress(OrderDeliveryAddressDTO address) {
        this.address = address;
    }

    /**
     * Get vat
     * @return vat
     */
    public OrderVatType getVat() {
        return vat;
    }

    public void setVat(OrderVatType vat) {
        this.vat = vat;
    }

    /**
     * Идентификатор службы доставки.
     * @return deliveryServiceId
     */
    public Long getDeliveryServiceId() {
        return deliveryServiceId;
    }

    public void setDeliveryServiceId(Long deliveryServiceId) {
        this.deliveryServiceId = deliveryServiceId;
    }

    /**
     * Get liftType
     * @return liftType
     */
    public OrderLiftType getLiftType() {
        return liftType;
    }

    public void setLiftType(OrderLiftType liftType) {
        this.liftType = liftType;
    }

    /**
     * Стоимость подъема на этаж.
     * @return liftPrice
     */
    public BigDecimal getLiftPrice() {
        return liftPrice;
    }

    public void setLiftPrice(BigDecimal liftPrice) {
        this.liftPrice = liftPrice;
    }

    /**
     * Идентификатор пункта самовывоза, присвоенный магазином.
     * @return outletCode
     */
    public String getOutletCode() {
        return outletCode;
    }

    public void setOutletCode(String outletCode) {
        this.outletCode = outletCode;
    }

    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return outletStorageLimitDate
     */
    public String getOutletStorageLimitDate() {
        return outletStorageLimitDate;
    }

    public void setOutletStorageLimitDate(String outletStorageLimitDate) {
        this.outletStorageLimitDate = outletStorageLimitDate;
    }

    /**
     * Get dispatchType
     * @return dispatchType
     */
    public OrderDeliveryDispatchType getDispatchType() {
        return dispatchType;
    }

    public void setDispatchType(OrderDeliveryDispatchType dispatchType) {
        this.dispatchType = dispatchType;
    }

    /**
     * Информация для отслеживания перемещений посылки.
     * @return tracks
     */
    public List<@Valid OrderTrackDTO> getTracks() {
        return tracks;
    }

    public void setTracks(List<@Valid OrderTrackDTO> tracks) {
        this.tracks = tracks;
    }

    /**
     * Информация о посылках.
     * @return shipments
     */
    public List<@Valid OrderShipmentDTO> getShipments() {
        return shipments;
    }

    public void setShipments(List<@Valid OrderShipmentDTO> shipments) {
        this.shipments = shipments;
    }

    /**
     * Приблизительная ли дата доставки.
     * @return estimated
     */
    public Boolean getEstimated() {
        return estimated;
    }

    public void setEstimated(Boolean estimated) {
        this.estimated = estimated;
    }

    /**
     * Get eacType
     * @return eacType
     */
    public OrderDeliveryEacType getEacType() {
        return eacType;
    }

    public void setEacType(OrderDeliveryEacType eacType) {
        this.eacType = eacType;
    }

    /**
     * Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
     * @return eacCode
     */
    public String getEacCode() {
        return eacCode;
    }

    public void setEacCode(String eacCode) {
        this.eacCode = eacCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

