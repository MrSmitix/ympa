#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_card_dto.h"


char* offer_card_dto_card_status_ToString(_api__offer_card_dto__e card_status) {
    char* card_statusArray[] =  { "NULL", "HAS_CARD_CAN_NOT_UPDATE", "HAS_CARD_CAN_UPDATE", "HAS_CARD_CAN_UPDATE_ERRORS", "HAS_CARD_CAN_UPDATE_PROCESSING", "NO_CARD_NEED_CONTENT", "NO_CARD_MARKET_WILL_CREATE", "NO_CARD_ERRORS", "NO_CARD_PROCESSING", "NO_CARD_ADD_TO_CAMPAIGN" };
    return card_statusArray[card_status];
}

_api__offer_card_dto__e offer_card_dto_card_status_FromString(char* card_status){
    int stringToReturn = 0;
    char *card_statusArray[] =  { "NULL", "HAS_CARD_CAN_NOT_UPDATE", "HAS_CARD_CAN_UPDATE", "HAS_CARD_CAN_UPDATE_ERRORS", "HAS_CARD_CAN_UPDATE_PROCESSING", "NO_CARD_NEED_CONTENT", "NO_CARD_MARKET_WILL_CREATE", "NO_CARD_ERRORS", "NO_CARD_PROCESSING", "NO_CARD_ADD_TO_CAMPAIGN" };
    size_t sizeofArray = sizeof(card_statusArray) / sizeof(card_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(card_status, card_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_card_dto_t *offer_card_dto_create(
    char *offer_id,
    get_mapping_dto_t *mapping,
    list_t *parameter_values,
    offer_card_status_type_t *card_status,
    int content_rating,
    list_t *recommendations,
    list_t *errors,
    list_t *warnings
    ) {
    offer_card_dto_t *offer_card_dto_local_var = malloc(sizeof(offer_card_dto_t));
    if (!offer_card_dto_local_var) {
        return NULL;
    }
    offer_card_dto_local_var->offer_id = offer_id;
    offer_card_dto_local_var->mapping = mapping;
    offer_card_dto_local_var->parameter_values = parameter_values;
    offer_card_dto_local_var->card_status = card_status;
    offer_card_dto_local_var->content_rating = content_rating;
    offer_card_dto_local_var->recommendations = recommendations;
    offer_card_dto_local_var->errors = errors;
    offer_card_dto_local_var->warnings = warnings;

    return offer_card_dto_local_var;
}


void offer_card_dto_free(offer_card_dto_t *offer_card_dto) {
    if(NULL == offer_card_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_card_dto->offer_id) {
        free(offer_card_dto->offer_id);
        offer_card_dto->offer_id = NULL;
    }
    if (offer_card_dto->mapping) {
        get_mapping_dto_free(offer_card_dto->mapping);
        offer_card_dto->mapping = NULL;
    }
    if (offer_card_dto->parameter_values) {
        list_ForEach(listEntry, offer_card_dto->parameter_values) {
            parameter_value_dto_free(listEntry->data);
        }
        list_freeList(offer_card_dto->parameter_values);
        offer_card_dto->parameter_values = NULL;
    }
    if (offer_card_dto->card_status) {
        offer_card_status_type_free(offer_card_dto->card_status);
        offer_card_dto->card_status = NULL;
    }
    if (offer_card_dto->recommendations) {
        list_ForEach(listEntry, offer_card_dto->recommendations) {
            offer_card_recommendation_dto_free(listEntry->data);
        }
        list_freeList(offer_card_dto->recommendations);
        offer_card_dto->recommendations = NULL;
    }
    if (offer_card_dto->errors) {
        list_ForEach(listEntry, offer_card_dto->errors) {
            offer_error_dto_free(listEntry->data);
        }
        list_freeList(offer_card_dto->errors);
        offer_card_dto->errors = NULL;
    }
    if (offer_card_dto->warnings) {
        list_ForEach(listEntry, offer_card_dto->warnings) {
            offer_error_dto_free(listEntry->data);
        }
        list_freeList(offer_card_dto->warnings);
        offer_card_dto->warnings = NULL;
    }
    free(offer_card_dto);
}

cJSON *offer_card_dto_convertToJSON(offer_card_dto_t *offer_card_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_card_dto->offer_id
    if (!offer_card_dto->offer_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "offerId", offer_card_dto->offer_id) == NULL) {
    goto fail; //String
    }


    // offer_card_dto->mapping
    if(offer_card_dto->mapping) {
    cJSON *mapping_local_JSON = get_mapping_dto_convertToJSON(offer_card_dto->mapping);
    if(mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mapping", mapping_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // offer_card_dto->parameter_values
    if(offer_card_dto->parameter_values) {
    cJSON *parameter_values = cJSON_AddArrayToObject(item, "parameterValues");
    if(parameter_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *parameter_valuesListEntry;
    if (offer_card_dto->parameter_values) {
    list_ForEach(parameter_valuesListEntry, offer_card_dto->parameter_values) {
    cJSON *itemLocal = parameter_value_dto_convertToJSON(parameter_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(parameter_values, itemLocal);
    }
    }
    }


    // offer_card_dto->card_status
    if(offer_card_dto->card_status != _api__offer_card_dto__NULL) {
    cJSON *card_status_local_JSON = offer_card_status_type_convertToJSON(offer_card_dto->card_status);
    if(card_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "cardStatus", card_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // offer_card_dto->content_rating
    if(offer_card_dto->content_rating) {
    if(cJSON_AddNumberToObject(item, "contentRating", offer_card_dto->content_rating) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_card_dto->recommendations
    if(offer_card_dto->recommendations) {
    cJSON *recommendations = cJSON_AddArrayToObject(item, "recommendations");
    if(recommendations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *recommendationsListEntry;
    if (offer_card_dto->recommendations) {
    list_ForEach(recommendationsListEntry, offer_card_dto->recommendations) {
    cJSON *itemLocal = offer_card_recommendation_dto_convertToJSON(recommendationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(recommendations, itemLocal);
    }
    }
    }


    // offer_card_dto->errors
    if(offer_card_dto->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (offer_card_dto->errors) {
    list_ForEach(errorsListEntry, offer_card_dto->errors) {
    cJSON *itemLocal = offer_error_dto_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // offer_card_dto->warnings
    if(offer_card_dto->warnings) {
    cJSON *warnings = cJSON_AddArrayToObject(item, "warnings");
    if(warnings == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *warningsListEntry;
    if (offer_card_dto->warnings) {
    list_ForEach(warningsListEntry, offer_card_dto->warnings) {
    cJSON *itemLocal = offer_error_dto_convertToJSON(warningsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(warnings, itemLocal);
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

offer_card_dto_t *offer_card_dto_parseFromJSON(cJSON *offer_card_dtoJSON){

    offer_card_dto_t *offer_card_dto_local_var = NULL;

    // define the local variable for offer_card_dto->mapping
    get_mapping_dto_t *mapping_local_nonprim = NULL;

    // define the local list for offer_card_dto->parameter_values
    list_t *parameter_valuesList = NULL;

    // define the local variable for offer_card_dto->card_status
    offer_card_status_type_t *card_status_local_nonprim = NULL;

    // define the local list for offer_card_dto->recommendations
    list_t *recommendationsList = NULL;

    // define the local list for offer_card_dto->errors
    list_t *errorsList = NULL;

    // define the local list for offer_card_dto->warnings
    list_t *warningsList = NULL;

    // offer_card_dto->offer_id
    cJSON *offer_id = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "offerId");
    if (!offer_id) {
        goto end;
    }

    
    if(!cJSON_IsString(offer_id))
    {
    goto end; //String
    }

    // offer_card_dto->mapping
    cJSON *mapping = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "mapping");
    if (mapping) { 
    mapping_local_nonprim = get_mapping_dto_parseFromJSON(mapping); //nonprimitive
    }

    // offer_card_dto->parameter_values
    cJSON *parameter_values = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "parameterValues");
    if (parameter_values) { 
    cJSON *parameter_values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(parameter_values)){
        goto end; //nonprimitive container
    }

    parameter_valuesList = list_createList();

    cJSON_ArrayForEach(parameter_values_local_nonprimitive,parameter_values )
    {
        if(!cJSON_IsObject(parameter_values_local_nonprimitive)){
            goto end;
        }
        parameter_value_dto_t *parameter_valuesItem = parameter_value_dto_parseFromJSON(parameter_values_local_nonprimitive);

        list_addElement(parameter_valuesList, parameter_valuesItem);
    }
    }

    // offer_card_dto->card_status
    cJSON *card_status = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "cardStatus");
    if (card_status) { 
    card_status_local_nonprim = offer_card_status_type_parseFromJSON(card_status); //custom
    }

    // offer_card_dto->content_rating
    cJSON *content_rating = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "contentRating");
    if (content_rating) { 
    if(!cJSON_IsNumber(content_rating))
    {
    goto end; //Numeric
    }
    }

    // offer_card_dto->recommendations
    cJSON *recommendations = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "recommendations");
    if (recommendations) { 
    cJSON *recommendations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(recommendations)){
        goto end; //nonprimitive container
    }

    recommendationsList = list_createList();

    cJSON_ArrayForEach(recommendations_local_nonprimitive,recommendations )
    {
        if(!cJSON_IsObject(recommendations_local_nonprimitive)){
            goto end;
        }
        offer_card_recommendation_dto_t *recommendationsItem = offer_card_recommendation_dto_parseFromJSON(recommendations_local_nonprimitive);

        list_addElement(recommendationsList, recommendationsItem);
    }
    }

    // offer_card_dto->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "errors");
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        offer_error_dto_t *errorsItem = offer_error_dto_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // offer_card_dto->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(offer_card_dtoJSON, "warnings");
    if (warnings) { 
    cJSON *warnings_local_nonprimitive = NULL;
    if(!cJSON_IsArray(warnings)){
        goto end; //nonprimitive container
    }

    warningsList = list_createList();

    cJSON_ArrayForEach(warnings_local_nonprimitive,warnings )
    {
        if(!cJSON_IsObject(warnings_local_nonprimitive)){
            goto end;
        }
        offer_error_dto_t *warningsItem = offer_error_dto_parseFromJSON(warnings_local_nonprimitive);

        list_addElement(warningsList, warningsItem);
    }
    }


    offer_card_dto_local_var = offer_card_dto_create (
        strdup(offer_id->valuestring),
        mapping ? mapping_local_nonprim : NULL,
        parameter_values ? parameter_valuesList : NULL,
        card_status ? card_status_local_nonprim : NULL,
        content_rating ? content_rating->valuedouble : 0,
        recommendations ? recommendationsList : NULL,
        errors ? errorsList : NULL,
        warnings ? warningsList : NULL
        );

    return offer_card_dto_local_var;
end:
    if (mapping_local_nonprim) {
        get_mapping_dto_free(mapping_local_nonprim);
        mapping_local_nonprim = NULL;
    }
    if (parameter_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, parameter_valuesList) {
            parameter_value_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(parameter_valuesList);
        parameter_valuesList = NULL;
    }
    if (card_status_local_nonprim) {
        offer_card_status_type_free(card_status_local_nonprim);
        card_status_local_nonprim = NULL;
    }
    if (recommendationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recommendationsList) {
            offer_card_recommendation_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recommendationsList);
        recommendationsList = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            offer_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    if (warningsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, warningsList) {
            offer_error_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(warningsList);
        warningsList = NULL;
    }
    return NULL;

}
