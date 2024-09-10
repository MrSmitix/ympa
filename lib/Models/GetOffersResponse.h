
/*
 * GetOffersResponse.h
 *
 * Список предложений с пагинатором.
 */

#ifndef TINY_CPP_CLIENT_GetOffersResponse_H_
#define TINY_CPP_CLIENT_GetOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FlippingPagerDTO.h"
#include "OfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список предложений с пагинатором.
 *
 *  \ingroup Models
 *
 */

class GetOffersResponse{
public:

    /*! \brief Constructor.
	 */
    GetOffersResponse();
    GetOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOffersResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<OfferDTO> offers;
    FlippingPagerDTO pager;
};
}

#endif /* TINY_CPP_CLIENT_GetOffersResponse_H_ */
