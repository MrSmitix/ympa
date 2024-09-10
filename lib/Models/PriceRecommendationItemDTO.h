
/*
 * PriceRecommendationItemDTO.h
 *
 * Рекомендованная цена.
 */

#ifndef TINY_CPP_CLIENT_PriceRecommendationItemDTO_H_
#define TINY_CPP_CLIENT_PriceRecommendationItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Рекомендованная цена.
 *
 *  \ingroup Models
 *
 */

class PriceRecommendationItemDTO{
public:

    /*! \brief Constructor.
	 */
    PriceRecommendationItemDTO();
    PriceRecommendationItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceRecommendationItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кампании.
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
	 */
	long getPrice();

	/*! \brief Set Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
	 */
	void setPrice(long  price);


    private:
    long campaignId{};
    long price{};
};
}

#endif /* TINY_CPP_CLIENT_PriceRecommendationItemDTO_H_ */
