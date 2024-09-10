/*
 * shows_sales_grouping_type.h
 *
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 */

#ifndef _shows_sales_grouping_type_H_
#define _shows_sales_grouping_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shows_sales_grouping_type_t shows_sales_grouping_type_t;


// Enum  for shows_sales_grouping_type

typedef enum { _api__shows_sales_grouping_type__NULL = 0, _api__shows_sales_grouping_type__CATEGORIES, _api__shows_sales_grouping_type__OFFERS } _api__shows_sales_grouping_type__e;

char* shows_sales_grouping_type_shows_sales_grouping_type_ToString(_api__shows_sales_grouping_type__e shows_sales_grouping_type);

_api__shows_sales_grouping_type__e shows_sales_grouping_type_shows_sales_grouping_type_FromString(char* shows_sales_grouping_type);

//cJSON *shows_sales_grouping_type_shows_sales_grouping_type_convertToJSON(_api__shows_sales_grouping_type__e shows_sales_grouping_type);

//_api__shows_sales_grouping_type__e shows_sales_grouping_type_shows_sales_grouping_type_parseFromJSON(cJSON *shows_sales_grouping_typeJSON);

#endif /* _shows_sales_grouping_type_H_ */

