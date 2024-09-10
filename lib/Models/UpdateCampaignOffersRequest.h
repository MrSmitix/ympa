
/*
 * UpdateCampaignOffersRequest.h
 *
 * Запрос на обновление предложений товаров магазина.
 */

#ifndef TINY_CPP_CLIENT_UpdateCampaignOffersRequest_H_
#define TINY_CPP_CLIENT_UpdateCampaignOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateCampaignOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на обновление предложений товаров магазина.
 *
 *  \ingroup Models
 *
 */

class UpdateCampaignOffersRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateCampaignOffersRequest();
    UpdateCampaignOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateCampaignOffersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Параметры размещения товаров в заданном магазине.
	 */
	std::list<UpdateCampaignOfferDTO> getOffers();

	/*! \brief Set Параметры размещения товаров в заданном магазине.
	 */
	void setOffers(std::list <UpdateCampaignOfferDTO> offers);


    private:
    std::list<UpdateCampaignOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_UpdateCampaignOffersRequest_H_ */
