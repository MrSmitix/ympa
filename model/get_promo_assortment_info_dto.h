/*
 * get_promo_assortment_info_dto.h
 *
 * Информация о товарах в акции.
 */

#ifndef _get_promo_assortment_info_dto_H_
#define _get_promo_assortment_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_assortment_info_dto_t get_promo_assortment_info_dto_t;




typedef struct get_promo_assortment_info_dto_t {
    int active_offers; //numeric
    int potential_offers; //numeric
    int processing; //boolean

} get_promo_assortment_info_dto_t;

get_promo_assortment_info_dto_t *get_promo_assortment_info_dto_create(
    int active_offers,
    int potential_offers,
    int processing
);

void get_promo_assortment_info_dto_free(get_promo_assortment_info_dto_t *get_promo_assortment_info_dto);

get_promo_assortment_info_dto_t *get_promo_assortment_info_dto_parseFromJSON(cJSON *get_promo_assortment_info_dtoJSON);

cJSON *get_promo_assortment_info_dto_convertToJSON(get_promo_assortment_info_dto_t *get_promo_assortment_info_dto);

#endif /* _get_promo_assortment_info_dto_H_ */

