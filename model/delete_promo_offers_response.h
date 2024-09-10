/*
 * delete_promo_offers_response.h
 *
 * Результат удаления товаров из акции.
 */

#ifndef _delete_promo_offers_response_H_
#define _delete_promo_offers_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_promo_offers_response_t delete_promo_offers_response_t;

#include "api_response_status_type.h"
#include "delete_promo_offers_result_dto.h"

// Enum  for delete_promo_offers_response

typedef enum  { _api__delete_promo_offers_response__NULL = 0, _api__delete_promo_offers_response__OK, _api__delete_promo_offers_response__ERROR } _api__delete_promo_offers_response__e;

char* delete_promo_offers_response_status_ToString(_api__delete_promo_offers_response__e status);

_api__delete_promo_offers_response__e delete_promo_offers_response_status_FromString(char* status);



typedef struct delete_promo_offers_response_t {
    api_response_status_type_t *status; // custom
    struct delete_promo_offers_result_dto_t *result; //model

} delete_promo_offers_response_t;

delete_promo_offers_response_t *delete_promo_offers_response_create(
    api_response_status_type_t *status,
    delete_promo_offers_result_dto_t *result
);

void delete_promo_offers_response_free(delete_promo_offers_response_t *delete_promo_offers_response);

delete_promo_offers_response_t *delete_promo_offers_response_parseFromJSON(cJSON *delete_promo_offers_responseJSON);

cJSON *delete_promo_offers_response_convertToJSON(delete_promo_offers_response_t *delete_promo_offers_response);

#endif /* _delete_promo_offers_response_H_ */

