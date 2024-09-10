/*
 * GetCampaignOffersResultDTO.h
 *
 * Список товаров в заданном магазине.
 */

#ifndef _GetCampaignOffersResultDTO_H_
#define _GetCampaignOffersResultDTO_H_


#include <string>
#include "GetCampaignOfferDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров в заданном магазине.
 *
 *  \ingroup Models
 *
 */

class GetCampaignOffersResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCampaignOffersResultDTO();
	GetCampaignOffersResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCampaignOffersResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Страница списка товаров.
	 */
	std::list<GetCampaignOfferDTO> getOffers();

	/*! \brief Set Страница списка товаров.
	 */
	void setOffers(std::list <GetCampaignOfferDTO> offers);

private:
	ScrollingPagerDTO paging;
	std::list <GetCampaignOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCampaignOffersResultDTO_H_ */
