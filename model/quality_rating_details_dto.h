/*
 * quality_rating_details_dto.h
 *
 * Информация о заказах, которые повлияли на индекс качества.
 */

#ifndef _quality_rating_details_dto_H_
#define _quality_rating_details_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quality_rating_details_dto_t quality_rating_details_dto_t;

#include "quality_rating_affected_order_dto.h"



typedef struct quality_rating_details_dto_t {
    list_t *affected_orders; //nonprimitive container

} quality_rating_details_dto_t;

quality_rating_details_dto_t *quality_rating_details_dto_create(
    list_t *affected_orders
);

void quality_rating_details_dto_free(quality_rating_details_dto_t *quality_rating_details_dto);

quality_rating_details_dto_t *quality_rating_details_dto_parseFromJSON(cJSON *quality_rating_details_dtoJSON);

cJSON *quality_rating_details_dto_convertToJSON(quality_rating_details_dto_t *quality_rating_details_dto);

#endif /* _quality_rating_details_dto_H_ */

