
/*
 * OrderDocumentStatusType.h
 *
 * Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
 */

#ifndef TINY_CPP_CLIENT_OrderDocumentStatusType_H_
#define TINY_CPP_CLIENT_OrderDocumentStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 *
 *  \ingroup Models
 *
 */

class OrderDocumentStatusType{
public:

    /*! \brief Constructor.
	 */
    OrderDocumentStatusType();
    OrderDocumentStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDocumentStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderDocumentStatusType_H_ */
