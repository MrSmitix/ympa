/*
 * outlet_status_type.h
 *
 * Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
 */

#ifndef _outlet_status_type_H_
#define _outlet_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_status_type_t outlet_status_type_t;


// Enum  for outlet_status_type

typedef enum { _api__outlet_status_type__NULL = 0, _api__outlet_status_type__AT_MODERATION, _api__outlet_status_type__FAILED, _api__outlet_status_type__MODERATED, _api__outlet_status_type__NONMODERATED, _api__outlet_status_type__UNKNOWN } _api__outlet_status_type__e;

char* outlet_status_type_outlet_status_type_ToString(_api__outlet_status_type__e outlet_status_type);

_api__outlet_status_type__e outlet_status_type_outlet_status_type_FromString(char* outlet_status_type);

//cJSON *outlet_status_type_outlet_status_type_convertToJSON(_api__outlet_status_type__e outlet_status_type);

//_api__outlet_status_type__e outlet_status_type_outlet_status_type_parseFromJSON(cJSON *outlet_status_typeJSON);

#endif /* _outlet_status_type_H_ */

