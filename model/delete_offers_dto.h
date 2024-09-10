/*
 * delete_offers_dto.h
 *
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 */

#ifndef _delete_offers_dto_H_
#define _delete_offers_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_offers_dto_t delete_offers_dto_t;




typedef struct delete_offers_dto_t {
    list_t *not_deleted_offer_ids; //primitive container

} delete_offers_dto_t;

delete_offers_dto_t *delete_offers_dto_create(
    list_t *not_deleted_offer_ids
);

void delete_offers_dto_free(delete_offers_dto_t *delete_offers_dto);

delete_offers_dto_t *delete_offers_dto_parseFromJSON(cJSON *delete_offers_dtoJSON);

cJSON *delete_offers_dto_convertToJSON(delete_offers_dto_t *delete_offers_dto);

#endif /* _delete_offers_dto_H_ */

