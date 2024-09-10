
/*
 * GetOfferRecommendationsRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetOfferRecommendationsRequest_H_
#define TINY_CPP_CLIENT_GetOfferRecommendationsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FieldStateType.h"
#include "PriceCompetitivenessType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOfferRecommendationsRequest{
public:

    /*! \brief Constructor.
	 */
    GetOfferRecommendationsRequest();
    GetOfferRecommendationsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferRecommendationsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<std::string> offerIds;
    FieldStateType cofinancePriceFilter;
    FieldStateType recommendedCofinancePriceFilter;
    PriceCompetitivenessType competitivenessFilter;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferRecommendationsRequest_H_ */
