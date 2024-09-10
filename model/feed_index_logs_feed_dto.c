#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_index_logs_feed_dto.h"



feed_index_logs_feed_dto_t *feed_index_logs_feed_dto_create(
    long id
    ) {
    feed_index_logs_feed_dto_t *feed_index_logs_feed_dto_local_var = malloc(sizeof(feed_index_logs_feed_dto_t));
    if (!feed_index_logs_feed_dto_local_var) {
        return NULL;
    }
    feed_index_logs_feed_dto_local_var->id = id;

    return feed_index_logs_feed_dto_local_var;
}


void feed_index_logs_feed_dto_free(feed_index_logs_feed_dto_t *feed_index_logs_feed_dto) {
    if(NULL == feed_index_logs_feed_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(feed_index_logs_feed_dto);
}

cJSON *feed_index_logs_feed_dto_convertToJSON(feed_index_logs_feed_dto_t *feed_index_logs_feed_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_index_logs_feed_dto->id
    if(feed_index_logs_feed_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", feed_index_logs_feed_dto->id) == NULL) {
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

feed_index_logs_feed_dto_t *feed_index_logs_feed_dto_parseFromJSON(cJSON *feed_index_logs_feed_dtoJSON){

    feed_index_logs_feed_dto_t *feed_index_logs_feed_dto_local_var = NULL;

    // feed_index_logs_feed_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(feed_index_logs_feed_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }


    feed_index_logs_feed_dto_local_var = feed_index_logs_feed_dto_create (
        id ? id->valuedouble : 0
        );

    return feed_index_logs_feed_dto_local_var;
end:
    return NULL;

}
