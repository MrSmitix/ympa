
/*
 * UpdatePromoOffersRequest.h
 *
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_UpdatePromoOffersRequest_H_
#define TINY_CPP_CLIENT_UpdatePromoOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatePromoOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOffersRequest{
public:

    /*! \brief Constructor.
	 */
    UpdatePromoOffersRequest();
    UpdatePromoOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePromoOffersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор акции.
	 */
	std::string getPromoId();

	/*! \brief Set Идентификатор акции.
	 */
	void setPromoId(std::string  promoId);
	/*! \brief Get Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
	 */
	std::list<UpdatePromoOfferDTO> getOffers();

	/*! \brief Set Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
	 */
	void setOffers(std::list <UpdatePromoOfferDTO> offers);


    private:
    std::string promoId{};
    std::list<UpdatePromoOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePromoOffersRequest_H_ */
