
/*
 * GetBidsRecommendationsResponseDTO.h
 *
 * Список товаров с рекомендованными ставками.
 */

#ifndef TINY_CPP_CLIENT_GetBidsRecommendationsResponseDTO_H_
#define TINY_CPP_CLIENT_GetBidsRecommendationsResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SkuBidRecommendationItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров с рекомендованными ставками.
 *
 *  \ingroup Models
 *
 */

class GetBidsRecommendationsResponseDTO{
public:

    /*! \brief Constructor.
	 */
    GetBidsRecommendationsResponseDTO();
    GetBidsRecommendationsResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBidsRecommendationsResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров с рекомендованными ставками.
	 */
	std::list<SkuBidRecommendationItemDTO> getRecommendations();

	/*! \brief Set Список товаров с рекомендованными ставками.
	 */
	void setRecommendations(std::list <SkuBidRecommendationItemDTO> recommendations);


    private:
    std::list<SkuBidRecommendationItemDTO> recommendations;
};
}

#endif /* TINY_CPP_CLIENT_GetBidsRecommendationsResponseDTO_H_ */
