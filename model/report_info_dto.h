/*
 * report_info_dto.h
 *
 * Статус генерации и ссылка на готовый отчет.
 */

#ifndef _report_info_dto_H_
#define _report_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct report_info_dto_t report_info_dto_t;

#include "report_status_type.h"
#include "report_sub_status_type.h"

// Enum  for report_info_dto

typedef enum  { _api__report_info_dto__NULL = 0, _api__report_info_dto__PENDING, _api__report_info_dto__PROCESSING, _api__report_info_dto__FAILED, _api__report_info_dto__DONE } _api__report_info_dto__e;

char* report_info_dto_status_ToString(_api__report_info_dto__e status);

_api__report_info_dto__e report_info_dto_status_FromString(char* status);

// Enum  for report_info_dto

typedef enum  { _api__report_info_dto__NULL = 0, _api__report_info_dto__NO_DATA, _api__report_info_dto__TOO_LARGE, _api__report_info_dto__RESOURCE_NOT_FOUND } _api__report_info_dto__e;

char* report_info_dto_sub_status_ToString(_api__report_info_dto__e sub_status);

_api__report_info_dto__e report_info_dto_sub_status_FromString(char* sub_status);



typedef struct report_info_dto_t {
    report_status_type_t *status; // custom
    report_sub_status_type_t *sub_status; // custom
    char *generation_requested_at; //date time
    char *generation_finished_at; //date time
    char *file; // string
    long estimated_generation_time; //numeric

} report_info_dto_t;

report_info_dto_t *report_info_dto_create(
    report_status_type_t *status,
    report_sub_status_type_t *sub_status,
    char *generation_requested_at,
    char *generation_finished_at,
    char *file,
    long estimated_generation_time
);

void report_info_dto_free(report_info_dto_t *report_info_dto);

report_info_dto_t *report_info_dto_parseFromJSON(cJSON *report_info_dtoJSON);

cJSON *report_info_dto_convertToJSON(report_info_dto_t *report_info_dto);

#endif /* _report_info_dto_H_ */

