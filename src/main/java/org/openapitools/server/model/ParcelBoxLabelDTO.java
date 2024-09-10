package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о ярлыке для коробки.
 */
public class ParcelBoxLabelDTO   {

    private String url;
    private String supplierName;
    private String deliveryServiceName;
    private Long orderId;
    private String orderNum;
    private String recipientName;
    private Long boxId;
    private String fulfilmentId;
    private String place;
    private String weight;
    private String deliveryServiceId;
    private String deliveryAddress;
    private String shipmentDate;

    /**
     * Default constructor.
     */
    public ParcelBoxLabelDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ParcelBoxLabelDTO.
     *
     * @param url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
     * @param supplierName Юридическое название магазина.
     * @param deliveryServiceName Юридическое название службы доставки.
     * @param orderId Идентификатор заказа в системе Маркета.
     * @param orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. 
     * @param recipientName Фамилия и инициалы получателя заказа.
     * @param boxId Идентификатор коробки.
     * @param fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. 
     * @param place Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. 
     * @param weight {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. 
     * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     * @param deliveryAddress Адрес получателя.
     * @param shipmentDate Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.
     */
    public ParcelBoxLabelDTO(
        String url, 
        String supplierName, 
        String deliveryServiceName, 
        Long orderId, 
        String orderNum, 
        String recipientName, 
        Long boxId, 
        String fulfilmentId, 
        String place, 
        String weight, 
        String deliveryServiceId, 
        String deliveryAddress, 
        String shipmentDate
    ) {
        this.url = url;
        this.supplierName = supplierName;
        this.deliveryServiceName = deliveryServiceName;
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.recipientName = recipientName;
        this.boxId = boxId;
        this.fulfilmentId = fulfilmentId;
        this.place = place;
        this.weight = weight;
        this.deliveryServiceId = deliveryServiceId;
        this.deliveryAddress = deliveryAddress;
        this.shipmentDate = shipmentDate;
    }



    /**
     * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Юридическое название магазина.
     * @return supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * Юридическое название службы доставки.
     * @return deliveryServiceName
     */
    public String getDeliveryServiceName() {
        return deliveryServiceName;
    }

    public void setDeliveryServiceName(String deliveryServiceName) {
        this.deliveryServiceName = deliveryServiceName;
    }

    /**
     * Идентификатор заказа в системе Маркета.
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
     * @return orderNum
     */
    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * Фамилия и инициалы получателя заказа.
     * @return recipientName
     */
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * Идентификатор коробки.
     * @return boxId
     */
    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

    /**
     * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
     * @return fulfilmentId
     */
    public String getFulfilmentId() {
        return fulfilmentId;
    }

    public void setFulfilmentId(String fulfilmentId) {
        this.fulfilmentId = fulfilmentId;
    }

    /**
     * Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
     * @return place
     */
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     * @return deliveryServiceId
     */
    public String getDeliveryServiceId() {
        return deliveryServiceId;
    }

    public void setDeliveryServiceId(String deliveryServiceId) {
        this.deliveryServiceId = deliveryServiceId;
    }

    /**
     * Адрес получателя.
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * Дата отгрузки в формате `dd.MM.yyyy`.
     * @return shipmentDate
     */
    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParcelBoxLabelDTO {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    supplierName: ").append(toIndentedString(supplierName)).append("\n");
        sb.append("    deliveryServiceName: ").append(toIndentedString(deliveryServiceName)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderNum: ").append(toIndentedString(orderNum)).append("\n");
        sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
        sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
        sb.append("    fulfilmentId: ").append(toIndentedString(fulfilmentId)).append("\n");
        sb.append("    place: ").append(toIndentedString(place)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    deliveryServiceId: ").append(toIndentedString(deliveryServiceId)).append("\n");
        sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
        sb.append("    shipmentDate: ").append(toIndentedString(shipmentDate)).append("\n");
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

