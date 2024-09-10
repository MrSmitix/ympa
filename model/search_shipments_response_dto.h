/*
 * search_shipments_response_dto.h
 *
 * Информация об отгрузках.
 */

#ifndef _search_shipments_response_dto_H_
#define _search_shipments_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct search_shipments_response_dto_t search_shipments_response_dto_t;

#include "forward_scrolling_pager_dto.h"
#include "shipment_info_dto.h"



typedef struct search_shipments_response_dto_t {
    list_t *shipments; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} search_shipments_response_dto_t;

search_shipments_response_dto_t *search_shipments_response_dto_create(
    list_t *shipments,
    forward_scrolling_pager_dto_t *paging
);

void search_shipments_response_dto_free(search_shipments_response_dto_t *search_shipments_response_dto);

search_shipments_response_dto_t *search_shipments_response_dto_parseFromJSON(cJSON *search_shipments_response_dtoJSON);

cJSON *search_shipments_response_dto_convertToJSON(search_shipments_response_dto_t *search_shipments_response_dto);

#endif /* _search_shipments_response_dto_H_ */

