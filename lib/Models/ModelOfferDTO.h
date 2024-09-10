
/*
 * ModelOfferDTO.h
 *
 * Информация о предложении.
 */

#ifndef TINY_CPP_CLIENT_ModelOfferDTO_H_
#define TINY_CPP_CLIENT_ModelOfferDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о предложении.
 *
 *  \ingroup Models
 *
 */

class ModelOfferDTO{
public:

    /*! \brief Constructor.
	 */
    ModelOfferDTO();
    ModelOfferDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ModelOfferDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	long getPreDiscountPrice();

	/*! \brief Set Цена предложения без скидки магазина.
	 */
	void setPreDiscountPrice(long  preDiscountPrice);
	/*! \brief Get Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
	 */
	long getPrice();

	/*! \brief Set Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
	 */
	void setPrice(long  price);
	/*! \brief Get Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
	 */
	long getRegionId();

	/*! \brief Set Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
	 */
	void setRegionId(long  regionId);
	/*! \brief Get Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
	 */
	long getShippingCost();

	/*! \brief Set Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
	 */
	void setShippingCost(long  shippingCost);
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
    int discount{};
    std::string name{};
    int pos{};
    long preDiscountPrice{};
    long price{};
    long regionId{};
    long shippingCost{};
    std::string shopName{};
    int shopRating{};
    int inStock{};
};
}

#endif /* TINY_CPP_CLIENT_ModelOfferDTO_H_ */
