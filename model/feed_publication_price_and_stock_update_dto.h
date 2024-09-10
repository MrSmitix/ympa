/*
 * feed_publication_price_and_stock_update_dto.h
 *
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
 */

#ifndef _feed_publication_price_and_stock_update_dto_H_
#define _feed_publication_price_and_stock_update_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_publication_price_and_stock_update_dto_t feed_publication_price_and_stock_update_dto_t;




typedef struct feed_publication_price_and_stock_update_dto_t {
    char *file_time; //date time
    char *published_time; //date time

} feed_publication_price_and_stock_update_dto_t;

feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto_create(
    char *file_time,
    char *published_time
);

void feed_publication_price_and_stock_update_dto_free(feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto);

feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto_parseFromJSON(cJSON *feed_publication_price_and_stock_update_dtoJSON);

cJSON *feed_publication_price_and_stock_update_dto_convertToJSON(feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto);

#endif /* _feed_publication_price_and_stock_update_dto_H_ */

