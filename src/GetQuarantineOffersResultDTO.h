/*
 * GetQuarantineOffersResultDTO.h
 *
 * Список товаров в карантине.
 */

#ifndef _GetQuarantineOffersResultDTO_H_
#define _GetQuarantineOffersResultDTO_H_


#include <string>
#include "QuarantineOfferDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров в карантине.
 *
 *  \ingroup Models
 *
 */

class GetQuarantineOffersResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetQuarantineOffersResultDTO();
	GetQuarantineOffersResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetQuarantineOffersResultDTO();

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
	/*! \brief Get Страница списка товаров в карантине.
	 */
	std::list<QuarantineOfferDTO> getOffers();

	/*! \brief Set Страница списка товаров в карантине.
	 */
	void setOffers(std::list <QuarantineOfferDTO> offers);

private:
	ScrollingPagerDTO paging;
	std::list <QuarantineOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetQuarantineOffersResultDTO_H_ */
