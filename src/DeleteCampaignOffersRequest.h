/*
 * DeleteCampaignOffersRequest.h
 *
 * Фильтрации удаляемых товаров по offerIds. 
 */

#ifndef _DeleteCampaignOffersRequest_H_
#define _DeleteCampaignOffersRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтрации удаляемых товаров по offerIds. 
 *
 *  \ingroup Models
 *
 */

class DeleteCampaignOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteCampaignOffersRequest();
	DeleteCampaignOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteCampaignOffersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы товаров в каталоге.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров в каталоге.
	 */
	void setOfferIds(std::list <std::string> offerIds);

private:
	std::list <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteCampaignOffersRequest_H_ */
