/*
 * orders_stats_commission_type.h
 *
 * Услуга:  * &#x60;FEE&#x60; — размещение товара на Маркете. * &#x60;FULFILLMENT&#x60; — складская обработка. Не возвращается с 1 января 2024 года. * &#x60;LOYALTY_PARTICIPATION_FEE&#x60; — участие в программе лояльности и отзывы за баллы. * &#x60;AUCTION_PROMOTION&#x60; — буст продаж с оплатой за продажи. * &#x60;INSTALLMENT&#x60; — рассрочка. Не возвращается с 24 февраля 2022 года. * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;EXPRESS_DELIVERY_TO_CUSTOMER&#x60; — экспресс-доставка покупателю (Экспресс). * &#x60;AGENCY&#x60; — прием платежа покупателя. * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя. * &#x60;RETURNED_ORDERS_STORAGE&#x60; — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;SORTING&#x60; — обработка заказа (FBS). * &#x60;INTAKE_SORTING&#x60; — организация забора заказов со склада продавца (FBS). * &#x60;RETURN_PROCESSING&#x60; — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;ILLIQUID_GOODS_SALE&#x60; — вознаграждение за продажу невывезенных товаров. 
 */

#ifndef _orders_stats_commission_type_H_
#define _orders_stats_commission_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_commission_type_t orders_stats_commission_type_t;


// Enum  for orders_stats_commission_type

typedef enum { _api__orders_stats_commission_type__NULL = 0, _api__orders_stats_commission_type__FEE, _api__orders_stats_commission_type__FULFILLMENT, _api__orders_stats_commission_type__LOYALTY_PARTICIPATION_FEE, _api__orders_stats_commission_type__AUCTION_PROMOTION, _api__orders_stats_commission_type__INSTALLMENT, _api__orders_stats_commission_type__DELIVERY_TO_CUSTOMER, _api__orders_stats_commission_type__EXPRESS_DELIVERY_TO_CUSTOMER, _api__orders_stats_commission_type__AGENCY, _api__orders_stats_commission_type__PAYMENT_TRANSFER, _api__orders_stats_commission_type__RETURNED_ORDERS_STORAGE, _api__orders_stats_commission_type__SORTING, _api__orders_stats_commission_type__INTAKE_SORTING, _api__orders_stats_commission_type__RETURN_PROCESSING, _api__orders_stats_commission_type__ILLIQUID_GOODS_SALE } _api__orders_stats_commission_type__e;

char* orders_stats_commission_type_orders_stats_commission_type_ToString(_api__orders_stats_commission_type__e orders_stats_commission_type);

_api__orders_stats_commission_type__e orders_stats_commission_type_orders_stats_commission_type_FromString(char* orders_stats_commission_type);

//cJSON *orders_stats_commission_type_orders_stats_commission_type_convertToJSON(_api__orders_stats_commission_type__e orders_stats_commission_type);

//_api__orders_stats_commission_type__e orders_stats_commission_type_orders_stats_commission_type_parseFromJSON(cJSON *orders_stats_commission_typeJSON);

#endif /* _orders_stats_commission_type_H_ */

