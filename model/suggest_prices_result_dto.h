/*
 * suggest_prices_result_dto.h
 *
 * Результат запроса цен для продвижения.
 */

#ifndef _suggest_prices_result_dto_H_
#define _suggest_prices_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct suggest_prices_result_dto_t suggest_prices_result_dto_t;

#include "price_suggest_offer_dto.h"



typedef struct suggest_prices_result_dto_t {
    list_t *offers; //nonprimitive container

} suggest_prices_result_dto_t;

suggest_prices_result_dto_t *suggest_prices_result_dto_create(
    list_t *offers
);

void suggest_prices_result_dto_free(suggest_prices_result_dto_t *suggest_prices_result_dto);

suggest_prices_result_dto_t *suggest_prices_result_dto_parseFromJSON(cJSON *suggest_prices_result_dtoJSON);

cJSON *suggest_prices_result_dto_convertToJSON(suggest_prices_result_dto_t *suggest_prices_result_dto);

#endif /* _suggest_prices_result_dto_H_ */

