
/*
 * OrdersStatsStockType.h
 *
 * Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества. 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsStockType_H_
#define TINY_CPP_CLIENT_OrdersStatsStockType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsStockType{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsStockType();
    OrdersStatsStockType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsStockType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsStockType_H_ */
