
/*
 * FulfillmentWarehousesDTO.h
 *
 * Список складов Маркета (FBY).
 */

#ifndef TINY_CPP_CLIENT_FulfillmentWarehousesDTO_H_
#define TINY_CPP_CLIENT_FulfillmentWarehousesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FulfillmentWarehouseDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список складов Маркета (FBY).
 *
 *  \ingroup Models
 *
 */

class FulfillmentWarehousesDTO{
public:

    /*! \brief Constructor.
	 */
    FulfillmentWarehousesDTO();
    FulfillmentWarehousesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FulfillmentWarehousesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список складов Маркета (FBY).
	 */
	std::list<FulfillmentWarehouseDTO> getWarehouses();

	/*! \brief Set Список складов Маркета (FBY).
	 */
	void setWarehouses(std::list <FulfillmentWarehouseDTO> warehouses);


    private:
    std::list<FulfillmentWarehouseDTO> warehouses;
};
}

#endif /* TINY_CPP_CLIENT_FulfillmentWarehousesDTO_H_ */
