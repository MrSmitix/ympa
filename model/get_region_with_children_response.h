/*
 * get_region_with_children_response.h
 *
 * 
 */

#ifndef _get_region_with_children_response_H_
#define _get_region_with_children_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_region_with_children_response_t get_region_with_children_response_t;

#include "flipping_pager_dto.h"
#include "region_dto.h"



typedef struct get_region_with_children_response_t {
    struct flipping_pager_dto_t *pager; //model
    struct region_dto_t *regions; //model

} get_region_with_children_response_t;

get_region_with_children_response_t *get_region_with_children_response_create(
    flipping_pager_dto_t *pager,
    region_dto_t *regions
);

void get_region_with_children_response_free(get_region_with_children_response_t *get_region_with_children_response);

get_region_with_children_response_t *get_region_with_children_response_parseFromJSON(cJSON *get_region_with_children_responseJSON);

cJSON *get_region_with_children_response_convertToJSON(get_region_with_children_response_t *get_region_with_children_response);

#endif /* _get_region_with_children_response_H_ */

