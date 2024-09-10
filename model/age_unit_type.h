/*
 * age_unit_type.h
 *
 * Единицы измерения возраста:  * &#x60;YEAR&#x60; — год. * &#x60;MONTH&#x60; — месяц. 
 */

#ifndef _age_unit_type_H_
#define _age_unit_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct age_unit_type_t age_unit_type_t;


// Enum  for age_unit_type

typedef enum { _api__age_unit_type__NULL = 0, _api__age_unit_type__YEAR, _api__age_unit_type__MONTH } _api__age_unit_type__e;

char* age_unit_type_age_unit_type_ToString(_api__age_unit_type__e age_unit_type);

_api__age_unit_type__e age_unit_type_age_unit_type_FromString(char* age_unit_type);

//cJSON *age_unit_type_age_unit_type_convertToJSON(_api__age_unit_type__e age_unit_type);

//_api__age_unit_type__e age_unit_type_age_unit_type_parseFromJSON(cJSON *age_unit_typeJSON);

#endif /* _age_unit_type_H_ */

