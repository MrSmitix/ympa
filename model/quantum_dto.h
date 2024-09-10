/*
 * quantum_dto.h
 *
 * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
 */

#ifndef _quantum_dto_H_
#define _quantum_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quantum_dto_t quantum_dto_t;




typedef struct quantum_dto_t {
    int min_quantity; //numeric
    int step_quantity; //numeric

} quantum_dto_t;

quantum_dto_t *quantum_dto_create(
    int min_quantity,
    int step_quantity
);

void quantum_dto_free(quantum_dto_t *quantum_dto);

quantum_dto_t *quantum_dto_parseFromJSON(cJSON *quantum_dtoJSON);

cJSON *quantum_dto_convertToJSON(quantum_dto_t *quantum_dto);

#endif /* _quantum_dto_H_ */

