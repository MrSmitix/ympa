/*
 * feed_index_logs_result_dto.h
 *
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */

#ifndef _feed_index_logs_result_dto_H_
#define _feed_index_logs_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_result_dto_t feed_index_logs_result_dto_t;

#include "feed_index_logs_feed_dto.h"
#include "feed_index_logs_record_dto.h"



typedef struct feed_index_logs_result_dto_t {
    struct feed_index_logs_feed_dto_t *feed; //model
    list_t *index_log_records; //nonprimitive container
    long total; //numeric

} feed_index_logs_result_dto_t;

feed_index_logs_result_dto_t *feed_index_logs_result_dto_create(
    feed_index_logs_feed_dto_t *feed,
    list_t *index_log_records,
    long total
);

void feed_index_logs_result_dto_free(feed_index_logs_result_dto_t *feed_index_logs_result_dto);

feed_index_logs_result_dto_t *feed_index_logs_result_dto_parseFromJSON(cJSON *feed_index_logs_result_dtoJSON);

cJSON *feed_index_logs_result_dto_convertToJSON(feed_index_logs_result_dto_t *feed_index_logs_result_dto);

#endif /* _feed_index_logs_result_dto_H_ */

