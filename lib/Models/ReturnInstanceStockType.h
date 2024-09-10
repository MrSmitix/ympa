
/*
 * ReturnInstanceStockType.h
 *
 * Тип остатка на складе.
 */

#ifndef TINY_CPP_CLIENT_ReturnInstanceStockType_H_
#define TINY_CPP_CLIENT_ReturnInstanceStockType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип остатка на складе.
 *
 *  \ingroup Models
 *
 */

class ReturnInstanceStockType{
public:

    /*! \brief Constructor.
	 */
    ReturnInstanceStockType();
    ReturnInstanceStockType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReturnInstanceStockType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReturnInstanceStockType_H_ */
