/*
 * region_type.h
 *
 * Тип региона.  Возможные значения:  * &#x60;CITY_DISTRICT&#x60; — район города.  * &#x60;CITY&#x60; — крупный город.  * &#x60;CONTINENT&#x60; — континент.  * &#x60;COUNTRY_DISTRICT&#x60; — область.  * &#x60;COUNTRY&#x60; — страна.  * &#x60;REGION&#x60; — регион.  * &#x60;REPUBLIC_AREA&#x60; — район субъекта федерации.  * &#x60;REPUBLIC&#x60; — субъект федерации.  * &#x60;SUBWAY_STATION&#x60; — станция метро.  * &#x60;VILLAGE&#x60; — город.  * &#x60;OTHER&#x60; — неизвестный регион. 
 */

#ifndef _region_type_H_
#define _region_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct region_type_t region_type_t;


// Enum  for region_type

typedef enum { _api__region_type__NULL = 0, _api__region_type__OTHER, _api__region_type__CONTINENT, _api__region_type__REGION, _api__region_type__COUNTRY, _api__region_type__COUNTRY_DISTRICT, _api__region_type__REPUBLIC, _api__region_type__CITY, _api__region_type__VILLAGE, _api__region_type__CITY_DISTRICT, _api__region_type__SUBWAY_STATION, _api__region_type__REPUBLIC_AREA } _api__region_type__e;

char* region_type_region_type_ToString(_api__region_type__e region_type);

_api__region_type__e region_type_region_type_FromString(char* region_type);

//cJSON *region_type_region_type_convertToJSON(_api__region_type__e region_type);

//_api__region_type__e region_type_region_type_parseFromJSON(cJSON *region_typeJSON);

#endif /* _region_type_H_ */

