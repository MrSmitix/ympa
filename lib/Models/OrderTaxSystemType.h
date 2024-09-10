
/*
 * OrderTaxSystemType.h
 *
 * Система налогообложения (СНО) магазина на момент оформления заказа:  * &#x60;ECHN&#x60; — единый сельскохозяйственный налог (ЕСХН).  * &#x60;ENVD&#x60; — единый налог на вмененный доход (ЕНВД).  * &#x60;OSN&#x60; — общая система налогообложения (ОСН).  * &#x60;PSN&#x60; — патентная система налогообложения (ПСН).  * &#x60;USN&#x60; — упрощенная система налогообложения (УСН).  * &#x60;USN_MINUS_COST&#x60; — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * &#x60;NPD&#x60; — налог на профессиональный доход (НПД).  * &#x60;UNKNOWN_VALUE&#x60; — неизвестное значение. Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_OrderTaxSystemType_H_
#define TINY_CPP_CLIENT_OrderTaxSystemType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. 
 *
 *  \ingroup Models
 *
 */

class OrderTaxSystemType{
public:

    /*! \brief Constructor.
	 */
    OrderTaxSystemType();
    OrderTaxSystemType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderTaxSystemType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderTaxSystemType_H_ */
