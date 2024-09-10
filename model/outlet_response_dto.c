#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_response_dto.h"



outlet_response_dto_t *outlet_response_dto_create(
    long id
    ) {
    outlet_response_dto_t *outlet_response_dto_local_var = malloc(sizeof(outlet_response_dto_t));
    if (!outlet_response_dto_local_var) {
        return NULL;
    }
    outlet_response_dto_local_var->id = id;

    return outlet_response_dto_local_var;
}


void outlet_response_dto_free(outlet_response_dto_t *outlet_response_dto) {
    if(NULL == outlet_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(outlet_response_dto);
}

cJSON *outlet_response_dto_convertToJSON(outlet_response_dto_t *outlet_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_response_dto->id
    if(outlet_response_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", outlet_response_dto->id) == NULL) {
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

outlet_response_dto_t *outlet_response_dto_parseFromJSON(cJSON *outlet_response_dtoJSON){

    outlet_response_dto_t *outlet_response_dto_local_var = NULL;

    // outlet_response_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(outlet_response_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }


    outlet_response_dto_local_var = outlet_response_dto_create (
        id ? id->valuedouble : 0
        );

    return outlet_response_dto_local_var;
end:
    return NULL;

}
