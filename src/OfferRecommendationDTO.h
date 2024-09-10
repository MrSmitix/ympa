/*
 * OfferRecommendationDTO.h
 *
 * Информация о состоянии цен и рекомендации. 
 */

#ifndef _OfferRecommendationDTO_H_
#define _OfferRecommendationDTO_H_


#include <string>
#include "OfferForRecommendationDTO.h"
#include "OfferRecommendationInfoDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о состоянии цен и рекомендации. 
 *
 *  \ingroup Models
 *
 */

class OfferRecommendationDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferRecommendationDTO();
	OfferRecommendationDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferRecommendationDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferRecommendationDTO_H_ */
