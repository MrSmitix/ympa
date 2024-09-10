
/*
 * OfferPriceByOfferIdsListResponseDTO.h
 *
 * Список цен.
 */

#ifndef TINY_CPP_CLIENT_OfferPriceByOfferIdsListResponseDTO_H_
#define TINY_CPP_CLIENT_OfferPriceByOfferIdsListResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferPriceByOfferIdsResponseDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список цен.
 *
 *  \ingroup Models
 *
 */

class OfferPriceByOfferIdsListResponseDTO{
public:

    /*! \brief Constructor.
	 */
    OfferPriceByOfferIdsListResponseDTO();
    OfferPriceByOfferIdsListResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferPriceByOfferIdsListResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Страница списка цен.
	 */
	std::list<OfferPriceByOfferIdsResponseDTO> getOffers();

	/*! \brief Set Страница списка цен.
	 */
	void setOffers(std::list <OfferPriceByOfferIdsResponseDTO> offers);
	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);


    private:
    std::list<OfferPriceByOfferIdsResponseDTO> offers;
    ScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_OfferPriceByOfferIdsListResponseDTO_H_ */
