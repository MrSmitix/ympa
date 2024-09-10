/*
 * update_mapping_dto.h
 *
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 */

#ifndef _update_mapping_dto_H_
#define _update_mapping_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_mapping_dto_t update_mapping_dto_t;




typedef struct update_mapping_dto_t {
    long market_sku; //numeric

} update_mapping_dto_t;

update_mapping_dto_t *update_mapping_dto_create(
    long market_sku
);

void update_mapping_dto_free(update_mapping_dto_t *update_mapping_dto);

update_mapping_dto_t *update_mapping_dto_parseFromJSON(cJSON *update_mapping_dtoJSON);

cJSON *update_mapping_dto_convertToJSON(update_mapping_dto_t *update_mapping_dto);

#endif /* _update_mapping_dto_H_ */

