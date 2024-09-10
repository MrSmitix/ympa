/*
 * DeletePromoOffersResultDTO.h
 *
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 */

#ifndef _DeletePromoOffersResultDTO_H_
#define _DeletePromoOffersResultDTO_H_


#include <string>
#include "RejectedPromoOfferDeleteDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 *
 *  \ingroup Models
 *
 */

class DeletePromoOffersResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePromoOffersResultDTO();
	DeletePromoOffersResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePromoOffersResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
	 */
	std::list<RejectedPromoOfferDeleteDTO> getRejectedOffers();

	/*! \brief Set Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
	 */
	void setRejectedOffers(std::list <RejectedPromoOfferDeleteDTO> rejectedOffers);

private:
	std::list <RejectedPromoOfferDeleteDTO>rejectedOffers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePromoOffersResultDTO_H_ */
