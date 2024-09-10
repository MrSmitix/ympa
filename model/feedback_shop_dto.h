/*
 * feedback_shop_dto.h
 *
 * Информация о магазине.
 */

#ifndef _feedback_shop_dto_H_
#define _feedback_shop_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_shop_dto_t feedback_shop_dto_t;




typedef struct feedback_shop_dto_t {
    char *name; // string

} feedback_shop_dto_t;

feedback_shop_dto_t *feedback_shop_dto_create(
    char *name
);

void feedback_shop_dto_free(feedback_shop_dto_t *feedback_shop_dto);

feedback_shop_dto_t *feedback_shop_dto_parseFromJSON(cJSON *feedback_shop_dtoJSON);

cJSON *feedback_shop_dto_convertToJSON(feedback_shop_dto_t *feedback_shop_dto);

#endif /* _feedback_shop_dto_H_ */

