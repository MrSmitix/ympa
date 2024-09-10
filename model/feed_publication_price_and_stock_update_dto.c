#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feed_publication_price_and_stock_update_dto.h"



feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto_create(
    char *file_time,
    char *published_time
    ) {
    feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto_local_var = malloc(sizeof(feed_publication_price_and_stock_update_dto_t));
    if (!feed_publication_price_and_stock_update_dto_local_var) {
        return NULL;
    }
    feed_publication_price_and_stock_update_dto_local_var->file_time = file_time;
    feed_publication_price_and_stock_update_dto_local_var->published_time = published_time;

    return feed_publication_price_and_stock_update_dto_local_var;
}


void feed_publication_price_and_stock_update_dto_free(feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto) {
    if(NULL == feed_publication_price_and_stock_update_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feed_publication_price_and_stock_update_dto->file_time) {
        free(feed_publication_price_and_stock_update_dto->file_time);
        feed_publication_price_and_stock_update_dto->file_time = NULL;
    }
    if (feed_publication_price_and_stock_update_dto->published_time) {
        free(feed_publication_price_and_stock_update_dto->published_time);
        feed_publication_price_and_stock_update_dto->published_time = NULL;
    }
    free(feed_publication_price_and_stock_update_dto);
}

cJSON *feed_publication_price_and_stock_update_dto_convertToJSON(feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto) {
    cJSON *item = cJSON_CreateObject();

    // feed_publication_price_and_stock_update_dto->file_time
    if(feed_publication_price_and_stock_update_dto->file_time) {
    if(cJSON_AddStringToObject(item, "fileTime", feed_publication_price_and_stock_update_dto->file_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feed_publication_price_and_stock_update_dto->published_time
    if(feed_publication_price_and_stock_update_dto->published_time) {
    if(cJSON_AddStringToObject(item, "publishedTime", feed_publication_price_and_stock_update_dto->published_time) == NULL) {
    goto fail; //Date-Time
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto_parseFromJSON(cJSON *feed_publication_price_and_stock_update_dtoJSON){

    feed_publication_price_and_stock_update_dto_t *feed_publication_price_and_stock_update_dto_local_var = NULL;

    // feed_publication_price_and_stock_update_dto->file_time
    cJSON *file_time = cJSON_GetObjectItemCaseSensitive(feed_publication_price_and_stock_update_dtoJSON, "fileTime");
    if (file_time) { 
    if(!cJSON_IsString(file_time) && !cJSON_IsNull(file_time))
    {
    goto end; //DateTime
    }
    }

    // feed_publication_price_and_stock_update_dto->published_time
    cJSON *published_time = cJSON_GetObjectItemCaseSensitive(feed_publication_price_and_stock_update_dtoJSON, "publishedTime");
    if (published_time) { 
    if(!cJSON_IsString(published_time) && !cJSON_IsNull(published_time))
    {
    goto end; //DateTime
    }
    }


    feed_publication_price_and_stock_update_dto_local_var = feed_publication_price_and_stock_update_dto_create (
        file_time && !cJSON_IsNull(file_time) ? strdup(file_time->valuestring) : NULL,
        published_time && !cJSON_IsNull(published_time) ? strdup(published_time->valuestring) : NULL
        );

    return feed_publication_price_and_stock_update_dto_local_var;
end:
    return NULL;

}
