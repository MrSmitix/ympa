/*
 * parameter_value_dto.h
 *
 * Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. 
 */

#ifndef _parameter_value_dto_H_
#define _parameter_value_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct parameter_value_dto_t parameter_value_dto_t;




typedef struct parameter_value_dto_t {
    long parameter_id; //numeric
    long unit_id; //numeric
    long value_id; //numeric
    char *value; // string

} parameter_value_dto_t;

parameter_value_dto_t *parameter_value_dto_create(
    long parameter_id,
    long unit_id,
    long value_id,
    char *value
);

void parameter_value_dto_free(parameter_value_dto_t *parameter_value_dto);

parameter_value_dto_t *parameter_value_dto_parseFromJSON(cJSON *parameter_value_dtoJSON);

cJSON *parameter_value_dto_convertToJSON(parameter_value_dto_t *parameter_value_dto);

#endif /* _parameter_value_dto_H_ */

