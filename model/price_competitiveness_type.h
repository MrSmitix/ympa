/*
 * price_competitiveness_type.h
 *
 * Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
 */

#ifndef _price_competitiveness_type_H_
#define _price_competitiveness_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_competitiveness_type_t price_competitiveness_type_t;


// Enum  for price_competitiveness_type

typedef enum { _api__price_competitiveness_type__NULL = 0, _api__price_competitiveness_type__OPTIMAL, _api__price_competitiveness_type__AVERAGE, _api__price_competitiveness_type__LOW } _api__price_competitiveness_type__e;

char* price_competitiveness_type_price_competitiveness_type_ToString(_api__price_competitiveness_type__e price_competitiveness_type);

_api__price_competitiveness_type__e price_competitiveness_type_price_competitiveness_type_FromString(char* price_competitiveness_type);

//cJSON *price_competitiveness_type_price_competitiveness_type_convertToJSON(_api__price_competitiveness_type__e price_competitiveness_type);

//_api__price_competitiveness_type__e price_competitiveness_type_price_competitiveness_type_parseFromJSON(cJSON *price_competitiveness_typeJSON);

#endif /* _price_competitiveness_type_H_ */

