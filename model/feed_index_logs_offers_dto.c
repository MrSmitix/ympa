#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_index_logs_offers_dto.h"



feed_index_logs_offers_dto_t *feed_index_logs_offers_dto_create(
    long rejected_count,
    long total_count
    ) {
    feed_index_logs_offers_dto_t *feed_index_logs_offers_dto_local_var = malloc(sizeof(feed_index_logs_offers_dto_t));
    if (!feed_index_logs_offers_dto_local_var) {
        return NULL;
    }
    feed_index_logs_offers_dto_local_var->rejected_count = rejected_count;
    feed_index_logs_offers_dto_local_var->total_count = total_count;

    return feed_index_logs_offers_dto_local_var;
}


void feed_index_logs_offers_dto_free(feed_index_logs_offers_dto_t *feed_index_logs_offers_dto) {
    if(NULL == feed_index_logs_offers_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(feed_index_logs_offers_dto);
}

cJSON *feed_index_logs_offers_dto_convertToJSON(feed_index_logs_offers_dto_t *feed_index_logs_offers_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_index_logs_offers_dto->rejected_count
    if(feed_index_logs_offers_dto->rejected_count) {
    if(cJSON_AddNumberToObject(item, "rejectedCount", feed_index_logs_offers_dto->rejected_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // feed_index_logs_offers_dto->total_count
    if(feed_index_logs_offers_dto->total_count) {
    if(cJSON_AddNumberToObject(item, "totalCount", feed_index_logs_offers_dto->total_count) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feed_index_logs_offers_dto_t *feed_index_logs_offers_dto_parseFromJSON(cJSON *feed_index_logs_offers_dtoJSON){

    feed_index_logs_offers_dto_t *feed_index_logs_offers_dto_local_var = NULL;

    // feed_index_logs_offers_dto->rejected_count
    cJSON *rejected_count = cJSON_GetObjectItemCaseSensitive(feed_index_logs_offers_dtoJSON, "rejectedCount");
    if (rejected_count) { 
    if(!cJSON_IsNumber(rejected_count))
    {
    goto end; //Numeric
    }
    }

    // feed_index_logs_offers_dto->total_count
    cJSON *total_count = cJSON_GetObjectItemCaseSensitive(feed_index_logs_offers_dtoJSON, "totalCount");
    if (total_count) { 
    if(!cJSON_IsNumber(total_count))
    {
    goto end; //Numeric
    }
    }


    feed_index_logs_offers_dto_local_var = feed_index_logs_offers_dto_create (
        rejected_count ? rejected_count->valuedouble : 0,
        total_count ? total_count->valuedouble : 0
        );

    return feed_index_logs_offers_dto_local_var;
end:
    return NULL;

}
