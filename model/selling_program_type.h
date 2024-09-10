/*
 * selling_program_type.h
 *
 * Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
 */

#ifndef _selling_program_type_H_
#define _selling_program_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct selling_program_type_t selling_program_type_t;


// Enum  for selling_program_type

typedef enum { _api__selling_program_type__NULL = 0, _api__selling_program_type__FBY, _api__selling_program_type__FBS, _api__selling_program_type__DBS, _api__selling_program_type__EXPRESS } _api__selling_program_type__e;

char* selling_program_type_selling_program_type_ToString(_api__selling_program_type__e selling_program_type);

_api__selling_program_type__e selling_program_type_selling_program_type_FromString(char* selling_program_type);

//cJSON *selling_program_type_selling_program_type_convertToJSON(_api__selling_program_type__e selling_program_type);

//_api__selling_program_type__e selling_program_type_selling_program_type_parseFromJSON(cJSON *selling_program_typeJSON);

#endif /* _selling_program_type_H_ */

