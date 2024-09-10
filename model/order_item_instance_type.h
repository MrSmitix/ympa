/*
 * order_item_instance_type.h
 *
 * Вид маркировки товара:  * &#x60;CIS&#x60; — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * &#x60;UIN&#x60; — УИН, уникальный идентификационный номер.  * &#x60;RNPT&#x60; — РНПТ, регистрационный номер партии товара.  * &#x60;GTD&#x60; — номер ГТД, грузовой таможенной декларации. 
 */

#ifndef _order_item_instance_type_H_
#define _order_item_instance_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_item_instance_type_t order_item_instance_type_t;


// Enum  for order_item_instance_type

typedef enum { _api__order_item_instance_type__NULL = 0, _api__order_item_instance_type__CIS, _api__order_item_instance_type__UIN, _api__order_item_instance_type__RNPT, _api__order_item_instance_type__GTD } _api__order_item_instance_type__e;

char* order_item_instance_type_order_item_instance_type_ToString(_api__order_item_instance_type__e order_item_instance_type);

_api__order_item_instance_type__e order_item_instance_type_order_item_instance_type_FromString(char* order_item_instance_type);

//cJSON *order_item_instance_type_order_item_instance_type_convertToJSON(_api__order_item_instance_type__e order_item_instance_type);

//_api__order_item_instance_type__e order_item_instance_type_order_item_instance_type_parseFromJSON(cJSON *order_item_instance_typeJSON);

#endif /* _order_item_instance_type_H_ */

