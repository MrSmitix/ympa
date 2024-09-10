
/*
 * WarehouseGroupDTO.h
 *
 * Информация о группе складов.
 */

#ifndef TINY_CPP_CLIENT_WarehouseGroupDTO_H_
#define TINY_CPP_CLIENT_WarehouseGroupDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WarehouseDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о группе складов.
 *
 *  \ingroup Models
 *
 */

class WarehouseGroupDTO{
public:

    /*! \brief Constructor.
	 */
    WarehouseGroupDTO();
    WarehouseGroupDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WarehouseGroupDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string name{};
    WarehouseDTO mainWarehouse;
    std::list<WarehouseDTO> warehouses;
};
}

#endif /* TINY_CPP_CLIENT_WarehouseGroupDTO_H_ */
