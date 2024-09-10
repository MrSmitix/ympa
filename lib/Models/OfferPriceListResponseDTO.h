
/*
 * OfferPriceListResponseDTO.h
 *
 * Список цен на товары.
 */

#ifndef TINY_CPP_CLIENT_OfferPriceListResponseDTO_H_
#define TINY_CPP_CLIENT_OfferPriceListResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferPriceResponseDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список цен на товары.
 *
 *  \ingroup Models
 *
 */

class OfferPriceListResponseDTO{
public:

    /*! \brief Constructor.
	 */
    OfferPriceListResponseDTO();
    OfferPriceListResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferPriceListResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Страница списка.
	 */
	std::list<OfferPriceResponseDTO> getOffers();

	/*! \brief Set Страница списка.
	 */
	void setOffers(std::list <OfferPriceResponseDTO> offers);
	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Количество всех цен магазина, измененных через API.
	 */
	int getTotal();

	/*! \brief Set Количество всех цен магазина, измененных через API.
	 */
	void setTotal(int  total);


    private:
    std::list<OfferPriceResponseDTO> offers;
    ScrollingPagerDTO paging;
    int total{};
};
}

#endif /* TINY_CPP_CLIENT_OfferPriceListResponseDTO_H_ */
