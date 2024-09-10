
/*
 * ShipmentType.h
 *
 * Способ отгрузки заказов:  * &#x60;IMPORT&#x60; — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * &#x60;WITHDRAW&#x60; — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
 */

#ifndef TINY_CPP_CLIENT_ShipmentType_H_
#define TINY_CPP_CLIENT_ShipmentType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
 *
 *  \ingroup Models
 *
 */

class ShipmentType{
public:

    /*! \brief Constructor.
	 */
    ShipmentType();
    ShipmentType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShipmentType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ShipmentType_H_ */
