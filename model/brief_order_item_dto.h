/*
 * brief_order_item_dto.h
 *
 * Информация о маркированном товаре.
 */

#ifndef _brief_order_item_dto_H_
#define _brief_order_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brief_order_item_dto_t brief_order_item_dto_t;

#include "order_item_instance_dto.h"
#include "order_vat_type.h"

// Enum  for brief_order_item_dto

typedef enum  { _api__brief_order_item_dto__NULL = 0, _api__brief_order_item_dto__NO_VAT, _api__brief_order_item_dto__VAT_0, _api__brief_order_item_dto__VAT_10, _api__brief_order_item_dto__VAT_10_110, _api__brief_order_item_dto__VAT_20, _api__brief_order_item_dto__VAT_20_120, _api__brief_order_item_dto__VAT_18, _api__brief_order_item_dto__VAT_18_118, _api__brief_order_item_dto__UNKNOWN_VALUE } _api__brief_order_item_dto__e;

char* brief_order_item_dto_vat_ToString(_api__brief_order_item_dto__e vat);

_api__brief_order_item_dto__e brief_order_item_dto_vat_FromString(char* vat);



typedef struct brief_order_item_dto_t {
    long id; //numeric
    order_vat_type_t *vat; // custom
    int count; //numeric
    double price; //numeric
    char *offer_name; // string
    char *offer_id; // string
    list_t *instances; //nonprimitive container

} brief_order_item_dto_t;

brief_order_item_dto_t *brief_order_item_dto_create(
    long id,
    order_vat_type_t *vat,
    int count,
    double price,
    char *offer_name,
    char *offer_id,
    list_t *instances
);

void brief_order_item_dto_free(brief_order_item_dto_t *brief_order_item_dto);

brief_order_item_dto_t *brief_order_item_dto_parseFromJSON(cJSON *brief_order_item_dtoJSON);

cJSON *brief_order_item_dto_convertToJSON(brief_order_item_dto_t *brief_order_item_dto);

#endif /* _brief_order_item_dto_H_ */

