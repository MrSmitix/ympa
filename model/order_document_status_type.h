/*
 * order_document_status_type.h
 *
 * Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
 */

#ifndef _order_document_status_type_H_
#define _order_document_status_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_document_status_type_t order_document_status_type_t;


// Enum  for order_document_status_type

typedef enum { _api__order_document_status_type__NULL = 0, _api__order_document_status_type__READY, _api__order_document_status_type__NOT_READY } _api__order_document_status_type__e;

char* order_document_status_type_order_document_status_type_ToString(_api__order_document_status_type__e order_document_status_type);

_api__order_document_status_type__e order_document_status_type_order_document_status_type_FromString(char* order_document_status_type);

//cJSON *order_document_status_type_order_document_status_type_convertToJSON(_api__order_document_status_type__e order_document_status_type);

//_api__order_document_status_type__e order_document_status_type_order_document_status_type_parseFromJSON(cJSON *order_document_status_typeJSON);

#endif /* _order_document_status_type_H_ */

