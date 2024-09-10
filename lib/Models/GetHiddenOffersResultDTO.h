
/*
 * GetHiddenOffersResultDTO.h
 *
 * Список скрытых вами товаров. 
 */

#ifndef TINY_CPP_CLIENT_GetHiddenOffersResultDTO_H_
#define TINY_CPP_CLIENT_GetHiddenOffersResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "HiddenOfferDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список скрытых вами товаров. 
 *
 *  \ingroup Models
 *
 */

class GetHiddenOffersResultDTO{
public:

    /*! \brief Constructor.
	 */
    GetHiddenOffersResultDTO();
    GetHiddenOffersResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetHiddenOffersResultDTO();


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
	/*! \brief Get Список скрытых товаров.
	 */
	std::list<HiddenOfferDTO> getHiddenOffers();

	/*! \brief Set Список скрытых товаров.
	 */
	void setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers);


    private:
    ScrollingPagerDTO paging;
    std::list<HiddenOfferDTO> hiddenOffers;
};
}

#endif /* TINY_CPP_CLIENT_GetHiddenOffersResultDTO_H_ */
