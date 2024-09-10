
/*
 * OfferRecommendationDTO.h
 *
 * Информация о состоянии цен и рекомендации. 
 */

#ifndef TINY_CPP_CLIENT_OfferRecommendationDTO_H_
#define TINY_CPP_CLIENT_OfferRecommendationDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferForRecommendationDTO.h"
#include "OfferRecommendationInfoDTO.h"

namespace Tiny {


/*! \brief Информация о состоянии цен и рекомендации. 
 *
 *  \ingroup Models
 *
 */

class OfferRecommendationDTO{
public:

    /*! \brief Constructor.
	 */
    OfferRecommendationDTO();
    OfferRecommendationDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferRecommendationDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OfferForRecommendationDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(OfferForRecommendationDTO  offer);
	/*! \brief Get 
	 */
	OfferRecommendationInfoDTO getRecommendation();

	/*! \brief Set 
	 */
	void setRecommendation(OfferRecommendationInfoDTO  recommendation);


    private:
    OfferForRecommendationDTO offer;
    OfferRecommendationInfoDTO recommendation;
};
}

#endif /* TINY_CPP_CLIENT_OfferRecommendationDTO_H_ */
