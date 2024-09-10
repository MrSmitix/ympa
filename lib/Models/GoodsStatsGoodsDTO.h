
/*
 * GoodsStatsGoodsDTO.h
 *
 * Информация о товаре.
 */

#ifndef TINY_CPP_CLIENT_GoodsStatsGoodsDTO_H_
#define TINY_CPP_CLIENT_GoodsStatsGoodsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GoodsStatsWarehouseDTO.h"
#include "GoodsStatsWeightDimensionsDTO.h"
#include "TariffDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о товаре.
 *
 *  \ingroup Models
 *
 */

class GoodsStatsGoodsDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsStatsGoodsDTO();
    GoodsStatsGoodsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsStatsGoodsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getShopSku();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setShopSku(std::string  shopSku);
	/*! \brief Get SKU на Маркете.
	 */
	long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long  marketSku);
	/*! \brief Get Название товара.
	 */
	std::string getName();

	/*! \brief Set Название товара.
	 */
	void setName(std::string  name);
	/*! \brief Get Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
	 */
	long getPrice();

	/*! \brief Set Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
	 */
	void setPrice(long  price);
	/*! \brief Get Идентификатор категории товара на Маркете.
	 */
	long getCategoryId();

	/*! \brief Set Идентификатор категории товара на Маркете.
	 */
	void setCategoryId(long  categoryId);
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
    std::string shopSku{};
    long marketSku{};
    std::string name{};
    long price{};
    long categoryId{};
    std::string categoryName{};
    GoodsStatsWeightDimensionsDTO weightDimensions;
    std::list<GoodsStatsWarehouseDTO> warehouses;
    std::list<TariffDTO> tariffs;
    std::list<std::string> pictures;
};
}

#endif /* TINY_CPP_CLIENT_GoodsStatsGoodsDTO_H_ */
