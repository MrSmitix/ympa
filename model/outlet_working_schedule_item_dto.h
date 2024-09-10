/*
 * outlet_working_schedule_item_dto.h
 *
 * Расписание работы точки продаж.
 */

#ifndef _outlet_working_schedule_item_dto_H_
#define _outlet_working_schedule_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_working_schedule_item_dto_t outlet_working_schedule_item_dto_t;

#include "day_of_week_type.h"

// Enum  for outlet_working_schedule_item_dto

typedef enum  { _api__outlet_working_schedule_item_dto__NULL = 0, _api__outlet_working_schedule_item_dto__MONDAY, _api__outlet_working_schedule_item_dto__TUESDAY, _api__outlet_working_schedule_item_dto__WEDNESDAY, _api__outlet_working_schedule_item_dto__THURSDAY, _api__outlet_working_schedule_item_dto__FRIDAY, _api__outlet_working_schedule_item_dto__SATURDAY, _api__outlet_working_schedule_item_dto__SUNDAY } _api__outlet_working_schedule_item_dto__e;

char* outlet_working_schedule_item_dto_start_day_ToString(_api__outlet_working_schedule_item_dto__e start_day);

_api__outlet_working_schedule_item_dto__e outlet_working_schedule_item_dto_start_day_FromString(char* start_day);

// Enum  for outlet_working_schedule_item_dto

typedef enum  { _api__outlet_working_schedule_item_dto__NULL = 0, _api__outlet_working_schedule_item_dto__MONDAY, _api__outlet_working_schedule_item_dto__TUESDAY, _api__outlet_working_schedule_item_dto__WEDNESDAY, _api__outlet_working_schedule_item_dto__THURSDAY, _api__outlet_working_schedule_item_dto__FRIDAY, _api__outlet_working_schedule_item_dto__SATURDAY, _api__outlet_working_schedule_item_dto__SUNDAY } _api__outlet_working_schedule_item_dto__e;

char* outlet_working_schedule_item_dto_end_day_ToString(_api__outlet_working_schedule_item_dto__e end_day);

_api__outlet_working_schedule_item_dto__e outlet_working_schedule_item_dto_end_day_FromString(char* end_day);



typedef struct outlet_working_schedule_item_dto_t {
    day_of_week_type_t *start_day; // custom
    day_of_week_type_t *end_day; // custom
    char *start_time; // string
    char *end_time; // string

} outlet_working_schedule_item_dto_t;

outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto_create(
    day_of_week_type_t *start_day,
    day_of_week_type_t *end_day,
    char *start_time,
    char *end_time
);

void outlet_working_schedule_item_dto_free(outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto);

outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto_parseFromJSON(cJSON *outlet_working_schedule_item_dtoJSON);

cJSON *outlet_working_schedule_item_dto_convertToJSON(outlet_working_schedule_item_dto_t *outlet_working_schedule_item_dto);

#endif /* _outlet_working_schedule_item_dto_H_ */

