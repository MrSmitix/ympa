
/*
 * GetCampaignOffersResultDTO.h
 *
 * Список товаров в заданном магазине.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignOffersResultDTO_H_
#define TINY_CPP_CLIENT_GetCampaignOffersResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetCampaignOfferDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров в заданном магазине.
 *
 *  \ingroup Models
 *
 */

class GetCampaignOffersResultDTO{
public:

    /*! \brief Constructor.
	 */
    GetCampaignOffersResultDTO();
    GetCampaignOffersResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignOffersResultDTO();


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
	/*! \brief Get Страница списка товаров.
	 */
	std::list<GetCampaignOfferDTO> getOffers();

	/*! \brief Set Страница списка товаров.
	 */
	void setOffers(std::list <GetCampaignOfferDTO> offers);


    private:
    ScrollingPagerDTO paging;
    std::list<GetCampaignOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignOffersResultDTO_H_ */
