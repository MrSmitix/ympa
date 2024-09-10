/*
 * hidden_offer_dto.h
 *
 * Информация о скрытии.
 */

#ifndef _hidden_offer_dto_H_
#define _hidden_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct hidden_offer_dto_t hidden_offer_dto_t;




typedef struct hidden_offer_dto_t {
    char *offer_id; // string

} hidden_offer_dto_t;

hidden_offer_dto_t *hidden_offer_dto_create(
    char *offer_id
);

void hidden_offer_dto_free(hidden_offer_dto_t *hidden_offer_dto);

hidden_offer_dto_t *hidden_offer_dto_parseFromJSON(cJSON *hidden_offer_dtoJSON);

cJSON *hidden_offer_dto_convertToJSON(hidden_offer_dto_t *hidden_offer_dto);

#endif /* _hidden_offer_dto_H_ */

