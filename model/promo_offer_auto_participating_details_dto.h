/*
 * promo_offer_auto_participating_details_dto.h
 *
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

#ifndef _promo_offer_auto_participating_details_dto_H_
#define _promo_offer_auto_participating_details_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_offer_auto_participating_details_dto_t promo_offer_auto_participating_details_dto_t;




typedef struct promo_offer_auto_participating_details_dto_t {
    list_t *campaign_ids; //primitive container

} promo_offer_auto_participating_details_dto_t;

promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto_create(
    list_t *campaign_ids
);

void promo_offer_auto_participating_details_dto_free(promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto);

promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto_parseFromJSON(cJSON *promo_offer_auto_participating_details_dtoJSON);

cJSON *promo_offer_auto_participating_details_dto_convertToJSON(promo_offer_auto_participating_details_dto_t *promo_offer_auto_participating_details_dto);

#endif /* _promo_offer_auto_participating_details_dto_H_ */

