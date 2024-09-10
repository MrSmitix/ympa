/*
 * GetPromoOffersRequest.h
 *
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */

#ifndef _GetPromoOffersRequest_H_
#define _GetPromoOffersRequest_H_


#include <string>
#include "PromoOfferParticipationStatusFilterType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Получение списка товаров, которые участвуют или могут участвовать в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoOffersRequest();
	GetPromoOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoOffersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор акции.
	 */
	std::string getPromoId();

	/*! \brief Set Идентификатор акции.
	 */
	void setPromoId(std::string  promoId);
	/*! \brief Get 
	 */
	PromoOfferParticipationStatusFilterType getStatusType();

	/*! \brief Set 
	 */
	void setStatusType(PromoOfferParticipationStatusFilterType  statusType);

private:
	std::string promoId;
	PromoOfferParticipationStatusFilterType statusType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoOffersRequest_H_ */
