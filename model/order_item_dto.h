/*
 * order_item_dto.h
 *
 * Список товаров в заказе.
 */

#ifndef _order_item_dto_H_
#define _order_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_item_dto_t order_item_dto_t;

#include "order_item_detail_dto.h"
#include "order_item_instance_dto.h"
#include "order_item_instance_type.h"
#include "order_item_promo_dto.h"
#include "order_item_subsidy_dto.h"
#include "order_vat_type.h"

// Enum  for order_item_dto

typedef enum  { _api__order_item_dto__NULL = 0, _api__order_item_dto__NO_VAT, _api__order_item_dto__VAT_0, _api__order_item_dto__VAT_10, _api__order_item_dto__VAT_10_110, _api__order_item_dto__VAT_20, _api__order_item_dto__VAT_20_120, _api__order_item_dto__VAT_18, _api__order_item_dto__VAT_18_118, _api__order_item_dto__UNKNOWN_VALUE } _api__order_item_dto__e;

char* order_item_dto_vat_ToString(_api__order_item_dto__e vat);

_api__order_item_dto__e order_item_dto_vat_FromString(char* vat);

// Enum  for order_item_dto

typedef enum  { _api__order_item_dto__NULL = 0, _api__order_item_dto__CIS, _api__order_item_dto__UIN, _api__order_item_dto__RNPT, _api__order_item_dto__GTD } _api__order_item_dto__e;

char* order_item_dto_required_instance_types_ToString(_api__order_item_dto__e required_instance_types);

_api__order_item_dto__e order_item_dto_required_instance_types_FromString(char* required_instance_types);



typedef struct order_item_dto_t {
    long id; //numeric
    char *offer_id; // string
    char *offer_name; // string
    double price; //numeric
    double buyer_price; //numeric
    double buyer_price_before_discount; //numeric
    double price_before_discount; //numeric
    int count; //numeric
    order_vat_type_t *vat; // custom
    char *shop_sku; // string
    double subsidy; //numeric
    char *partner_warehouse_id; // string
    list_t *promos; //nonprimitive container
    list_t *instances; //nonprimitive container
    list_t *details; //nonprimitive container
    list_t *subsidies; //nonprimitive container
    list_t *required_instance_types; //nonprimitive container

} order_item_dto_t;

order_item_dto_t *order_item_dto_create(
    long id,
    char *offer_id,
    char *offer_name,
    double price,
    double buyer_price,
    double buyer_price_before_discount,
    double price_before_discount,
    int count,
    order_vat_type_t *vat,
    char *shop_sku,
    double subsidy,
    char *partner_warehouse_id,
    list_t *promos,
    list_t *instances,
    list_t *details,
    list_t *subsidies,
    list_t *required_instance_types
);

void order_item_dto_free(order_item_dto_t *order_item_dto);

order_item_dto_t *order_item_dto_parseFromJSON(cJSON *order_item_dtoJSON);

cJSON *order_item_dto_convertToJSON(order_item_dto_t *order_item_dto);

#endif /* _order_item_dto_H_ */

