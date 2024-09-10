/*
 * update_promo_offers_request.h
 *
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
 */

#ifndef _update_promo_offers_request_H_
#define _update_promo_offers_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_promo_offers_request_t update_promo_offers_request_t;

#include "update_promo_offer_dto.h"



typedef struct update_promo_offers_request_t {
    char *promo_id; // string
    list_t *offers; //nonprimitive container

} update_promo_offers_request_t;

update_promo_offers_request_t *update_promo_offers_request_create(
    char *promo_id,
    list_t *offers
);

void update_promo_offers_request_free(update_promo_offers_request_t *update_promo_offers_request);

update_promo_offers_request_t *update_promo_offers_request_parseFromJSON(cJSON *update_promo_offers_requestJSON);

cJSON *update_promo_offers_request_convertToJSON(update_promo_offers_request_t *update_promo_offers_request);

#endif /* _update_promo_offers_request_H_ */

