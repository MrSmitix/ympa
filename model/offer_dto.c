#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "offer_dto.h"


char* offer_dto_currency_ToString(_api__offer_dto__e currency) {
    char* currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    return currencyArray[currency];
}

_api__offer_dto__e offer_dto_currency_FromString(char* currency){
    int stringToReturn = 0;
    char *currencyArray[] =  { "NULL", "RUR", "USD", "EUR", "UAH", "AUD", "GBP", "BYR", "BYN", "DKK", "ISK", "KZT", "CAD", "CNY", "NOK", "XDR", "SGD", "TRY", "SEK", "CHF", "JPY", "AZN", "ALL", "DZD", "AOA", "ARS", "AMD", "AFN", "BHD", "BGN", "BOB", "BWP", "BND", "BRL", "BIF", "HUF", "VEF", "KPW", "VND", "GMD", "GHS", "GNF", "HKD", "GEL", "AED", "EGP", "ZMK", "ILS", "INR", "IDR", "JOD", "IQD", "IRR", "YER", "QAR", "KES", "KGS", "COP", "CDF", "CRC", "KWD", "CUP", "LAK", "LVL", "SLL", "LBP", "LYD", "SZL", "LTL", "MUR", "MRO", "MKD", "MWK", "MGA", "MYR", "MAD", "MXN", "MZN", "MDL", "MNT", "NPR", "NGN", "NIO", "NZD", "OMR", "PKR", "PYG", "PEN", "PLN", "KHR", "SAR", "RON", "SCR", "SYP", "SKK", "SOS", "SDG", "SRD", "TJS", "THB", "TWD", "BDT", "TZS", "TND", "TMM", "UGX", "UZS", "UYU", "PHP", "DJF", "XAF", "XOF", "HRK", "CZK", "CLP", "LKR", "EEK", "ETB", "RSD", "ZAR", "KRW", "NAD", "TL", "UE" };
    size_t sizeofArray = sizeof(currencyArray) / sizeof(currencyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(currency, currencyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

offer_dto_t *offer_dto_create(
    double price,
    long feed_id,
    char *id,
    char *shop_category_id,
    int market_category_id,
    double pre_discount_price,
    int discount,
    int cut_price,
    char *url,
    long model_id,
    char *name,
    currency_type_t *currency,
    double bid,
    double cbid,
    double fee,
    int blocked
    ) {
    offer_dto_t *offer_dto_local_var = malloc(sizeof(offer_dto_t));
    if (!offer_dto_local_var) {
        return NULL;
    }
    offer_dto_local_var->price = price;
    offer_dto_local_var->feed_id = feed_id;
    offer_dto_local_var->id = id;
    offer_dto_local_var->shop_category_id = shop_category_id;
    offer_dto_local_var->market_category_id = market_category_id;
    offer_dto_local_var->pre_discount_price = pre_discount_price;
    offer_dto_local_var->discount = discount;
    offer_dto_local_var->cut_price = cut_price;
    offer_dto_local_var->url = url;
    offer_dto_local_var->model_id = model_id;
    offer_dto_local_var->name = name;
    offer_dto_local_var->currency = currency;
    offer_dto_local_var->bid = bid;
    offer_dto_local_var->cbid = cbid;
    offer_dto_local_var->fee = fee;
    offer_dto_local_var->blocked = blocked;

    return offer_dto_local_var;
}


void offer_dto_free(offer_dto_t *offer_dto) {
    if(NULL == offer_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (offer_dto->id) {
        free(offer_dto->id);
        offer_dto->id = NULL;
    }
    if (offer_dto->shop_category_id) {
        free(offer_dto->shop_category_id);
        offer_dto->shop_category_id = NULL;
    }
    if (offer_dto->url) {
        free(offer_dto->url);
        offer_dto->url = NULL;
    }
    if (offer_dto->name) {
        free(offer_dto->name);
        offer_dto->name = NULL;
    }
    if (offer_dto->currency) {
        currency_type_free(offer_dto->currency);
        offer_dto->currency = NULL;
    }
    free(offer_dto);
}

cJSON *offer_dto_convertToJSON(offer_dto_t *offer_dto) {
    cJSON *item = cJSON_CreateObject();

    // offer_dto->price
    if(offer_dto->price) {
    if(cJSON_AddNumberToObject(item, "price", offer_dto->price) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->feed_id
    if(offer_dto->feed_id) {
    if(cJSON_AddNumberToObject(item, "feedId", offer_dto->feed_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->id
    if(offer_dto->id) {
    if(cJSON_AddStringToObject(item, "id", offer_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // offer_dto->shop_category_id
    if(offer_dto->shop_category_id) {
    if(cJSON_AddStringToObject(item, "shopCategoryId", offer_dto->shop_category_id) == NULL) {
    goto fail; //String
    }
    }


    // offer_dto->market_category_id
    if(offer_dto->market_category_id) {
    if(cJSON_AddNumberToObject(item, "marketCategoryId", offer_dto->market_category_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->pre_discount_price
    if(offer_dto->pre_discount_price) {
    if(cJSON_AddNumberToObject(item, "preDiscountPrice", offer_dto->pre_discount_price) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->discount
    if(offer_dto->discount) {
    if(cJSON_AddNumberToObject(item, "discount", offer_dto->discount) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->cut_price
    if(offer_dto->cut_price) {
    if(cJSON_AddBoolToObject(item, "cutPrice", offer_dto->cut_price) == NULL) {
    goto fail; //Bool
    }
    }


    // offer_dto->url
    if(offer_dto->url) {
    if(cJSON_AddStringToObject(item, "url", offer_dto->url) == NULL) {
    goto fail; //String
    }
    }


    // offer_dto->model_id
    if (!offer_dto->model_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "modelId", offer_dto->model_id) == NULL) {
    goto fail; //Numeric
    }


    // offer_dto->name
    if(offer_dto->name) {
    if(cJSON_AddStringToObject(item, "name", offer_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // offer_dto->currency
    if(offer_dto->currency != _api__offer_dto__NULL) {
    cJSON *currency_local_JSON = currency_type_convertToJSON(offer_dto->currency);
    if(currency_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "currency", currency_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // offer_dto->bid
    if(offer_dto->bid) {
    if(cJSON_AddNumberToObject(item, "bid", offer_dto->bid) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->cbid
    if(offer_dto->cbid) {
    if(cJSON_AddNumberToObject(item, "cbid", offer_dto->cbid) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->fee
    if(offer_dto->fee) {
    if(cJSON_AddNumberToObject(item, "fee", offer_dto->fee) == NULL) {
    goto fail; //Numeric
    }
    }


    // offer_dto->blocked
    if(offer_dto->blocked) {
    if(cJSON_AddBoolToObject(item, "blocked", offer_dto->blocked) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

offer_dto_t *offer_dto_parseFromJSON(cJSON *offer_dtoJSON){

    offer_dto_t *offer_dto_local_var = NULL;

    // define the local variable for offer_dto->currency
    currency_type_t *currency_local_nonprim = NULL;

    // offer_dto->price
    cJSON *price = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "price");
    if (price) { 
    if(!cJSON_IsNumber(price))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "feedId");
    if (feed_id) { 
    if(!cJSON_IsNumber(feed_id))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // offer_dto->shop_category_id
    cJSON *shop_category_id = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "shopCategoryId");
    if (shop_category_id) { 
    if(!cJSON_IsString(shop_category_id) && !cJSON_IsNull(shop_category_id))
    {
    goto end; //String
    }
    }

    // offer_dto->market_category_id
    cJSON *market_category_id = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "marketCategoryId");
    if (market_category_id) { 
    if(!cJSON_IsNumber(market_category_id))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->pre_discount_price
    cJSON *pre_discount_price = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "preDiscountPrice");
    if (pre_discount_price) { 
    if(!cJSON_IsNumber(pre_discount_price))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->discount
    cJSON *discount = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "discount");
    if (discount) { 
    if(!cJSON_IsNumber(discount))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->cut_price
    cJSON *cut_price = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "cutPrice");
    if (cut_price) { 
    if(!cJSON_IsBool(cut_price))
    {
    goto end; //Bool
    }
    }

    // offer_dto->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "url");
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // offer_dto->model_id
    cJSON *model_id = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "modelId");
    if (!model_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(model_id))
    {
    goto end; //Numeric
    }

    // offer_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // offer_dto->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "currency");
    if (currency) { 
    currency_local_nonprim = currency_type_parseFromJSON(currency); //custom
    }

    // offer_dto->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "bid");
    if (bid) { 
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->cbid
    cJSON *cbid = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "cbid");
    if (cbid) { 
    if(!cJSON_IsNumber(cbid))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->fee
    cJSON *fee = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "fee");
    if (fee) { 
    if(!cJSON_IsNumber(fee))
    {
    goto end; //Numeric
    }
    }

    // offer_dto->blocked
    cJSON *blocked = cJSON_GetObjectItemCaseSensitive(offer_dtoJSON, "blocked");
    if (blocked) { 
    if(!cJSON_IsBool(blocked))
    {
    goto end; //Bool
    }
    }


    offer_dto_local_var = offer_dto_create (
        price ? price->valuedouble : 0,
        feed_id ? feed_id->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        shop_category_id && !cJSON_IsNull(shop_category_id) ? strdup(shop_category_id->valuestring) : NULL,
        market_category_id ? market_category_id->valuedouble : 0,
        pre_discount_price ? pre_discount_price->valuedouble : 0,
        discount ? discount->valuedouble : 0,
        cut_price ? cut_price->valueint : 0,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL,
        model_id->valuedouble,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        currency ? currency_local_nonprim : NULL,
        bid ? bid->valuedouble : 0,
        cbid ? cbid->valuedouble : 0,
        fee ? fee->valuedouble : 0,
        blocked ? blocked->valueint : 0
        );

    return offer_dto_local_var;
end:
    if (currency_local_nonprim) {
        currency_type_free(currency_local_nonprim);
        currency_local_nonprim = NULL;
    }
    return NULL;

}
