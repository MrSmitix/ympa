/*
 * order_buyer_basic_info_dto.h
 *
 * Информация о покупателе с базовыми полями.
 */

#ifndef _order_buyer_basic_info_dto_H_
#define _order_buyer_basic_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_buyer_basic_info_dto_t order_buyer_basic_info_dto_t;

#include "order_buyer_type.h"

// Enum  for order_buyer_basic_info_dto

typedef enum  { _api__order_buyer_basic_info_dto__NULL = 0, _api__order_buyer_basic_info_dto__PERSON, _api__order_buyer_basic_info_dto__BUSINESS } _api__order_buyer_basic_info_dto__e;

char* order_buyer_basic_info_dto_type_ToString(_api__order_buyer_basic_info_dto__e type);

_api__order_buyer_basic_info_dto__e order_buyer_basic_info_dto_type_FromString(char* type);



typedef struct order_buyer_basic_info_dto_t {
    char *id; // string
    char *last_name; // string
    char *first_name; // string
    char *middle_name; // string
    order_buyer_type_t *type; // custom

} order_buyer_basic_info_dto_t;

order_buyer_basic_info_dto_t *order_buyer_basic_info_dto_create(
    char *id,
    char *last_name,
    char *first_name,
    char *middle_name,
    order_buyer_type_t *type
);

void order_buyer_basic_info_dto_free(order_buyer_basic_info_dto_t *order_buyer_basic_info_dto);

order_buyer_basic_info_dto_t *order_buyer_basic_info_dto_parseFromJSON(cJSON *order_buyer_basic_info_dtoJSON);

cJSON *order_buyer_basic_info_dto_convertToJSON(order_buyer_basic_info_dto_t *order_buyer_basic_info_dto);

#endif /* _order_buyer_basic_info_dto_H_ */

