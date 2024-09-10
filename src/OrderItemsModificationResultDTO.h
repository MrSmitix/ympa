/*
 * OrderItemsModificationResultDTO.h
 *
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
 */

#ifndef _OrderItemsModificationResultDTO_H_
#define _OrderItemsModificationResultDTO_H_


#include <string>
#include "BriefOrderItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 *
 *  \ingroup Models
 *
 */

class OrderItemsModificationResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemsModificationResultDTO();
	OrderItemsModificationResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemsModificationResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список позиций в заказе, подлежащих маркировке.
	 */
	std::list<BriefOrderItemDTO> getItems();

	/*! \brief Set Список позиций в заказе, подлежащих маркировке.
	 */
	void setItems(std::list <BriefOrderItemDTO> items);

private:
	std::list <BriefOrderItemDTO>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemsModificationResultDTO_H_ */
