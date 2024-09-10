
/*
 * AddOffersToArchiveErrorType.h
 *
 * Причина, по которой товар не удалось поместить в архив:  * &#x60;OFFER_HAS_STOCKS&#x60; — товар хранится на складе Маркета. 
 */

#ifndef TINY_CPP_CLIENT_AddOffersToArchiveErrorType_H_
#define TINY_CPP_CLIENT_AddOffersToArchiveErrorType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveErrorType{
public:

    /*! \brief Constructor.
	 */
    AddOffersToArchiveErrorType();
    AddOffersToArchiveErrorType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AddOffersToArchiveErrorType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AddOffersToArchiveErrorType_H_ */
