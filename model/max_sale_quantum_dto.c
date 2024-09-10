#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "max_sale_quantum_dto.h"



max_sale_quantum_dto_t *max_sale_quantum_dto_create(
    long id,
    char *name,
    int max_sale_quantum
    ) {
    max_sale_quantum_dto_t *max_sale_quantum_dto_local_var = malloc(sizeof(max_sale_quantum_dto_t));
    if (!max_sale_quantum_dto_local_var) {
        return NULL;
    }
    max_sale_quantum_dto_local_var->id = id;
    max_sale_quantum_dto_local_var->name = name;
    max_sale_quantum_dto_local_var->max_sale_quantum = max_sale_quantum;

    return max_sale_quantum_dto_local_var;
}


void max_sale_quantum_dto_free(max_sale_quantum_dto_t *max_sale_quantum_dto) {
    if(NULL == max_sale_quantum_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (max_sale_quantum_dto->name) {
        free(max_sale_quantum_dto->name);
        max_sale_quantum_dto->name = NULL;
    }
    free(max_sale_quantum_dto);
}

cJSON *max_sale_quantum_dto_convertToJSON(max_sale_quantum_dto_t *max_sale_quantum_dto) {
    cJSON *item = cJSON_CreateObject();

    // max_sale_quantum_dto->id
    if (!max_sale_quantum_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", max_sale_quantum_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // max_sale_quantum_dto->name
    if(max_sale_quantum_dto->name) {
    if(cJSON_AddStringToObject(item, "name", max_sale_quantum_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // max_sale_quantum_dto->max_sale_quantum
    if(max_sale_quantum_dto->max_sale_quantum) {
    if(cJSON_AddNumberToObject(item, "maxSaleQuantum", max_sale_quantum_dto->max_sale_quantum) == NULL) {
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

max_sale_quantum_dto_t *max_sale_quantum_dto_parseFromJSON(cJSON *max_sale_quantum_dtoJSON){

    max_sale_quantum_dto_t *max_sale_quantum_dto_local_var = NULL;

    // max_sale_quantum_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(max_sale_quantum_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // max_sale_quantum_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(max_sale_quantum_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // max_sale_quantum_dto->max_sale_quantum
    cJSON *max_sale_quantum = cJSON_GetObjectItemCaseSensitive(max_sale_quantum_dtoJSON, "maxSaleQuantum");
    if (max_sale_quantum) { 
    if(!cJSON_IsNumber(max_sale_quantum))
    {
    goto end; //Numeric
    }
    }


    max_sale_quantum_dto_local_var = max_sale_quantum_dto_create (
        id->valuedouble,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        max_sale_quantum ? max_sale_quantum->valuedouble : 0
        );

    return max_sale_quantum_dto_local_var;
end:
    return NULL;

}
