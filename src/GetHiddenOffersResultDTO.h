/*
 * GetHiddenOffersResultDTO.h
 *
 * Список скрытых вами товаров. 
 */

#ifndef _GetHiddenOffersResultDTO_H_
#define _GetHiddenOffersResultDTO_H_


#include <string>
#include "HiddenOfferDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список скрытых вами товаров. 
 *
 *  \ingroup Models
 *
 */

class GetHiddenOffersResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetHiddenOffersResultDTO();
	GetHiddenOffersResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetHiddenOffersResultDTO();

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
	/*! \brief Get Список скрытых товаров.
	 */
	std::list<HiddenOfferDTO> getHiddenOffers();

	/*! \brief Set Список скрытых товаров.
	 */
	void setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers);

private:
	ScrollingPagerDTO paging;
	std::list <HiddenOfferDTO>hiddenOffers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetHiddenOffersResultDTO_H_ */
