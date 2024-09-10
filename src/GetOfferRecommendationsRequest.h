/*
 * GetOfferRecommendationsRequest.h
 *
 * 
 */

#ifndef _GetOfferRecommendationsRequest_H_
#define _GetOfferRecommendationsRequest_H_


#include <string>
#include "FieldStateType.h"
#include "PriceCompetitivenessType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOfferRecommendationsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferRecommendationsRequest();
	GetOfferRecommendationsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferRecommendationsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
	 */
	void setOfferIds(std::list <std::string> offerIds);
	/*! \brief Get 
	 */
	FieldStateType getCofinancePriceFilter();

	/*! \brief Set 
	 */
	void setCofinancePriceFilter(FieldStateType  cofinancePriceFilter);
	/*! \brief Get 
	 */
	FieldStateType getRecommendedCofinancePriceFilter();

	/*! \brief Set 
	 */
	void setRecommendedCofinancePriceFilter(FieldStateType  recommendedCofinancePriceFilter);
	/*! \brief Get 
	 */
	PriceCompetitivenessType getCompetitivenessFilter();

	/*! \brief Set 
	 */
	void setCompetitivenessFilter(PriceCompetitivenessType  competitivenessFilter);

private:
	std::list <std::string>offerIds;
	FieldStateType cofinancePriceFilter;
	FieldStateType recommendedCofinancePriceFilter;
	PriceCompetitivenessType competitivenessFilter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferRecommendationsRequest_H_ */
