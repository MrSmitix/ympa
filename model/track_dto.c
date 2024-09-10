#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "track_dto.h"



track_dto_t *track_dto_create(
    char *track_code
    ) {
    track_dto_t *track_dto_local_var = malloc(sizeof(track_dto_t));
    if (!track_dto_local_var) {
        return NULL;
    }
    track_dto_local_var->track_code = track_code;

    return track_dto_local_var;
}


void track_dto_free(track_dto_t *track_dto) {
    if(NULL == track_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (track_dto->track_code) {
        free(track_dto->track_code);
        track_dto->track_code = NULL;
    }
    free(track_dto);
}

cJSON *track_dto_convertToJSON(track_dto_t *track_dto) {
    cJSON *item = cJSON_CreateObject();

    // track_dto->track_code
    if(track_dto->track_code) {
    if(cJSON_AddStringToObject(item, "trackCode", track_dto->track_code) == NULL) {
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

track_dto_t *track_dto_parseFromJSON(cJSON *track_dtoJSON){

    track_dto_t *track_dto_local_var = NULL;

    // track_dto->track_code
    cJSON *track_code = cJSON_GetObjectItemCaseSensitive(track_dtoJSON, "trackCode");
    if (track_code) { 
    if(!cJSON_IsString(track_code) && !cJSON_IsNull(track_code))
    {
    goto end; //String
    }
    }


    track_dto_local_var = track_dto_create (
        track_code && !cJSON_IsNull(track_code) ? strdup(track_code->valuestring) : NULL
        );

    return track_dto_local_var;
end:
    return NULL;

}
