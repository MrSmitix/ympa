/*
 * eac_verification_status_type.h
 *
 * Статус проверки кода подтверждения:  * &#x60;ACCEPTED&#x60; — код верный. * &#x60;REJECTED&#x60; — код неверный. * &#x60;NEED_UPDATE&#x60; — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 */

#ifndef _eac_verification_status_type_H_
#define _eac_verification_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct eac_verification_status_type_t eac_verification_status_type_t;


// Enum  for eac_verification_status_type

typedef enum { _api__eac_verification_status_type__NULL = 0, _api__eac_verification_status_type__ACCEPTED, _api__eac_verification_status_type__REJECTED, _api__eac_verification_status_type__NEED_UPDATE } _api__eac_verification_status_type__e;

char* eac_verification_status_type_eac_verification_status_type_ToString(_api__eac_verification_status_type__e eac_verification_status_type);

_api__eac_verification_status_type__e eac_verification_status_type_eac_verification_status_type_FromString(char* eac_verification_status_type);

//cJSON *eac_verification_status_type_eac_verification_status_type_convertToJSON(_api__eac_verification_status_type__e eac_verification_status_type);

//_api__eac_verification_status_type__e eac_verification_status_type_eac_verification_status_type_parseFromJSON(cJSON *eac_verification_status_typeJSON);

#endif /* _eac_verification_status_type_H_ */

