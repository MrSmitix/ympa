
/*
 * WarehouseOfferDTO.h
 *
 * Информация об остатках товара.
 */

#ifndef TINY_CPP_CLIENT_WarehouseOfferDTO_H_
#define TINY_CPP_CLIENT_WarehouseOfferDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TurnoverDTO.h"
#include "WarehouseStockDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об остатках товара.
 *
 *  \ingroup Models
 *
 */

class WarehouseOfferDTO{
public:

    /*! \brief Constructor.
	 */
    WarehouseOfferDTO();
    WarehouseOfferDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WarehouseOfferDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get 
	 */
	TurnoverDTO getTurnoverSummary();

	/*! \brief Set 
	 */
	void setTurnoverSummary(TurnoverDTO  turnoverSummary);
	/*! \brief Get Информация об остатках.
	 */
	std::list<WarehouseStockDTO> getStocks();

	/*! \brief Set Информация об остатках.
	 */
	void setStocks(std::list <WarehouseStockDTO> stocks);
	/*! \brief Get Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
	 */
	std::string getUpdatedAt();

	/*! \brief Set Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
	 */
	void setUpdatedAt(std::string  updatedAt);


    private:
    std::string offerId{};
    TurnoverDTO turnoverSummary;
    std::list<WarehouseStockDTO> stocks;
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_WarehouseOfferDTO_H_ */
