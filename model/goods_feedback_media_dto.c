#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "goods_feedback_media_dto.h"



goods_feedback_media_dto_t *goods_feedback_media_dto_create(
    list_t *photos,
    list_t *videos
    ) {
    goods_feedback_media_dto_t *goods_feedback_media_dto_local_var = malloc(sizeof(goods_feedback_media_dto_t));
    if (!goods_feedback_media_dto_local_var) {
        return NULL;
    }
    goods_feedback_media_dto_local_var->photos = photos;
    goods_feedback_media_dto_local_var->videos = videos;

    return goods_feedback_media_dto_local_var;
}


void goods_feedback_media_dto_free(goods_feedback_media_dto_t *goods_feedback_media_dto) {
    if(NULL == goods_feedback_media_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (goods_feedback_media_dto->photos) {
        list_ForEach(listEntry, goods_feedback_media_dto->photos) {
            free(listEntry->data);
        }
        list_freeList(goods_feedback_media_dto->photos);
        goods_feedback_media_dto->photos = NULL;
    }
    if (goods_feedback_media_dto->videos) {
        list_ForEach(listEntry, goods_feedback_media_dto->videos) {
            free(listEntry->data);
        }
        list_freeList(goods_feedback_media_dto->videos);
        goods_feedback_media_dto->videos = NULL;
    }
    free(goods_feedback_media_dto);
}

cJSON *goods_feedback_media_dto_convertToJSON(goods_feedback_media_dto_t *goods_feedback_media_dto) {
    cJSON *item = cJSON_CreateObject();

    // goods_feedback_media_dto->photos
    if(goods_feedback_media_dto->photos) {
    cJSON *photos = cJSON_AddArrayToObject(item, "photos");
    if(photos == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *photosListEntry;
    list_ForEach(photosListEntry, goods_feedback_media_dto->photos) {
    if(cJSON_AddStringToObject(photos, "", (char*)photosListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // goods_feedback_media_dto->videos
    if(goods_feedback_media_dto->videos) {
    cJSON *videos = cJSON_AddArrayToObject(item, "videos");
    if(videos == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *videosListEntry;
    list_ForEach(videosListEntry, goods_feedback_media_dto->videos) {
    if(cJSON_AddStringToObject(videos, "", (char*)videosListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

goods_feedback_media_dto_t *goods_feedback_media_dto_parseFromJSON(cJSON *goods_feedback_media_dtoJSON){

    goods_feedback_media_dto_t *goods_feedback_media_dto_local_var = NULL;

    // define the local list for goods_feedback_media_dto->photos
    list_t *photosList = NULL;

    // define the local list for goods_feedback_media_dto->videos
    list_t *videosList = NULL;

    // goods_feedback_media_dto->photos
    cJSON *photos = cJSON_GetObjectItemCaseSensitive(goods_feedback_media_dtoJSON, "photos");
    if (photos) { 
    cJSON *photos_local = NULL;
    if(!cJSON_IsArray(photos)) {
        goto end;//primitive container
    }
    photosList = list_createList();

    cJSON_ArrayForEach(photos_local, photos)
    {
        if(!cJSON_IsString(photos_local))
        {
            goto end;
        }
        list_addElement(photosList , strdup(photos_local->valuestring));
    }
    }

    // goods_feedback_media_dto->videos
    cJSON *videos = cJSON_GetObjectItemCaseSensitive(goods_feedback_media_dtoJSON, "videos");
    if (videos) { 
    cJSON *videos_local = NULL;
    if(!cJSON_IsArray(videos)) {
        goto end;//primitive container
    }
    videosList = list_createList();

    cJSON_ArrayForEach(videos_local, videos)
    {
        if(!cJSON_IsString(videos_local))
        {
            goto end;
        }
        list_addElement(videosList , strdup(videos_local->valuestring));
    }
    }


    goods_feedback_media_dto_local_var = goods_feedback_media_dto_create (
        photos ? photosList : NULL,
        videos ? videosList : NULL
        );

    return goods_feedback_media_dto_local_var;
end:
    if (photosList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, photosList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(photosList);
        photosList = NULL;
    }
    if (videosList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, videosList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(videosList);
        videosList = NULL;
    }
    return NULL;

}
