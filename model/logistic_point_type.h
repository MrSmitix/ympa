/*
 * logistic_point_type.h
 *
 * Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
 */

#ifndef _logistic_point_type_H_
#define _logistic_point_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct logistic_point_type_t logistic_point_type_t;


// Enum  for logistic_point_type

typedef enum { _api__logistic_point_type__NULL = 0, _api__logistic_point_type__WAREHOUSE, _api__logistic_point_type__PICKUP_POINT, _api__logistic_point_type__PICKUP_TERMINAL, _api__logistic_point_type__PICKUP_POST_OFFICE, _api__logistic_point_type__PICKUP_MIXED, _api__logistic_point_type__PICKUP_RETAIL, _api__logistic_point_type__UNKNOWN } _api__logistic_point_type__e;

char* logistic_point_type_logistic_point_type_ToString(_api__logistic_point_type__e logistic_point_type);

_api__logistic_point_type__e logistic_point_type_logistic_point_type_FromString(char* logistic_point_type);

//cJSON *logistic_point_type_logistic_point_type_convertToJSON(_api__logistic_point_type__e logistic_point_type);

//_api__logistic_point_type__e logistic_point_type_logistic_point_type_parseFromJSON(cJSON *logistic_point_typeJSON);

#endif /* _logistic_point_type_H_ */

