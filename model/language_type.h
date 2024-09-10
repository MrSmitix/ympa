/*
 * language_type.h
 *
 * Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
 */

#ifndef _language_type_H_
#define _language_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct language_type_t language_type_t;


// Enum  for language_type

typedef enum { _api__language_type__NULL = 0, _api__language_type__RU, _api__language_type__EN } _api__language_type__e;

char* language_type_language_type_ToString(_api__language_type__e language_type);

_api__language_type__e language_type_language_type_FromString(char* language_type);

//cJSON *language_type_language_type_convertToJSON(_api__language_type__e language_type);

//_api__language_type__e language_type_language_type_parseFromJSON(cJSON *language_typeJSON);

#endif /* _language_type_H_ */

