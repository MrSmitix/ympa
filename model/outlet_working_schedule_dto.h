/*
 * outlet_working_schedule_dto.h
 *
 * Список режимов работы точки продаж. 
 */

#ifndef _outlet_working_schedule_dto_H_
#define _outlet_working_schedule_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct outlet_working_schedule_dto_t outlet_working_schedule_dto_t;

#include "outlet_working_schedule_item_dto.h"



typedef struct outlet_working_schedule_dto_t {
    int work_in_holiday; //boolean
    list_t *schedule_items; //nonprimitive container

} outlet_working_schedule_dto_t;

outlet_working_schedule_dto_t *outlet_working_schedule_dto_create(
    int work_in_holiday,
    list_t *schedule_items
);

void outlet_working_schedule_dto_free(outlet_working_schedule_dto_t *outlet_working_schedule_dto);

outlet_working_schedule_dto_t *outlet_working_schedule_dto_parseFromJSON(cJSON *outlet_working_schedule_dtoJSON);

cJSON *outlet_working_schedule_dto_convertToJSON(outlet_working_schedule_dto_t *outlet_working_schedule_dto);

#endif /* _outlet_working_schedule_dto_H_ */

