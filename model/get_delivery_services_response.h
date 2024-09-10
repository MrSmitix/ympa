/*
 * get_delivery_services_response.h
 *
 * Ответ на запрос списка служб доставки.
 */

#ifndef _get_delivery_services_response_H_
#define _get_delivery_services_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_delivery_services_response_t get_delivery_services_response_t;

#include "delivery_services_dto.h"



typedef struct get_delivery_services_response_t {
    struct delivery_services_dto_t *result; //model

} get_delivery_services_response_t;

get_delivery_services_response_t *get_delivery_services_response_create(
    delivery_services_dto_t *result
);

void get_delivery_services_response_free(get_delivery_services_response_t *get_delivery_services_response);

get_delivery_services_response_t *get_delivery_services_response_parseFromJSON(cJSON *get_delivery_services_responseJSON);

cJSON *get_delivery_services_response_convertToJSON(get_delivery_services_response_t *get_delivery_services_response);

#endif /* _get_delivery_services_response_H_ */

