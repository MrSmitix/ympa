/*
 * goods_feedback_comment_status_type.h
 *
 * Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
 */

#ifndef _goods_feedback_comment_status_type_H_
#define _goods_feedback_comment_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct goods_feedback_comment_status_type_t goods_feedback_comment_status_type_t;


// Enum  for goods_feedback_comment_status_type

typedef enum { _api__goods_feedback_comment_status_type__NULL = 0, _api__goods_feedback_comment_status_type__PUBLISHED, _api__goods_feedback_comment_status_type__UNMODERATED, _api__goods_feedback_comment_status_type__BANNED, _api__goods_feedback_comment_status_type__DELETED } _api__goods_feedback_comment_status_type__e;

char* goods_feedback_comment_status_type_goods_feedback_comment_status_type_ToString(_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type);

_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type_goods_feedback_comment_status_type_FromString(char* goods_feedback_comment_status_type);

//cJSON *goods_feedback_comment_status_type_goods_feedback_comment_status_type_convertToJSON(_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type);

//_api__goods_feedback_comment_status_type__e goods_feedback_comment_status_type_goods_feedback_comment_status_type_parseFromJSON(cJSON *goods_feedback_comment_status_typeJSON);

#endif /* _goods_feedback_comment_status_type_H_ */

