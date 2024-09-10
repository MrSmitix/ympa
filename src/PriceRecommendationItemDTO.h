/*
 * PriceRecommendationItemDTO.h
 *
 * Рекомендованная цена.
 */

#ifndef _PriceRecommendationItemDTO_H_
#define _PriceRecommendationItemDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Рекомендованная цена.
 *
 *  \ingroup Models
 *
 */

class PriceRecommendationItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceRecommendationItemDTO();
	PriceRecommendationItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceRecommendationItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор кампании.
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
	 */
	long long getPrice();

	/*! \brief Set Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
	 */
	void setPrice(long long  price);

private:
	long long campaignId;
	long long price;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceRecommendationItemDTO_H_ */
