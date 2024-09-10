/*
 * GetOffersResponse.h
 *
 * Список предложений с пагинатором.
 */

#ifndef _GetOffersResponse_H_
#define _GetOffersResponse_H_


#include <string>
#include "FlippingPagerDTO.h"
#include "OfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список предложений с пагинатором.
 *
 *  \ingroup Models
 *
 */

class GetOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOffersResponse();
	GetOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOffersResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список предложений магазина.
	 */
	std::list<OfferDTO> getOffers();

	/*! \brief Set Список предложений магазина.
	 */
	void setOffers(std::list <OfferDTO> offers);
	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);

private:
	std::list <OfferDTO>offers;
	FlippingPagerDTO pager;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOffersResponse_H_ */
