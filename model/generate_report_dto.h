/*
 * generate_report_dto.h
 *
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */

#ifndef _generate_report_dto_H_
#define _generate_report_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generate_report_dto_t generate_report_dto_t;




typedef struct generate_report_dto_t {
    char *report_id; // string
    long estimated_generation_time; //numeric

} generate_report_dto_t;

generate_report_dto_t *generate_report_dto_create(
    char *report_id,
    long estimated_generation_time
);

void generate_report_dto_free(generate_report_dto_t *generate_report_dto);

generate_report_dto_t *generate_report_dto_parseFromJSON(cJSON *generate_report_dtoJSON);

cJSON *generate_report_dto_convertToJSON(generate_report_dto_t *generate_report_dto);

#endif /* _generate_report_dto_H_ */

