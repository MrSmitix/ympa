/*
 * get_goods_stats_request.h
 *
 * Запрос отчета по товарам.
 */

#ifndef _get_goods_stats_request_H_
#define _get_goods_stats_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_goods_stats_request_t get_goods_stats_request_t;




typedef struct get_goods_stats_request_t {
    list_t *shop_skus; //primitive container

} get_goods_stats_request_t;

get_goods_stats_request_t *get_goods_stats_request_create(
    list_t *shop_skus
);

void get_goods_stats_request_free(get_goods_stats_request_t *get_goods_stats_request);

get_goods_stats_request_t *get_goods_stats_request_parseFromJSON(cJSON *get_goods_stats_requestJSON);

cJSON *get_goods_stats_request_convertToJSON(get_goods_stats_request_t *get_goods_stats_request);

#endif /* _get_goods_stats_request_H_ */

