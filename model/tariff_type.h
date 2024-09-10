/*
 * tariff_type.h
 *
 * Услуга Маркета или дополнительный тариф к услуге размещения:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;STORAGE&#x60; — хранение товара на складе Маркета в течение суток.  * &#x60;SURPLUS&#x60; — хранение излишков на складе Маркета.  * &#x60;WITHDRAW&#x60; — вывоз товара со склада Маркета.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;CROSSREGIONAL_DELIVERY_RETURN&#x60; — доставка невыкупов и возвратов.  * &#x60;DISPOSAL&#x60; — утилизация.  * &#x60;SORTING_CENTER_STORAGE&#x60; — хранение невыкупов и возвратов.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;FF_XDOC_SUPPLY_BOX&#x60; — поставка товара через транзитный склад (за короб).  * &#x60;FF_XDOC_SUPPLY_PALLET&#x60; — поставка товара через транзитный склад (за палету).  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  * &#x60;RETURN_PROCESSING&#x60; — обработка невыкупов и возвратов.  * &#x60;EXPRESS_CANCELLED_BY_PARTNER&#x60; — отмена заказа с экспресс-доставкой.  * &#x60;DELIVERY_TO_CUSTOMER_RETURN&#x60; — возврат доставляемого товара на склад.  * &#x60;CROSSBORDER_DELIVERY&#x60; — доставка из-за рубежа.  * &#x60;INTAKE_SORTING_BULKY_CARGO&#x60; — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_SMALL_GOODS&#x60; — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_DAILY&#x60; — организация забора заказов со склада продавца.  * &#x60;FF_STORAGE_BILLING&#x60; — хранения товаров на складе.  * &#x60;CANCELLED_ORDER_FEE_QI&#x60; — отмена заказа по вине продавца.  * &#x60;LATE_ORDER_EXECUTION_FEE_QI&#x60; — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */

#ifndef _tariff_type_H_
#define _tariff_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct tariff_type_t tariff_type_t;


// Enum  for tariff_type

typedef enum { _api__tariff_type__NULL = 0, _api__tariff_type__AGENCY_COMMISSION, _api__tariff_type__PAYMENT_TRANSFER, _api__tariff_type__STORAGE, _api__tariff_type__WITHDRAW, _api__tariff_type__SURPLUS, _api__tariff_type__FEE, _api__tariff_type__DELIVERY_TO_CUSTOMER, _api__tariff_type__CROSSREGIONAL_DELIVERY, _api__tariff_type__CROSSREGIONAL_DELIVERY_RETURN, _api__tariff_type__DISPOSAL, _api__tariff_type__SORTING_CENTER_STORAGE, _api__tariff_type__EXPRESS_DELIVERY, _api__tariff_type__FF_XDOC_SUPPLY_BOX, _api__tariff_type__FF_XDOC_SUPPLY_PALLET, _api__tariff_type__SORTING, _api__tariff_type__MIDDLE_MILE, _api__tariff_type__RETURN_PROCESSING, _api__tariff_type__EXPRESS_CANCELLED_BY_PARTNER, _api__tariff_type__DELIVERY_TO_CUSTOMER_RETURN, _api__tariff_type__CROSSBORDER_DELIVERY, _api__tariff_type__INTAKE_SORTING_BULKY_CARGO, _api__tariff_type__INTAKE_SORTING_SMALL_GOODS, _api__tariff_type__INTAKE_SORTING_DAILY, _api__tariff_type__FF_STORAGE_BILLING, _api__tariff_type__CANCELLED_ORDER_FEE_QI, _api__tariff_type__LATE_ORDER_EXECUTION_FEE_QI } _api__tariff_type__e;

char* tariff_type_tariff_type_ToString(_api__tariff_type__e tariff_type);

_api__tariff_type__e tariff_type_tariff_type_FromString(char* tariff_type);

//cJSON *tariff_type_tariff_type_convertToJSON(_api__tariff_type__e tariff_type);

//_api__tariff_type__e tariff_type_tariff_type_parseFromJSON(cJSON *tariff_typeJSON);

#endif /* _tariff_type_H_ */

