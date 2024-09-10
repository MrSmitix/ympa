/*
 * FulfillmentWarehousesDTO.h
 *
 * Список складов Маркета (FBY).
 */

#ifndef _FulfillmentWarehousesDTO_H_
#define _FulfillmentWarehousesDTO_H_


#include <string>
#include "FulfillmentWarehouseDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список складов Маркета (FBY).
 *
 *  \ingroup Models
 *
 */

class FulfillmentWarehousesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FulfillmentWarehousesDTO();
	FulfillmentWarehousesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FulfillmentWarehousesDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список складов Маркета (FBY).
	 */
	std::list<FulfillmentWarehouseDTO> getWarehouses();

	/*! \brief Set Список складов Маркета (FBY).
	 */
	void setWarehouses(std::list <FulfillmentWarehouseDTO> warehouses);

private:
	std::list <FulfillmentWarehouseDTO>warehouses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FulfillmentWarehousesDTO_H_ */
