/*
 * update_offer_mapping_result_dto.h
 *
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */

#ifndef _update_offer_mapping_result_dto_H_
#define _update_offer_mapping_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_offer_mapping_result_dto_t update_offer_mapping_result_dto_t;

#include "offer_mapping_error_dto.h"



typedef struct update_offer_mapping_result_dto_t {
    char *offer_id; // string
    list_t *errors; //nonprimitive container
    list_t *warnings; //nonprimitive container

} update_offer_mapping_result_dto_t;

update_offer_mapping_result_dto_t *update_offer_mapping_result_dto_create(
    char *offer_id,
    list_t *errors,
    list_t *warnings
);

void update_offer_mapping_result_dto_free(update_offer_mapping_result_dto_t *update_offer_mapping_result_dto);

update_offer_mapping_result_dto_t *update_offer_mapping_result_dto_parseFromJSON(cJSON *update_offer_mapping_result_dtoJSON);

cJSON *update_offer_mapping_result_dto_convertToJSON(update_offer_mapping_result_dto_t *update_offer_mapping_result_dto);

#endif /* _update_offer_mapping_result_dto_H_ */

