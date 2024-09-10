#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_index_logs_result_dto.h"



feed_index_logs_result_dto_t *feed_index_logs_result_dto_create(
    feed_index_logs_feed_dto_t *feed,
    list_t *index_log_records,
    long total
    ) {
    feed_index_logs_result_dto_t *feed_index_logs_result_dto_local_var = malloc(sizeof(feed_index_logs_result_dto_t));
    if (!feed_index_logs_result_dto_local_var) {
        return NULL;
    }
    feed_index_logs_result_dto_local_var->feed = feed;
    feed_index_logs_result_dto_local_var->index_log_records = index_log_records;
    feed_index_logs_result_dto_local_var->total = total;

    return feed_index_logs_result_dto_local_var;
}


void feed_index_logs_result_dto_free(feed_index_logs_result_dto_t *feed_index_logs_result_dto) {
    if(NULL == feed_index_logs_result_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_index_logs_result_dto->feed) {
        feed_index_logs_feed_dto_free(feed_index_logs_result_dto->feed);
        feed_index_logs_result_dto->feed = NULL;
    }
    if (feed_index_logs_result_dto->index_log_records) {
        list_ForEach(listEntry, feed_index_logs_result_dto->index_log_records) {
            feed_index_logs_record_dto_free(listEntry->data);
        }
        list_freeList(feed_index_logs_result_dto->index_log_records);
        feed_index_logs_result_dto->index_log_records = NULL;
    }
    free(feed_index_logs_result_dto);
}

cJSON *feed_index_logs_result_dto_convertToJSON(feed_index_logs_result_dto_t *feed_index_logs_result_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_index_logs_result_dto->feed
    if(feed_index_logs_result_dto->feed) {
    cJSON *feed_local_JSON = feed_index_logs_feed_dto_convertToJSON(feed_index_logs_result_dto->feed);
    if(feed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "feed", feed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feed_index_logs_result_dto->index_log_records
    if (!feed_index_logs_result_dto->index_log_records) {
        goto fail;
    }
    cJSON *index_log_records = cJSON_AddArrayToObject(item, "indexLogRecords");
    if(index_log_records == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *index_log_recordsListEntry;
    if (feed_index_logs_result_dto->index_log_records) {
    list_ForEach(index_log_recordsListEntry, feed_index_logs_result_dto->index_log_records) {
    cJSON *itemLocal = feed_index_logs_record_dto_convertToJSON(index_log_recordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(index_log_records, itemLocal);
    }
    }


    // feed_index_logs_result_dto->total
    if(feed_index_logs_result_dto->total) {
    if(cJSON_AddNumberToObject(item, "total", feed_index_logs_result_dto->total) == NULL) {
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

feed_index_logs_result_dto_t *feed_index_logs_result_dto_parseFromJSON(cJSON *feed_index_logs_result_dtoJSON){

    feed_index_logs_result_dto_t *feed_index_logs_result_dto_local_var = NULL;

    // define the local variable for feed_index_logs_result_dto->feed
    feed_index_logs_feed_dto_t *feed_local_nonprim = NULL;

    // define the local list for feed_index_logs_result_dto->index_log_records
    list_t *index_log_recordsList = NULL;

    // feed_index_logs_result_dto->feed
    cJSON *feed = cJSON_GetObjectItemCaseSensitive(feed_index_logs_result_dtoJSON, "feed");
    if (feed) { 
    feed_local_nonprim = feed_index_logs_feed_dto_parseFromJSON(feed); //nonprimitive
    }

    // feed_index_logs_result_dto->index_log_records
    cJSON *index_log_records = cJSON_GetObjectItemCaseSensitive(feed_index_logs_result_dtoJSON, "indexLogRecords");
    if (!index_log_records) {
        goto end;
    }

    
    cJSON *index_log_records_local_nonprimitive = NULL;
    if(!cJSON_IsArray(index_log_records)){
        goto end; //nonprimitive container
    }

    index_log_recordsList = list_createList();

    cJSON_ArrayForEach(index_log_records_local_nonprimitive,index_log_records )
    {
        if(!cJSON_IsObject(index_log_records_local_nonprimitive)){
            goto end;
        }
        feed_index_logs_record_dto_t *index_log_recordsItem = feed_index_logs_record_dto_parseFromJSON(index_log_records_local_nonprimitive);

        list_addElement(index_log_recordsList, index_log_recordsItem);
    }

    // feed_index_logs_result_dto->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(feed_index_logs_result_dtoJSON, "total");
    if (total) { 
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }
    }


    feed_index_logs_result_dto_local_var = feed_index_logs_result_dto_create (
        feed ? feed_local_nonprim : NULL,
        index_log_recordsList,
        total ? total->valuedouble : 0
        );

    return feed_index_logs_result_dto_local_var;
end:
    if (feed_local_nonprim) {
        feed_index_logs_feed_dto_free(feed_local_nonprim);
        feed_local_nonprim = NULL;
    }
    if (index_log_recordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, index_log_recordsList) {
            feed_index_logs_record_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(index_log_recordsList);
        index_log_recordsList = NULL;
    }
    return NULL;

}
