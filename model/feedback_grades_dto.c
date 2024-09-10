#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_grades_dto.h"



feedback_grades_dto_t *feedback_grades_dto_create(
    double average,
    long agree_count,
    long reject_count,
    list_t *factors
    ) {
    feedback_grades_dto_t *feedback_grades_dto_local_var = malloc(sizeof(feedback_grades_dto_t));
    if (!feedback_grades_dto_local_var) {
        return NULL;
    }
    feedback_grades_dto_local_var->average = average;
    feedback_grades_dto_local_var->agree_count = agree_count;
    feedback_grades_dto_local_var->reject_count = reject_count;
    feedback_grades_dto_local_var->factors = factors;

    return feedback_grades_dto_local_var;
}


void feedback_grades_dto_free(feedback_grades_dto_t *feedback_grades_dto) {
    if(NULL == feedback_grades_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_grades_dto->factors) {
        list_ForEach(listEntry, feedback_grades_dto->factors) {
            feedback_factor_dto_free(listEntry->data);
        }
        list_freeList(feedback_grades_dto->factors);
        feedback_grades_dto->factors = NULL;
    }
    free(feedback_grades_dto);
}

cJSON *feedback_grades_dto_convertToJSON(feedback_grades_dto_t *feedback_grades_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_grades_dto->average
    if(feedback_grades_dto->average) {
    if(cJSON_AddNumberToObject(item, "average", feedback_grades_dto->average) == NULL) {
    goto fail; //Numeric
    }
    }


    // feedback_grades_dto->agree_count
    if(feedback_grades_dto->agree_count) {
    if(cJSON_AddNumberToObject(item, "agreeCount", feedback_grades_dto->agree_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // feedback_grades_dto->reject_count
    if(feedback_grades_dto->reject_count) {
    if(cJSON_AddNumberToObject(item, "rejectCount", feedback_grades_dto->reject_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // feedback_grades_dto->factors
    if (!feedback_grades_dto->factors) {
        goto fail;
    }
    cJSON *factors = cJSON_AddArrayToObject(item, "factors");
    if(factors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *factorsListEntry;
    if (feedback_grades_dto->factors) {
    list_ForEach(factorsListEntry, feedback_grades_dto->factors) {
    cJSON *itemLocal = feedback_factor_dto_convertToJSON(factorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(factors, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feedback_grades_dto_t *feedback_grades_dto_parseFromJSON(cJSON *feedback_grades_dtoJSON){

    feedback_grades_dto_t *feedback_grades_dto_local_var = NULL;

    // define the local list for feedback_grades_dto->factors
    list_t *factorsList = NULL;

    // feedback_grades_dto->average
    cJSON *average = cJSON_GetObjectItemCaseSensitive(feedback_grades_dtoJSON, "average");
    if (average) { 
    if(!cJSON_IsNumber(average))
    {
    goto end; //Numeric
    }
    }

    // feedback_grades_dto->agree_count
    cJSON *agree_count = cJSON_GetObjectItemCaseSensitive(feedback_grades_dtoJSON, "agreeCount");
    if (agree_count) { 
    if(!cJSON_IsNumber(agree_count))
    {
    goto end; //Numeric
    }
    }

    // feedback_grades_dto->reject_count
    cJSON *reject_count = cJSON_GetObjectItemCaseSensitive(feedback_grades_dtoJSON, "rejectCount");
    if (reject_count) { 
    if(!cJSON_IsNumber(reject_count))
    {
    goto end; //Numeric
    }
    }

    // feedback_grades_dto->factors
    cJSON *factors = cJSON_GetObjectItemCaseSensitive(feedback_grades_dtoJSON, "factors");
    if (!factors) {
        goto end;
    }

    
    cJSON *factors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(factors)){
        goto end; //nonprimitive container
    }

    factorsList = list_createList();

    cJSON_ArrayForEach(factors_local_nonprimitive,factors )
    {
        if(!cJSON_IsObject(factors_local_nonprimitive)){
            goto end;
        }
        feedback_factor_dto_t *factorsItem = feedback_factor_dto_parseFromJSON(factors_local_nonprimitive);

        list_addElement(factorsList, factorsItem);
    }


    feedback_grades_dto_local_var = feedback_grades_dto_create (
        average ? average->valuedouble : 0,
        agree_count ? agree_count->valuedouble : 0,
        reject_count ? reject_count->valuedouble : 0,
        factorsList
        );

    return feedback_grades_dto_local_var;
end:
    if (factorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, factorsList) {
            feedback_factor_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(factorsList);
        factorsList = NULL;
    }
    return NULL;

}
