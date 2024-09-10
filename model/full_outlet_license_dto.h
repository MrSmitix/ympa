/*
 * full_outlet_license_dto.h
 *
 * Информация о лицензии.
 */

#ifndef _full_outlet_license_dto_H_
#define _full_outlet_license_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct full_outlet_license_dto_t full_outlet_license_dto_t;

#include "license_check_status_type.h"
#include "license_type.h"

// Enum  for full_outlet_license_dto

typedef enum  { _api__full_outlet_license_dto__NULL = 0, _api__full_outlet_license_dto__ALCOHOL, _api__full_outlet_license_dto__UNKNOWN } _api__full_outlet_license_dto__e;

char* full_outlet_license_dto_license_type_ToString(_api__full_outlet_license_dto__e license_type);

_api__full_outlet_license_dto__e full_outlet_license_dto_license_type_FromString(char* license_type);

// Enum  for full_outlet_license_dto

typedef enum  { _api__full_outlet_license_dto__NULL = 0, _api__full_outlet_license_dto___NEW, _api__full_outlet_license_dto__SUCCESS, _api__full_outlet_license_dto__FAIL, _api__full_outlet_license_dto__REVOKE, _api__full_outlet_license_dto__DONT_WANT, _api__full_outlet_license_dto__FAIL_MANUAL } _api__full_outlet_license_dto__e;

char* full_outlet_license_dto_check_status_ToString(_api__full_outlet_license_dto__e check_status);

_api__full_outlet_license_dto__e full_outlet_license_dto_check_status_FromString(char* check_status);



typedef struct full_outlet_license_dto_t {
    long id; //numeric
    long outlet_id; //numeric
    license_type_t *license_type; // custom
    char *number; // string
    char *date_of_issue; //date time
    char *date_of_expiry; //date time
    license_check_status_type_t *check_status; // custom
    char *check_comment; // string

} full_outlet_license_dto_t;

full_outlet_license_dto_t *full_outlet_license_dto_create(
    long id,
    long outlet_id,
    license_type_t *license_type,
    char *number,
    char *date_of_issue,
    char *date_of_expiry,
    license_check_status_type_t *check_status,
    char *check_comment
);

void full_outlet_license_dto_free(full_outlet_license_dto_t *full_outlet_license_dto);

full_outlet_license_dto_t *full_outlet_license_dto_parseFromJSON(cJSON *full_outlet_license_dtoJSON);

cJSON *full_outlet_license_dto_convertToJSON(full_outlet_license_dto_t *full_outlet_license_dto);

#endif /* _full_outlet_license_dto_H_ */

