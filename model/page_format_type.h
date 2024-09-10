/*
 * page_format_type.h
 *
 * Размещение ярлыков на странице: * &#x60;A7&#x60; — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * &#x60;A4&#x60; — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
 */

#ifndef _page_format_type_H_
#define _page_format_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct page_format_type_t page_format_type_t;


// Enum  for page_format_type

typedef enum { _api__page_format_type__NULL = 0, _api__page_format_type__A7, _api__page_format_type__A4 } _api__page_format_type__e;

char* page_format_type_page_format_type_ToString(_api__page_format_type__e page_format_type);

_api__page_format_type__e page_format_type_page_format_type_FromString(char* page_format_type);

//cJSON *page_format_type_page_format_type_convertToJSON(_api__page_format_type__e page_format_type);

//_api__page_format_type__e page_format_type_page_format_type_parseFromJSON(cJSON *page_format_typeJSON);

#endif /* _page_format_type_H_ */

