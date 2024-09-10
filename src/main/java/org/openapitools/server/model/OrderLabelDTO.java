package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ParcelBoxLabelDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные для печати ярлыка.
 */
public class OrderLabelDTO   {

    private Long orderId;
    private Integer placesNumber;
    private String url;
    private List<@Valid ParcelBoxLabelDTO> parcelBoxLabels = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrderLabelDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderLabelDTO.
     *
     * @param orderId Идентификатор заказа.
     * @param placesNumber Количество коробок в заказе.
     * @param url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
     * @param parcelBoxLabels Информация на ярлыке.
     */
    public OrderLabelDTO(
        Long orderId, 
        Integer placesNumber, 
        String url, 
        List<@Valid ParcelBoxLabelDTO> parcelBoxLabels
    ) {
        this.orderId = orderId;
        this.placesNumber = placesNumber;
        this.url = url;
        this.parcelBoxLabels = parcelBoxLabels;
    }



    /**
     * Идентификатор заказа.
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Количество коробок в заказе.
     * @return placesNumber
     */
    public Integer getPlacesNumber() {
        return placesNumber;
    }

    public void setPlacesNumber(Integer placesNumber) {
        this.placesNumber = placesNumber;
    }

    /**
     * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Информация на ярлыке.
     * @return parcelBoxLabels
     */
    public List<@Valid ParcelBoxLabelDTO> getParcelBoxLabels() {
        return parcelBoxLabels;
    }

    public void setParcelBoxLabels(List<@Valid ParcelBoxLabelDTO> parcelBoxLabels) {
        this.parcelBoxLabels = parcelBoxLabels;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLabelDTO {\n");
        
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    placesNumber: ").append(toIndentedString(placesNumber)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    parcelBoxLabels: ").append(toIndentedString(parcelBoxLabels)).append("\n");
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

