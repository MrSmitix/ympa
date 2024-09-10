/*
 * feed_content_error_type.h
 *
 * Тип ошибки в содержимом прайс-листа.  Возможные значения:  * &#x60;PARSE_ERROR&#x60; — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * &#x60;PARSE_XML_ERROR&#x60; — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * &#x60;TOO_MANY_REJECTED_OFFERS&#x60; — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
 */

#ifndef _feed_content_error_type_H_
#define _feed_content_error_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_content_error_type_t feed_content_error_type_t;


// Enum  for feed_content_error_type

typedef enum { _api__feed_content_error_type__NULL = 0, _api__feed_content_error_type__PARSE_ERROR, _api__feed_content_error_type__PARSE_XML_ERROR, _api__feed_content_error_type__TOO_MANY_REJECTED_OFFERS } _api__feed_content_error_type__e;

char* feed_content_error_type_feed_content_error_type_ToString(_api__feed_content_error_type__e feed_content_error_type);

_api__feed_content_error_type__e feed_content_error_type_feed_content_error_type_FromString(char* feed_content_error_type);

//cJSON *feed_content_error_type_feed_content_error_type_convertToJSON(_api__feed_content_error_type__e feed_content_error_type);

//_api__feed_content_error_type__e feed_content_error_type_feed_content_error_type_parseFromJSON(cJSON *feed_content_error_typeJSON);

#endif /* _feed_content_error_type_H_ */

