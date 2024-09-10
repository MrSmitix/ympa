/*
 * ModelOfferDTO.h
 *
 * Информация о предложении.
 */

#ifndef _ModelOfferDTO_H_
#define _ModelOfferDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о предложении.
 *
 *  \ingroup Models
 *
 */

class ModelOfferDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ModelOfferDTO();
	ModelOfferDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModelOfferDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Скидка на предложение в процентах.
	 */
	int getDiscount();

	/*! \brief Set Скидка на предложение в процентах.
	 */
	void setDiscount(int  discount);
	/*! \brief Get Наименование предложения.
	 */
	std::string getName();

	/*! \brief Set Наименование предложения.
	 */
	void setName(std::string  name);
	/*! \brief Get Позиция предложения в выдаче Маркета на карточке модели.
	 */
	int getPos();

	/*! \brief Set Позиция предложения в выдаче Маркета на карточке модели.
	 */
	void setPos(int  pos);
	/*! \brief Get Цена предложения без скидки магазина.
	 */
	long long getPreDiscountPrice();

	/*! \brief Set Цена предложения без скидки магазина.
	 */
	void setPreDiscountPrice(long long  preDiscountPrice);
	/*! \brief Get Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
	 */
	long long getPrice();

	/*! \brief Set Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
	 */
	void setPrice(long long  price);
	/*! \brief Get Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
	 */
	long long getRegionId();

	/*! \brief Set Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
	 */
	void setRegionId(long long  regionId);
	/*! \brief Get Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
	 */
	long long getShippingCost();

	/*! \brief Set Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
	 */
	void setShippingCost(long long  shippingCost);
	/*! \brief Get Название магазина (в том виде, в котором отображается на Маркете).
	 */
	std::string getShopName();

	/*! \brief Set Название магазина (в том виде, в котором отображается на Маркете).
	 */
	void setShopName(std::string  shopName);
	/*! \brief Get Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
	 */
	int getShopRating();

	/*! \brief Set Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
	 */
	void setShopRating(int  shopRating);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	int getInStock();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
	 */
	void setInStock(int  inStock);

private:
	int discount;
	std::string name;
	int pos;
	long long preDiscountPrice;
	long long price;
	long long regionId;
	long long shippingCost;
	std::string shopName;
	int shopRating;
	int inStock;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModelOfferDTO_H_ */
