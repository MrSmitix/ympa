
/*
 * OrdersStatsPriceType.h
 *
 * Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны. 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsPriceType_H_
#define TINY_CPP_CLIENT_OrdersStatsPriceType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPriceType{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsPriceType();
    OrdersStatsPriceType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsPriceType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsPriceType_H_ */
