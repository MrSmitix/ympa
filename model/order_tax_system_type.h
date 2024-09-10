/*
 * order_tax_system_type.h
 *
 * Система налогообложения (СНО) магазина на момент оформления заказа:  * &#x60;ECHN&#x60; — единый сельскохозяйственный налог (ЕСХН).  * &#x60;ENVD&#x60; — единый налог на вмененный доход (ЕНВД).  * &#x60;OSN&#x60; — общая система налогообложения (ОСН).  * &#x60;PSN&#x60; — патентная система налогообложения (ПСН).  * &#x60;USN&#x60; — упрощенная система налогообложения (УСН).  * &#x60;USN_MINUS_COST&#x60; — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * &#x60;NPD&#x60; — налог на профессиональный доход (НПД).  * &#x60;UNKNOWN_VALUE&#x60; — неизвестное значение. Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;. 
 */

#ifndef _order_tax_system_type_H_
#define _order_tax_system_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_tax_system_type_t order_tax_system_type_t;


// Enum  for order_tax_system_type

typedef enum { _api__order_tax_system_type__NULL = 0, _api__order_tax_system_type__OSN, _api__order_tax_system_type__USN, _api__order_tax_system_type__USN_MINUS_COST, _api__order_tax_system_type__ENVD, _api__order_tax_system_type__ECHN, _api__order_tax_system_type__PSN, _api__order_tax_system_type__NPD, _api__order_tax_system_type__UNKNOWN_VALUE } _api__order_tax_system_type__e;

char* order_tax_system_type_order_tax_system_type_ToString(_api__order_tax_system_type__e order_tax_system_type);

_api__order_tax_system_type__e order_tax_system_type_order_tax_system_type_FromString(char* order_tax_system_type);

//cJSON *order_tax_system_type_order_tax_system_type_convertToJSON(_api__order_tax_system_type__e order_tax_system_type);

//_api__order_tax_system_type__e order_tax_system_type_order_tax_system_type_parseFromJSON(cJSON *order_tax_system_typeJSON);

#endif /* _order_tax_system_type_H_ */

