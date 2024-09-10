/*
 * promo_offer_participation_status_type.h
 *
 * Статус товара в акции:  * &#x60;AUTO&#x60; — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * &#x60;PARTIALLY_AUTO&#x60; — добавлен автоматически у части магазинов.  * &#x60;MANUAL&#x60; — добавлен вручную.  * &#x60;NOT_PARTICIPATING&#x60; — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

#ifndef _promo_offer_participation_status_type_H_
#define _promo_offer_participation_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_offer_participation_status_type_t promo_offer_participation_status_type_t;


// Enum  for promo_offer_participation_status_type

typedef enum { _api__promo_offer_participation_status_type__NULL = 0, _api__promo_offer_participation_status_type___AUTO, _api__promo_offer_participation_status_type__PARTIALLY_AUTO, _api__promo_offer_participation_status_type__MANUAL, _api__promo_offer_participation_status_type__NOT_PARTICIPATING } _api__promo_offer_participation_status_type__e;

char* promo_offer_participation_status_type_promo_offer_participation_status_type_ToString(_api__promo_offer_participation_status_type__e promo_offer_participation_status_type);

_api__promo_offer_participation_status_type__e promo_offer_participation_status_type_promo_offer_participation_status_type_FromString(char* promo_offer_participation_status_type);

//cJSON *promo_offer_participation_status_type_promo_offer_participation_status_type_convertToJSON(_api__promo_offer_participation_status_type__e promo_offer_participation_status_type);

//_api__promo_offer_participation_status_type__e promo_offer_participation_status_type_promo_offer_participation_status_type_parseFromJSON(cJSON *promo_offer_participation_status_typeJSON);

#endif /* _promo_offer_participation_status_type_H_ */

