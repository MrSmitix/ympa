/*
 * GoodsStatsGoodsDTO.h
 *
 * Информация о товаре.
 */

#ifndef _GoodsStatsGoodsDTO_H_
#define _GoodsStatsGoodsDTO_H_


#include <string>
#include "GoodsStatsWarehouseDTO.h"
#include "GoodsStatsWeightDimensionsDTO.h"
#include "TariffDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о товаре.
 *
 *  \ingroup Models
 *
 */

class GoodsStatsGoodsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsStatsGoodsDTO();
	GoodsStatsGoodsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsStatsGoodsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getShopSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setShopSku(std::string  shopSku);
	/*! \brief Get SKU на Маркете.
	 */
	long long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long long  marketSku);
	/*! \brief Get Название товара.
	 */
	std::string getName();

	/*! \brief Set Название товара.
	 */
	void setName(std::string  name);
	/*! \brief Get Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
	 */
	long long getPrice();

	/*! \brief Set Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
	 */
	void setPrice(long long  price);
	/*! \brief Get Идентификатор категории товара на Маркете.
	 */
	long long getCategoryId();

	/*! \brief Set Идентификатор категории товара на Маркете.
	 */
	void setCategoryId(long long  categoryId);
	/*! \brief Get Название категории товара на Маркете.
	 */
	std::string getCategoryName();

	/*! \brief Set Название категории товара на Маркете.
	 */
	void setCategoryName(std::string  categoryName);
	/*! \brief Get 
	 */
	GoodsStatsWeightDimensionsDTO getWeightDimensions();

	/*! \brief Set 
	 */
	void setWeightDimensions(GoodsStatsWeightDimensionsDTO  weightDimensions);
	/*! \brief Get Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
	 */
	std::list<GoodsStatsWarehouseDTO> getWarehouses();

	/*! \brief Set Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
	 */
	void setWarehouses(std::list <GoodsStatsWarehouseDTO> warehouses);
	/*! \brief Get Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
	 */
	std::list<TariffDTO> getTariffs();

	/*! \brief Set Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
	 */
	void setTariffs(std::list <TariffDTO> tariffs);
	/*! \brief Get Ссылки (URL) изображений товара в хорошем качестве.
	 */
	std::list<std::string> getPictures();

	/*! \brief Set Ссылки (URL) изображений товара в хорошем качестве.
	 */
	void setPictures(std::list <std::string> pictures);

private:
	std::string shopSku;
	long long marketSku;
	std::string name;
	long long price;
	long long categoryId;
	std::string categoryName;
	GoodsStatsWeightDimensionsDTO weightDimensions;
	std::list <GoodsStatsWarehouseDTO>warehouses;
	std::list <TariffDTO>tariffs;
	std::list <std::string>pictures;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsStatsGoodsDTO_H_ */
