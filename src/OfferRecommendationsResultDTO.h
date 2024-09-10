/*
 * OfferRecommendationsResultDTO.h
 *
 * Список товаров с рекомендациями.
 */

#ifndef _OfferRecommendationsResultDTO_H_
#define _OfferRecommendationsResultDTO_H_


#include <string>
#include "OfferRecommendationDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров с рекомендациями.
 *
 *  \ingroup Models
 *
 */

class OfferRecommendationsResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferRecommendationsResultDTO();
	OfferRecommendationsResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferRecommendationsResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <OfferRecommendationDTO>offerRecommendations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferRecommendationsResultDTO_H_ */
