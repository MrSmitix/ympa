/*
 * price_quarantine_verdict_param_name_type.h
 *
 * Имя параметра причины скрытия товара по цене.  * &#x60;CURRENT_PRICE&#x60; — цена, из-за которой товар попал в карантин. * &#x60;LAST_VALID_PRICE&#x60; — последняя цена до попадания в карантин (только для карантина типа &#x60;PRICE_CHANGE&#x60;). * &#x60;MIN_PRICE&#x60; — порог попадания в карантин (только для карантина типов &#x60;LOW_PRICE&#x60; и &#x60;LOW_PRICE_PROMO&#x60;). * &#x60;CURRENCY&#x60; — валюта. 
 */

#ifndef _price_quarantine_verdict_param_name_type_H_
#define _price_quarantine_verdict_param_name_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_quarantine_verdict_param_name_type_t price_quarantine_verdict_param_name_type_t;


// Enum  for price_quarantine_verdict_param_name_type

typedef enum { _api__price_quarantine_verdict_param_name_type__NULL = 0, _api__price_quarantine_verdict_param_name_type__CURRENT_PRICE, _api__price_quarantine_verdict_param_name_type__LAST_VALID_PRICE, _api__price_quarantine_verdict_param_name_type__MIN_PRICE, _api__price_quarantine_verdict_param_name_type__CURRENCY } _api__price_quarantine_verdict_param_name_type__e;

char* price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_ToString(_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type);

_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_FromString(char* price_quarantine_verdict_param_name_type);

//cJSON *price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_convertToJSON(_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type);

//_api__price_quarantine_verdict_param_name_type__e price_quarantine_verdict_param_name_type_price_quarantine_verdict_param_name_type_parseFromJSON(cJSON *price_quarantine_verdict_param_name_typeJSON);

#endif /* _price_quarantine_verdict_param_name_type_H_ */

