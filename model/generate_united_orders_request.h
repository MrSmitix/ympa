/*
 * generate_united_orders_request.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _generate_united_orders_request_H_
#define _generate_united_orders_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_united_orders_request_t generate_united_orders_request_t;




typedef struct generate_united_orders_request_t {
    long business_id; //numeric
    char *date_from; //date
    char *date_to; //date
    list_t *campaign_ids; //primitive container
    char *promo_id; // string

} generate_united_orders_request_t;

generate_united_orders_request_t *generate_united_orders_request_create(
    long business_id,
    char *date_from,
    char *date_to,
    list_t *campaign_ids,
    char *promo_id
);

void generate_united_orders_request_free(generate_united_orders_request_t *generate_united_orders_request);

generate_united_orders_request_t *generate_united_orders_request_parseFromJSON(cJSON *generate_united_orders_requestJSON);

cJSON *generate_united_orders_request_convertToJSON(generate_united_orders_request_t *generate_united_orders_request);

#endif /* _generate_united_orders_request_H_ */

