/*
 * offer_campaign_status_type.h
 *
 * Статус товара:  * &#x60;PUBLISHED&#x60; — Готов к продаже. * &#x60;CHECKING&#x60; — На проверке. * &#x60;DISABLED_BY_PARTNER&#x60; — Скрыт вами. * &#x60;REJECTED_BY_MARKET&#x60; — Отклонен. * &#x60;DISABLED_AUTOMATICALLY&#x60; — Исправьте ошибки. * &#x60;CREATING_CARD&#x60; — Создается карточка. * &#x60;NO_CARD&#x60; — Нужна карточка. * &#x60;NO_STOCKS&#x60; — Нет на складе. * &#x60;ARCHIVED&#x60; — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 */

#ifndef _offer_campaign_status_type_H_
#define _offer_campaign_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_campaign_status_type_t offer_campaign_status_type_t;


// Enum  for offer_campaign_status_type

typedef enum { _api__offer_campaign_status_type__NULL = 0, _api__offer_campaign_status_type__PUBLISHED, _api__offer_campaign_status_type__CHECKING, _api__offer_campaign_status_type__DISABLED_BY_PARTNER, _api__offer_campaign_status_type__DISABLED_AUTOMATICALLY, _api__offer_campaign_status_type__REJECTED_BY_MARKET, _api__offer_campaign_status_type__CREATING_CARD, _api__offer_campaign_status_type__NO_CARD, _api__offer_campaign_status_type__NO_STOCKS, _api__offer_campaign_status_type__ARCHIVED } _api__offer_campaign_status_type__e;

char* offer_campaign_status_type_offer_campaign_status_type_ToString(_api__offer_campaign_status_type__e offer_campaign_status_type);

_api__offer_campaign_status_type__e offer_campaign_status_type_offer_campaign_status_type_FromString(char* offer_campaign_status_type);

//cJSON *offer_campaign_status_type_offer_campaign_status_type_convertToJSON(_api__offer_campaign_status_type__e offer_campaign_status_type);

//_api__offer_campaign_status_type__e offer_campaign_status_type_offer_campaign_status_type_parseFromJSON(cJSON *offer_campaign_status_typeJSON);

#endif /* _offer_campaign_status_type_H_ */

