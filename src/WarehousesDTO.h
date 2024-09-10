/*
 * WarehousesDTO.h
 *
 * Информация о складах и группах складов.
 */

#ifndef _WarehousesDTO_H_
#define _WarehousesDTO_H_


#include <string>
#include "WarehouseDTO.h"
#include "WarehouseGroupDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о складах и группах складов.
 *
 *  \ingroup Models
 *
 */

class WarehousesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	WarehousesDTO();
	WarehousesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WarehousesDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список складов, не входящих в группы.
	 */
	std::list<WarehouseDTO> getWarehouses();

	/*! \brief Set Список складов, не входящих в группы.
	 */
	void setWarehouses(std::list <WarehouseDTO> warehouses);
	/*! \brief Get Список групп складов.
	 */
	std::list<WarehouseGroupDTO> getWarehouseGroups();

	/*! \brief Set Список групп складов.
	 */
	void setWarehouseGroups(std::list <WarehouseGroupDTO> warehouseGroups);

private:
	std::list <WarehouseDTO>warehouses;
	std::list <WarehouseGroupDTO>warehouseGroups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _WarehousesDTO_H_ */
