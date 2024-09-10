/*
 * OfferPriceByOfferIdsListResponseDTO.h
 *
 * Список цен.
 */

#ifndef _OfferPriceByOfferIdsListResponseDTO_H_
#define _OfferPriceByOfferIdsListResponseDTO_H_


#include <string>
#include "OfferPriceByOfferIdsResponseDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список цен.
 *
 *  \ingroup Models
 *
 */

class OfferPriceByOfferIdsListResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferPriceByOfferIdsListResponseDTO();
	OfferPriceByOfferIdsListResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferPriceByOfferIdsListResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Страница списка цен.
	 */
	std::list<OfferPriceByOfferIdsResponseDTO> getOffers();

	/*! \brief Set Страница списка цен.
	 */
	void setOffers(std::list <OfferPriceByOfferIdsResponseDTO> offers);
	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);

private:
	std::list <OfferPriceByOfferIdsResponseDTO>offers;
	ScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferPriceByOfferIdsListResponseDTO_H_ */
