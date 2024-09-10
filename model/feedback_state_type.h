/*
 * feedback_state_type.h
 *
 * Статус отзыва:  * &#x60;LAST&#x60; — актуален. * &#x60;PREVIOUS&#x60; — устарел. * &#x60;DELETED&#x60; — удален. 
 */

#ifndef _feedback_state_type_H_
#define _feedback_state_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_state_type_t feedback_state_type_t;


// Enum  for feedback_state_type

typedef enum { _api__feedback_state_type__NULL = 0, _api__feedback_state_type__LAST, _api__feedback_state_type__PREVIOUS, _api__feedback_state_type__DELETED } _api__feedback_state_type__e;

char* feedback_state_type_feedback_state_type_ToString(_api__feedback_state_type__e feedback_state_type);

_api__feedback_state_type__e feedback_state_type_feedback_state_type_FromString(char* feedback_state_type);

//cJSON *feedback_state_type_feedback_state_type_convertToJSON(_api__feedback_state_type__e feedback_state_type);

//_api__feedback_state_type__e feedback_state_type_feedback_state_type_parseFromJSON(cJSON *feedback_state_typeJSON);

#endif /* _feedback_state_type_H_ */

