/*
 * warehouse_stock_type.h
 *
 * Тип остатков товаров на складе:  * &#x60;AVAILABLE&#x60; (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * &#x60;DEFECT&#x60; (соответствует типу «Брак») — товар с браком.  * &#x60;EXPIRED&#x60; (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * &#x60;FIT&#x60; (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * &#x60;FREEZE&#x60; — товар, который зарезервирован для заказов.  * &#x60;QUARANTINE&#x60; (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * &#x60;UTILIZATION&#x60; — товар, который будет утилизирован. 
 */

#ifndef _warehouse_stock_type_H_
#define _warehouse_stock_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct warehouse_stock_type_t warehouse_stock_type_t;


// Enum  for warehouse_stock_type

typedef enum { _api__warehouse_stock_type__NULL = 0, _api__warehouse_stock_type__FIT, _api__warehouse_stock_type__FREEZE, _api__warehouse_stock_type__AVAILABLE, _api__warehouse_stock_type__QUARANTINE, _api__warehouse_stock_type__UTILIZATION, _api__warehouse_stock_type__DEFECT, _api__warehouse_stock_type__EXPIRED } _api__warehouse_stock_type__e;

char* warehouse_stock_type_warehouse_stock_type_ToString(_api__warehouse_stock_type__e warehouse_stock_type);

_api__warehouse_stock_type__e warehouse_stock_type_warehouse_stock_type_FromString(char* warehouse_stock_type);

//cJSON *warehouse_stock_type_warehouse_stock_type_convertToJSON(_api__warehouse_stock_type__e warehouse_stock_type);

//_api__warehouse_stock_type__e warehouse_stock_type_warehouse_stock_type_parseFromJSON(cJSON *warehouse_stock_typeJSON);

#endif /* _warehouse_stock_type_H_ */

