
/*
 * UpdateBusinessPricesRequest.h
 *
 * Запрос на установку базовых цен на товары.
 */

#ifndef TINY_CPP_CLIENT_UpdateBusinessPricesRequest_H_
#define TINY_CPP_CLIENT_UpdateBusinessPricesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateBusinessOfferPriceDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на установку базовых цен на товары.
 *
 *  \ingroup Models
 *
 */

class UpdateBusinessPricesRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateBusinessPricesRequest();
    UpdateBusinessPricesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateBusinessPricesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров с ценами.
	 */
	std::list<UpdateBusinessOfferPriceDTO> getOffers();

	/*! \brief Set Список товаров с ценами.
	 */
	void setOffers(std::list <UpdateBusinessOfferPriceDTO> offers);


    private:
    std::list<UpdateBusinessOfferPriceDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_UpdateBusinessPricesRequest_H_ */
