/*
 * offer_processing_status_type.h
 *
 * Статус публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * &#x60;IN_WORK&#x60; — товар проходит модерацию. Это занимает несколько дней. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете &#x60;marketSku&#x60; нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре &#x60;notes&#x60;. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
 */

#ifndef _offer_processing_status_type_H_
#define _offer_processing_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_processing_status_type_t offer_processing_status_type_t;


// Enum  for offer_processing_status_type

typedef enum { _api__offer_processing_status_type__NULL = 0, _api__offer_processing_status_type__UNKNOWN, _api__offer_processing_status_type__READY, _api__offer_processing_status_type__IN_WORK, _api__offer_processing_status_type__NEED_INFO, _api__offer_processing_status_type__NEED_MAPPING, _api__offer_processing_status_type__NEED_CONTENT, _api__offer_processing_status_type__CONTENT_PROCESSING, _api__offer_processing_status_type__SUSPENDED, _api__offer_processing_status_type__REJECTED, _api__offer_processing_status_type__REVIEW, _api__offer_processing_status_type__CREATE_ERROR, _api__offer_processing_status_type__UPDATE_ERROR } _api__offer_processing_status_type__e;

char* offer_processing_status_type_offer_processing_status_type_ToString(_api__offer_processing_status_type__e offer_processing_status_type);

_api__offer_processing_status_type__e offer_processing_status_type_offer_processing_status_type_FromString(char* offer_processing_status_type);

//cJSON *offer_processing_status_type_offer_processing_status_type_convertToJSON(_api__offer_processing_status_type__e offer_processing_status_type);

//_api__offer_processing_status_type__e offer_processing_status_type_offer_processing_status_type_parseFromJSON(cJSON *offer_processing_status_typeJSON);

#endif /* _offer_processing_status_type_H_ */

