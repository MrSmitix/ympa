/*
 * calculated_tariff_type.h
 *
 * Услуга Маркета:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */

#ifndef _calculated_tariff_type_H_
#define _calculated_tariff_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculated_tariff_type_t calculated_tariff_type_t;


// Enum  for calculated_tariff_type

typedef enum { _api__calculated_tariff_type__NULL = 0, _api__calculated_tariff_type__AGENCY_COMMISSION, _api__calculated_tariff_type__PAYMENT_TRANSFER, _api__calculated_tariff_type__FEE, _api__calculated_tariff_type__DELIVERY_TO_CUSTOMER, _api__calculated_tariff_type__CROSSREGIONAL_DELIVERY, _api__calculated_tariff_type__EXPRESS_DELIVERY, _api__calculated_tariff_type__SORTING, _api__calculated_tariff_type__MIDDLE_MILE } _api__calculated_tariff_type__e;

char* calculated_tariff_type_calculated_tariff_type_ToString(_api__calculated_tariff_type__e calculated_tariff_type);

_api__calculated_tariff_type__e calculated_tariff_type_calculated_tariff_type_FromString(char* calculated_tariff_type);

//cJSON *calculated_tariff_type_calculated_tariff_type_convertToJSON(_api__calculated_tariff_type__e calculated_tariff_type);

//_api__calculated_tariff_type__e calculated_tariff_type_calculated_tariff_type_parseFromJSON(cJSON *calculated_tariff_typeJSON);

#endif /* _calculated_tariff_type_H_ */

