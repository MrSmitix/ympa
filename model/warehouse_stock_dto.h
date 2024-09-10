/*
 * warehouse_stock_dto.h
 *
 * Информация об остатках товара.
 */

#ifndef _warehouse_stock_dto_H_
#define _warehouse_stock_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouse_stock_dto_t warehouse_stock_dto_t;

#include "warehouse_stock_type.h"

// Enum  for warehouse_stock_dto

typedef enum  { _api__warehouse_stock_dto__NULL = 0, _api__warehouse_stock_dto__FIT, _api__warehouse_stock_dto__FREEZE, _api__warehouse_stock_dto__AVAILABLE, _api__warehouse_stock_dto__QUARANTINE, _api__warehouse_stock_dto__UTILIZATION, _api__warehouse_stock_dto__DEFECT, _api__warehouse_stock_dto__EXPIRED } _api__warehouse_stock_dto__e;

char* warehouse_stock_dto_type_ToString(_api__warehouse_stock_dto__e type);

_api__warehouse_stock_dto__e warehouse_stock_dto_type_FromString(char* type);



typedef struct warehouse_stock_dto_t {
    warehouse_stock_type_t *type; // custom
    long count; //numeric

} warehouse_stock_dto_t;

warehouse_stock_dto_t *warehouse_stock_dto_create(
    warehouse_stock_type_t *type,
    long count
);

void warehouse_stock_dto_free(warehouse_stock_dto_t *warehouse_stock_dto);

warehouse_stock_dto_t *warehouse_stock_dto_parseFromJSON(cJSON *warehouse_stock_dtoJSON);

cJSON *warehouse_stock_dto_convertToJSON(warehouse_stock_dto_t *warehouse_stock_dto);

#endif /* _warehouse_stock_dto_H_ */

