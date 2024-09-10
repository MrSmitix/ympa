/*
 * order_item_instance_dto.h
 *
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */

#ifndef _order_item_instance_dto_H_
#define _order_item_instance_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_item_instance_dto_t order_item_instance_dto_t;




typedef struct order_item_instance_dto_t {
    char *cis; // string
    char *cis_full; // string
    char *uin; // string
    char *rnpt; // string
    char *gtd; // string

} order_item_instance_dto_t;

order_item_instance_dto_t *order_item_instance_dto_create(
    char *cis,
    char *cis_full,
    char *uin,
    char *rnpt,
    char *gtd
);

void order_item_instance_dto_free(order_item_instance_dto_t *order_item_instance_dto);

order_item_instance_dto_t *order_item_instance_dto_parseFromJSON(cJSON *order_item_instance_dtoJSON);

cJSON *order_item_instance_dto_convertToJSON(order_item_instance_dto_t *order_item_instance_dto);

#endif /* _order_item_instance_dto_H_ */

