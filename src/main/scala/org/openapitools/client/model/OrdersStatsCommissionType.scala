/**
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
package org.openapitools.client.model


  /**
   * Услуга:  * `FEE` — размещение товара на Маркете. * `FULFILLMENT` — складская обработка. Не возвращается с 1 января 2024 года. * `LOYALTY_PARTICIPATION_FEE` — участие в программе лояльности и отзывы за баллы. * `AUCTION_PROMOTION` — буст продаж с оплатой за продажи. * `INSTALLMENT` — рассрочка. Не возвращается с 24 февраля 2022 года. * `DELIVERY_TO_CUSTOMER` — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `EXPRESS_DELIVERY_TO_CUSTOMER` — экспресс-доставка покупателю (Экспресс). * `AGENCY` — прием платежа покупателя. * `PAYMENT_TRANSFER` — перевод платежа покупателя. * `RETURNED_ORDERS_STORAGE` — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `SORTING` — обработка заказа (FBS). * `INTAKE_SORTING` — организация забора заказов со склада продавца (FBS). * `RETURN_PROCESSING` — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `ILLIQUID_GOODS_SALE` — вознаграждение за продажу невывезенных товаров. 
   */

object OrdersStatsCommissionType extends Enumeration {
    type OrdersStatsCommissionType = OrdersStatsCommissionType.Value
    val FEE = Value("FEE")
    val FULFILLMENT = Value("FULFILLMENT")
    val LOYALTYPARTICIPATIONFEE = Value("LOYALTY_PARTICIPATION_FEE")
    val AUCTIONPROMOTION = Value("AUCTION_PROMOTION")
    val INSTALLMENT = Value("INSTALLMENT")
    val DELIVERYTOCUSTOMER = Value("DELIVERY_TO_CUSTOMER")
    val EXPRESSDELIVERYTOCUSTOMER = Value("EXPRESS_DELIVERY_TO_CUSTOMER")
    val AGENCY = Value("AGENCY")
    val PAYMENTTRANSFER = Value("PAYMENT_TRANSFER")
    val RETURNEDORDERSSTORAGE = Value("RETURNED_ORDERS_STORAGE")
    val SORTING = Value("SORTING")
    val INTAKESORTING = Value("INTAKE_SORTING")
    val RETURNPROCESSING = Value("RETURN_PROCESSING")
    val ILLIQUIDGOODSSALE = Value("ILLIQUID_GOODS_SALE")
}
