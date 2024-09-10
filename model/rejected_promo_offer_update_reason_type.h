/*
 * rejected_promo_offer_update_reason_type.h
 *
 * Причина отклонения изменения:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU.  * &#x60;OFFER_DUPLICATION&#x60; — один и тот же товар передан несколько раз.  * &#x60;OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар не подходит под условия акции.  * &#x60;OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED&#x60; — товар не добавлен в акцию по техническим причинам.  * &#x60;DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED&#x60; — истек срок добавления товаров в акцию.  * &#x60;EMPTY_OLD_PRICE&#x60; — не указана зачеркнутая цена.  * &#x60;EMPTY_PROMO_PRICE&#x60; — не указана цена по акции.  * &#x60;MAX_PROMO_PRICE_EXCEEDED&#x60; — цена по акции превышает максимально возможную цену для участия в акции.  * &#x60;PROMO_PRICE_BIGGER_THAN_MAX&#x60; — цена по акции больше 95% от зачеркнутой цены.  * &#x60;PROMO_PRICE_SMALLER_THAN_MIN&#x60; — цена по акции меньше 1% от зачеркнутой цены. 
 */

#ifndef _rejected_promo_offer_update_reason_type_H_
#define _rejected_promo_offer_update_reason_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct rejected_promo_offer_update_reason_type_t rejected_promo_offer_update_reason_type_t;


// Enum  for rejected_promo_offer_update_reason_type

typedef enum { _api__rejected_promo_offer_update_reason_type__NULL = 0, _api__rejected_promo_offer_update_reason_type__OFFER_DOES_NOT_EXIST, _api__rejected_promo_offer_update_reason_type__OFFER_DUPLICATION, _api__rejected_promo_offer_update_reason_type__OFFER_NOT_ELIGIBLE_FOR_PROMO, _api__rejected_promo_offer_update_reason_type__OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED, _api__rejected_promo_offer_update_reason_type__DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED, _api__rejected_promo_offer_update_reason_type__EMPTY_OLD_PRICE, _api__rejected_promo_offer_update_reason_type__EMPTY_PROMO_PRICE, _api__rejected_promo_offer_update_reason_type__MAX_PROMO_PRICE_EXCEEDED, _api__rejected_promo_offer_update_reason_type__PROMO_PRICE_BIGGER_THAN_MAX, _api__rejected_promo_offer_update_reason_type__PROMO_PRICE_SMALLER_THAN_MIN } _api__rejected_promo_offer_update_reason_type__e;

char* rejected_promo_offer_update_reason_type_rejected_promo_offer_update_reason_type_ToString(_api__rejected_promo_offer_update_reason_type__e rejected_promo_offer_update_reason_type);

_api__rejected_promo_offer_update_reason_type__e rejected_promo_offer_update_reason_type_rejected_promo_offer_update_reason_type_FromString(char* rejected_promo_offer_update_reason_type);

//cJSON *rejected_promo_offer_update_reason_type_rejected_promo_offer_update_reason_type_convertToJSON(_api__rejected_promo_offer_update_reason_type__e rejected_promo_offer_update_reason_type);

//_api__rejected_promo_offer_update_reason_type__e rejected_promo_offer_update_reason_type_rejected_promo_offer_update_reason_type_parseFromJSON(cJSON *rejected_promo_offer_update_reason_typeJSON);

#endif /* _rejected_promo_offer_update_reason_type_H_ */

