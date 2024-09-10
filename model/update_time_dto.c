#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_time_dto.h"



update_time_dto_t *update_time_dto_create(
    char *updated_at
    ) {
    update_time_dto_t *update_time_dto_local_var = malloc(sizeof(update_time_dto_t));
    if (!update_time_dto_local_var) {
        return NULL;
    }
    update_time_dto_local_var->updated_at = updated_at;

    return update_time_dto_local_var;
}


void update_time_dto_free(update_time_dto_t *update_time_dto) {
    if(NULL == update_time_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (update_time_dto->updated_at) {
        free(update_time_dto->updated_at);
        update_time_dto->updated_at = NULL;
    }
    free(update_time_dto);
}

cJSON *update_time_dto_convertToJSON(update_time_dto_t *update_time_dto) {
    cJSON *item = cJSON_CreateObject();

    // update_time_dto->updated_at
    if (!update_time_dto->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updatedAt", update_time_dto->updated_at) == NULL) {
    goto fail; //Date-Time
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_time_dto_t *update_time_dto_parseFromJSON(cJSON *update_time_dtoJSON){

    update_time_dto_t *update_time_dto_local_var = NULL;

    // update_time_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(update_time_dtoJSON, "updatedAt");
    if (!updated_at) {
        goto end;
    }

    
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }


    update_time_dto_local_var = update_time_dto_create (
        strdup(updated_at->valuestring)
        );

    return update_time_dto_local_var;
end:
    return NULL;

}
