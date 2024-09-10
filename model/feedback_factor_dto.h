/*
 * feedback_factor_dto.h
 *
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
 */

#ifndef _feedback_factor_dto_H_
#define _feedback_factor_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_factor_dto_t feedback_factor_dto_t;




typedef struct feedback_factor_dto_t {
    long id; //numeric
    char *title; // string
    char *description; // string
    int value; //numeric

} feedback_factor_dto_t;

feedback_factor_dto_t *feedback_factor_dto_create(
    long id,
    char *title,
    char *description,
    int value
);

void feedback_factor_dto_free(feedback_factor_dto_t *feedback_factor_dto);

feedback_factor_dto_t *feedback_factor_dto_parseFromJSON(cJSON *feedback_factor_dtoJSON);

cJSON *feedback_factor_dto_convertToJSON(feedback_factor_dto_t *feedback_factor_dto);

#endif /* _feedback_factor_dto_H_ */

