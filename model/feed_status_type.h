/*
 * feed_status_type.h
 *
 * Статус прайс-листа.  Возможные значения:    * &#x60;ERROR&#x60; — найдены ошибки.   * &#x60;NA&#x60; — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * &#x60;OK&#x60; — ошибок не найдено. 
 */

#ifndef _feed_status_type_H_
#define _feed_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_status_type_t feed_status_type_t;


// Enum  for feed_status_type

typedef enum { _api__feed_status_type__NULL = 0, _api__feed_status_type__ERROR, _api__feed_status_type__NA, _api__feed_status_type__OK } _api__feed_status_type__e;

char* feed_status_type_feed_status_type_ToString(_api__feed_status_type__e feed_status_type);

_api__feed_status_type__e feed_status_type_feed_status_type_FromString(char* feed_status_type);

//cJSON *feed_status_type_feed_status_type_convertToJSON(_api__feed_status_type__e feed_status_type);

//_api__feed_status_type__e feed_status_type_feed_status_type_parseFromJSON(cJSON *feed_status_typeJSON);

#endif /* _feed_status_type_H_ */

