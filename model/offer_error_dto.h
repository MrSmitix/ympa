/*
 * offer_error_dto.h
 *
 * Сообщение об ошибке, связанной с размещением товара.
 */

#ifndef _offer_error_dto_H_
#define _offer_error_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_error_dto_t offer_error_dto_t;




typedef struct offer_error_dto_t {
    char *message; // string
    char *comment; // string

} offer_error_dto_t;

offer_error_dto_t *offer_error_dto_create(
    char *message,
    char *comment
);

void offer_error_dto_free(offer_error_dto_t *offer_error_dto);

offer_error_dto_t *offer_error_dto_parseFromJSON(cJSON *offer_error_dtoJSON);

cJSON *offer_error_dto_convertToJSON(offer_error_dto_t *offer_error_dto);

#endif /* _offer_error_dto_H_ */

