package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Услуга:  * &#x60;FEE&#x60; — размещение товара на Маркете. * &#x60;FULFILLMENT&#x60; — складская обработка. Не возвращается с 1 января 2024 года. * &#x60;LOYALTY_PARTICIPATION_FEE&#x60; — участие в программе лояльности и отзывы за баллы. * &#x60;AUCTION_PROMOTION&#x60; — буст продаж с оплатой за продажи. * &#x60;INSTALLMENT&#x60; — рассрочка. Не возвращается с 24 февраля 2022 года. * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;EXPRESS_DELIVERY_TO_CUSTOMER&#x60; — экспресс-доставка покупателю (Экспресс). * &#x60;AGENCY&#x60; — прием платежа покупателя. * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя. * &#x60;RETURNED_ORDERS_STORAGE&#x60; — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;SORTING&#x60; — обработка заказа (FBS). * &#x60;INTAKE_SORTING&#x60; — организация забора заказов со склада продавца (FBS). * &#x60;RETURN_PROCESSING&#x60; — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;ILLIQUID_GOODS_SALE&#x60; — вознаграждение за продажу невывезенных товаров. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrdersStatsCommissionType {

    @JsonProperty("FEE") FEE(String.valueOf("FEE")), @JsonProperty("FULFILLMENT") FULFILLMENT(String.valueOf("FULFILLMENT")), @JsonProperty("LOYALTY_PARTICIPATION_FEE") LOYALTY_PARTICIPATION_FEE(String.valueOf("LOYALTY_PARTICIPATION_FEE")), @JsonProperty("AUCTION_PROMOTION") AUCTION_PROMOTION(String.valueOf("AUCTION_PROMOTION")), @JsonProperty("INSTALLMENT") INSTALLMENT(String.valueOf("INSTALLMENT")), @JsonProperty("DELIVERY_TO_CUSTOMER") DELIVERY_TO_CUSTOMER(String.valueOf("DELIVERY_TO_CUSTOMER")), @JsonProperty("EXPRESS_DELIVERY_TO_CUSTOMER") EXPRESS_DELIVERY_TO_CUSTOMER(String.valueOf("EXPRESS_DELIVERY_TO_CUSTOMER")), @JsonProperty("AGENCY") AGENCY(String.valueOf("AGENCY")), @JsonProperty("PAYMENT_TRANSFER") PAYMENT_TRANSFER(String.valueOf("PAYMENT_TRANSFER")), @JsonProperty("RETURNED_ORDERS_STORAGE") RETURNED_ORDERS_STORAGE(String.valueOf("RETURNED_ORDERS_STORAGE")), @JsonProperty("SORTING") SORTING(String.valueOf("SORTING")), @JsonProperty("INTAKE_SORTING") INTAKE_SORTING(String.valueOf("INTAKE_SORTING")), @JsonProperty("RETURN_PROCESSING") RETURN_PROCESSING(String.valueOf("RETURN_PROCESSING")), @JsonProperty("ILLIQUID_GOODS_SALE") ILLIQUID_GOODS_SALE(String.valueOf("ILLIQUID_GOODS_SALE"));


    private String value;

    OrdersStatsCommissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrdersStatsCommissionType fromValue(String value) {
        for (OrdersStatsCommissionType b : OrdersStatsCommissionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



