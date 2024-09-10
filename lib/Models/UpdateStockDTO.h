
/*
 * UpdateStockDTO.h
 *
 * Информация об остатках одного товара на одном из складов.
 */

#ifndef TINY_CPP_CLIENT_UpdateStockDTO_H_
#define TINY_CPP_CLIENT_UpdateStockDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateStockItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об остатках одного товара на одном из складов.
 *
 *  \ingroup Models
 *
 */

class UpdateStockDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateStockDTO();
    UpdateStockDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateStockDTO();


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
	/*! \brief Get Информация об остатках товара. 
	 */
	std::list<UpdateStockItemDTO> getItems();

	/*! \brief Set Информация об остатках товара. 
	 */
	void setItems(std::list <UpdateStockItemDTO> items);


    private:
    std::string sku{};
    std::list<UpdateStockItemDTO> items;
};
}

#endif /* TINY_CPP_CLIENT_UpdateStockDTO_H_ */
