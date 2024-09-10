#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_report_dto.h"



generate_report_dto_t *generate_report_dto_create(
    char *report_id,
    long estimated_generation_time
    ) {
    generate_report_dto_t *generate_report_dto_local_var = malloc(sizeof(generate_report_dto_t));
    if (!generate_report_dto_local_var) {
        return NULL;
    }
    generate_report_dto_local_var->report_id = report_id;
    generate_report_dto_local_var->estimated_generation_time = estimated_generation_time;

    return generate_report_dto_local_var;
}


void generate_report_dto_free(generate_report_dto_t *generate_report_dto) {
    if(NULL == generate_report_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_report_dto->report_id) {
        free(generate_report_dto->report_id);
        generate_report_dto->report_id = NULL;
    }
    free(generate_report_dto);
}

cJSON *generate_report_dto_convertToJSON(generate_report_dto_t *generate_report_dto) {
    cJSON *item = cJSON_CreateObject();

    // generate_report_dto->report_id
    if (!generate_report_dto->report_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "reportId", generate_report_dto->report_id) == NULL) {
    goto fail; //String
    }


    // generate_report_dto->estimated_generation_time
    if (!generate_report_dto->estimated_generation_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "estimatedGenerationTime", generate_report_dto->estimated_generation_time) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_report_dto_t *generate_report_dto_parseFromJSON(cJSON *generate_report_dtoJSON){

    generate_report_dto_t *generate_report_dto_local_var = NULL;

    // generate_report_dto->report_id
    cJSON *report_id = cJSON_GetObjectItemCaseSensitive(generate_report_dtoJSON, "reportId");
    if (!report_id) {
        goto end;
    }

    
    if(!cJSON_IsString(report_id))
    {
    goto end; //String
    }

    // generate_report_dto->estimated_generation_time
    cJSON *estimated_generation_time = cJSON_GetObjectItemCaseSensitive(generate_report_dtoJSON, "estimatedGenerationTime");
    if (!estimated_generation_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(estimated_generation_time))
    {
    goto end; //Numeric
    }


    generate_report_dto_local_var = generate_report_dto_create (
        strdup(report_id->valuestring),
        estimated_generation_time->valuedouble
        );

    return generate_report_dto_local_var;
end:
    return NULL;

}
