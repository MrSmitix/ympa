/*
 * suggest_prices_response.h
 *
 * Ответ на запрос списка цен для продвижения.
 */

#ifndef _suggest_prices_response_H_
#define _suggest_prices_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct suggest_prices_response_t suggest_prices_response_t;

#include "api_response_status_type.h"
#include "suggest_prices_result_dto.h"

// Enum  for suggest_prices_response

typedef enum  { _api__suggest_prices_response__NULL = 0, _api__suggest_prices_response__OK, _api__suggest_prices_response__ERROR } _api__suggest_prices_response__e;

char* suggest_prices_response_status_ToString(_api__suggest_prices_response__e status);

_api__suggest_prices_response__e suggest_prices_response_status_FromString(char* status);



typedef struct suggest_prices_response_t {
    api_response_status_type_t *status; // custom
    struct suggest_prices_result_dto_t *result; //model

} suggest_prices_response_t;

suggest_prices_response_t *suggest_prices_response_create(
    api_response_status_type_t *status,
    suggest_prices_result_dto_t *result
);

void suggest_prices_response_free(suggest_prices_response_t *suggest_prices_response);

suggest_prices_response_t *suggest_prices_response_parseFromJSON(cJSON *suggest_prices_responseJSON);

cJSON *suggest_prices_response_convertToJSON(suggest_prices_response_t *suggest_prices_response);

#endif /* _suggest_prices_response_H_ */

