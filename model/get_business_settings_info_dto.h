/*
 * get_business_settings_info_dto.h
 *
 * Информация о кабинете и его настройках.
 */

#ifndef _get_business_settings_info_dto_H_
#define _get_business_settings_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_business_settings_info_dto_t get_business_settings_info_dto_t;

#include "business_dto.h"
#include "business_settings_dto.h"



typedef struct get_business_settings_info_dto_t {
    struct business_dto_t *info; //model
    struct business_settings_dto_t *settings; //model

} get_business_settings_info_dto_t;

get_business_settings_info_dto_t *get_business_settings_info_dto_create(
    business_dto_t *info,
    business_settings_dto_t *settings
);

void get_business_settings_info_dto_free(get_business_settings_info_dto_t *get_business_settings_info_dto);

get_business_settings_info_dto_t *get_business_settings_info_dto_parseFromJSON(cJSON *get_business_settings_info_dtoJSON);

cJSON *get_business_settings_info_dto_convertToJSON(get_business_settings_info_dto_t *get_business_settings_info_dto);

#endif /* _get_business_settings_info_dto_H_ */

