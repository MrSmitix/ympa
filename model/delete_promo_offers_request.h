/*
 * delete_promo_offers_request.h
 *
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
 */

#ifndef _delete_promo_offers_request_H_
#define _delete_promo_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_promo_offers_request_t delete_promo_offers_request_t;




typedef struct delete_promo_offers_request_t {
    char *promo_id; // string
    int delete_all_offers; //boolean
    list_t *offer_ids; //primitive container

} delete_promo_offers_request_t;

delete_promo_offers_request_t *delete_promo_offers_request_create(
    char *promo_id,
    int delete_all_offers,
    list_t *offer_ids
);

void delete_promo_offers_request_free(delete_promo_offers_request_t *delete_promo_offers_request);

delete_promo_offers_request_t *delete_promo_offers_request_parseFromJSON(cJSON *delete_promo_offers_requestJSON);

cJSON *delete_promo_offers_request_convertToJSON(delete_promo_offers_request_t *delete_promo_offers_request);

#endif /* _delete_promo_offers_request_H_ */

