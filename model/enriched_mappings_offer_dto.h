/*
 * enriched_mappings_offer_dto.h
 *
 * Информация о рекомендованных карточках товаров.
 */

#ifndef _enriched_mappings_offer_dto_H_
#define _enriched_mappings_offer_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct enriched_mappings_offer_dto_t enriched_mappings_offer_dto_t;

#include "day_of_week_type.h"
#include "offer_availability_status_type.h"
#include "offer_processing_state_dto.h"
#include "offer_weight_dimensions_dto.h"
#include "time_period_dto.h"

// Enum  for enriched_mappings_offer_dto

typedef enum  { _api__enriched_mappings_offer_dto__NULL = 0, _api__enriched_mappings_offer_dto__MONDAY, _api__enriched_mappings_offer_dto__TUESDAY, _api__enriched_mappings_offer_dto__WEDNESDAY, _api__enriched_mappings_offer_dto__THURSDAY, _api__enriched_mappings_offer_dto__FRIDAY, _api__enriched_mappings_offer_dto__SATURDAY, _api__enriched_mappings_offer_dto__SUNDAY } _api__enriched_mappings_offer_dto__e;

char* enriched_mappings_offer_dto_supply_schedule_days_ToString(_api__enriched_mappings_offer_dto__e supply_schedule_days);

_api__enriched_mappings_offer_dto__e enriched_mappings_offer_dto_supply_schedule_days_FromString(char* supply_schedule_days);

// Enum  for enriched_mappings_offer_dto

typedef enum  { _api__enriched_mappings_offer_dto__NULL = 0, _api__enriched_mappings_offer_dto__ACTIVE, _api__enriched_mappings_offer_dto__INACTIVE, _api__enriched_mappings_offer_dto__DELISTED } _api__enriched_mappings_offer_dto__e;

char* enriched_mappings_offer_dto_availability_ToString(_api__enriched_mappings_offer_dto__e availability);

_api__enriched_mappings_offer_dto__e enriched_mappings_offer_dto_availability_FromString(char* availability);



typedef struct enriched_mappings_offer_dto_t {
    char *name; // string
    char *shop_sku; // string
    char *category; // string
    char *vendor; // string
    char *vendor_code; // string
    char *description; // string
    char *id; // string
    long feed_id; //numeric
    list_t *barcodes; //primitive container
    list_t *urls; //primitive container
    list_t *pictures; //primitive container
    char *manufacturer; // string
    list_t *manufacturer_countries; //primitive container
    int min_shipment; //numeric
    int transport_unit_size; //numeric
    int quantum_of_supply; //numeric
    int delivery_duration_days; //numeric
    int box_count; //numeric
    list_t *customs_commodity_codes; //primitive container
    struct offer_weight_dimensions_dto_t *weight_dimensions; //model
    list_t *supply_schedule_days; //nonprimitive container
    int shelf_life_days; //numeric
    int life_time_days; //numeric
    int guarantee_period_days; //numeric
    struct offer_processing_state_dto_t *processing_state; //model
    offer_availability_status_type_t *availability; // custom
    struct time_period_dto_t *shelf_life; //model
    struct time_period_dto_t *life_time; //model
    struct time_period_dto_t *guarantee_period; //model
    char *certificate; // string
    double price; //numeric
    long market_category_id; //numeric
    char *market_category_name; // string
    long market_model_id; //numeric
    char *market_model_name; // string
    long market_sku; //numeric
    char *market_sku_name; // string

} enriched_mappings_offer_dto_t;

enriched_mappings_offer_dto_t *enriched_mappings_offer_dto_create(
    char *name,
    char *shop_sku,
    char *category,
    char *vendor,
    char *vendor_code,
    char *description,
    char *id,
    long feed_id,
    list_t *barcodes,
    list_t *urls,
    list_t *pictures,
    char *manufacturer,
    list_t *manufacturer_countries,
    int min_shipment,
    int transport_unit_size,
    int quantum_of_supply,
    int delivery_duration_days,
    int box_count,
    list_t *customs_commodity_codes,
    offer_weight_dimensions_dto_t *weight_dimensions,
    list_t *supply_schedule_days,
    int shelf_life_days,
    int life_time_days,
    int guarantee_period_days,
    offer_processing_state_dto_t *processing_state,
    offer_availability_status_type_t *availability,
    time_period_dto_t *shelf_life,
    time_period_dto_t *life_time,
    time_period_dto_t *guarantee_period,
    char *certificate,
    double price,
    long market_category_id,
    char *market_category_name,
    long market_model_id,
    char *market_model_name,
    long market_sku,
    char *market_sku_name
);

void enriched_mappings_offer_dto_free(enriched_mappings_offer_dto_t *enriched_mappings_offer_dto);

enriched_mappings_offer_dto_t *enriched_mappings_offer_dto_parseFromJSON(cJSON *enriched_mappings_offer_dtoJSON);

cJSON *enriched_mappings_offer_dto_convertToJSON(enriched_mappings_offer_dto_t *enriched_mappings_offer_dto);

#endif /* _enriched_mappings_offer_dto_H_ */

