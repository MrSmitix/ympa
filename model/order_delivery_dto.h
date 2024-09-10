/*
 * order_delivery_dto.h
 *
 * Информация о доставке.
 */

#ifndef _order_delivery_dto_H_
#define _order_delivery_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_dto_t order_delivery_dto_t;

#include "order_courier_dto.h"
#include "order_delivery_address_dto.h"
#include "order_delivery_dates_dto.h"
#include "order_delivery_dispatch_type.h"
#include "order_delivery_eac_type.h"
#include "order_delivery_partner_type.h"
#include "order_delivery_type.h"
#include "order_lift_type.h"
#include "order_shipment_dto.h"
#include "order_track_dto.h"
#include "order_vat_type.h"
#include "region_dto.h"

// Enum  for order_delivery_dto

typedef enum  { _api__order_delivery_dto__NULL = 0, _api__order_delivery_dto__DELIVERY, _api__order_delivery_dto__PICKUP, _api__order_delivery_dto__POST, _api__order_delivery_dto__DIGITAL, _api__order_delivery_dto__UNKNOWN } _api__order_delivery_dto__e;

char* order_delivery_dto_type_ToString(_api__order_delivery_dto__e type);

_api__order_delivery_dto__e order_delivery_dto_type_FromString(char* type);

// Enum  for order_delivery_dto

typedef enum  { _api__order_delivery_dto__NULL = 0, _api__order_delivery_dto__SHOP, _api__order_delivery_dto__YANDEX_MARKET, _api__order_delivery_dto__UNKNOWN } _api__order_delivery_dto__e;

char* order_delivery_dto_delivery_partner_type_ToString(_api__order_delivery_dto__e delivery_partner_type);

_api__order_delivery_dto__e order_delivery_dto_delivery_partner_type_FromString(char* delivery_partner_type);

// Enum  for order_delivery_dto

typedef enum  { _api__order_delivery_dto__NULL = 0, _api__order_delivery_dto__NO_VAT, _api__order_delivery_dto__VAT_0, _api__order_delivery_dto__VAT_10, _api__order_delivery_dto__VAT_10_110, _api__order_delivery_dto__VAT_20, _api__order_delivery_dto__VAT_20_120, _api__order_delivery_dto__VAT_18, _api__order_delivery_dto__VAT_18_118, _api__order_delivery_dto__UNKNOWN_VALUE } _api__order_delivery_dto__e;

char* order_delivery_dto_vat_ToString(_api__order_delivery_dto__e vat);

_api__order_delivery_dto__e order_delivery_dto_vat_FromString(char* vat);

// Enum  for order_delivery_dto

typedef enum  { _api__order_delivery_dto__NULL = 0, _api__order_delivery_dto__NOT_NEEDED, _api__order_delivery_dto__MANUAL, _api__order_delivery_dto__ELEVATOR, _api__order_delivery_dto__CARGO_ELEVATOR, _api__order_delivery_dto__FREE, _api__order_delivery_dto__UNKNOWN } _api__order_delivery_dto__e;

char* order_delivery_dto_lift_type_ToString(_api__order_delivery_dto__e lift_type);

_api__order_delivery_dto__e order_delivery_dto_lift_type_FromString(char* lift_type);

// Enum  for order_delivery_dto

typedef enum  { _api__order_delivery_dto__NULL = 0, _api__order_delivery_dto__UNKNOWN, _api__order_delivery_dto__BUYER, _api__order_delivery_dto__MARKET_PARTNER_OUTLET, _api__order_delivery_dto__MARKET_BRANDED_OUTLET, _api__order_delivery_dto__SHOP_OUTLET, _api__order_delivery_dto__DROPOFF } _api__order_delivery_dto__e;

char* order_delivery_dto_dispatch_type_ToString(_api__order_delivery_dto__e dispatch_type);

_api__order_delivery_dto__e order_delivery_dto_dispatch_type_FromString(char* dispatch_type);

// Enum  for order_delivery_dto

typedef enum  { _api__order_delivery_dto__NULL = 0, _api__order_delivery_dto__MERCHANT_TO_COURIER, _api__order_delivery_dto__COURIER_TO_MERCHANT, _api__order_delivery_dto__CHECKING_BY_MERCHANT } _api__order_delivery_dto__e;

char* order_delivery_dto_eac_type_ToString(_api__order_delivery_dto__e eac_type);

_api__order_delivery_dto__e order_delivery_dto_eac_type_FromString(char* eac_type);



typedef struct order_delivery_dto_t {
    char *id; // string
    order_delivery_type_t *type; // custom
    char *service_name; // string
    double price; //numeric
    order_delivery_partner_type_t *delivery_partner_type; // custom
    struct order_courier_dto_t *courier; //model
    struct order_delivery_dates_dto_t *dates; //model
    struct region_dto_t *region; //model
    struct order_delivery_address_dto_t *address; //model
    order_vat_type_t *vat; // custom
    long delivery_service_id; //numeric
    order_lift_type_t *lift_type; // custom
    double lift_price; //numeric
    char *outlet_code; // string
    char *outlet_storage_limit_date; // string
    order_delivery_dispatch_type_t *dispatch_type; // custom
    list_t *tracks; //nonprimitive container
    list_t *shipments; //nonprimitive container
    int estimated; //boolean
    order_delivery_eac_type_t *eac_type; // custom
    char *eac_code; // string

} order_delivery_dto_t;

order_delivery_dto_t *order_delivery_dto_create(
    char *id,
    order_delivery_type_t *type,
    char *service_name,
    double price,
    order_delivery_partner_type_t *delivery_partner_type,
    order_courier_dto_t *courier,
    order_delivery_dates_dto_t *dates,
    region_dto_t *region,
    order_delivery_address_dto_t *address,
    order_vat_type_t *vat,
    long delivery_service_id,
    order_lift_type_t *lift_type,
    double lift_price,
    char *outlet_code,
    char *outlet_storage_limit_date,
    order_delivery_dispatch_type_t *dispatch_type,
    list_t *tracks,
    list_t *shipments,
    int estimated,
    order_delivery_eac_type_t *eac_type,
    char *eac_code
);

void order_delivery_dto_free(order_delivery_dto_t *order_delivery_dto);

order_delivery_dto_t *order_delivery_dto_parseFromJSON(cJSON *order_delivery_dtoJSON);

cJSON *order_delivery_dto_convertToJSON(order_delivery_dto_t *order_delivery_dto);

#endif /* _order_delivery_dto_H_ */

