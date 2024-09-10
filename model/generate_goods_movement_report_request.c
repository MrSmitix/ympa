#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generate_goods_movement_report_request.h"



generate_goods_movement_report_request_t *generate_goods_movement_report_request_create(
    long campaign_id,
    char *date_from,
    char *date_to,
    char *shop_sku
    ) {
    generate_goods_movement_report_request_t *generate_goods_movement_report_request_local_var = malloc(sizeof(generate_goods_movement_report_request_t));
    if (!generate_goods_movement_report_request_local_var) {
        return NULL;
    }
    generate_goods_movement_report_request_local_var->campaign_id = campaign_id;
    generate_goods_movement_report_request_local_var->date_from = date_from;
    generate_goods_movement_report_request_local_var->date_to = date_to;
    generate_goods_movement_report_request_local_var->shop_sku = shop_sku;

    return generate_goods_movement_report_request_local_var;
}


void generate_goods_movement_report_request_free(generate_goods_movement_report_request_t *generate_goods_movement_report_request) {
    if(NULL == generate_goods_movement_report_request){
        return ;
    }
    listEntry_t *listEntry;
    if (generate_goods_movement_report_request->date_from) {
        free(generate_goods_movement_report_request->date_from);
        generate_goods_movement_report_request->date_from = NULL;
    }
    if (generate_goods_movement_report_request->date_to) {
        free(generate_goods_movement_report_request->date_to);
        generate_goods_movement_report_request->date_to = NULL;
    }
    if (generate_goods_movement_report_request->shop_sku) {
        free(generate_goods_movement_report_request->shop_sku);
        generate_goods_movement_report_request->shop_sku = NULL;
    }
    free(generate_goods_movement_report_request);
}

cJSON *generate_goods_movement_report_request_convertToJSON(generate_goods_movement_report_request_t *generate_goods_movement_report_request) {
    cJSON *item = cJSON_CreateObject();

    // generate_goods_movement_report_request->campaign_id
    if (!generate_goods_movement_report_request->campaign_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "campaignId", generate_goods_movement_report_request->campaign_id) == NULL) {
    goto fail; //Numeric
    }


    // generate_goods_movement_report_request->date_from
    if (!generate_goods_movement_report_request->date_from) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateFrom", generate_goods_movement_report_request->date_from) == NULL) {
    goto fail; //Date
    }


    // generate_goods_movement_report_request->date_to
    if (!generate_goods_movement_report_request->date_to) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "dateTo", generate_goods_movement_report_request->date_to) == NULL) {
    goto fail; //Date
    }


    // generate_goods_movement_report_request->shop_sku
    if(generate_goods_movement_report_request->shop_sku) {
    if(cJSON_AddStringToObject(item, "shopSku", generate_goods_movement_report_request->shop_sku) == NULL) {
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

generate_goods_movement_report_request_t *generate_goods_movement_report_request_parseFromJSON(cJSON *generate_goods_movement_report_requestJSON){

    generate_goods_movement_report_request_t *generate_goods_movement_report_request_local_var = NULL;

    // generate_goods_movement_report_request->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(generate_goods_movement_report_requestJSON, "campaignId");
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(campaign_id))
    {
    goto end; //Numeric
    }

    // generate_goods_movement_report_request->date_from
    cJSON *date_from = cJSON_GetObjectItemCaseSensitive(generate_goods_movement_report_requestJSON, "dateFrom");
    if (!date_from) {
        goto end;
    }

    
    if(!cJSON_IsString(date_from))
    {
    goto end; //Date
    }

    // generate_goods_movement_report_request->date_to
    cJSON *date_to = cJSON_GetObjectItemCaseSensitive(generate_goods_movement_report_requestJSON, "dateTo");
    if (!date_to) {
        goto end;
    }

    
    if(!cJSON_IsString(date_to))
    {
    goto end; //Date
    }

    // generate_goods_movement_report_request->shop_sku
    cJSON *shop_sku = cJSON_GetObjectItemCaseSensitive(generate_goods_movement_report_requestJSON, "shopSku");
    if (shop_sku) { 
    if(!cJSON_IsString(shop_sku) && !cJSON_IsNull(shop_sku))
    {
    goto end; //String
    }
    }


    generate_goods_movement_report_request_local_var = generate_goods_movement_report_request_create (
        campaign_id->valuedouble,
        strdup(date_from->valuestring),
        strdup(date_to->valuestring),
        shop_sku && !cJSON_IsNull(shop_sku) ? strdup(shop_sku->valuestring) : NULL
        );

    return generate_goods_movement_report_request_local_var;
end:
    return NULL;

}
