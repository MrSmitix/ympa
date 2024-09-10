/*
 * get_outlets_response.h
 *
 * Ответ на запрос информации о точках продаж.
 */

#ifndef _get_outlets_response_H_
#define _get_outlets_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_outlets_response_t get_outlets_response_t;

#include "flipping_pager_dto.h"
#include "full_outlet_dto.h"
#include "scrolling_pager_dto.h"



typedef struct get_outlets_response_t {
    list_t *outlets; //nonprimitive container
    struct scrolling_pager_dto_t *paging; //model
    struct flipping_pager_dto_t *pager; //model

} get_outlets_response_t;

get_outlets_response_t *get_outlets_response_create(
    list_t *outlets,
    scrolling_pager_dto_t *paging,
    flipping_pager_dto_t *pager
);

void get_outlets_response_free(get_outlets_response_t *get_outlets_response);

get_outlets_response_t *get_outlets_response_parseFromJSON(cJSON *get_outlets_responseJSON);

cJSON *get_outlets_response_convertToJSON(get_outlets_response_t *get_outlets_response);

#endif /* _get_outlets_response_H_ */

