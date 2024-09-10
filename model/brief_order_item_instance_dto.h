/*
 * brief_order_item_instance_dto.h
 *
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 */

#ifndef _brief_order_item_instance_dto_H_
#define _brief_order_item_instance_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brief_order_item_instance_dto_t brief_order_item_instance_dto_t;




typedef struct brief_order_item_instance_dto_t {
    char *cis; // string
    char *uin; // string
    char *rnpt; // string
    char *gtd; // string

} brief_order_item_instance_dto_t;

brief_order_item_instance_dto_t *brief_order_item_instance_dto_create(
    char *cis,
    char *uin,
    char *rnpt,
    char *gtd
);

void brief_order_item_instance_dto_free(brief_order_item_instance_dto_t *brief_order_item_instance_dto);

brief_order_item_instance_dto_t *brief_order_item_instance_dto_parseFromJSON(cJSON *brief_order_item_instance_dtoJSON);

cJSON *brief_order_item_instance_dto_convertToJSON(brief_order_item_instance_dto_t *brief_order_item_instance_dto);

#endif /* _brief_order_item_instance_dto_H_ */

