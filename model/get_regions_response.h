/*
 * get_regions_response.h
 *
 * 
 */

#ifndef _get_regions_response_H_
#define _get_regions_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_regions_response_t get_regions_response_t;

#include "forward_scrolling_pager_dto.h"
#include "region_dto.h"



typedef struct get_regions_response_t {
    list_t *regions; //nonprimitive container
    struct forward_scrolling_pager_dto_t *paging; //model

} get_regions_response_t;

get_regions_response_t *get_regions_response_create(
    list_t *regions,
    forward_scrolling_pager_dto_t *paging
);

void get_regions_response_free(get_regions_response_t *get_regions_response);

get_regions_response_t *get_regions_response_parseFromJSON(cJSON *get_regions_responseJSON);

cJSON *get_regions_response_convertToJSON(get_regions_response_t *get_regions_response);

#endif /* _get_regions_response_H_ */

