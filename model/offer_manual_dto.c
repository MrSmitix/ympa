#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_manual_dto.h"



offer_manual_dto_t *offer_manual_dto_create(
    char *url,
    char *title
    ) {
    offer_manual_dto_t *offer_manual_dto_local_var = malloc(sizeof(offer_manual_dto_t));
    if (!offer_manual_dto_local_var) {
        return NULL;
    }
    offer_manual_dto_local_var->url = url;
    offer_manual_dto_local_var->title = title;

    return offer_manual_dto_local_var;
}


void offer_manual_dto_free(offer_manual_dto_t *offer_manual_dto) {
    if(NULL == offer_manual_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_manual_dto->url) {
        free(offer_manual_dto->url);
        offer_manual_dto->url = NULL;
    }
    if (offer_manual_dto->title) {
        free(offer_manual_dto->title);
        offer_manual_dto->title = NULL;
    }
    free(offer_manual_dto);
}

cJSON *offer_manual_dto_convertToJSON(offer_manual_dto_t *offer_manual_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_manual_dto->url
    if (!offer_manual_dto->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", offer_manual_dto->url) == NULL) {
    goto fail; //String
    }


    // offer_manual_dto->title
    if(offer_manual_dto->title) {
    if(cJSON_AddStringToObject(item, "title", offer_manual_dto->title) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_manual_dto_t *offer_manual_dto_parseFromJSON(cJSON *offer_manual_dtoJSON){

    offer_manual_dto_t *offer_manual_dto_local_var = NULL;

    // offer_manual_dto->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(offer_manual_dtoJSON, "url");
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // offer_manual_dto->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(offer_manual_dtoJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    offer_manual_dto_local_var = offer_manual_dto_create (
        strdup(url->valuestring),
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL
        );

    return offer_manual_dto_local_var;
end:
    return NULL;

}
