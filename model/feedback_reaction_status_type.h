/*
 * feedback_reaction_status_type.h
 *
 * Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
 */

#ifndef _feedback_reaction_status_type_H_
#define _feedback_reaction_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_reaction_status_type_t feedback_reaction_status_type_t;


// Enum  for feedback_reaction_status_type

typedef enum { _api__feedback_reaction_status_type__NULL = 0, _api__feedback_reaction_status_type__ALL, _api__feedback_reaction_status_type__NEED_REACTION } _api__feedback_reaction_status_type__e;

char* feedback_reaction_status_type_feedback_reaction_status_type_ToString(_api__feedback_reaction_status_type__e feedback_reaction_status_type);

_api__feedback_reaction_status_type__e feedback_reaction_status_type_feedback_reaction_status_type_FromString(char* feedback_reaction_status_type);

//cJSON *feedback_reaction_status_type_feedback_reaction_status_type_convertToJSON(_api__feedback_reaction_status_type__e feedback_reaction_status_type);

//_api__feedback_reaction_status_type__e feedback_reaction_status_type_feedback_reaction_status_type_parseFromJSON(cJSON *feedback_reaction_status_typeJSON);

#endif /* _feedback_reaction_status_type_H_ */

