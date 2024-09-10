/*
 * OrderBoxLayoutDTO.h
 *
 * Информация о коробке.
 */

#ifndef _OrderBoxLayoutDTO_H_
#define _OrderBoxLayoutDTO_H_


#include <string>
#include "OrderBoxLayoutItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о коробке.
 *
 *  \ingroup Models
 *
 */

class OrderBoxLayoutDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBoxLayoutDTO();
	OrderBoxLayoutDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBoxLayoutDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
	 */
	std::list<OrderBoxLayoutItemDTO> getItems();

	/*! \brief Set Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
	 */
	void setItems(std::list <OrderBoxLayoutItemDTO> items);

private:
	std::list <OrderBoxLayoutItemDTO>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBoxLayoutDTO_H_ */
