/*
 * UpdateStockItemDTO.h
 *
 * Информация об остатках товара. 
 */

#ifndef _UpdateStockItemDTO_H_
#define _UpdateStockItemDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об остатках товара. 
 *
 *  \ingroup Models
 *
 */

class UpdateStockItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateStockItemDTO();
	UpdateStockItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateStockItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Количество доступного товара. 
	 */
	long long getCount();

	/*! \brief Set Количество доступного товара. 
	 */
	void setCount(long long  count);
	/*! \brief Get Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getUpdatedAt();

	/*! \brief Set Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setUpdatedAt(std::string  updatedAt);

private:
	long long count;
	std::string updatedAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateStockItemDTO_H_ */
