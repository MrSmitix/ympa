/*
 * promo_offer_participation_status_filter_type.h
 *
 * Фильтр для товаров, которые добавлены в акцию вручную:  * &#x60;MANUALLY_ADDED&#x60; — товары, которые добавлены вручную.  * &#x60;NOT_MANUALLY_ADDED&#x60;— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр &#x60;statusType&#x60;, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

#ifndef _promo_offer_participation_status_filter_type_H_
#define _promo_offer_participation_status_filter_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_offer_participation_status_filter_type_t promo_offer_participation_status_filter_type_t;


// Enum  for promo_offer_participation_status_filter_type

typedef enum { _api__promo_offer_participation_status_filter_type__NULL = 0, _api__promo_offer_participation_status_filter_type__MANUALLY_ADDED, _api__promo_offer_participation_status_filter_type__NOT_MANUALLY_ADDED } _api__promo_offer_participation_status_filter_type__e;

char* promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_ToString(_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type);

_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_FromString(char* promo_offer_participation_status_filter_type);

//cJSON *promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_convertToJSON(_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type);

//_api__promo_offer_participation_status_filter_type__e promo_offer_participation_status_filter_type_promo_offer_participation_status_filter_type_parseFromJSON(cJSON *promo_offer_participation_status_filter_typeJSON);

#endif /* _promo_offer_participation_status_filter_type_H_ */

