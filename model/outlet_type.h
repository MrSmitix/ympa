/*
 * outlet_type.h
 *
 * Тип точки продаж.  Возможные значения:  * &#x60;DEPOT&#x60; — пункт выдачи заказов. * &#x60;MIXED&#x60; — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * &#x60;RETAIL&#x60; — розничная точка продаж (торговый зал). 
 */

#ifndef _outlet_type_H_
#define _outlet_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_type_t outlet_type_t;


// Enum  for outlet_type

typedef enum { _api__outlet_type__NULL = 0, _api__outlet_type__DEPOT, _api__outlet_type__MIXED, _api__outlet_type__RETAIL, _api__outlet_type__NOT_DEFINED } _api__outlet_type__e;

char* outlet_type_outlet_type_ToString(_api__outlet_type__e outlet_type);

_api__outlet_type__e outlet_type_outlet_type_FromString(char* outlet_type);

//cJSON *outlet_type_outlet_type_convertToJSON(_api__outlet_type__e outlet_type);

//_api__outlet_type__e outlet_type_outlet_type_parseFromJSON(cJSON *outlet_typeJSON);

#endif /* _outlet_type_H_ */

