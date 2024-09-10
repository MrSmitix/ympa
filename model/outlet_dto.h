/*
 * outlet_dto.h
 *
 * Информация о точке продаж.
 */

#ifndef _outlet_dto_H_
#define _outlet_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_dto_t outlet_dto_t;

#include "outlet_address_dto.h"
#include "outlet_delivery_rule_dto.h"
#include "outlet_type.h"
#include "outlet_visibility_type.h"
#include "outlet_working_schedule_dto.h"

// Enum  for outlet_dto

typedef enum  { _api__outlet_dto__NULL = 0, _api__outlet_dto__DEPOT, _api__outlet_dto__MIXED, _api__outlet_dto__RETAIL, _api__outlet_dto__NOT_DEFINED } _api__outlet_dto__e;

char* outlet_dto_type_ToString(_api__outlet_dto__e type);

_api__outlet_dto__e outlet_dto_type_FromString(char* type);

// Enum  for outlet_dto

typedef enum  { _api__outlet_dto__NULL = 0, _api__outlet_dto__HIDDEN, _api__outlet_dto__VISIBLE, _api__outlet_dto__UNKNOWN } _api__outlet_dto__e;

char* outlet_dto_visibility_ToString(_api__outlet_dto__e visibility);

_api__outlet_dto__e outlet_dto_visibility_FromString(char* visibility);



typedef struct outlet_dto_t {
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

} outlet_dto_t;

outlet_dto_t *outlet_dto_create(
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

void outlet_dto_free(outlet_dto_t *outlet_dto);

outlet_dto_t *outlet_dto_parseFromJSON(cJSON *outlet_dtoJSON);

cJSON *outlet_dto_convertToJSON(outlet_dto_t *outlet_dto);

#endif /* _outlet_dto_H_ */

