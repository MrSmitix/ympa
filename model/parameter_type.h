/*
 * parameter_type.h
 *
 * Тип данных:  * &#x60;TEXT&#x60; — текст. * &#x60;ENUM&#x60; — список возможных значений. * &#x60;BOOLEAN&#x60; — &#x60;true&#x60; или &#x60;false&#x60;. * &#x60;NUMERIC&#x60; — число. 
 */

#ifndef _parameter_type_H_
#define _parameter_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct parameter_type_t parameter_type_t;


// Enum  for parameter_type

typedef enum { _api__parameter_type__NULL = 0, _api__parameter_type__TEXT, _api__parameter_type___ENUM, _api__parameter_type__BOOLEAN, _api__parameter_type__NUMERIC } _api__parameter_type__e;

char* parameter_type_parameter_type_ToString(_api__parameter_type__e parameter_type);

_api__parameter_type__e parameter_type_parameter_type_FromString(char* parameter_type);

//cJSON *parameter_type_parameter_type_convertToJSON(_api__parameter_type__e parameter_type);

//_api__parameter_type__e parameter_type_parameter_type_parseFromJSON(cJSON *parameter_typeJSON);

#endif /* _parameter_type_H_ */

