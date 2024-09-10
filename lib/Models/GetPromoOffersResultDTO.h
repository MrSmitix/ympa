
/*
 * GetPromoOffersResultDTO.h
 *
 * Список товаров, которые участвуют или могут участвовать в акции.
 */

#ifndef TINY_CPP_CLIENT_GetPromoOffersResultDTO_H_
#define TINY_CPP_CLIENT_GetPromoOffersResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "GetPromoOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров, которые участвуют или могут участвовать в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoOffersResultDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromoOffersResultDTO();
    GetPromoOffersResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoOffersResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Товары, которые участвуют или могут участвовать в акции.
	 */
	std::list<GetPromoOfferDTO> getOffers();

	/*! \brief Set Товары, которые участвуют или могут участвовать в акции.
	 */
	void setOffers(std::list <GetPromoOfferDTO> offers);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);


    private:
    std::list<GetPromoOfferDTO> offers;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_GetPromoOffersResultDTO_H_ */
