/*
 * get_promo_promocode_info_dto.h
 *
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 */

#ifndef _get_promo_promocode_info_dto_H_
#define _get_promo_promocode_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_promocode_info_dto_t get_promo_promocode_info_dto_t;




typedef struct get_promo_promocode_info_dto_t {
    char *promocode; // string
    int discount; //numeric

} get_promo_promocode_info_dto_t;

get_promo_promocode_info_dto_t *get_promo_promocode_info_dto_create(
    char *promocode,
    int discount
);

void get_promo_promocode_info_dto_free(get_promo_promocode_info_dto_t *get_promo_promocode_info_dto);

get_promo_promocode_info_dto_t *get_promo_promocode_info_dto_parseFromJSON(cJSON *get_promo_promocode_info_dtoJSON);

cJSON *get_promo_promocode_info_dto_convertToJSON(get_promo_promocode_info_dto_t *get_promo_promocode_info_dto);

#endif /* _get_promo_promocode_info_dto_H_ */

