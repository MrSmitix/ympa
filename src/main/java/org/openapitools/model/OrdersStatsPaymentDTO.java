/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.model.OrdersStatsPaymentOrderDTO;
import org.openapitools.model.OrdersStatsPaymentSourceType;
import org.openapitools.model.OrdersStatsPaymentType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о денежных переводах по заказу.
 */
@Schema(name = "OrdersStatsPaymentDTO", description = "Информация о денежных переводах по заказу.")
@JsonPropertyOrder({
  OrdersStatsPaymentDTO.JSON_PROPERTY_ID,
  OrdersStatsPaymentDTO.JSON_PROPERTY_DATE,
  OrdersStatsPaymentDTO.JSON_PROPERTY_TYPE,
  OrdersStatsPaymentDTO.JSON_PROPERTY_SOURCE,
  OrdersStatsPaymentDTO.JSON_PROPERTY_TOTAL,
  OrdersStatsPaymentDTO.JSON_PROPERTY_PAYMENT_ORDER
})
@JsonTypeName("OrdersStatsPaymentDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrdersStatsPaymentDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_DATE = "date";
    private LocalDate date;

    public static final String JSON_PROPERTY_TYPE = "type";
    private OrdersStatsPaymentType type;

    public static final String JSON_PROPERTY_SOURCE = "source";
    private OrdersStatsPaymentSourceType source;

    public static final String JSON_PROPERTY_TOTAL = "total";
    private BigDecimal total;

    public static final String JSON_PROPERTY_PAYMENT_ORDER = "paymentOrder";
    private OrdersStatsPaymentOrderDTO paymentOrder;

    public OrdersStatsPaymentDTO() {
    }

    public OrdersStatsPaymentDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор денежного перевода.
     * @return id
     */
    @Nullable
    @Schema(name = "id", description = "Идентификатор денежного перевода.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public OrdersStatsPaymentDTO date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     * @return date
     */
    @Nullable
    @Schema(name = "date", description = "Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getDate() {
        return date;
    }

    @JsonProperty(JSON_PROPERTY_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public OrdersStatsPaymentDTO type(OrdersStatsPaymentType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Nullable
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrdersStatsPaymentType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(OrdersStatsPaymentType type) {
        this.type = type;
    }

    public OrdersStatsPaymentDTO source(OrdersStatsPaymentSourceType source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @Nullable
    @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrdersStatsPaymentSourceType getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSource(OrdersStatsPaymentSourceType source) {
        this.source = source;
    }

    public OrdersStatsPaymentDTO total(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
     * @return total
     */
    @Nullable
    @Schema(name = "total", description = "Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOTAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getTotal() {
        return total;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public OrdersStatsPaymentDTO paymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
        this.paymentOrder = paymentOrder;
        return this;
    }

    /**
     * Get paymentOrder
     * @return paymentOrder
     */
    @Valid
    @Nullable
    @Schema(name = "paymentOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAYMENT_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrdersStatsPaymentOrderDTO getPaymentOrder() {
        return paymentOrder;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_ORDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
        this.paymentOrder = paymentOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrdersStatsPaymentDTO ordersStatsPaymentDTO = (OrdersStatsPaymentDTO) o;
        return Objects.equals(this.id, ordersStatsPaymentDTO.id) &&
            Objects.equals(this.date, ordersStatsPaymentDTO.date) &&
            Objects.equals(this.type, ordersStatsPaymentDTO.type) &&
            Objects.equals(this.source, ordersStatsPaymentDTO.source) &&
            Objects.equals(this.total, ordersStatsPaymentDTO.total) &&
            Objects.equals(this.paymentOrder, ordersStatsPaymentDTO.paymentOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, type, source, total, paymentOrder);
    }

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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

