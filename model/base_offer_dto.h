/*
 * base_offer_dto.h
 *
 * Основные параметры товара.
 */

#ifndef _base_offer_dto_H_
#define _base_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_offer_dto_t base_offer_dto_t;

#include "age_dto.h"
#include "offer_condition_dto.h"
#include "offer_manual_dto.h"
#include "offer_param_dto.h"
#include "offer_type.h"
#include "offer_weight_dimensions_dto.h"
#include "time_period_dto.h"

// Enum  for base_offer_dto

typedef enum  { _api__base_offer_dto__NULL = 0, _api__base_offer_dto___DEFAULT, _api__base_offer_dto__MEDICINE, _api__base_offer_dto__BOOK, _api__base_offer_dto__AUDIOBOOK, _api__base_offer_dto__ARTIST_TITLE, _api__base_offer_dto__ON_DEMAND } _api__base_offer_dto__e;

char* base_offer_dto_type_ToString(_api__base_offer_dto__e type);

_api__base_offer_dto__e base_offer_dto_type_FromString(char* type);



typedef struct base_offer_dto_t {
    char *offer_id; // string
    char *name; // string
    long market_category_id; //numeric
    char *category; // string
    list_t *pictures; //primitive container
    list_t *videos; //primitive container
    list_t *manuals; //nonprimitive container
    char *vendor; // string
    list_t *barcodes; //primitive container
    char *description; // string
    list_t *manufacturer_countries; //primitive container
    struct offer_weight_dimensions_dto_t *weight_dimensions; //model
    char *vendor_code; // string
    list_t *tags; //primitive container
    struct time_period_dto_t *shelf_life; //model
    struct time_period_dto_t *life_time; //model
    struct time_period_dto_t *guarantee_period; //model
    char *customs_commodity_code; // string
    list_t *certificates; //primitive container
    int box_count; //numeric
    struct offer_condition_dto_t *condition; //model
    offer_type_t *type; // custom
    int downloadable; //boolean
    int adult; //boolean
    struct age_dto_t *age; //model
    list_t *params; //nonprimitive container

} base_offer_dto_t;

base_offer_dto_t *base_offer_dto_create(
    char *offer_id,
    char *name,
    long market_category_id,
    char *category,
    list_t *pictures,
    list_t *videos,
    list_t *manuals,
    char *vendor,
    list_t *barcodes,
    char *description,
    list_t *manufacturer_countries,
    offer_weight_dimensions_dto_t *weight_dimensions,
    char *vendor_code,
    list_t *tags,
    time_period_dto_t *shelf_life,
    time_period_dto_t *life_time,
    time_period_dto_t *guarantee_period,
    char *customs_commodity_code,
    list_t *certificates,
    int box_count,
    offer_condition_dto_t *condition,
    offer_type_t *type,
    int downloadable,
    int adult,
    age_dto_t *age,
    list_t *params
);

void base_offer_dto_free(base_offer_dto_t *base_offer_dto);

base_offer_dto_t *base_offer_dto_parseFromJSON(cJSON *base_offer_dtoJSON);

cJSON *base_offer_dto_convertToJSON(base_offer_dto_t *base_offer_dto);

#endif /* _base_offer_dto_H_ */

