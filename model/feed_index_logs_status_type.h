/*
 * feed_index_logs_status_type.h
 *
 * Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. 
 */

#ifndef _feed_index_logs_status_type_H_
#define _feed_index_logs_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_status_type_t feed_index_logs_status_type_t;


// Enum  for feed_index_logs_status_type

typedef enum { _api__feed_index_logs_status_type__NULL = 0, _api__feed_index_logs_status_type__ERROR, _api__feed_index_logs_status_type__OK, _api__feed_index_logs_status_type__WARNING } _api__feed_index_logs_status_type__e;

char* feed_index_logs_status_type_feed_index_logs_status_type_ToString(_api__feed_index_logs_status_type__e feed_index_logs_status_type);

_api__feed_index_logs_status_type__e feed_index_logs_status_type_feed_index_logs_status_type_FromString(char* feed_index_logs_status_type);

//cJSON *feed_index_logs_status_type_feed_index_logs_status_type_convertToJSON(_api__feed_index_logs_status_type__e feed_index_logs_status_type);

//_api__feed_index_logs_status_type__e feed_index_logs_status_type_feed_index_logs_status_type_parseFromJSON(cJSON *feed_index_logs_status_typeJSON);

#endif /* _feed_index_logs_status_type_H_ */

