/*
 * outlet_license_dto.h
 *
 * Информация о лицензии.
 */

#ifndef _outlet_license_dto_H_
#define _outlet_license_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_license_dto_t outlet_license_dto_t;

#include "license_type.h"

// Enum  for outlet_license_dto

typedef enum  { _api__outlet_license_dto__NULL = 0, _api__outlet_license_dto__ALCOHOL, _api__outlet_license_dto__UNKNOWN } _api__outlet_license_dto__e;

char* outlet_license_dto_license_type_ToString(_api__outlet_license_dto__e license_type);

_api__outlet_license_dto__e outlet_license_dto_license_type_FromString(char* license_type);



typedef struct outlet_license_dto_t {
    long id; //numeric
    long outlet_id; //numeric
    license_type_t *license_type; // custom
    char *number; // string
    char *date_of_issue; //date time
    char *date_of_expiry; //date time

} outlet_license_dto_t;

outlet_license_dto_t *outlet_license_dto_create(
    long id,
    long outlet_id,
    license_type_t *license_type,
    char *number,
    char *date_of_issue,
    char *date_of_expiry
);

void outlet_license_dto_free(outlet_license_dto_t *outlet_license_dto);

outlet_license_dto_t *outlet_license_dto_parseFromJSON(cJSON *outlet_license_dtoJSON);

cJSON *outlet_license_dto_convertToJSON(outlet_license_dto_t *outlet_license_dto);

#endif /* _outlet_license_dto_H_ */

