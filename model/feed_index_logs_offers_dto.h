/*
 * feed_index_logs_offers_dto.h
 *
 * Информация о предложениях прайс-листа.
 */

#ifndef _feed_index_logs_offers_dto_H_
#define _feed_index_logs_offers_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_offers_dto_t feed_index_logs_offers_dto_t;




typedef struct feed_index_logs_offers_dto_t {
    long rejected_count; //numeric
    long total_count; //numeric

} feed_index_logs_offers_dto_t;

feed_index_logs_offers_dto_t *feed_index_logs_offers_dto_create(
    long rejected_count,
    long total_count
);

void feed_index_logs_offers_dto_free(feed_index_logs_offers_dto_t *feed_index_logs_offers_dto);

feed_index_logs_offers_dto_t *feed_index_logs_offers_dto_parseFromJSON(cJSON *feed_index_logs_offers_dtoJSON);

cJSON *feed_index_logs_offers_dto_convertToJSON(feed_index_logs_offers_dto_t *feed_index_logs_offers_dto);

#endif /* _feed_index_logs_offers_dto_H_ */

