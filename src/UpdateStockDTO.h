/*
 * UpdateStockDTO.h
 *
 * Информация об остатках одного товара на одном из складов.
 */

#ifndef _UpdateStockDTO_H_
#define _UpdateStockDTO_H_


#include <string>
#include "UpdateStockItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об остатках одного товара на одном из складов.
 *
 *  \ingroup Models
 *
 */

class UpdateStockDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateStockDTO();
	UpdateStockDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateStockDTO();

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
	/*! \brief Get Информация об остатках товара. 
	 */
	std::list<UpdateStockItemDTO> getItems();

	/*! \brief Set Информация об остатках товара. 
	 */
	void setItems(std::list <UpdateStockItemDTO> items);

private:
	std::string sku;
	std::list <UpdateStockItemDTO>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateStockDTO_H_ */
