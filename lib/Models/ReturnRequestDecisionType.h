
/*
 * ReturnRequestDecisionType.h
 *
 * Решение по возврату.
 */

#ifndef TINY_CPP_CLIENT_ReturnRequestDecisionType_H_
#define TINY_CPP_CLIENT_ReturnRequestDecisionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Решение по возврату.
 *
 *  \ingroup Models
 *
 */

class ReturnRequestDecisionType{
public:

    /*! \brief Constructor.
	 */
    ReturnRequestDecisionType();
    ReturnRequestDecisionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReturnRequestDecisionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReturnRequestDecisionType_H_ */
