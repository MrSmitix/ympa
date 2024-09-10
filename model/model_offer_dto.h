/*
 * model_offer_dto.h
 *
 * Информация о предложении.
 */

#ifndef _model_offer_dto_H_
#define _model_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct model_offer_dto_t model_offer_dto_t;




typedef struct model_offer_dto_t {
    int discount; //numeric
    char *name; // string
    int pos; //numeric
    double pre_discount_price; //numeric
    double price; //numeric
    long region_id; //numeric
    double shipping_cost; //numeric
    char *shop_name; // string
    int shop_rating; //numeric
    int in_stock; //numeric

} model_offer_dto_t;

model_offer_dto_t *model_offer_dto_create(
    int discount,
    char *name,
    int pos,
    double pre_discount_price,
    double price,
    long region_id,
    double shipping_cost,
    char *shop_name,
    int shop_rating,
    int in_stock
);

void model_offer_dto_free(model_offer_dto_t *model_offer_dto);

model_offer_dto_t *model_offer_dto_parseFromJSON(cJSON *model_offer_dtoJSON);

cJSON *model_offer_dto_convertToJSON(model_offer_dto_t *model_offer_dto);

#endif /* _model_offer_dto_H_ */

