/*
 * warning_promo_offer_update_dto.h
 *
 * Описание предупреждения, которое появилось при добавлении товара.
 */

#ifndef _warning_promo_offer_update_dto_H_
#define _warning_promo_offer_update_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warning_promo_offer_update_dto_t warning_promo_offer_update_dto_t;

#include "promo_offer_update_warning_dto.h"



typedef struct warning_promo_offer_update_dto_t {
    char *offer_id; // string
    list_t *warnings; //nonprimitive container

} warning_promo_offer_update_dto_t;

warning_promo_offer_update_dto_t *warning_promo_offer_update_dto_create(
    char *offer_id,
    list_t *warnings
);

void warning_promo_offer_update_dto_free(warning_promo_offer_update_dto_t *warning_promo_offer_update_dto);

warning_promo_offer_update_dto_t *warning_promo_offer_update_dto_parseFromJSON(cJSON *warning_promo_offer_update_dtoJSON);

cJSON *warning_promo_offer_update_dto_convertToJSON(warning_promo_offer_update_dto_t *warning_promo_offer_update_dto);

#endif /* _warning_promo_offer_update_dto_H_ */

