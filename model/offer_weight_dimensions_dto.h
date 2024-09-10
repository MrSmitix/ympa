/*
 * offer_weight_dimensions_dto.h
 *
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */

#ifndef _offer_weight_dimensions_dto_H_
#define _offer_weight_dimensions_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_weight_dimensions_dto_t offer_weight_dimensions_dto_t;




typedef struct offer_weight_dimensions_dto_t {
    double length; //numeric
    double width; //numeric
    double height; //numeric
    double weight; //numeric

} offer_weight_dimensions_dto_t;

offer_weight_dimensions_dto_t *offer_weight_dimensions_dto_create(
    double length,
    double width,
    double height,
    double weight
);

void offer_weight_dimensions_dto_free(offer_weight_dimensions_dto_t *offer_weight_dimensions_dto);

offer_weight_dimensions_dto_t *offer_weight_dimensions_dto_parseFromJSON(cJSON *offer_weight_dimensions_dtoJSON);

cJSON *offer_weight_dimensions_dto_convertToJSON(offer_weight_dimensions_dto_t *offer_weight_dimensions_dto);

#endif /* _offer_weight_dimensions_dto_H_ */

