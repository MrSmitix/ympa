/*
 * get_promo_constraints_dto.h
 *
 * Ограничения в акции.
 */

#ifndef _get_promo_constraints_dto_H_
#define _get_promo_constraints_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_constraints_dto_t get_promo_constraints_dto_t;




typedef struct get_promo_constraints_dto_t {
    list_t *warehouse_ids; //primitive container

} get_promo_constraints_dto_t;

get_promo_constraints_dto_t *get_promo_constraints_dto_create(
    list_t *warehouse_ids
);

void get_promo_constraints_dto_free(get_promo_constraints_dto_t *get_promo_constraints_dto);

get_promo_constraints_dto_t *get_promo_constraints_dto_parseFromJSON(cJSON *get_promo_constraints_dtoJSON);

cJSON *get_promo_constraints_dto_convertToJSON(get_promo_constraints_dto_t *get_promo_constraints_dto);

#endif /* _get_promo_constraints_dto_H_ */

