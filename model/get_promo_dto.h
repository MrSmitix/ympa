/*
 * get_promo_dto.h
 *
 * Информация об акции.
 */

#ifndef _get_promo_dto_H_
#define _get_promo_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_dto_t get_promo_dto_t;

#include "channel_type.h"
#include "get_promo_assortment_info_dto.h"
#include "get_promo_bestseller_info_dto.h"
#include "get_promo_constraints_dto.h"
#include "get_promo_mechanics_info_dto.h"
#include "promo_period_dto.h"



typedef struct get_promo_dto_t {
    char *id; // string
    char *name; // string
    struct promo_period_dto_t *period; //model
    int participating; //boolean
    struct get_promo_assortment_info_dto_t *assortment_info; //model
    struct get_promo_mechanics_info_dto_t *mechanics_info; //model
    struct get_promo_bestseller_info_dto_t *bestseller_info; //model
    list_t *channels; //nonprimitive container
    struct get_promo_constraints_dto_t *constraints; //model

} get_promo_dto_t;

get_promo_dto_t *get_promo_dto_create(
    char *id,
    char *name,
    promo_period_dto_t *period,
    int participating,
    get_promo_assortment_info_dto_t *assortment_info,
    get_promo_mechanics_info_dto_t *mechanics_info,
    get_promo_bestseller_info_dto_t *bestseller_info,
    list_t *channels,
    get_promo_constraints_dto_t *constraints
);

void get_promo_dto_free(get_promo_dto_t *get_promo_dto);

get_promo_dto_t *get_promo_dto_parseFromJSON(cJSON *get_promo_dtoJSON);

cJSON *get_promo_dto_convertToJSON(get_promo_dto_t *get_promo_dto);

#endif /* _get_promo_dto_H_ */

