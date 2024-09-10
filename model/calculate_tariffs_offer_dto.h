/*
 * calculate_tariffs_offer_dto.h
 *
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */

#ifndef _calculate_tariffs_offer_dto_H_
#define _calculate_tariffs_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct calculate_tariffs_offer_dto_t calculate_tariffs_offer_dto_t;




typedef struct calculate_tariffs_offer_dto_t {
    long category_id; //numeric
    double price; //numeric
    double length; //numeric
    double width; //numeric
    double height; //numeric
    double weight; //numeric
    int quantity; //numeric

} calculate_tariffs_offer_dto_t;

calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto_create(
    long category_id,
    double price,
    double length,
    double width,
    double height,
    double weight,
    int quantity
);

void calculate_tariffs_offer_dto_free(calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto);

calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto_parseFromJSON(cJSON *calculate_tariffs_offer_dtoJSON);

cJSON *calculate_tariffs_offer_dto_convertToJSON(calculate_tariffs_offer_dto_t *calculate_tariffs_offer_dto);

#endif /* _calculate_tariffs_offer_dto_H_ */

