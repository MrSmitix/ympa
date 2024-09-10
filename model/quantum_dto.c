#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quantum_dto.h"



quantum_dto_t *quantum_dto_create(
    int min_quantity,
    int step_quantity
    ) {
    quantum_dto_t *quantum_dto_local_var = malloc(sizeof(quantum_dto_t));
    if (!quantum_dto_local_var) {
        return NULL;
    }
    quantum_dto_local_var->min_quantity = min_quantity;
    quantum_dto_local_var->step_quantity = step_quantity;

    return quantum_dto_local_var;
}


void quantum_dto_free(quantum_dto_t *quantum_dto) {
    if(NULL == quantum_dto){
        return ;
    }
    listEntry_t *listEntry;
    free(quantum_dto);
}

cJSON *quantum_dto_convertToJSON(quantum_dto_t *quantum_dto) {
    cJSON *item = cJSON_CreateObject();

    // quantum_dto->min_quantity
    if(quantum_dto->min_quantity) {
    if(cJSON_AddNumberToObject(item, "minQuantity", quantum_dto->min_quantity) == NULL) {
    goto fail; //Numeric
    }
    }


    // quantum_dto->step_quantity
    if(quantum_dto->step_quantity) {
    if(cJSON_AddNumberToObject(item, "stepQuantity", quantum_dto->step_quantity) == NULL) {
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

quantum_dto_t *quantum_dto_parseFromJSON(cJSON *quantum_dtoJSON){

    quantum_dto_t *quantum_dto_local_var = NULL;

    // quantum_dto->min_quantity
    cJSON *min_quantity = cJSON_GetObjectItemCaseSensitive(quantum_dtoJSON, "minQuantity");
    if (min_quantity) { 
    if(!cJSON_IsNumber(min_quantity))
    {
    goto end; //Numeric
    }
    }

    // quantum_dto->step_quantity
    cJSON *step_quantity = cJSON_GetObjectItemCaseSensitive(quantum_dtoJSON, "stepQuantity");
    if (step_quantity) { 
    if(!cJSON_IsNumber(step_quantity))
    {
    goto end; //Numeric
    }
    }


    quantum_dto_local_var = quantum_dto_create (
        min_quantity ? min_quantity->valuedouble : 0,
        step_quantity ? step_quantity->valuedouble : 0
        );

    return quantum_dto_local_var;
end:
    return NULL;

}
