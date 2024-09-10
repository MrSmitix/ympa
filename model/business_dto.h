/*
 * business_dto.h
 *
 * Информация о кабинете.
 */

#ifndef _business_dto_H_
#define _business_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_dto_t business_dto_t;




typedef struct business_dto_t {
    long id; //numeric
    char *name; // string

} business_dto_t;

business_dto_t *business_dto_create(
    long id,
    char *name
);

void business_dto_free(business_dto_t *business_dto);

business_dto_t *business_dto_parseFromJSON(cJSON *business_dtoJSON);

cJSON *business_dto_convertToJSON(business_dto_t *business_dto);

#endif /* _business_dto_H_ */

