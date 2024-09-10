
/*
 * FulfillmentWarehouseDTO.h
 *
 * Склад Маркета (FBY).
 */

#ifndef TINY_CPP_CLIENT_FulfillmentWarehouseDTO_H_
#define TINY_CPP_CLIENT_FulfillmentWarehouseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WarehouseAddressDTO.h"

namespace Tiny {


/*! \brief Склад Маркета (FBY).
 *
 *  \ingroup Models
 *
 */

class FulfillmentWarehouseDTO{
public:

    /*! \brief Constructor.
	 */
    FulfillmentWarehouseDTO();
    FulfillmentWarehouseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FulfillmentWarehouseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор склада.
	 */
	long getId();

	/*! \brief Set Идентификатор склада.
	 */
	void setId(long  id);
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
    long id{};
    std::string name{};
    WarehouseAddressDTO address;
};
}

#endif /* TINY_CPP_CLIENT_FulfillmentWarehouseDTO_H_ */
