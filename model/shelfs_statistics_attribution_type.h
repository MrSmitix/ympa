/*
 * shelfs_statistics_attribution_type.h
 *
 * Тип атрибуции:   * &#x60;CLICKS&#x60; — по кликам.   * &#x60;SHOWS&#x60; — по показам. &lt;br&gt;&lt;br&gt;  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
 */

#ifndef _shelfs_statistics_attribution_type_H_
#define _shelfs_statistics_attribution_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shelfs_statistics_attribution_type_t shelfs_statistics_attribution_type_t;


// Enum  for shelfs_statistics_attribution_type

typedef enum { _api__shelfs_statistics_attribution_type__NULL = 0, _api__shelfs_statistics_attribution_type__CLICKS, _api__shelfs_statistics_attribution_type__SHOWS } _api__shelfs_statistics_attribution_type__e;

char* shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_ToString(_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type);

_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_FromString(char* shelfs_statistics_attribution_type);

//cJSON *shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_convertToJSON(_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type);

//_api__shelfs_statistics_attribution_type__e shelfs_statistics_attribution_type_shelfs_statistics_attribution_type_parseFromJSON(cJSON *shelfs_statistics_attribution_typeJSON);

#endif /* _shelfs_statistics_attribution_type_H_ */

