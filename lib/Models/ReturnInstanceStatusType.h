
/*
 * ReturnInstanceStatusType.h
 *
 * Логистический статус конкретного товара.
 */

#ifndef TINY_CPP_CLIENT_ReturnInstanceStatusType_H_
#define TINY_CPP_CLIENT_ReturnInstanceStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Логистический статус конкретного товара.
 *
 *  \ingroup Models
 *
 */

class ReturnInstanceStatusType{
public:

    /*! \brief Constructor.
	 */
    ReturnInstanceStatusType();
    ReturnInstanceStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReturnInstanceStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReturnInstanceStatusType_H_ */
