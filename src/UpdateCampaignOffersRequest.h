/*
 * UpdateCampaignOffersRequest.h
 *
 * Запрос на обновление предложений товаров магазина.
 */

#ifndef _UpdateCampaignOffersRequest_H_
#define _UpdateCampaignOffersRequest_H_


#include <string>
#include "UpdateCampaignOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на обновление предложений товаров магазина.
 *
 *  \ingroup Models
 *
 */

class UpdateCampaignOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateCampaignOffersRequest();
	UpdateCampaignOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateCampaignOffersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Параметры размещения товаров в заданном магазине.
	 */
	std::list<UpdateCampaignOfferDTO> getOffers();

	/*! \brief Set Параметры размещения товаров в заданном магазине.
	 */
	void setOffers(std::list <UpdateCampaignOfferDTO> offers);

private:
	std::list <UpdateCampaignOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateCampaignOffersRequest_H_ */
