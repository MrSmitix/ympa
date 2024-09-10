/*
 * return_decision_subreason_type.h
 *
 * Детали причин возврата:   * &#x60;DO_NOT_FIT&#x60;:     * &#x60;USER_DID_NOT_LIKE&#x60; — товар не понравился.     * &#x60;USER_CHANGED_MIND&#x60; — передумал покупать.     * &#x60;DELIVERED_TOO_LONG&#x60; — длительный срок доставки, поэтому передумал.    * &#x60;BAD_QUALITY&#x60;:     * &#x60;BAD_PACKAGE&#x60; — упаковка товара была нарушена.     * &#x60;DAMAGED&#x60; — царапины, сколы.     * &#x60;NOT_WORKING&#x60; — не включается / не работает.     * &#x60;INCOMPLETENESS&#x60; — некомплект (не хватает детали в наборе, к товару).    * &#x60;WRONG_ITEM&#x60;:     * &#x60;WRONG_ITEM&#x60; — не тот товар.     * &#x60;WRONG_COLOR&#x60; — не соответствует по цвету.     * &#x60;DID_NOT_MATCH_DESCRIPTION&#x60; — не соответствует заявленным характеристикам/описанию. 
 */

#ifndef _return_decision_subreason_type_H_
#define _return_decision_subreason_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct return_decision_subreason_type_t return_decision_subreason_type_t;


// Enum  for return_decision_subreason_type

typedef enum { _api__return_decision_subreason_type__NULL = 0, _api__return_decision_subreason_type__USER_DID_NOT_LIKE, _api__return_decision_subreason_type__USER_CHANGED_MIND, _api__return_decision_subreason_type__DELIVERED_TOO_LONG, _api__return_decision_subreason_type__BAD_PACKAGE, _api__return_decision_subreason_type__DAMAGED, _api__return_decision_subreason_type__NOT_WORKING, _api__return_decision_subreason_type__INCOMPLETENESS, _api__return_decision_subreason_type__WRONG_ITEM, _api__return_decision_subreason_type__WRONG_COLOR, _api__return_decision_subreason_type__DID_NOT_MATCH_DESCRIPTION, _api__return_decision_subreason_type__UNKNOWN } _api__return_decision_subreason_type__e;

char* return_decision_subreason_type_return_decision_subreason_type_ToString(_api__return_decision_subreason_type__e return_decision_subreason_type);

_api__return_decision_subreason_type__e return_decision_subreason_type_return_decision_subreason_type_FromString(char* return_decision_subreason_type);

//cJSON *return_decision_subreason_type_return_decision_subreason_type_convertToJSON(_api__return_decision_subreason_type__e return_decision_subreason_type);

//_api__return_decision_subreason_type__e return_decision_subreason_type_return_decision_subreason_type_parseFromJSON(cJSON *return_decision_subreason_typeJSON);

#endif /* _return_decision_subreason_type_H_ */

