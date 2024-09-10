/*
 * placement_type.h
 *
 * Модель, по которой работает магазин:  * &#x60;FBS&#x60; — FBS или Экспресс. * &#x60;FBY&#x60; — FBY. * &#x60;DBS&#x60; — DBS. 
 */

#ifndef _placement_type_H_
#define _placement_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct placement_type_t placement_type_t;


// Enum  for placement_type

typedef enum { _api__placement_type__NULL = 0, _api__placement_type__FBS, _api__placement_type__FBY, _api__placement_type__DBS } _api__placement_type__e;

char* placement_type_placement_type_ToString(_api__placement_type__e placement_type);

_api__placement_type__e placement_type_placement_type_FromString(char* placement_type);

//cJSON *placement_type_placement_type_convertToJSON(_api__placement_type__e placement_type);

//_api__placement_type__e placement_type_placement_type_parseFromJSON(cJSON *placement_typeJSON);

#endif /* _placement_type_H_ */

