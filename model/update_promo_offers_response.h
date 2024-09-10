/*
 * update_promo_offers_response.h
 *
 * Результат добавления товаров в акцию.
 */

#ifndef _update_promo_offers_response_H_
#define _update_promo_offers_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_promo_offers_response_t update_promo_offers_response_t;

#include "api_response_status_type.h"
#include "update_promo_offers_result_dto.h"

// Enum  for update_promo_offers_response

typedef enum  { _api__update_promo_offers_response__NULL = 0, _api__update_promo_offers_response__OK, _api__update_promo_offers_response__ERROR } _api__update_promo_offers_response__e;

char* update_promo_offers_response_status_ToString(_api__update_promo_offers_response__e status);

_api__update_promo_offers_response__e update_promo_offers_response_status_FromString(char* status);



typedef struct update_promo_offers_response_t {
    api_response_status_type_t *status; // custom
    struct update_promo_offers_result_dto_t *result; //model

} update_promo_offers_response_t;

update_promo_offers_response_t *update_promo_offers_response_create(
    api_response_status_type_t *status,
    update_promo_offers_result_dto_t *result
);

void update_promo_offers_response_free(update_promo_offers_response_t *update_promo_offers_response);

update_promo_offers_response_t *update_promo_offers_response_parseFromJSON(cJSON *update_promo_offers_responseJSON);

cJSON *update_promo_offers_response_convertToJSON(update_promo_offers_response_t *update_promo_offers_response);

#endif /* _update_promo_offers_response_H_ */

