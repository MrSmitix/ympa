/*
 * OfferPriceListResponseDTO.h
 *
 * Список цен на товары.
 */

#ifndef _OfferPriceListResponseDTO_H_
#define _OfferPriceListResponseDTO_H_


#include <string>
#include "OfferPriceResponseDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список цен на товары.
 *
 *  \ingroup Models
 *
 */

class OfferPriceListResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferPriceListResponseDTO();
	OfferPriceListResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferPriceListResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Страница списка.
	 */
	std::list<OfferPriceResponseDTO> getOffers();

	/*! \brief Set Страница списка.
	 */
	void setOffers(std::list <OfferPriceResponseDTO> offers);
	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Количество всех цен магазина, измененных через API.
	 */
	int getTotal();

	/*! \brief Set Количество всех цен магазина, измененных через API.
	 */
	void setTotal(int  total);

private:
	std::list <OfferPriceResponseDTO>offers;
	ScrollingPagerDTO paging;
	int total;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferPriceListResponseDTO_H_ */
