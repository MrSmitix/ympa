/*
 * sort_order_type.h
 *
 * Направление сортировки.  Возможные значения: - &#x60;ASC&#x60; — сортировка по возрастанию. - &#x60;DESC&#x60; — сортировка по убыванию. 
 */

#ifndef _sort_order_type_H_
#define _sort_order_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct sort_order_type_t sort_order_type_t;


// Enum  for sort_order_type

typedef enum { _api__sort_order_type__NULL = 0, _api__sort_order_type__ASC, _api__sort_order_type__DESC } _api__sort_order_type__e;

char* sort_order_type_sort_order_type_ToString(_api__sort_order_type__e sort_order_type);

_api__sort_order_type__e sort_order_type_sort_order_type_FromString(char* sort_order_type);

//cJSON *sort_order_type_sort_order_type_convertToJSON(_api__sort_order_type__e sort_order_type);

//_api__sort_order_type__e sort_order_type_sort_order_type_parseFromJSON(cJSON *sort_order_typeJSON);

#endif /* _sort_order_type_H_ */

