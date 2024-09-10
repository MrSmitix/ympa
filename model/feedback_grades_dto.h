/*
 * feedback_grades_dto.h
 *
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */

#ifndef _feedback_grades_dto_H_
#define _feedback_grades_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feedback_grades_dto_t feedback_grades_dto_t;

#include "feedback_factor_dto.h"



typedef struct feedback_grades_dto_t {
    double average; //numeric
    long agree_count; //numeric
    long reject_count; //numeric
    list_t *factors; //nonprimitive container

} feedback_grades_dto_t;

feedback_grades_dto_t *feedback_grades_dto_create(
    double average,
    long agree_count,
    long reject_count,
    list_t *factors
);

void feedback_grades_dto_free(feedback_grades_dto_t *feedback_grades_dto);

feedback_grades_dto_t *feedback_grades_dto_parseFromJSON(cJSON *feedback_grades_dtoJSON);

cJSON *feedback_grades_dto_convertToJSON(feedback_grades_dto_t *feedback_grades_dto);

#endif /* _feedback_grades_dto_H_ */

