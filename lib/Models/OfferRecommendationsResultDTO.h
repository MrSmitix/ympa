
/*
 * OfferRecommendationsResultDTO.h
 *
 * Список товаров с рекомендациями.
 */

#ifndef TINY_CPP_CLIENT_OfferRecommendationsResultDTO_H_
#define TINY_CPP_CLIENT_OfferRecommendationsResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferRecommendationDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров с рекомендациями.
 *
 *  \ingroup Models
 *
 */

class OfferRecommendationsResultDTO{
public:

    /*! \brief Constructor.
	 */
    OfferRecommendationsResultDTO();
    OfferRecommendationsResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferRecommendationsResultDTO();


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
	std::list<OfferRecommendationDTO> getOfferRecommendations();

	/*! \brief Set Страница списка товаров.
	 */
	void setOfferRecommendations(std::list <OfferRecommendationDTO> offerRecommendations);


    private:
    ScrollingPagerDTO paging;
    std::list<OfferRecommendationDTO> offerRecommendations;
};
}

#endif /* TINY_CPP_CLIENT_OfferRecommendationsResultDTO_H_ */
