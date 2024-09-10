/*
 * change_outlet_request.h
 *
 * 
 */

#ifndef _change_outlet_request_H_
#define _change_outlet_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct change_outlet_request_t change_outlet_request_t;

#include "outlet_address_dto.h"
#include "outlet_delivery_rule_dto.h"
#include "outlet_type.h"
#include "outlet_visibility_type.h"
#include "outlet_working_schedule_dto.h"

// Enum  for change_outlet_request

typedef enum  { _api__change_outlet_request__NULL = 0, _api__change_outlet_request__DEPOT, _api__change_outlet_request__MIXED, _api__change_outlet_request__RETAIL, _api__change_outlet_request__NOT_DEFINED } _api__change_outlet_request__e;

char* change_outlet_request_type_ToString(_api__change_outlet_request__e type);

_api__change_outlet_request__e change_outlet_request_type_FromString(char* type);

// Enum  for change_outlet_request

typedef enum  { _api__change_outlet_request__NULL = 0, _api__change_outlet_request__HIDDEN, _api__change_outlet_request__VISIBLE, _api__change_outlet_request__UNKNOWN } _api__change_outlet_request__e;

char* change_outlet_request_visibility_ToString(_api__change_outlet_request__e visibility);

_api__change_outlet_request__e change_outlet_request_visibility_FromString(char* visibility);



typedef struct change_outlet_request_t {
    char *name; // string
    outlet_type_t *type; // custom
    char *coords; // string
    int is_main; //boolean
    char *shop_outlet_code; // string
    outlet_visibility_type_t *visibility; // custom
    struct outlet_address_dto_t *address; //model
    list_t *phones; //primitive container
    struct outlet_working_schedule_dto_t *working_schedule; //model
    list_t *delivery_rules; //nonprimitive container
    long storage_period; //numeric

} change_outlet_request_t;

change_outlet_request_t *change_outlet_request_create(
    char *name,
    outlet_type_t *type,
    char *coords,
    int is_main,
    char *shop_outlet_code,
    outlet_visibility_type_t *visibility,
    outlet_address_dto_t *address,
    list_t *phones,
    outlet_working_schedule_dto_t *working_schedule,
    list_t *delivery_rules,
    long storage_period
);

void change_outlet_request_free(change_outlet_request_t *change_outlet_request);

change_outlet_request_t *change_outlet_request_parseFromJSON(cJSON *change_outlet_requestJSON);

cJSON *change_outlet_request_convertToJSON(change_outlet_request_t *change_outlet_request);

#endif /* _change_outlet_request_H_ */

