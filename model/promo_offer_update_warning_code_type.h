/*
 * promo_offer_update_warning_code_type.h
 *
 * Предупреждение, которое появилось при добавлении товара:  * &#x60;DEEP_DISCOUNT_OFFER&#x60; — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * &#x60;CATALOG_PRICE_IS_LOWER_THAN_PROMO&#x60; — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * &#x60;SHOP_PRICES_ARE_LOWER_THAN_PROMO&#x60; — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * &#x60;PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE&#x60; — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * &#x60;SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар в отдельном магазине не подходит под условия акции. 
 */

#ifndef _promo_offer_update_warning_code_type_H_
#define _promo_offer_update_warning_code_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_offer_update_warning_code_type_t promo_offer_update_warning_code_type_t;


// Enum  for promo_offer_update_warning_code_type

typedef enum { _api__promo_offer_update_warning_code_type__NULL = 0, _api__promo_offer_update_warning_code_type__DEEP_DISCOUNT_OFFER, _api__promo_offer_update_warning_code_type__CATALOG_PRICE_IS_LOWER_THAN_PROMO, _api__promo_offer_update_warning_code_type__SHOP_PRICES_ARE_LOWER_THAN_PROMO, _api__promo_offer_update_warning_code_type__PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE, _api__promo_offer_update_warning_code_type__SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO } _api__promo_offer_update_warning_code_type__e;

char* promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_ToString(_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type);

_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_FromString(char* promo_offer_update_warning_code_type);

//cJSON *promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_convertToJSON(_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type);

//_api__promo_offer_update_warning_code_type__e promo_offer_update_warning_code_type_promo_offer_update_warning_code_type_parseFromJSON(cJSON *promo_offer_update_warning_code_typeJSON);

#endif /* _promo_offer_update_warning_code_type_H_ */

