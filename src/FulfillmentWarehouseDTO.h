/*
 * FulfillmentWarehouseDTO.h
 *
 * Склад Маркета (FBY).
 */

#ifndef _FulfillmentWarehouseDTO_H_
#define _FulfillmentWarehouseDTO_H_


#include <string>
#include "WarehouseAddressDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Склад Маркета (FBY).
 *
 *  \ingroup Models
 *
 */

class FulfillmentWarehouseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FulfillmentWarehouseDTO();
	FulfillmentWarehouseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FulfillmentWarehouseDTO();

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
	/*! \brief Get 
	 */
	WarehouseAddressDTO getAddress();

	/*! \brief Set 
	 */
	void setAddress(WarehouseAddressDTO  address);

private:
	long long id;
	std::string name;
	WarehouseAddressDTO address;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FulfillmentWarehouseDTO_H_ */
