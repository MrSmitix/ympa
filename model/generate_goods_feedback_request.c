#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_goods_feedback_request.h"



generate_goods_feedback_request_t *generate_goods_feedback_request_create(
    long business_id
    ) {
    generate_goods_feedback_request_t *generate_goods_feedback_request_local_var = malloc(sizeof(generate_goods_feedback_request_t));
    if (!generate_goods_feedback_request_local_var) {
        return NULL;
    }
    generate_goods_feedback_request_local_var->business_id = business_id;

    return generate_goods_feedback_request_local_var;
}


void generate_goods_feedback_request_free(generate_goods_feedback_request_t *generate_goods_feedback_request) {
    if(NULL == generate_goods_feedback_request){
        return ;
    }
    listEntry_t *listEntry;
    free(generate_goods_feedback_request);
}

cJSON *generate_goods_feedback_request_convertToJSON(generate_goods_feedback_request_t *generate_goods_feedback_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_goods_feedback_request->business_id
    if (!generate_goods_feedback_request->business_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "businessId", generate_goods_feedback_request->business_id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_goods_feedback_request_t *generate_goods_feedback_request_parseFromJSON(cJSON *generate_goods_feedback_requestJSON){

    generate_goods_feedback_request_t *generate_goods_feedback_request_local_var = NULL;

    // generate_goods_feedback_request->business_id
    cJSON *business_id = cJSON_GetObjectItemCaseSensitive(generate_goods_feedback_requestJSON, "businessId");
    if (!business_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(business_id))
    {
    goto end; //Numeric
    }


    generate_goods_feedback_request_local_var = generate_goods_feedback_request_create (
        business_id->valuedouble
        );

    return generate_goods_feedback_request_local_var;
end:
    return NULL;

}
