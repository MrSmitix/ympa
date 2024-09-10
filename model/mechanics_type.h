/*
 * mechanics_type.h
 *
 * Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
 */

#ifndef _mechanics_type_H_
#define _mechanics_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct mechanics_type_t mechanics_type_t;


// Enum  for mechanics_type

typedef enum { _api__mechanics_type__NULL = 0, _api__mechanics_type__DIRECT_DISCOUNT, _api__mechanics_type__BLUE_FLASH, _api__mechanics_type__MARKET_PROMOCODE } _api__mechanics_type__e;

char* mechanics_type_mechanics_type_ToString(_api__mechanics_type__e mechanics_type);

_api__mechanics_type__e mechanics_type_mechanics_type_FromString(char* mechanics_type);

//cJSON *mechanics_type_mechanics_type_convertToJSON(_api__mechanics_type__e mechanics_type);

//_api__mechanics_type__e mechanics_type_mechanics_type_parseFromJSON(cJSON *mechanics_typeJSON);

#endif /* _mechanics_type_H_ */

