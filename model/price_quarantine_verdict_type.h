/*
 * price_quarantine_verdict_type.h
 *
 * Типы карантина:  * &#x60;PRICE_CHANGE&#x60; — новая цена слишком сильно отличается от прежней. В поле &#x60;params&#x60; будет  новая цена &#x60;CURRENT_PRICE&#x60; и последняя цена до попадания в карантин &#x60;LAST_VALID_PRICE&#x60;. * &#x60;LOW_PRICE&#x60; — установленная цена слишком сильно отличается от рыночной. В поле &#x60;params&#x60; будет установленная вами цена &#x60;CURRENT_PRICE&#x60; и порог попадания в карантин &#x60;MIN_PRICE&#x60;. * &#x60;LOW_PRICE_PROMO&#x60; — цена после применения акций слишком сильно отличается от рыночной. В поле &#x60;params&#x60; будет цена после применения акций &#x60;CURRENT_PRICE&#x60; и порог попадания в карантин &#x60;MIN_PRICE&#x60;. 
 */

#ifndef _price_quarantine_verdict_type_H_
#define _price_quarantine_verdict_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_quarantine_verdict_type_t price_quarantine_verdict_type_t;


// Enum  for price_quarantine_verdict_type

typedef enum { _api__price_quarantine_verdict_type__NULL = 0, _api__price_quarantine_verdict_type__PRICE_CHANGE, _api__price_quarantine_verdict_type__LOW_PRICE, _api__price_quarantine_verdict_type__LOW_PRICE_PROMO } _api__price_quarantine_verdict_type__e;

char* price_quarantine_verdict_type_price_quarantine_verdict_type_ToString(_api__price_quarantine_verdict_type__e price_quarantine_verdict_type);

_api__price_quarantine_verdict_type__e price_quarantine_verdict_type_price_quarantine_verdict_type_FromString(char* price_quarantine_verdict_type);

//cJSON *price_quarantine_verdict_type_price_quarantine_verdict_type_convertToJSON(_api__price_quarantine_verdict_type__e price_quarantine_verdict_type);

//_api__price_quarantine_verdict_type__e price_quarantine_verdict_type_price_quarantine_verdict_type_parseFromJSON(cJSON *price_quarantine_verdict_typeJSON);

#endif /* _price_quarantine_verdict_type_H_ */

