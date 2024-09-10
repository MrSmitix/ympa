/*
 * orders_stats_item_dto.h
 *
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
 */

#ifndef _orders_stats_item_dto_H_
#define _orders_stats_item_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct orders_stats_item_dto_t orders_stats_item_dto_t;

#include "orders_stats_details_dto.h"
#include "orders_stats_price_dto.h"
#include "orders_stats_warehouse_dto.h"



typedef struct orders_stats_item_dto_t {
    char *offer_name; // string
    long market_sku; //numeric
    char *shop_sku; // string
    int count; //numeric
    list_t *prices; //nonprimitive container
    struct orders_stats_warehouse_dto_t *warehouse; //model
    list_t *details; //nonprimitive container
    list_t *cis_list; //primitive container
    int initial_count; //numeric
    int bid_fee; //numeric
    double cofinance_threshold; //numeric
    double cofinance_value; //numeric

} orders_stats_item_dto_t;

orders_stats_item_dto_t *orders_stats_item_dto_create(
    char *offer_name,
    long market_sku,
    char *shop_sku,
    int count,
    list_t *prices,
    orders_stats_warehouse_dto_t *warehouse,
    list_t *details,
    list_t *cis_list,
    int initial_count,
    int bid_fee,
    double cofinance_threshold,
    double cofinance_value
);

void orders_stats_item_dto_free(orders_stats_item_dto_t *orders_stats_item_dto);

orders_stats_item_dto_t *orders_stats_item_dto_parseFromJSON(cJSON *orders_stats_item_dtoJSON);

cJSON *orders_stats_item_dto_convertToJSON(orders_stats_item_dto_t *orders_stats_item_dto);

#endif /* _orders_stats_item_dto_H_ */

