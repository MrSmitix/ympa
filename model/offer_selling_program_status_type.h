/*
 * offer_selling_program_status_type.h
 *
 * Информация о доступности или недоступности.  * &#x60;FINE&#x60; — доступно. * &#x60;REJECT&#x60; — недоступно. 
 */

#ifndef _offer_selling_program_status_type_H_
#define _offer_selling_program_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_selling_program_status_type_t offer_selling_program_status_type_t;


// Enum  for offer_selling_program_status_type

typedef enum { _api__offer_selling_program_status_type__NULL = 0, _api__offer_selling_program_status_type__FINE, _api__offer_selling_program_status_type__REJECT } _api__offer_selling_program_status_type__e;

char* offer_selling_program_status_type_offer_selling_program_status_type_ToString(_api__offer_selling_program_status_type__e offer_selling_program_status_type);

_api__offer_selling_program_status_type__e offer_selling_program_status_type_offer_selling_program_status_type_FromString(char* offer_selling_program_status_type);

//cJSON *offer_selling_program_status_type_offer_selling_program_status_type_convertToJSON(_api__offer_selling_program_status_type__e offer_selling_program_status_type);

//_api__offer_selling_program_status_type__e offer_selling_program_status_type_offer_selling_program_status_type_parseFromJSON(cJSON *offer_selling_program_status_typeJSON);

#endif /* _offer_selling_program_status_type_H_ */

