/*
 * offer_condition_quality_type.h
 *
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
 */

#ifndef _offer_condition_quality_type_H_
#define _offer_condition_quality_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_condition_quality_type_t offer_condition_quality_type_t;


// Enum  for offer_condition_quality_type

typedef enum { _api__offer_condition_quality_type__NULL = 0, _api__offer_condition_quality_type__PERFECT, _api__offer_condition_quality_type__EXCELLENT, _api__offer_condition_quality_type__GOOD, _api__offer_condition_quality_type__NOT_SPECIFIED } _api__offer_condition_quality_type__e;

char* offer_condition_quality_type_offer_condition_quality_type_ToString(_api__offer_condition_quality_type__e offer_condition_quality_type);

_api__offer_condition_quality_type__e offer_condition_quality_type_offer_condition_quality_type_FromString(char* offer_condition_quality_type);

//cJSON *offer_condition_quality_type_offer_condition_quality_type_convertToJSON(_api__offer_condition_quality_type__e offer_condition_quality_type);

//_api__offer_condition_quality_type__e offer_condition_quality_type_offer_condition_quality_type_parseFromJSON(cJSON *offer_condition_quality_typeJSON);

#endif /* _offer_condition_quality_type_H_ */

