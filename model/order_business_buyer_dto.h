/*
 * order_business_buyer_dto.h
 *
 * Информация о покупателе. 
 */

#ifndef _order_business_buyer_dto_H_
#define _order_business_buyer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_business_buyer_dto_t order_business_buyer_dto_t;




typedef struct order_business_buyer_dto_t {
    char *inn; // string
    char *kpp; // string
    char *organization_name; // string
    char *organization_jur_address; // string

} order_business_buyer_dto_t;

order_business_buyer_dto_t *order_business_buyer_dto_create(
    char *inn,
    char *kpp,
    char *organization_name,
    char *organization_jur_address
);

void order_business_buyer_dto_free(order_business_buyer_dto_t *order_business_buyer_dto);

order_business_buyer_dto_t *order_business_buyer_dto_parseFromJSON(cJSON *order_business_buyer_dtoJSON);

cJSON *order_business_buyer_dto_convertToJSON(order_business_buyer_dto_t *order_business_buyer_dto);

#endif /* _order_business_buyer_dto_H_ */

