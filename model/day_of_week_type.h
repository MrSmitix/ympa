/*
 * day_of_week_type.h
 *
 * День недели:  * &#x60;MONDAY&#x60; — понедельник. * &#x60;TUESDAY&#x60; — вторник. * &#x60;WEDNESDAY&#x60; — среда. * &#x60;THURSDAY&#x60; — четверг. * &#x60;FRIDAY&#x60; — пятница. * &#x60;SATURDAY&#x60; — суббота. * &#x60;SUNDAY&#x60; — воскресенье. 
 */

#ifndef _day_of_week_type_H_
#define _day_of_week_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct day_of_week_type_t day_of_week_type_t;


// Enum  for day_of_week_type

typedef enum { _api__day_of_week_type__NULL = 0, _api__day_of_week_type__MONDAY, _api__day_of_week_type__TUESDAY, _api__day_of_week_type__WEDNESDAY, _api__day_of_week_type__THURSDAY, _api__day_of_week_type__FRIDAY, _api__day_of_week_type__SATURDAY, _api__day_of_week_type__SUNDAY } _api__day_of_week_type__e;

char* day_of_week_type_day_of_week_type_ToString(_api__day_of_week_type__e day_of_week_type);

_api__day_of_week_type__e day_of_week_type_day_of_week_type_FromString(char* day_of_week_type);

//cJSON *day_of_week_type_day_of_week_type_convertToJSON(_api__day_of_week_type__e day_of_week_type);

//_api__day_of_week_type__e day_of_week_type_day_of_week_type_parseFromJSON(cJSON *day_of_week_typeJSON);

#endif /* _day_of_week_type_H_ */

