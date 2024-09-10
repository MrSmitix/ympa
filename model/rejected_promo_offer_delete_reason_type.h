/*
 * rejected_promo_offer_delete_reason_type.h
 *
 * Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
 */

#ifndef _rejected_promo_offer_delete_reason_type_H_
#define _rejected_promo_offer_delete_reason_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct rejected_promo_offer_delete_reason_type_t rejected_promo_offer_delete_reason_type_t;


// Enum  for rejected_promo_offer_delete_reason_type

typedef enum { _api__rejected_promo_offer_delete_reason_type__NULL = 0, _api__rejected_promo_offer_delete_reason_type__OFFER_DOES_NOT_EXIST } _api__rejected_promo_offer_delete_reason_type__e;

char* rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_ToString(_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type);

_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_FromString(char* rejected_promo_offer_delete_reason_type);

//cJSON *rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_convertToJSON(_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type);

//_api__rejected_promo_offer_delete_reason_type__e rejected_promo_offer_delete_reason_type_rejected_promo_offer_delete_reason_type_parseFromJSON(cJSON *rejected_promo_offer_delete_reason_typeJSON);

#endif /* _rejected_promo_offer_delete_reason_type_H_ */

