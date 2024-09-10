/*
 * offer_card_status_type.h
 *
 * Статус карточки товара:  * &#x60;HAS_CARD_CAN_NOT_UPDATE&#x60; — Карточка Маркета. * &#x60;HAS_CARD_CAN_UPDATE&#x60; — Можно дополнить. * &#x60;HAS_CARD_CAN_UPDATE_ERRORS&#x60; — Изменения не приняты. * &#x60;HAS_CARD_CAN_UPDATE_PROCESSING&#x60; — Изменения на проверке. * &#x60;NO_CARD_NEED_CONTENT&#x60; — Создайте карточку. * &#x60;NO_CARD_MARKET_WILL_CREATE&#x60; — Создаст Маркет. * &#x60;NO_CARD_ERRORS&#x60; — Не создана из-за ошибки. * &#x60;NO_CARD_PROCESSING&#x60; — Проверяем данные. * &#x60;NO_CARD_ADD_TO_CAMPAIGN&#x60; — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
 */

#ifndef _offer_card_status_type_H_
#define _offer_card_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_card_status_type_t offer_card_status_type_t;


// Enum  for offer_card_status_type

typedef enum { _api__offer_card_status_type__NULL = 0, _api__offer_card_status_type__HAS_CARD_CAN_NOT_UPDATE, _api__offer_card_status_type__HAS_CARD_CAN_UPDATE, _api__offer_card_status_type__HAS_CARD_CAN_UPDATE_ERRORS, _api__offer_card_status_type__HAS_CARD_CAN_UPDATE_PROCESSING, _api__offer_card_status_type__NO_CARD_NEED_CONTENT, _api__offer_card_status_type__NO_CARD_MARKET_WILL_CREATE, _api__offer_card_status_type__NO_CARD_ERRORS, _api__offer_card_status_type__NO_CARD_PROCESSING, _api__offer_card_status_type__NO_CARD_ADD_TO_CAMPAIGN } _api__offer_card_status_type__e;

char* offer_card_status_type_offer_card_status_type_ToString(_api__offer_card_status_type__e offer_card_status_type);

_api__offer_card_status_type__e offer_card_status_type_offer_card_status_type_FromString(char* offer_card_status_type);

//cJSON *offer_card_status_type_offer_card_status_type_convertToJSON(_api__offer_card_status_type__e offer_card_status_type);

//_api__offer_card_status_type__e offer_card_status_type_offer_card_status_type_parseFromJSON(cJSON *offer_card_status_typeJSON);

#endif /* _offer_card_status_type_H_ */

