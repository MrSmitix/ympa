/*
 * DeleteCampaignOffersDTO.h
 *
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */

#ifndef _DeleteCampaignOffersDTO_H_
#define _DeleteCampaignOffersDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 *
 *  \ingroup Models
 *
 */

class DeleteCampaignOffersDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteCampaignOffersDTO();
	DeleteCampaignOffersDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteCampaignOffersDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список SKU.
	 */
	std::list<std::string> getNotDeletedOfferIds();

	/*! \brief Set Список SKU.
	 */
	void setNotDeletedOfferIds(std::list <std::string> notDeletedOfferIds);

private:
	std::list <std::string>notDeletedOfferIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteCampaignOffersDTO_H_ */
