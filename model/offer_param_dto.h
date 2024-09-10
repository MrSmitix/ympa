/*
 * offer_param_dto.h
 *
 * Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} 
 */

#ifndef _offer_param_dto_H_
#define _offer_param_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_param_dto_t offer_param_dto_t;




typedef struct offer_param_dto_t {
    char *name; // string
    char *value; // string

} offer_param_dto_t;

offer_param_dto_t *offer_param_dto_create(
    char *name,
    char *value
);

void offer_param_dto_free(offer_param_dto_t *offer_param_dto);

offer_param_dto_t *offer_param_dto_parseFromJSON(cJSON *offer_param_dtoJSON);

cJSON *offer_param_dto_convertToJSON(offer_param_dto_t *offer_param_dto);

#endif /* _offer_param_dto_H_ */

