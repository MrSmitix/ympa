/*
 * outlet_visibility_type.h
 *
 * Состояние точки продаж.  Возможные значения:  * &#x60;HIDDEN&#x60; — точка продаж выключена. * &#x60;VISIBLE&#x60; — точка продаж включена. 
 */

#ifndef _outlet_visibility_type_H_
#define _outlet_visibility_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_visibility_type_t outlet_visibility_type_t;


// Enum  for outlet_visibility_type

typedef enum { _api__outlet_visibility_type__NULL = 0, _api__outlet_visibility_type__HIDDEN, _api__outlet_visibility_type__VISIBLE, _api__outlet_visibility_type__UNKNOWN } _api__outlet_visibility_type__e;

char* outlet_visibility_type_outlet_visibility_type_ToString(_api__outlet_visibility_type__e outlet_visibility_type);

_api__outlet_visibility_type__e outlet_visibility_type_outlet_visibility_type_FromString(char* outlet_visibility_type);

//cJSON *outlet_visibility_type_outlet_visibility_type_convertToJSON(_api__outlet_visibility_type__e outlet_visibility_type);

//_api__outlet_visibility_type__e outlet_visibility_type_outlet_visibility_type_parseFromJSON(cJSON *outlet_visibility_typeJSON);

#endif /* _outlet_visibility_type_H_ */

