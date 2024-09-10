/*
 * feed_index_logs_index_type.h
 *
 * Тип обновления.  Возможные значения:  * &#x60;DIFF&#x60; — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * &#x60;FAST_PRICE&#x60; — только обновление цен ранее опубликованных предложений. * &#x60;FULL&#x60; — полное обновление данных на Яндекс Маркете. 
 */

#ifndef _feed_index_logs_index_type_H_
#define _feed_index_logs_index_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_index_type_t feed_index_logs_index_type_t;


// Enum  for feed_index_logs_index_type

typedef enum { _api__feed_index_logs_index_type__NULL = 0, _api__feed_index_logs_index_type__DIFF, _api__feed_index_logs_index_type__FAST_PRICE, _api__feed_index_logs_index_type__FULL } _api__feed_index_logs_index_type__e;

char* feed_index_logs_index_type_feed_index_logs_index_type_ToString(_api__feed_index_logs_index_type__e feed_index_logs_index_type);

_api__feed_index_logs_index_type__e feed_index_logs_index_type_feed_index_logs_index_type_FromString(char* feed_index_logs_index_type);

//cJSON *feed_index_logs_index_type_feed_index_logs_index_type_convertToJSON(_api__feed_index_logs_index_type__e feed_index_logs_index_type);

//_api__feed_index_logs_index_type__e feed_index_logs_index_type_feed_index_logs_index_type_parseFromJSON(cJSON *feed_index_logs_index_typeJSON);

#endif /* _feed_index_logs_index_type_H_ */

