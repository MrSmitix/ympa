/*
 * feedback_comment_author_type.h
 *
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
 */

#ifndef _feedback_comment_author_type_H_
#define _feedback_comment_author_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_comment_author_type_t feedback_comment_author_type_t;


// Enum  for feedback_comment_author_type

typedef enum { _api__feedback_comment_author_type__NULL = 0, _api__feedback_comment_author_type__USER, _api__feedback_comment_author_type__SHOP } _api__feedback_comment_author_type__e;

char* feedback_comment_author_type_feedback_comment_author_type_ToString(_api__feedback_comment_author_type__e feedback_comment_author_type);

_api__feedback_comment_author_type__e feedback_comment_author_type_feedback_comment_author_type_FromString(char* feedback_comment_author_type);

//cJSON *feedback_comment_author_type_feedback_comment_author_type_convertToJSON(_api__feedback_comment_author_type__e feedback_comment_author_type);

//_api__feedback_comment_author_type__e feedback_comment_author_type_feedback_comment_author_type_parseFromJSON(cJSON *feedback_comment_author_typeJSON);

#endif /* _feedback_comment_author_type_H_ */

