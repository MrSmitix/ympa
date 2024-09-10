/*
 * OrdersStatsWarehouseDTO.h
 *
 * Информация о складе, на котором хранится товар.
 */

#ifndef _OrdersStatsWarehouseDTO_H_
#define _OrdersStatsWarehouseDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о складе, на котором хранится товар.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsWarehouseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsWarehouseDTO();
	OrdersStatsWarehouseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsWarehouseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор склада.
	 */
	long long getId();

	/*! \brief Set Идентификатор склада.
	 */
	void setId(long long  id);
	/*! \brief Get Название склада.
	 */
	std::string getName();

	/*! \brief Set Название склада.
	 */
	void setName(std::string  name);

private:
	long long id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsWarehouseDTO_H_ */
