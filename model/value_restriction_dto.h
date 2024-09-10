/*
 * value_restriction_dto.h
 *
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
 */

#ifndef _value_restriction_dto_H_
#define _value_restriction_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct value_restriction_dto_t value_restriction_dto_t;

#include "option_values_limited_dto.h"



typedef struct value_restriction_dto_t {
    long limiting_parameter_id; //numeric
    list_t *limited_values; //nonprimitive container

} value_restriction_dto_t;

value_restriction_dto_t *value_restriction_dto_create(
    long limiting_parameter_id,
    list_t *limited_values
);

void value_restriction_dto_free(value_restriction_dto_t *value_restriction_dto);

value_restriction_dto_t *value_restriction_dto_parseFromJSON(cJSON *value_restriction_dtoJSON);

cJSON *value_restriction_dto_convertToJSON(value_restriction_dto_t *value_restriction_dto);

#endif /* _value_restriction_dto_H_ */

