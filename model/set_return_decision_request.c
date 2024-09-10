#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "set_return_decision_request.h"


char* set_return_decision_request_decision_type_ToString(_api__set_return_decision_request__e decision_type) {
    char* decision_typeArray[] =  { "NULL", "REFUND_MONEY", "REFUND_MONEY_INCLUDING_SHIPMENT", "REPAIR", "REPLACE", "SEND_TO_EXAMINATION", "DECLINE_REFUND", "OTHER_DECISION" };
    return decision_typeArray[decision_type];
}

_api__set_return_decision_request__e set_return_decision_request_decision_type_FromString(char* decision_type){
    int stringToReturn = 0;
    char *decision_typeArray[] =  { "NULL", "REFUND_MONEY", "REFUND_MONEY_INCLUDING_SHIPMENT", "REPAIR", "REPLACE", "SEND_TO_EXAMINATION", "DECLINE_REFUND", "OTHER_DECISION" };
    size_t sizeofArray = sizeof(decision_typeArray) / sizeof(decision_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(decision_type, decision_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

set_return_decision_request_t *set_return_decision_request_create(
    long return_item_id,
    return_request_decision_type_t *decision_type,
    char *comment
    ) {
    set_return_decision_request_t *set_return_decision_request_local_var = malloc(sizeof(set_return_decision_request_t));
    if (!set_return_decision_request_local_var) {
        return NULL;
    }
    set_return_decision_request_local_var->return_item_id = return_item_id;
    set_return_decision_request_local_var->decision_type = decision_type;
    set_return_decision_request_local_var->comment = comment;

    return set_return_decision_request_local_var;
}


void set_return_decision_request_free(set_return_decision_request_t *set_return_decision_request) {
    if(NULL == set_return_decision_request){
        return ;
    }
    listEntry_t *listEntry;
    if (set_return_decision_request->decision_type) {
        return_request_decision_type_free(set_return_decision_request->decision_type);
        set_return_decision_request->decision_type = NULL;
    }
    if (set_return_decision_request->comment) {
        free(set_return_decision_request->comment);
        set_return_decision_request->comment = NULL;
    }
    free(set_return_decision_request);
}

cJSON *set_return_decision_request_convertToJSON(set_return_decision_request_t *set_return_decision_request) {
    cJSON *item = cJSON_CreateObject();

    // set_return_decision_request->return_item_id
    if (!set_return_decision_request->return_item_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "returnItemId", set_return_decision_request->return_item_id) == NULL) {
    goto fail; //Numeric
    }


    // set_return_decision_request->decision_type
    if (_api__set_return_decision_request__NULL == set_return_decision_request->decision_type) {
        goto fail;
    }
    cJSON *decision_type_local_JSON = return_request_decision_type_convertToJSON(set_return_decision_request->decision_type);
    if(decision_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "decisionType", decision_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // set_return_decision_request->comment
    if(set_return_decision_request->comment) {
    if(cJSON_AddStringToObject(item, "comment", set_return_decision_request->comment) == NULL) {
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

set_return_decision_request_t *set_return_decision_request_parseFromJSON(cJSON *set_return_decision_requestJSON){

    set_return_decision_request_t *set_return_decision_request_local_var = NULL;

    // define the local variable for set_return_decision_request->decision_type
    return_request_decision_type_t *decision_type_local_nonprim = NULL;

    // set_return_decision_request->return_item_id
    cJSON *return_item_id = cJSON_GetObjectItemCaseSensitive(set_return_decision_requestJSON, "returnItemId");
    if (!return_item_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(return_item_id))
    {
    goto end; //Numeric
    }

    // set_return_decision_request->decision_type
    cJSON *decision_type = cJSON_GetObjectItemCaseSensitive(set_return_decision_requestJSON, "decisionType");
    if (!decision_type) {
        goto end;
    }

    
    decision_type_local_nonprim = return_request_decision_type_parseFromJSON(decision_type); //custom

    // set_return_decision_request->comment
    cJSON *comment = cJSON_GetObjectItemCaseSensitive(set_return_decision_requestJSON, "comment");
    if (comment) { 
    if(!cJSON_IsString(comment) && !cJSON_IsNull(comment))
    {
    goto end; //String
    }
    }


    set_return_decision_request_local_var = set_return_decision_request_create (
        return_item_id->valuedouble,
        decision_type_local_nonprim,
        comment && !cJSON_IsNull(comment) ? strdup(comment->valuestring) : NULL
        );

    return set_return_decision_request_local_var;
end:
    if (decision_type_local_nonprim) {
        return_request_decision_type_free(decision_type_local_nonprim);
        decision_type_local_nonprim = NULL;
    }
    return NULL;

}
