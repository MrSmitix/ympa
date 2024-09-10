
/*
 * WarehousesDTO.h
 *
 * Информация о складах и группах складов.
 */

#ifndef TINY_CPP_CLIENT_WarehousesDTO_H_
#define TINY_CPP_CLIENT_WarehousesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WarehouseDTO.h"
#include "WarehouseGroupDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о складах и группах складов.
 *
 *  \ingroup Models
 *
 */

class WarehousesDTO{
public:

    /*! \brief Constructor.
	 */
    WarehousesDTO();
    WarehousesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WarehousesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<WarehouseDTO> warehouses;
    std::list<WarehouseGroupDTO> warehouseGroups;
};
}

#endif /* TINY_CPP_CLIENT_WarehousesDTO_H_ */
