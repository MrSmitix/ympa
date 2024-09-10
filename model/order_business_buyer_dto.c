#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_business_buyer_dto.h"



order_business_buyer_dto_t *order_business_buyer_dto_create(
    char *inn,
    char *kpp,
    char *organization_name,
    char *organization_jur_address
    ) {
    order_business_buyer_dto_t *order_business_buyer_dto_local_var = malloc(sizeof(order_business_buyer_dto_t));
    if (!order_business_buyer_dto_local_var) {
        return NULL;
    }
    order_business_buyer_dto_local_var->inn = inn;
    order_business_buyer_dto_local_var->kpp = kpp;
    order_business_buyer_dto_local_var->organization_name = organization_name;
    order_business_buyer_dto_local_var->organization_jur_address = organization_jur_address;

    return order_business_buyer_dto_local_var;
}


void order_business_buyer_dto_free(order_business_buyer_dto_t *order_business_buyer_dto) {
    if(NULL == order_business_buyer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_business_buyer_dto->inn) {
        free(order_business_buyer_dto->inn);
        order_business_buyer_dto->inn = NULL;
    }
    if (order_business_buyer_dto->kpp) {
        free(order_business_buyer_dto->kpp);
        order_business_buyer_dto->kpp = NULL;
    }
    if (order_business_buyer_dto->organization_name) {
        free(order_business_buyer_dto->organization_name);
        order_business_buyer_dto->organization_name = NULL;
    }
    if (order_business_buyer_dto->organization_jur_address) {
        free(order_business_buyer_dto->organization_jur_address);
        order_business_buyer_dto->organization_jur_address = NULL;
    }
    free(order_business_buyer_dto);
}

cJSON *order_business_buyer_dto_convertToJSON(order_business_buyer_dto_t *order_business_buyer_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_business_buyer_dto->inn
    if(order_business_buyer_dto->inn) {
    if(cJSON_AddStringToObject(item, "inn", order_business_buyer_dto->inn) == NULL) {
    goto fail; //String
    }
    }


    // order_business_buyer_dto->kpp
    if(order_business_buyer_dto->kpp) {
    if(cJSON_AddStringToObject(item, "kpp", order_business_buyer_dto->kpp) == NULL) {
    goto fail; //String
    }
    }


    // order_business_buyer_dto->organization_name
    if(order_business_buyer_dto->organization_name) {
    if(cJSON_AddStringToObject(item, "organizationName", order_business_buyer_dto->organization_name) == NULL) {
    goto fail; //String
    }
    }


    // order_business_buyer_dto->organization_jur_address
    if(order_business_buyer_dto->organization_jur_address) {
    if(cJSON_AddStringToObject(item, "organizationJurAddress", order_business_buyer_dto->organization_jur_address) == NULL) {
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

order_business_buyer_dto_t *order_business_buyer_dto_parseFromJSON(cJSON *order_business_buyer_dtoJSON){

    order_business_buyer_dto_t *order_business_buyer_dto_local_var = NULL;

    // order_business_buyer_dto->inn
    cJSON *inn = cJSON_GetObjectItemCaseSensitive(order_business_buyer_dtoJSON, "inn");
    if (inn) { 
    if(!cJSON_IsString(inn) && !cJSON_IsNull(inn))
    {
    goto end; //String
    }
    }

    // order_business_buyer_dto->kpp
    cJSON *kpp = cJSON_GetObjectItemCaseSensitive(order_business_buyer_dtoJSON, "kpp");
    if (kpp) { 
    if(!cJSON_IsString(kpp) && !cJSON_IsNull(kpp))
    {
    goto end; //String
    }
    }

    // order_business_buyer_dto->organization_name
    cJSON *organization_name = cJSON_GetObjectItemCaseSensitive(order_business_buyer_dtoJSON, "organizationName");
    if (organization_name) { 
    if(!cJSON_IsString(organization_name) && !cJSON_IsNull(organization_name))
    {
    goto end; //String
    }
    }

    // order_business_buyer_dto->organization_jur_address
    cJSON *organization_jur_address = cJSON_GetObjectItemCaseSensitive(order_business_buyer_dtoJSON, "organizationJurAddress");
    if (organization_jur_address) { 
    if(!cJSON_IsString(organization_jur_address) && !cJSON_IsNull(organization_jur_address))
    {
    goto end; //String
    }
    }


    order_business_buyer_dto_local_var = order_business_buyer_dto_create (
        inn && !cJSON_IsNull(inn) ? strdup(inn->valuestring) : NULL,
        kpp && !cJSON_IsNull(kpp) ? strdup(kpp->valuestring) : NULL,
        organization_name && !cJSON_IsNull(organization_name) ? strdup(organization_name->valuestring) : NULL,
        organization_jur_address && !cJSON_IsNull(organization_jur_address) ? strdup(organization_jur_address->valuestring) : NULL
        );

    return order_business_buyer_dto_local_var;
end:
    return NULL;

}
