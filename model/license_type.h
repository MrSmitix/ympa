/*
 * license_type.h
 *
 * Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
 */

#ifndef _license_type_H_
#define _license_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct license_type_t license_type_t;


// Enum  for license_type

typedef enum { _api__license_type__NULL = 0, _api__license_type__ALCOHOL, _api__license_type__UNKNOWN } _api__license_type__e;

char* license_type_license_type_ToString(_api__license_type__e license_type);

_api__license_type__e license_type_license_type_FromString(char* license_type);

//cJSON *license_type_license_type_convertToJSON(_api__license_type__e license_type);

//_api__license_type__e license_type_license_type_parseFromJSON(cJSON *license_typeJSON);

#endif /* _license_type_H_ */

