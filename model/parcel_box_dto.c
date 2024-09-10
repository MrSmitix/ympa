#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "parcel_box_dto.h"



parcel_box_dto_t *parcel_box_dto_create(
    long id,
    char *fulfilment_id
    ) {
    parcel_box_dto_t *parcel_box_dto_local_var = malloc(sizeof(parcel_box_dto_t));
    if (!parcel_box_dto_local_var) {
        return NULL;
    }
    parcel_box_dto_local_var->id = id;
    parcel_box_dto_local_var->fulfilment_id = fulfilment_id;

    return parcel_box_dto_local_var;
}


void parcel_box_dto_free(parcel_box_dto_t *parcel_box_dto) {
    if(NULL == parcel_box_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (parcel_box_dto->fulfilment_id) {
        free(parcel_box_dto->fulfilment_id);
        parcel_box_dto->fulfilment_id = NULL;
    }
    free(parcel_box_dto);
}

cJSON *parcel_box_dto_convertToJSON(parcel_box_dto_t *parcel_box_dto) {
    cJSON *item = cJSON_CreateObject();

    // parcel_box_dto->id
    if(parcel_box_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", parcel_box_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // parcel_box_dto->fulfilment_id
    if(parcel_box_dto->fulfilment_id) {
    if(cJSON_AddStringToObject(item, "fulfilmentId", parcel_box_dto->fulfilment_id) == NULL) {
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

parcel_box_dto_t *parcel_box_dto_parseFromJSON(cJSON *parcel_box_dtoJSON){

    parcel_box_dto_t *parcel_box_dto_local_var = NULL;

    // parcel_box_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(parcel_box_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // parcel_box_dto->fulfilment_id
    cJSON *fulfilment_id = cJSON_GetObjectItemCaseSensitive(parcel_box_dtoJSON, "fulfilmentId");
    if (fulfilment_id) { 
    if(!cJSON_IsString(fulfilment_id) && !cJSON_IsNull(fulfilment_id))
    {
    goto end; //String
    }
    }


    parcel_box_dto_local_var = parcel_box_dto_create (
        id ? id->valuedouble : 0,
        fulfilment_id && !cJSON_IsNull(fulfilment_id) ? strdup(fulfilment_id->valuestring) : NULL
        );

    return parcel_box_dto_local_var;
end:
    return NULL;

}
