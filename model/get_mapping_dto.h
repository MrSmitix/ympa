/*
 * get_mapping_dto.h
 *
 * Информация о товарах в каталоге. 
 */

#ifndef _get_mapping_dto_H_
#define _get_mapping_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_mapping_dto_t get_mapping_dto_t;




typedef struct get_mapping_dto_t {
    long market_sku; //numeric
    char *market_sku_name; // string
    long market_model_id; //numeric
    char *market_model_name; // string
    long market_category_id; //numeric
    char *market_category_name; // string

} get_mapping_dto_t;

get_mapping_dto_t *get_mapping_dto_create(
    long market_sku,
    char *market_sku_name,
    long market_model_id,
    char *market_model_name,
    long market_category_id,
    char *market_category_name
);

void get_mapping_dto_free(get_mapping_dto_t *get_mapping_dto);

get_mapping_dto_t *get_mapping_dto_parseFromJSON(cJSON *get_mapping_dtoJSON);

cJSON *get_mapping_dto_convertToJSON(get_mapping_dto_t *get_mapping_dto);

#endif /* _get_mapping_dto_H_ */

