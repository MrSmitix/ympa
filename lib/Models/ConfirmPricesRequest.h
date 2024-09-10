
/*
 * ConfirmPricesRequest.h
 *
 * Запрос на подтверждение цены. 
 */

#ifndef TINY_CPP_CLIENT_ConfirmPricesRequest_H_
#define TINY_CPP_CLIENT_ConfirmPricesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на подтверждение цены. 
 *
 *  \ingroup Models
 *
 */

class ConfirmPricesRequest{
public:

    /*! \brief Constructor.
	 */
    ConfirmPricesRequest();
    ConfirmPricesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConfirmPricesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификаторы товаров, у которых подтверждается цена.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров, у которых подтверждается цена.
	 */
	void setOfferIds(std::list <std::string> offerIds);


    private:
    std::list<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_ConfirmPricesRequest_H_ */
