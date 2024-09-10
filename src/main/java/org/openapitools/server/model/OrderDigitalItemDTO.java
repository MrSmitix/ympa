package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ключ цифрового товара.
 */
public class OrderDigitalItemDTO   {

    private Long id;
    private String code;
    private String slip;
    private LocalDate activateTill;

    /**
     * Default constructor.
     */
    public OrderDigitalItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderDigitalItemDTO.
     *
     * @param id Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. 
     * @param code Сам ключ.
     * @param slip Инструкция по активации.
     * @param activateTill Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     */
    public OrderDigitalItemDTO(
        Long id, 
        String code, 
        String slip, 
        LocalDate activateTill
    ) {
        this.id = id;
        this.code = code;
        this.slip = slip;
        this.activateTill = activateTill;
    }



    /**
     * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Сам ключ.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Инструкция по активации.
     * @return slip
     */
    public String getSlip() {
        return slip;
    }

    public void setSlip(String slip) {
        this.slip = slip;
    }

    /**
     * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @return activateTill
     */
    public LocalDate getActivateTill() {
        return activateTill;
    }

    public void setActivateTill(LocalDate activateTill) {
        this.activateTill = activateTill;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderDigitalItemDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    slip: ").append(toIndentedString(slip)).append("\n");
        sb.append("    activateTill: ").append(toIndentedString(activateTill)).append("\n");
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

