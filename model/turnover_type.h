/*
 * turnover_type.h
 *
 * Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |&#x60;LOW&#x60;|&#x60;turnoverDays&#x60; ≥ 120|| |&#x60;ALMOST_LOW&#x60;|100 ≤ &#x60;turnoverDays&#x60; &lt; 120|| |&#x60;HIGH&#x60;|45 ≤ &#x60;turnoverDays&#x60; &lt; 100|| |&#x60;VERY_HIGH&#x60;|0 ≤ &#x60;turnoverDays&#x60; &lt; 45|| |&#x60;NO_SALES&#x60;|—|Продаж нет.| |&#x60;FREE_STORE&#x60;|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
 */

#ifndef _turnover_type_H_
#define _turnover_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct turnover_type_t turnover_type_t;


// Enum  for turnover_type

typedef enum { _api__turnover_type__NULL = 0, _api__turnover_type__LOW, _api__turnover_type__ALMOST_LOW, _api__turnover_type__HIGH, _api__turnover_type__VERY_HIGH, _api__turnover_type__NO_SALES, _api__turnover_type__FREE_STORE } _api__turnover_type__e;

char* turnover_type_turnover_type_ToString(_api__turnover_type__e turnover_type);

_api__turnover_type__e turnover_type_turnover_type_FromString(char* turnover_type);

//cJSON *turnover_type_turnover_type_convertToJSON(_api__turnover_type__e turnover_type);

//_api__turnover_type__e turnover_type_turnover_type_parseFromJSON(cJSON *turnover_typeJSON);

#endif /* _turnover_type_H_ */

