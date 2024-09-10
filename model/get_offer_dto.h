/*
 * get_offer_dto.h
 *
 * Параметры товара.
 */

#ifndef _get_offer_dto_H_
#define _get_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_offer_dto_t get_offer_dto_t;

#include "age_dto.h"
#include "get_price_dto.h"
#include "get_price_with_discount_dto.h"
#include "offer_campaign_status_dto.h"
#include "offer_card_status_type.h"
#include "offer_condition_dto.h"
#include "offer_manual_dto.h"
#include "offer_param_dto.h"
#include "offer_selling_program_dto.h"
#include "offer_type.h"
#include "offer_weight_dimensions_dto.h"
#include "time_period_dto.h"

// Enum  for get_offer_dto

typedef enum  { _api__get_offer_dto__NULL = 0, _api__get_offer_dto___DEFAULT, _api__get_offer_dto__MEDICINE, _api__get_offer_dto__BOOK, _api__get_offer_dto__AUDIOBOOK, _api__get_offer_dto__ARTIST_TITLE, _api__get_offer_dto__ON_DEMAND } _api__get_offer_dto__e;

char* get_offer_dto_type_ToString(_api__get_offer_dto__e type);

_api__get_offer_dto__e get_offer_dto_type_FromString(char* type);

// Enum  for get_offer_dto

typedef enum  { _api__get_offer_dto__NULL = 0, _api__get_offer_dto__HAS_CARD_CAN_NOT_UPDATE, _api__get_offer_dto__HAS_CARD_CAN_UPDATE, _api__get_offer_dto__HAS_CARD_CAN_UPDATE_ERRORS, _api__get_offer_dto__HAS_CARD_CAN_UPDATE_PROCESSING, _api__get_offer_dto__NO_CARD_NEED_CONTENT, _api__get_offer_dto__NO_CARD_MARKET_WILL_CREATE, _api__get_offer_dto__NO_CARD_ERRORS, _api__get_offer_dto__NO_CARD_PROCESSING, _api__get_offer_dto__NO_CARD_ADD_TO_CAMPAIGN } _api__get_offer_dto__e;

char* get_offer_dto_card_status_ToString(_api__get_offer_dto__e card_status);

_api__get_offer_dto__e get_offer_dto_card_status_FromString(char* card_status);



typedef struct get_offer_dto_t {
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
    struct get_price_with_discount_dto_t *basic_price; //model
    struct get_price_dto_t *purchase_price; //model
    struct get_price_dto_t *additional_expenses; //model
    struct get_price_dto_t *cofinance_price; //model
    offer_card_status_type_t *card_status; // custom
    list_t *campaigns; //nonprimitive container
    list_t *selling_programs; //nonprimitive container
    int archived; //boolean

} get_offer_dto_t;

get_offer_dto_t *get_offer_dto_create(
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
    list_t *params,
    get_price_with_discount_dto_t *basic_price,
    get_price_dto_t *purchase_price,
    get_price_dto_t *additional_expenses,
    get_price_dto_t *cofinance_price,
    offer_card_status_type_t *card_status,
    list_t *campaigns,
    list_t *selling_programs,
    int archived
);

void get_offer_dto_free(get_offer_dto_t *get_offer_dto);

get_offer_dto_t *get_offer_dto_parseFromJSON(cJSON *get_offer_dtoJSON);

cJSON *get_offer_dto_convertToJSON(get_offer_dto_t *get_offer_dto);

#endif /* _get_offer_dto_H_ */

