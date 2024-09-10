#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "return_decision_dto.h"


char* return_decision_dto_reason_type_ToString(_api__return_decision_dto__e reason_type) {
    char* reason_typeArray[] =  { "NULL", "BAD_QUALITY", "DOES_NOT_FIT", "WRONG_ITEM", "DAMAGE_DELIVERY", "LOYALTY_FAIL", "CONTENT_FAIL", "UNKNOWN" };
    return reason_typeArray[reason_type];
}

_api__return_decision_dto__e return_decision_dto_reason_type_FromString(char* reason_type){
    int stringToReturn = 0;
    char *reason_typeArray[] =  { "NULL", "BAD_QUALITY", "DOES_NOT_FIT", "WRONG_ITEM", "DAMAGE_DELIVERY", "LOYALTY_FAIL", "CONTENT_FAIL", "UNKNOWN" };
    size_t sizeofArray = sizeof(reason_typeArray) / sizeof(reason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason_type, reason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* return_decision_dto_subreason_type_ToString(_api__return_decision_dto__e subreason_type) {
    char* subreason_typeArray[] =  { "NULL", "USER_DID_NOT_LIKE", "USER_CHANGED_MIND", "DELIVERED_TOO_LONG", "BAD_PACKAGE", "DAMAGED", "NOT_WORKING", "INCOMPLETENESS", "WRONG_ITEM", "WRONG_COLOR", "DID_NOT_MATCH_DESCRIPTION", "UNKNOWN" };
    return subreason_typeArray[subreason_type];
}

_api__return_decision_dto__e return_decision_dto_subreason_type_FromString(char* subreason_type){
    int stringToReturn = 0;
    char *subreason_typeArray[] =  { "NULL", "USER_DID_NOT_LIKE", "USER_CHANGED_MIND", "DELIVERED_TOO_LONG", "BAD_PACKAGE", "DAMAGED", "NOT_WORKING", "INCOMPLETENESS", "WRONG_ITEM", "WRONG_COLOR", "DID_NOT_MATCH_DESCRIPTION", "UNKNOWN" };
    size_t sizeofArray = sizeof(subreason_typeArray) / sizeof(subreason_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(subreason_type, subreason_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* return_decision_dto_decision_type_ToString(_api__return_decision_dto__e decision_type) {
    char* decision_typeArray[] =  { "NULL", "REFUND_MONEY", "REFUND_MONEY_INCLUDING_SHIPMENT", "REPAIR", "REPLACE", "SEND_TO_EXAMINATION", "DECLINE_REFUND", "OTHER_DECISION", "UNKNOWN" };
    return decision_typeArray[decision_type];
}

_api__return_decision_dto__e return_decision_dto_decision_type_FromString(char* decision_type){
    int stringToReturn = 0;
    char *decision_typeArray[] =  { "NULL", "REFUND_MONEY", "REFUND_MONEY_INCLUDING_SHIPMENT", "REPAIR", "REPLACE", "SEND_TO_EXAMINATION", "DECLINE_REFUND", "OTHER_DECISION", "UNKNOWN" };
    size_t sizeofArray = sizeof(decision_typeArray) / sizeof(decision_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(decision_type, decision_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

return_decision_dto_t *return_decision_dto_create(
    long return_item_id,
    int count,
    char *comment,
    return_decision_reason_type_t *reason_type,
    return_decision_subreason_type_t *subreason_type,
    return_decision_type_t *decision_type,
    long refund_amount,
    long partner_compensation,
    list_t *images
    ) {
    return_decision_dto_t *return_decision_dto_local_var = malloc(sizeof(return_decision_dto_t));
    if (!return_decision_dto_local_var) {
        return NULL;
    }
    return_decision_dto_local_var->return_item_id = return_item_id;
    return_decision_dto_local_var->count = count;
    return_decision_dto_local_var->comment = comment;
    return_decision_dto_local_var->reason_type = reason_type;
    return_decision_dto_local_var->subreason_type = subreason_type;
    return_decision_dto_local_var->decision_type = decision_type;
    return_decision_dto_local_var->refund_amount = refund_amount;
    return_decision_dto_local_var->partner_compensation = partner_compensation;
    return_decision_dto_local_var->images = images;

    return return_decision_dto_local_var;
}


void return_decision_dto_free(return_decision_dto_t *return_decision_dto) {
    if(NULL == return_decision_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (return_decision_dto->comment) {
        free(return_decision_dto->comment);
        return_decision_dto->comment = NULL;
    }
    if (return_decision_dto->reason_type) {
        return_decision_reason_type_free(return_decision_dto->reason_type);
        return_decision_dto->reason_type = NULL;
    }
    if (return_decision_dto->subreason_type) {
        return_decision_subreason_type_free(return_decision_dto->subreason_type);
        return_decision_dto->subreason_type = NULL;
    }
    if (return_decision_dto->decision_type) {
        return_decision_type_free(return_decision_dto->decision_type);
        return_decision_dto->decision_type = NULL;
    }
    if (return_decision_dto->images) {
        list_ForEach(listEntry, return_decision_dto->images) {
            free(listEntry->data);
        }
        list_freeList(return_decision_dto->images);
        return_decision_dto->images = NULL;
    }
    free(return_decision_dto);
}

cJSON *return_decision_dto_convertToJSON(return_decision_dto_t *return_decision_dto) {
    cJSON *item = cJSON_CreateObject();

    // return_decision_dto->return_item_id
    if(return_decision_dto->return_item_id) {
    if(cJSON_AddNumberToObject(item, "returnItemId", return_decision_dto->return_item_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_decision_dto->count
    if(return_decision_dto->count) {
    if(cJSON_AddNumberToObject(item, "count", return_decision_dto->count) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_decision_dto->comment
    if(return_decision_dto->comment) {
    if(cJSON_AddStringToObject(item, "comment", return_decision_dto->comment) == NULL) {
    goto fail; //String
    }
    }


    // return_decision_dto->reason_type
    if(return_decision_dto->reason_type != _api__return_decision_dto__NULL) {
    cJSON *reason_type_local_JSON = return_decision_reason_type_convertToJSON(return_decision_dto->reason_type);
    if(reason_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "reasonType", reason_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_decision_dto->subreason_type
    if(return_decision_dto->subreason_type != _api__return_decision_dto__NULL) {
    cJSON *subreason_type_local_JSON = return_decision_subreason_type_convertToJSON(return_decision_dto->subreason_type);
    if(subreason_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "subreasonType", subreason_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_decision_dto->decision_type
    if(return_decision_dto->decision_type != _api__return_decision_dto__NULL) {
    cJSON *decision_type_local_JSON = return_decision_type_convertToJSON(return_decision_dto->decision_type);
    if(decision_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "decisionType", decision_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // return_decision_dto->refund_amount
    if(return_decision_dto->refund_amount) {
    if(cJSON_AddNumberToObject(item, "refundAmount", return_decision_dto->refund_amount) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_decision_dto->partner_compensation
    if(return_decision_dto->partner_compensation) {
    if(cJSON_AddNumberToObject(item, "partnerCompensation", return_decision_dto->partner_compensation) == NULL) {
    goto fail; //Numeric
    }
    }


    // return_decision_dto->images
    if(return_decision_dto->images) {
    cJSON *images = cJSON_AddArrayToObject(item, "images");
    if(images == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *imagesListEntry;
    list_ForEach(imagesListEntry, return_decision_dto->images) {
    if(cJSON_AddStringToObject(images, "", (char*)imagesListEntry->data) == NULL)
    {
        goto fail;
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

return_decision_dto_t *return_decision_dto_parseFromJSON(cJSON *return_decision_dtoJSON){

    return_decision_dto_t *return_decision_dto_local_var = NULL;

    // define the local variable for return_decision_dto->reason_type
    return_decision_reason_type_t *reason_type_local_nonprim = NULL;

    // define the local variable for return_decision_dto->subreason_type
    return_decision_subreason_type_t *subreason_type_local_nonprim = NULL;

    // define the local variable for return_decision_dto->decision_type
    return_decision_type_t *decision_type_local_nonprim = NULL;

    // define the local list for return_decision_dto->images
    list_t *imagesList = NULL;

    // return_decision_dto->return_item_id
    cJSON *return_item_id = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "returnItemId");
    if (return_item_id) { 
    if(!cJSON_IsNumber(return_item_id))
    {
    goto end; //Numeric
    }
    }

    // return_decision_dto->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "count");
    if (count) { 
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    }

    // return_decision_dto->comment
    cJSON *comment = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "comment");
    if (comment) { 
    if(!cJSON_IsString(comment) && !cJSON_IsNull(comment))
    {
    goto end; //String
    }
    }

    // return_decision_dto->reason_type
    cJSON *reason_type = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "reasonType");
    if (reason_type) { 
    reason_type_local_nonprim = return_decision_reason_type_parseFromJSON(reason_type); //custom
    }

    // return_decision_dto->subreason_type
    cJSON *subreason_type = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "subreasonType");
    if (subreason_type) { 
    subreason_type_local_nonprim = return_decision_subreason_type_parseFromJSON(subreason_type); //custom
    }

    // return_decision_dto->decision_type
    cJSON *decision_type = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "decisionType");
    if (decision_type) { 
    decision_type_local_nonprim = return_decision_type_parseFromJSON(decision_type); //custom
    }

    // return_decision_dto->refund_amount
    cJSON *refund_amount = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "refundAmount");
    if (refund_amount) { 
    if(!cJSON_IsNumber(refund_amount))
    {
    goto end; //Numeric
    }
    }

    // return_decision_dto->partner_compensation
    cJSON *partner_compensation = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "partnerCompensation");
    if (partner_compensation) { 
    if(!cJSON_IsNumber(partner_compensation))
    {
    goto end; //Numeric
    }
    }

    // return_decision_dto->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(return_decision_dtoJSON, "images");
    if (images) { 
    cJSON *images_local = NULL;
    if(!cJSON_IsArray(images)) {
        goto end;//primitive container
    }
    imagesList = list_createList();

    cJSON_ArrayForEach(images_local, images)
    {
        if(!cJSON_IsString(images_local))
        {
            goto end;
        }
        list_addElement(imagesList , strdup(images_local->valuestring));
    }
    }


    return_decision_dto_local_var = return_decision_dto_create (
        return_item_id ? return_item_id->valuedouble : 0,
        count ? count->valuedouble : 0,
        comment && !cJSON_IsNull(comment) ? strdup(comment->valuestring) : NULL,
        reason_type ? reason_type_local_nonprim : NULL,
        subreason_type ? subreason_type_local_nonprim : NULL,
        decision_type ? decision_type_local_nonprim : NULL,
        refund_amount ? refund_amount->valuedouble : 0,
        partner_compensation ? partner_compensation->valuedouble : 0,
        images ? imagesList : NULL
        );

    return return_decision_dto_local_var;
end:
    if (reason_type_local_nonprim) {
        return_decision_reason_type_free(reason_type_local_nonprim);
        reason_type_local_nonprim = NULL;
    }
    if (subreason_type_local_nonprim) {
        return_decision_subreason_type_free(subreason_type_local_nonprim);
        subreason_type_local_nonprim = NULL;
    }
    if (decision_type_local_nonprim) {
        return_decision_type_free(decision_type_local_nonprim);
        decision_type_local_nonprim = NULL;
    }
    if (imagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, imagesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(imagesList);
        imagesList = NULL;
    }
    return NULL;

}
