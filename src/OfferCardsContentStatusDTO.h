/*
 * OfferCardsContentStatusDTO.h
 *
 * Список товаров с информацией о состоянии карточек.
 */

#ifndef _OfferCardsContentStatusDTO_H_
#define _OfferCardsContentStatusDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "OfferCardDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров с информацией о состоянии карточек.
 *
 *  \ingroup Models
 *
 */

class OfferCardsContentStatusDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferCardsContentStatusDTO();
	OfferCardsContentStatusDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferCardsContentStatusDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Страница списка товаров с информацией о состоянии карточек.
	 */
	std::list<OfferCardDTO> getOfferCards();

	/*! \brief Set Страница списка товаров с информацией о состоянии карточек.
	 */
	void setOfferCards(std::list <OfferCardDTO> offerCards);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	std::list <OfferCardDTO>offerCards;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferCardsContentStatusDTO_H_ */
