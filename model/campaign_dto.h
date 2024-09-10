/*
 * campaign_dto.h
 *
 * Информация о магазине.
 */

#ifndef _campaign_dto_H_
#define _campaign_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_dto_t campaign_dto_t;

#include "business_dto.h"
#include "placement_type.h"

// Enum  for campaign_dto

typedef enum  { _api__campaign_dto__NULL = 0, _api__campaign_dto__FBS, _api__campaign_dto__FBY, _api__campaign_dto__DBS } _api__campaign_dto__e;

char* campaign_dto_placement_type_ToString(_api__campaign_dto__e placement_type);

_api__campaign_dto__e campaign_dto_placement_type_FromString(char* placement_type);



typedef struct campaign_dto_t {
    char *domain; // string
    long id; //numeric
    long client_id; //numeric
    struct business_dto_t *business; //model
    placement_type_t *placement_type; // custom

} campaign_dto_t;

campaign_dto_t *campaign_dto_create(
    char *domain,
    long id,
    long client_id,
    business_dto_t *business,
    placement_type_t *placement_type
);

void campaign_dto_free(campaign_dto_t *campaign_dto);

campaign_dto_t *campaign_dto_parseFromJSON(cJSON *campaign_dtoJSON);

cJSON *campaign_dto_convertToJSON(campaign_dto_t *campaign_dto);

#endif /* _campaign_dto_H_ */

