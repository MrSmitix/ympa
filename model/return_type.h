/*
 * return_type.h
 *
 * Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
 */

#ifndef _return_type_H_
#define _return_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_type_t return_type_t;


// Enum  for return_type

typedef enum { _api__return_type__NULL = 0, _api__return_type__UNREDEEMED, _api__return_type___RETURN } _api__return_type__e;

char* return_type_return_type_ToString(_api__return_type__e return_type);

_api__return_type__e return_type_return_type_FromString(char* return_type);

//cJSON *return_type_return_type_convertToJSON(_api__return_type__e return_type);

//_api__return_type__e return_type_return_type_parseFromJSON(cJSON *return_typeJSON);

#endif /* _return_type_H_ */

