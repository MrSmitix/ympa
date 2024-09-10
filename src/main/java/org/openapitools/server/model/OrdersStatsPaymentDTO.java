package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.server.model.OrdersStatsPaymentOrderDTO;
import org.openapitools.server.model.OrdersStatsPaymentSourceType;
import org.openapitools.server.model.OrdersStatsPaymentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о денежных переводах по заказу.
 */
public class OrdersStatsPaymentDTO   {

    private String id;
    private LocalDate date;
    private OrdersStatsPaymentType type;
    private OrdersStatsPaymentSourceType source;
    private BigDecimal total;
    private OrdersStatsPaymentOrderDTO paymentOrder;

    /**
     * Default constructor.
     */
    public OrdersStatsPaymentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsPaymentDTO.
     *
     * @param id Идентификатор денежного перевода.
     * @param date Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     * @param type type
     * @param source source
     * @param total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
     * @param paymentOrder paymentOrder
     */
    public OrdersStatsPaymentDTO(
        String id, 
        LocalDate date, 
        OrdersStatsPaymentType type, 
        OrdersStatsPaymentSourceType source, 
        BigDecimal total, 
        OrdersStatsPaymentOrderDTO paymentOrder
    ) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.source = source;
        this.total = total;
        this.paymentOrder = paymentOrder;
    }



    /**
     * Идентификатор денежного перевода.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Get type
     * @return type
     */
    public OrdersStatsPaymentType getType() {
        return type;
    }

    public void setType(OrdersStatsPaymentType type) {
        this.type = type;
    }

    /**
     * Get source
     * @return source
     */
    public OrdersStatsPaymentSourceType getSource() {
        return source;
    }

    public void setSource(OrdersStatsPaymentSourceType source) {
        this.source = source;
    }

    /**
     * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * Get paymentOrder
     * @return paymentOrder
     */
    public OrdersStatsPaymentOrderDTO getPaymentOrder() {
        return paymentOrder;
    }

    public void setPaymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
        this.paymentOrder = paymentOrder;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersStatsPaymentDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    paymentOrder: ").append(toIndentedString(paymentOrder)).append("\n");
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

