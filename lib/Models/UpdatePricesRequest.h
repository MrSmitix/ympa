
/*
 * UpdatePricesRequest.h
 *
 * Запрос на установку цен на товары.
 */

#ifndef TINY_CPP_CLIENT_UpdatePricesRequest_H_
#define TINY_CPP_CLIENT_UpdatePricesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferPriceDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на установку цен на товары.
 *
 *  \ingroup Models
 *
 */

class UpdatePricesRequest{
public:

    /*! \brief Constructor.
	 */
    UpdatePricesRequest();
    UpdatePricesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePricesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров.
	 */
	std::list<OfferPriceDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <OfferPriceDTO> offers);


    private:
    std::list<OfferPriceDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePricesRequest_H_ */
