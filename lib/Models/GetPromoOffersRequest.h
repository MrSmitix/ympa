
/*
 * GetPromoOffersRequest.h
 *
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */

#ifndef TINY_CPP_CLIENT_GetPromoOffersRequest_H_
#define TINY_CPP_CLIENT_GetPromoOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PromoOfferParticipationStatusFilterType.h"

namespace Tiny {


/*! \brief Получение списка товаров, которые участвуют или могут участвовать в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoOffersRequest{
public:

    /*! \brief Constructor.
	 */
    GetPromoOffersRequest();
    GetPromoOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoOffersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string promoId{};
    PromoOfferParticipationStatusFilterType statusType;
};
}

#endif /* TINY_CPP_CLIENT_GetPromoOffersRequest_H_ */
