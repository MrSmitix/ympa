/*
 * WarehouseGroupDTO.h
 *
 * Информация о группе складов.
 */

#ifndef _WarehouseGroupDTO_H_
#define _WarehouseGroupDTO_H_


#include <string>
#include "WarehouseDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о группе складов.
 *
 *  \ingroup Models
 *
 */

class WarehouseGroupDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	WarehouseGroupDTO();
	WarehouseGroupDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WarehouseGroupDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Название группы складов.
	 */
	std::string getName();

	/*! \brief Set Название группы складов.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	WarehouseDTO getMainWarehouse();

	/*! \brief Set 
	 */
	void setMainWarehouse(WarehouseDTO  mainWarehouse);
	/*! \brief Get Список складов, входящих в группу.
	 */
	std::list<WarehouseDTO> getWarehouses();

	/*! \brief Set Список складов, входящих в группу.
	 */
	void setWarehouses(std::list <WarehouseDTO> warehouses);

private:
	std::string name;
	WarehouseDTO mainWarehouse;
	std::list <WarehouseDTO>warehouses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _WarehouseGroupDTO_H_ */
