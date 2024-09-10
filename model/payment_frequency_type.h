/*
 * payment_frequency_type.h
 *
 * Частота выплат:  * &#x60;DAILY&#x60; — ежедневно. * &#x60;WEEKLY&#x60; — раз в неделю. * &#x60;BIWEEKLY&#x60; — раз в две недели. * &#x60;MONTHLY&#x60; — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
 */

#ifndef _payment_frequency_type_H_
#define _payment_frequency_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct payment_frequency_type_t payment_frequency_type_t;


// Enum  for payment_frequency_type

typedef enum { _api__payment_frequency_type__NULL = 0, _api__payment_frequency_type__DAILY, _api__payment_frequency_type__WEEKLY, _api__payment_frequency_type__BIWEEKLY, _api__payment_frequency_type__MONTHLY } _api__payment_frequency_type__e;

char* payment_frequency_type_payment_frequency_type_ToString(_api__payment_frequency_type__e payment_frequency_type);

_api__payment_frequency_type__e payment_frequency_type_payment_frequency_type_FromString(char* payment_frequency_type);

//cJSON *payment_frequency_type_payment_frequency_type_convertToJSON(_api__payment_frequency_type__e payment_frequency_type);

//_api__payment_frequency_type__e payment_frequency_type_payment_frequency_type_parseFromJSON(cJSON *payment_frequency_typeJSON);

#endif /* _payment_frequency_type_H_ */

