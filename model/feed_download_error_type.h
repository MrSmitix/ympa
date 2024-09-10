/*
 * feed_download_error_type.h
 *
 * Тип ошибки загрузки прайс-листа.  Возможные значения:  * &#x60;DOWNLOAD_ERROR&#x60; — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре &#x60;description&#x60;.  * &#x60;DOWNLOAD_HTTP_ERROR&#x60; — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре &#x60;httpStatusCode&#x60;. 
 */

#ifndef _feed_download_error_type_H_
#define _feed_download_error_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_download_error_type_t feed_download_error_type_t;


// Enum  for feed_download_error_type

typedef enum { _api__feed_download_error_type__NULL = 0, _api__feed_download_error_type__DOWNLOAD_ERROR, _api__feed_download_error_type__DOWNLOAD_HTTP_ERROR } _api__feed_download_error_type__e;

char* feed_download_error_type_feed_download_error_type_ToString(_api__feed_download_error_type__e feed_download_error_type);

_api__feed_download_error_type__e feed_download_error_type_feed_download_error_type_FromString(char* feed_download_error_type);

//cJSON *feed_download_error_type_feed_download_error_type_convertToJSON(_api__feed_download_error_type__e feed_download_error_type);

//_api__feed_download_error_type__e feed_download_error_type_feed_download_error_type_parseFromJSON(cJSON *feed_download_error_typeJSON);

#endif /* _feed_download_error_type_H_ */

