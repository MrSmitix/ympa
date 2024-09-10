/*
 * get_promos_result_dto.h
 *
 * Информация об акциях Маркета.
 */

#ifndef _get_promos_result_dto_H_
#define _get_promos_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promos_result_dto_t get_promos_result_dto_t;

#include "get_promo_dto.h"



typedef struct get_promos_result_dto_t {
    list_t *promos; //nonprimitive container

} get_promos_result_dto_t;

get_promos_result_dto_t *get_promos_result_dto_create(
    list_t *promos
);

void get_promos_result_dto_free(get_promos_result_dto_t *get_promos_result_dto);

get_promos_result_dto_t *get_promos_result_dto_parseFromJSON(cJSON *get_promos_result_dtoJSON);

cJSON *get_promos_result_dto_convertToJSON(get_promos_result_dto_t *get_promos_result_dto);

#endif /* _get_promos_result_dto_H_ */

