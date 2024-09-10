/*
 * order_vat_type.h
 *
 * Ставка налога на добавленную стоимость (НДС) на товар:  * &#x60;NO_VAT&#x60; — НДС не облагается, используется только для отдельных видов услуг.  * &#x60;VAT_0&#x60; — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * &#x60;VAT_10&#x60; — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * &#x60;VAT_10_110&#x60; — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * &#x60;VAT_20&#x60; — НДС 20%. Основная ставка с 2019 года.  * &#x60;VAT_20_120&#x60; — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * &#x60;VAT_18&#x60; — НДС 18%. Основная ставка до 2019 года.  * &#x60;VAT_18_118&#x60; — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * &#x60;UNKNOWN_VALUE&#x60; — неизвестный тип.  Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;. 
 */

#ifndef _order_vat_type_H_
#define _order_vat_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_vat_type_t order_vat_type_t;


// Enum  for order_vat_type

typedef enum { _api__order_vat_type__NULL = 0, _api__order_vat_type__NO_VAT, _api__order_vat_type__VAT_0, _api__order_vat_type__VAT_10, _api__order_vat_type__VAT_10_110, _api__order_vat_type__VAT_20, _api__order_vat_type__VAT_20_120, _api__order_vat_type__VAT_18, _api__order_vat_type__VAT_18_118, _api__order_vat_type__UNKNOWN_VALUE } _api__order_vat_type__e;

char* order_vat_type_order_vat_type_ToString(_api__order_vat_type__e order_vat_type);

_api__order_vat_type__e order_vat_type_order_vat_type_FromString(char* order_vat_type);

//cJSON *order_vat_type_order_vat_type_convertToJSON(_api__order_vat_type__e order_vat_type);

//_api__order_vat_type__e order_vat_type_order_vat_type_parseFromJSON(cJSON *order_vat_typeJSON);

#endif /* _order_vat_type_H_ */

