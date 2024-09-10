
/*
 * SkuBidRecommendationItemDTO.h
 *
 * Список товаров с рекомендованными ставками.
 */

#ifndef TINY_CPP_CLIENT_SkuBidRecommendationItemDTO_H_
#define TINY_CPP_CLIENT_SkuBidRecommendationItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BidRecommendationItemDTO.h"
#include "PriceRecommendationItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров с рекомендованными ставками.
 *
 *  \ingroup Models
 *
 */

class SkuBidRecommendationItemDTO{
public:

    /*! \brief Constructor.
	 */
    SkuBidRecommendationItemDTO();
    SkuBidRecommendationItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SkuBidRecommendationItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setSku(std::string  sku);
	/*! \brief Get Значение ставки.
	 */
	int getBid();

	/*! \brief Set Значение ставки.
	 */
	void setBid(int  bid);
	/*! \brief Get Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
	 */
	std::list<BidRecommendationItemDTO> getBidRecommendations();

	/*! \brief Set Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
	 */
	void setBidRecommendations(std::list <BidRecommendationItemDTO> bidRecommendations);
	/*! \brief Get Рекомендованные цены.
	 */
	std::list<PriceRecommendationItemDTO> getPriceRecommendations();

	/*! \brief Set Рекомендованные цены.
	 */
	void setPriceRecommendations(std::list <PriceRecommendationItemDTO> priceRecommendations);


    private:
    std::string sku{};
    int bid{};
    std::list<BidRecommendationItemDTO> bidRecommendations;
    std::list<PriceRecommendationItemDTO> priceRecommendations;
};
}

#endif /* TINY_CPP_CLIENT_SkuBidRecommendationItemDTO_H_ */
