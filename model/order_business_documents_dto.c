#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "order_business_documents_dto.h"



order_business_documents_dto_t *order_business_documents_dto_create(
    document_dto_t *upd,
    document_dto_t *ukd,
    document_dto_t *torg_twelve,
    document_dto_t *sf,
    document_dto_t *ksf
    ) {
    order_business_documents_dto_t *order_business_documents_dto_local_var = malloc(sizeof(order_business_documents_dto_t));
    if (!order_business_documents_dto_local_var) {
        return NULL;
    }
    order_business_documents_dto_local_var->upd = upd;
    order_business_documents_dto_local_var->ukd = ukd;
    order_business_documents_dto_local_var->torg_twelve = torg_twelve;
    order_business_documents_dto_local_var->sf = sf;
    order_business_documents_dto_local_var->ksf = ksf;

    return order_business_documents_dto_local_var;
}


void order_business_documents_dto_free(order_business_documents_dto_t *order_business_documents_dto) {
    if(NULL == order_business_documents_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (order_business_documents_dto->upd) {
        document_dto_free(order_business_documents_dto->upd);
        order_business_documents_dto->upd = NULL;
    }
    if (order_business_documents_dto->ukd) {
        document_dto_free(order_business_documents_dto->ukd);
        order_business_documents_dto->ukd = NULL;
    }
    if (order_business_documents_dto->torg_twelve) {
        document_dto_free(order_business_documents_dto->torg_twelve);
        order_business_documents_dto->torg_twelve = NULL;
    }
    if (order_business_documents_dto->sf) {
        document_dto_free(order_business_documents_dto->sf);
        order_business_documents_dto->sf = NULL;
    }
    if (order_business_documents_dto->ksf) {
        document_dto_free(order_business_documents_dto->ksf);
        order_business_documents_dto->ksf = NULL;
    }
    free(order_business_documents_dto);
}

cJSON *order_business_documents_dto_convertToJSON(order_business_documents_dto_t *order_business_documents_dto) {
    cJSON *item = cJSON_CreateObject();

    // order_business_documents_dto->upd
    if(order_business_documents_dto->upd) {
    cJSON *upd_local_JSON = document_dto_convertToJSON(order_business_documents_dto->upd);
    if(upd_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "upd", upd_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_business_documents_dto->ukd
    if(order_business_documents_dto->ukd) {
    cJSON *ukd_local_JSON = document_dto_convertToJSON(order_business_documents_dto->ukd);
    if(ukd_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ukd", ukd_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_business_documents_dto->torg_twelve
    if(order_business_documents_dto->torg_twelve) {
    cJSON *torg_twelve_local_JSON = document_dto_convertToJSON(order_business_documents_dto->torg_twelve);
    if(torg_twelve_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "torgTwelve", torg_twelve_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_business_documents_dto->sf
    if(order_business_documents_dto->sf) {
    cJSON *sf_local_JSON = document_dto_convertToJSON(order_business_documents_dto->sf);
    if(sf_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sf", sf_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // order_business_documents_dto->ksf
    if(order_business_documents_dto->ksf) {
    cJSON *ksf_local_JSON = document_dto_convertToJSON(order_business_documents_dto->ksf);
    if(ksf_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ksf", ksf_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

order_business_documents_dto_t *order_business_documents_dto_parseFromJSON(cJSON *order_business_documents_dtoJSON){

    order_business_documents_dto_t *order_business_documents_dto_local_var = NULL;

    // define the local variable for order_business_documents_dto->upd
    document_dto_t *upd_local_nonprim = NULL;

    // define the local variable for order_business_documents_dto->ukd
    document_dto_t *ukd_local_nonprim = NULL;

    // define the local variable for order_business_documents_dto->torg_twelve
    document_dto_t *torg_twelve_local_nonprim = NULL;

    // define the local variable for order_business_documents_dto->sf
    document_dto_t *sf_local_nonprim = NULL;

    // define the local variable for order_business_documents_dto->ksf
    document_dto_t *ksf_local_nonprim = NULL;

    // order_business_documents_dto->upd
    cJSON *upd = cJSON_GetObjectItemCaseSensitive(order_business_documents_dtoJSON, "upd");
    if (upd) { 
    upd_local_nonprim = document_dto_parseFromJSON(upd); //nonprimitive
    }

    // order_business_documents_dto->ukd
    cJSON *ukd = cJSON_GetObjectItemCaseSensitive(order_business_documents_dtoJSON, "ukd");
    if (ukd) { 
    ukd_local_nonprim = document_dto_parseFromJSON(ukd); //nonprimitive
    }

    // order_business_documents_dto->torg_twelve
    cJSON *torg_twelve = cJSON_GetObjectItemCaseSensitive(order_business_documents_dtoJSON, "torgTwelve");
    if (torg_twelve) { 
    torg_twelve_local_nonprim = document_dto_parseFromJSON(torg_twelve); //nonprimitive
    }

    // order_business_documents_dto->sf
    cJSON *sf = cJSON_GetObjectItemCaseSensitive(order_business_documents_dtoJSON, "sf");
    if (sf) { 
    sf_local_nonprim = document_dto_parseFromJSON(sf); //nonprimitive
    }

    // order_business_documents_dto->ksf
    cJSON *ksf = cJSON_GetObjectItemCaseSensitive(order_business_documents_dtoJSON, "ksf");
    if (ksf) { 
    ksf_local_nonprim = document_dto_parseFromJSON(ksf); //nonprimitive
    }


    order_business_documents_dto_local_var = order_business_documents_dto_create (
        upd ? upd_local_nonprim : NULL,
        ukd ? ukd_local_nonprim : NULL,
        torg_twelve ? torg_twelve_local_nonprim : NULL,
        sf ? sf_local_nonprim : NULL,
        ksf ? ksf_local_nonprim : NULL
        );

    return order_business_documents_dto_local_var;
end:
    if (upd_local_nonprim) {
        document_dto_free(upd_local_nonprim);
        upd_local_nonprim = NULL;
    }
    if (ukd_local_nonprim) {
        document_dto_free(ukd_local_nonprim);
        ukd_local_nonprim = NULL;
    }
    if (torg_twelve_local_nonprim) {
        document_dto_free(torg_twelve_local_nonprim);
        torg_twelve_local_nonprim = NULL;
    }
    if (sf_local_nonprim) {
        document_dto_free(sf_local_nonprim);
        sf_local_nonprim = NULL;
    }
    if (ksf_local_nonprim) {
        document_dto_free(ksf_local_nonprim);
        ksf_local_nonprim = NULL;
    }
    return NULL;

}
