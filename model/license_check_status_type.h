/*
 * license_check_status_type.h
 *
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 */

#ifndef _license_check_status_type_H_
#define _license_check_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct license_check_status_type_t license_check_status_type_t;


// Enum  for license_check_status_type

typedef enum { _api__license_check_status_type__NULL = 0, _api__license_check_status_type___NEW, _api__license_check_status_type__SUCCESS, _api__license_check_status_type__FAIL, _api__license_check_status_type__REVOKE, _api__license_check_status_type__DONT_WANT, _api__license_check_status_type__FAIL_MANUAL } _api__license_check_status_type__e;

char* license_check_status_type_license_check_status_type_ToString(_api__license_check_status_type__e license_check_status_type);

_api__license_check_status_type__e license_check_status_type_license_check_status_type_FromString(char* license_check_status_type);

//cJSON *license_check_status_type_license_check_status_type_convertToJSON(_api__license_check_status_type__e license_check_status_type);

//_api__license_check_status_type__e license_check_status_type_license_check_status_type_parseFromJSON(cJSON *license_check_status_typeJSON);

#endif /* _license_check_status_type_H_ */

