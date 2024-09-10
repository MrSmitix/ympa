#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_goods_turnover_request.h"



generate_goods_turnover_request_t *generate_goods_turnover_request_create(
    long campaign_id,
    char *date
    ) {
    generate_goods_turnover_request_t *generate_goods_turnover_request_local_var = malloc(sizeof(generate_goods_turnover_request_t));
    if (!generate_goods_turnover_request_local_var) {
        return NULL;
    }
    generate_goods_turnover_request_local_var->campaign_id = campaign_id;
    generate_goods_turnover_request_local_var->date = date;

    return generate_goods_turnover_request_local_var;
}


void generate_goods_turnover_request_free(generate_goods_turnover_request_t *generate_goods_turnover_request) {
    if(NULL == generate_goods_turnover_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_goods_turnover_request->date) {
        free(generate_goods_turnover_request->date);
        generate_goods_turnover_request->date = NULL;
    }
    free(generate_goods_turnover_request);
}

cJSON *generate_goods_turnover_request_convertToJSON(generate_goods_turnover_request_t *generate_goods_turnover_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_goods_turnover_request->campaign_id
    if (!generate_goods_turnover_request->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", generate_goods_turnover_request->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_goods_turnover_request->date
    if(generate_goods_turnover_request->date) {
    if(cJSON_AddStringToObject(item, "date", generate_goods_turnover_request->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generate_goods_turnover_request_t *generate_goods_turnover_request_parseFromJSON(cJSON *generate_goods_turnover_requestJSON){

    generate_goods_turnover_request_t *generate_goods_turnover_request_local_var = NULL;

    // generate_goods_turnover_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(generate_goods_turnover_requestJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // generate_goods_turnover_request->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(generate_goods_turnover_requestJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    generate_goods_turnover_request_local_var = generate_goods_turnover_request_create (
        campaign_id->valuedouble,
        date ? strdup(date->valuestring) : NULL
        );

    return generate_goods_turnover_request_local_var;
end:
    return NULL;

}
