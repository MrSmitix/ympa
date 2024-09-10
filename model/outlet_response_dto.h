/*
 * outlet_response_dto.h
 *
 * Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. 
 */

#ifndef _outlet_response_dto_H_
#define _outlet_response_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_response_dto_t outlet_response_dto_t;




typedef struct outlet_response_dto_t {
    long id; //numeric

} outlet_response_dto_t;

outlet_response_dto_t *outlet_response_dto_create(
    long id
);

void outlet_response_dto_free(outlet_response_dto_t *outlet_response_dto);

outlet_response_dto_t *outlet_response_dto_parseFromJSON(cJSON *outlet_response_dtoJSON);

cJSON *outlet_response_dto_convertToJSON(outlet_response_dto_t *outlet_response_dto);

#endif /* _outlet_response_dto_H_ */

