#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pallets_count_dto.h"



pallets_count_dto_t *pallets_count_dto_create(
    int planned,
    int fact
    ) {
    pallets_count_dto_t *pallets_count_dto_local_var = malloc(sizeof(pallets_count_dto_t));
    if (!pallets_count_dto_local_var) {
        return NULL;
    }
    pallets_count_dto_local_var->planned = planned;
    pallets_count_dto_local_var->fact = fact;

    return pallets_count_dto_local_var;
}


void pallets_count_dto_free(pallets_count_dto_t *pallets_count_dto) {
    if(NULL == pallets_count_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(pallets_count_dto);
}

cJSON *pallets_count_dto_convertToJSON(pallets_count_dto_t *pallets_count_dto) {
    cJSON *item = cJSON_CreateObject();

    // pallets_count_dto->planned
    if(pallets_count_dto->planned) {
    if(cJSON_AddNumberToObject(item, "planned", pallets_count_dto->planned) == NULL) {
    goto fail; //Numeric
    }
    }


    // pallets_count_dto->fact
    if(pallets_count_dto->fact) {
    if(cJSON_AddNumberToObject(item, "fact", pallets_count_dto->fact) == NULL) {
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

pallets_count_dto_t *pallets_count_dto_parseFromJSON(cJSON *pallets_count_dtoJSON){

    pallets_count_dto_t *pallets_count_dto_local_var = NULL;

    // pallets_count_dto->planned
    cJSON *planned = cJSON_GetObjectItemCaseSensitive(pallets_count_dtoJSON, "planned");
    if (planned) { 
    if(!cJSON_IsNumber(planned))
    {
    goto end; //Numeric
    }
    }

    // pallets_count_dto->fact
    cJSON *fact = cJSON_GetObjectItemCaseSensitive(pallets_count_dtoJSON, "fact");
    if (fact) { 
    if(!cJSON_IsNumber(fact))
    {
    goto end; //Numeric
    }
    }


    pallets_count_dto_local_var = pallets_count_dto_create (
        planned ? planned->valuedouble : 0,
        fact ? fact->valuedouble : 0
        );

    return pallets_count_dto_local_var;
end:
    return NULL;

}
