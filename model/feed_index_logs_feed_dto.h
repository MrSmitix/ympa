/*
 * feed_index_logs_feed_dto.h
 *
 * Информация о прайс-листе.
 */

#ifndef _feed_index_logs_feed_dto_H_
#define _feed_index_logs_feed_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_feed_dto_t feed_index_logs_feed_dto_t;




typedef struct feed_index_logs_feed_dto_t {
    long id; //numeric

} feed_index_logs_feed_dto_t;

feed_index_logs_feed_dto_t *feed_index_logs_feed_dto_create(
    long id
);

void feed_index_logs_feed_dto_free(feed_index_logs_feed_dto_t *feed_index_logs_feed_dto);

feed_index_logs_feed_dto_t *feed_index_logs_feed_dto_parseFromJSON(cJSON *feed_index_logs_feed_dtoJSON);

cJSON *feed_index_logs_feed_dto_convertToJSON(feed_index_logs_feed_dto_t *feed_index_logs_feed_dto);

#endif /* _feed_index_logs_feed_dto_H_ */

