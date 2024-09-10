/*
 * full_outlet_dto.h
 *
 * Информация о точке продаж.
 */

#ifndef _full_outlet_dto_H_
#define _full_outlet_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct full_outlet_dto_t full_outlet_dto_t;

#include "outlet_address_dto.h"
#include "outlet_delivery_rule_dto.h"
#include "outlet_status_type.h"
#include "outlet_type.h"
#include "outlet_visibility_type.h"
#include "outlet_working_schedule_dto.h"
#include "region_dto.h"

// Enum  for full_outlet_dto

typedef enum  { _api__full_outlet_dto__NULL = 0, _api__full_outlet_dto__DEPOT, _api__full_outlet_dto__MIXED, _api__full_outlet_dto__RETAIL, _api__full_outlet_dto__NOT_DEFINED } _api__full_outlet_dto__e;

char* full_outlet_dto_type_ToString(_api__full_outlet_dto__e type);

_api__full_outlet_dto__e full_outlet_dto_type_FromString(char* type);

// Enum  for full_outlet_dto

typedef enum  { _api__full_outlet_dto__NULL = 0, _api__full_outlet_dto__HIDDEN, _api__full_outlet_dto__VISIBLE, _api__full_outlet_dto__UNKNOWN } _api__full_outlet_dto__e;

char* full_outlet_dto_visibility_ToString(_api__full_outlet_dto__e visibility);

_api__full_outlet_dto__e full_outlet_dto_visibility_FromString(char* visibility);

// Enum  for full_outlet_dto

typedef enum  { _api__full_outlet_dto__NULL = 0, _api__full_outlet_dto__AT_MODERATION, _api__full_outlet_dto__FAILED, _api__full_outlet_dto__MODERATED, _api__full_outlet_dto__NONMODERATED, _api__full_outlet_dto__UNKNOWN } _api__full_outlet_dto__e;

char* full_outlet_dto_status_ToString(_api__full_outlet_dto__e status);

_api__full_outlet_dto__e full_outlet_dto_status_FromString(char* status);



typedef struct full_outlet_dto_t {
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
    long id; //numeric
    outlet_status_type_t *status; // custom
    struct region_dto_t *region; //model
    char *shop_outlet_id; // string
    char *working_time; // string
    char *moderation_reason; // string

} full_outlet_dto_t;

full_outlet_dto_t *full_outlet_dto_create(
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
    long storage_period,
    long id,
    outlet_status_type_t *status,
    region_dto_t *region,
    char *shop_outlet_id,
    char *working_time,
    char *moderation_reason
);

void full_outlet_dto_free(full_outlet_dto_t *full_outlet_dto);

full_outlet_dto_t *full_outlet_dto_parseFromJSON(cJSON *full_outlet_dtoJSON);

cJSON *full_outlet_dto_convertToJSON(full_outlet_dto_t *full_outlet_dto);

#endif /* _full_outlet_dto_H_ */

