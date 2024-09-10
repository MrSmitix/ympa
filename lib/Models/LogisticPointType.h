
/*
 * LogisticPointType.h
 *
 * Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
 */

#ifndef TINY_CPP_CLIENT_LogisticPointType_H_
#define TINY_CPP_CLIENT_LogisticPointType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал. 
 *
 *  \ingroup Models
 *
 */

class LogisticPointType{
public:

    /*! \brief Constructor.
	 */
    LogisticPointType();
    LogisticPointType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LogisticPointType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LogisticPointType_H_ */
