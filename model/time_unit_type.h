/*
 * time_unit_type.h
 *
 * Единица измерения времени:  * &#x60;HOUR&#x60; — час. * &#x60;DAY&#x60; — сутки. * &#x60;WEEK&#x60; — неделя. * &#x60;MONTH&#x60; — месяц. * &#x60;YEAR&#x60; — год. 
 */

#ifndef _time_unit_type_H_
#define _time_unit_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct time_unit_type_t time_unit_type_t;


// Enum  for time_unit_type

typedef enum { _api__time_unit_type__NULL = 0, _api__time_unit_type__HOUR, _api__time_unit_type__DAY, _api__time_unit_type__WEEK, _api__time_unit_type__MONTH, _api__time_unit_type__YEAR } _api__time_unit_type__e;

char* time_unit_type_time_unit_type_ToString(_api__time_unit_type__e time_unit_type);

_api__time_unit_type__e time_unit_type_time_unit_type_FromString(char* time_unit_type);

//cJSON *time_unit_type_time_unit_type_convertToJSON(_api__time_unit_type__e time_unit_type);

//_api__time_unit_type__e time_unit_type_time_unit_type_parseFromJSON(cJSON *time_unit_typeJSON);

#endif /* _time_unit_type_H_ */

