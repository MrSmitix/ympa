/*
 * api_response_status_type.h
 *
 * Тип ответа.
 */

#ifndef _api_response_status_type_H_
#define _api_response_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_response_status_type_t api_response_status_type_t;


// Enum  for api_response_status_type

typedef enum { _api__api_response_status_type__NULL = 0, _api__api_response_status_type__OK, _api__api_response_status_type__ERROR } _api__api_response_status_type__e;

char* api_response_status_type_api_response_status_type_ToString(_api__api_response_status_type__e api_response_status_type);

_api__api_response_status_type__e api_response_status_type_api_response_status_type_FromString(char* api_response_status_type);

//cJSON *api_response_status_type_api_response_status_type_convertToJSON(_api__api_response_status_type__e api_response_status_type);

//_api__api_response_status_type__e api_response_status_type_api_response_status_type_parseFromJSON(cJSON *api_response_status_typeJSON);

#endif /* _api_response_status_type_H_ */

