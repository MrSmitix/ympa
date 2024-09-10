/*
 * GetPromoOffersResultDTO.h
 *
 * Список товаров, которые участвуют или могут участвовать в акции.
 */

#ifndef _GetPromoOffersResultDTO_H_
#define _GetPromoOffersResultDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "GetPromoOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров, которые участвуют или могут участвовать в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoOffersResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoOffersResultDTO();
	GetPromoOffersResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoOffersResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Товары, которые участвуют или могут участвовать в акции.
	 */
	std::list<GetPromoOfferDTO> getOffers();

	/*! \brief Set Товары, которые участвуют или могут участвовать в акции.
	 */
	void setOffers(std::list <GetPromoOfferDTO> offers);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	std::list <GetPromoOfferDTO>offers;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoOffersResultDTO_H_ */
