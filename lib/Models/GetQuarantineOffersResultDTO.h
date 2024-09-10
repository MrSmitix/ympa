
/*
 * GetQuarantineOffersResultDTO.h
 *
 * Список товаров в карантине.
 */

#ifndef TINY_CPP_CLIENT_GetQuarantineOffersResultDTO_H_
#define TINY_CPP_CLIENT_GetQuarantineOffersResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QuarantineOfferDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров в карантине.
 *
 *  \ingroup Models
 *
 */

class GetQuarantineOffersResultDTO{
public:

    /*! \brief Constructor.
	 */
    GetQuarantineOffersResultDTO();
    GetQuarantineOffersResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetQuarantineOffersResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<QuarantineOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_GetQuarantineOffersResultDTO_H_ */
