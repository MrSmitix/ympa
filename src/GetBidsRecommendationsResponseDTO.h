/*
 * GetBidsRecommendationsResponseDTO.h
 *
 * Список товаров с рекомендованными ставками.
 */

#ifndef _GetBidsRecommendationsResponseDTO_H_
#define _GetBidsRecommendationsResponseDTO_H_


#include <string>
#include "SkuBidRecommendationItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров с рекомендованными ставками.
 *
 *  \ingroup Models
 *
 */

class GetBidsRecommendationsResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBidsRecommendationsResponseDTO();
	GetBidsRecommendationsResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBidsRecommendationsResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров с рекомендованными ставками.
	 */
	std::list<SkuBidRecommendationItemDTO> getRecommendations();

	/*! \brief Set Список товаров с рекомендованными ставками.
	 */
	void setRecommendations(std::list <SkuBidRecommendationItemDTO> recommendations);

private:
	std::list <SkuBidRecommendationItemDTO>recommendations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBidsRecommendationsResponseDTO_H_ */
