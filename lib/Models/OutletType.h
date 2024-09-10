
/*
 * OutletType.h
 *
 * Тип точки продаж.  Возможные значения:  * &#x60;DEPOT&#x60; — пункт выдачи заказов. * &#x60;MIXED&#x60; — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * &#x60;RETAIL&#x60; — розничная точка продаж (торговый зал). 
 */

#ifndef TINY_CPP_CLIENT_OutletType_H_
#define TINY_CPP_CLIENT_OutletType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). 
 *
 *  \ingroup Models
 *
 */

class OutletType{
public:

    /*! \brief Constructor.
	 */
    OutletType();
    OutletType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OutletType_H_ */
