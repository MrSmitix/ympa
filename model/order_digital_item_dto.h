/*
 * order_digital_item_dto.h
 *
 * Ключ цифрового товара.
 */

#ifndef _order_digital_item_dto_H_
#define _order_digital_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_digital_item_dto_t order_digital_item_dto_t;




typedef struct order_digital_item_dto_t {
    long id; //numeric
    char *code; // string
    char *slip; // string
    char *activate_till; //date

} order_digital_item_dto_t;

order_digital_item_dto_t *order_digital_item_dto_create(
    long id,
    char *code,
    char *slip,
    char *activate_till
);

void order_digital_item_dto_free(order_digital_item_dto_t *order_digital_item_dto);

order_digital_item_dto_t *order_digital_item_dto_parseFromJSON(cJSON *order_digital_item_dtoJSON);

cJSON *order_digital_item_dto_convertToJSON(order_digital_item_dto_t *order_digital_item_dto);

#endif /* _order_digital_item_dto_H_ */

