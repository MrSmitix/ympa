/*
 * SkuBidRecommendationItemDTO.h
 *
 * Список товаров с рекомендованными ставками.
 */

#ifndef _SkuBidRecommendationItemDTO_H_
#define _SkuBidRecommendationItemDTO_H_


#include <string>
#include "BidRecommendationItemDTO.h"
#include "PriceRecommendationItemDTO.h"
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

class SkuBidRecommendationItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	SkuBidRecommendationItemDTO();
	SkuBidRecommendationItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SkuBidRecommendationItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string sku;
	int bid;
	std::list <BidRecommendationItemDTO>bidRecommendations;
	std::list <PriceRecommendationItemDTO>priceRecommendations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SkuBidRecommendationItemDTO_H_ */
