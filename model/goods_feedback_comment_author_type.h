/*
 * goods_feedback_comment_author_type.h
 *
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;BUSINESS&#x60; — кабинет. 
 */

#ifndef _goods_feedback_comment_author_type_H_
#define _goods_feedback_comment_author_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_comment_author_type_t goods_feedback_comment_author_type_t;


// Enum  for goods_feedback_comment_author_type

typedef enum { _api__goods_feedback_comment_author_type__NULL = 0, _api__goods_feedback_comment_author_type__USER, _api__goods_feedback_comment_author_type__BUSINESS } _api__goods_feedback_comment_author_type__e;

char* goods_feedback_comment_author_type_goods_feedback_comment_author_type_ToString(_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type);

_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type_goods_feedback_comment_author_type_FromString(char* goods_feedback_comment_author_type);

//cJSON *goods_feedback_comment_author_type_goods_feedback_comment_author_type_convertToJSON(_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type);

//_api__goods_feedback_comment_author_type__e goods_feedback_comment_author_type_goods_feedback_comment_author_type_parseFromJSON(cJSON *goods_feedback_comment_author_typeJSON);

#endif /* _goods_feedback_comment_author_type_H_ */

