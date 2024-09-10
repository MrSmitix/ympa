#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_dto.h"



goods_feedback_dto_t *goods_feedback_dto_create(
    long feedback_id,
    char *created_at,
    int need_reaction,
    goods_feedback_identifiers_dto_t *identifiers,
    char *author,
    goods_feedback_description_dto_t *description,
    goods_feedback_media_dto_t *media,
    goods_feedback_statistics_dto_t *statistics
    ) {
    goods_feedback_dto_t *goods_feedback_dto_local_var = malloc(sizeof(goods_feedback_dto_t));
    if (!goods_feedback_dto_local_var) {
        return NULL;
    }
    goods_feedback_dto_local_var->feedback_id = feedback_id;
    goods_feedback_dto_local_var->created_at = created_at;
    goods_feedback_dto_local_var->need_reaction = need_reaction;
    goods_feedback_dto_local_var->identifiers = identifiers;
    goods_feedback_dto_local_var->author = author;
    goods_feedback_dto_local_var->description = description;
    goods_feedback_dto_local_var->media = media;
    goods_feedback_dto_local_var->statistics = statistics;

    return goods_feedback_dto_local_var;
}


void goods_feedback_dto_free(goods_feedback_dto_t *goods_feedback_dto) {
    if(NULL == goods_feedback_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_feedback_dto->created_at) {
        free(goods_feedback_dto->created_at);
        goods_feedback_dto->created_at = NULL;
    }
    if (goods_feedback_dto->identifiers) {
        goods_feedback_identifiers_dto_free(goods_feedback_dto->identifiers);
        goods_feedback_dto->identifiers = NULL;
    }
    if (goods_feedback_dto->author) {
        free(goods_feedback_dto->author);
        goods_feedback_dto->author = NULL;
    }
    if (goods_feedback_dto->description) {
        goods_feedback_description_dto_free(goods_feedback_dto->description);
        goods_feedback_dto->description = NULL;
    }
    if (goods_feedback_dto->media) {
        goods_feedback_media_dto_free(goods_feedback_dto->media);
        goods_feedback_dto->media = NULL;
    }
    if (goods_feedback_dto->statistics) {
        goods_feedback_statistics_dto_free(goods_feedback_dto->statistics);
        goods_feedback_dto->statistics = NULL;
    }
    free(goods_feedback_dto);
}

cJSON *goods_feedback_dto_convertToJSON(goods_feedback_dto_t *goods_feedback_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_dto->feedback_id
    if (!goods_feedback_dto->feedback_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "feedbackId", goods_feedback_dto->feedback_id) == NULL) {
    goto fail; //Numeric
    }


    // goods_feedback_dto->created_at
    if (!goods_feedback_dto->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "createdAt", goods_feedback_dto->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // goods_feedback_dto->need_reaction
    if (!goods_feedback_dto->need_reaction) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "needReaction", goods_feedback_dto->need_reaction) == NULL) {
    goto fail; //Bool
    }


    // goods_feedback_dto->identifiers
    if (!goods_feedback_dto->identifiers) {
        goto fail;
    }
    cJSON *identifiers_local_JSON = goods_feedback_identifiers_dto_convertToJSON(goods_feedback_dto->identifiers);
    if(identifiers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "identifiers", identifiers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // goods_feedback_dto->author
    if(goods_feedback_dto->author) {
    if(cJSON_AddStringToObject(item, "author", goods_feedback_dto->author) == NULL) {
    goto fail; //String
    }
    }


    // goods_feedback_dto->description
    if(goods_feedback_dto->description) {
    cJSON *description_local_JSON = goods_feedback_description_dto_convertToJSON(goods_feedback_dto->description);
    if(description_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "description", description_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // goods_feedback_dto->media
    if(goods_feedback_dto->media) {
    cJSON *media_local_JSON = goods_feedback_media_dto_convertToJSON(goods_feedback_dto->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // goods_feedback_dto->statistics
    if (!goods_feedback_dto->statistics) {
        goto fail;
    }
    cJSON *statistics_local_JSON = goods_feedback_statistics_dto_convertToJSON(goods_feedback_dto->statistics);
    if(statistics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "statistics", statistics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

goods_feedback_dto_t *goods_feedback_dto_parseFromJSON(cJSON *goods_feedback_dtoJSON){

    goods_feedback_dto_t *goods_feedback_dto_local_var = NULL;

    // define the local variable for goods_feedback_dto->identifiers
    goods_feedback_identifiers_dto_t *identifiers_local_nonprim = NULL;

    // define the local variable for goods_feedback_dto->description
    goods_feedback_description_dto_t *description_local_nonprim = NULL;

    // define the local variable for goods_feedback_dto->media
    goods_feedback_media_dto_t *media_local_nonprim = NULL;

    // define the local variable for goods_feedback_dto->statistics
    goods_feedback_statistics_dto_t *statistics_local_nonprim = NULL;

    // goods_feedback_dto->feedback_id
    cJSON *feedback_id = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "feedbackId");
    if (!feedback_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(feedback_id))
    {
    goto end; //Numeric
    }

    // goods_feedback_dto->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "createdAt");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // goods_feedback_dto->need_reaction
    cJSON *need_reaction = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "needReaction");
    if (!need_reaction) {
        goto end;
    }

    
    if(!cJSON_IsBool(need_reaction))
    {
    goto end; //Bool
    }

    // goods_feedback_dto->identifiers
    cJSON *identifiers = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "identifiers");
    if (!identifiers) {
        goto end;
    }

    
    identifiers_local_nonprim = goods_feedback_identifiers_dto_parseFromJSON(identifiers); //nonprimitive

    // goods_feedback_dto->author
    cJSON *author = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "author");
    if (author) { 
    if(!cJSON_IsString(author) && !cJSON_IsNull(author))
    {
    goto end; //String
    }
    }

    // goods_feedback_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "description");
    if (description) { 
    description_local_nonprim = goods_feedback_description_dto_parseFromJSON(description); //nonprimitive
    }

    // goods_feedback_dto->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "media");
    if (media) { 
    media_local_nonprim = goods_feedback_media_dto_parseFromJSON(media); //nonprimitive
    }

    // goods_feedback_dto->statistics
    cJSON *statistics = cJSON_GetObjectItemCaseSensitive(goods_feedback_dtoJSON, "statistics");
    if (!statistics) {
        goto end;
    }

    
    statistics_local_nonprim = goods_feedback_statistics_dto_parseFromJSON(statistics); //nonprimitive


    goods_feedback_dto_local_var = goods_feedback_dto_create (
        feedback_id->valuedouble,
        strdup(created_at->valuestring),
        need_reaction->valueint,
        identifiers_local_nonprim,
        author && !cJSON_IsNull(author) ? strdup(author->valuestring) : NULL,
        description ? description_local_nonprim : NULL,
        media ? media_local_nonprim : NULL,
        statistics_local_nonprim
        );

    return goods_feedback_dto_local_var;
end:
    if (identifiers_local_nonprim) {
        goods_feedback_identifiers_dto_free(identifiers_local_nonprim);
        identifiers_local_nonprim = NULL;
    }
    if (description_local_nonprim) {
        goods_feedback_description_dto_free(description_local_nonprim);
        description_local_nonprim = NULL;
    }
    if (media_local_nonprim) {
        goods_feedback_media_dto_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (statistics_local_nonprim) {
        goods_feedback_statistics_dto_free(statistics_local_nonprim);
        statistics_local_nonprim = NULL;
    }
    return NULL;

}
