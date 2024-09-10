
/*
 * WarehouseStockDTO.h
 *
 * Информация об остатках товара.
 */

#ifndef TINY_CPP_CLIENT_WarehouseStockDTO_H_
#define TINY_CPP_CLIENT_WarehouseStockDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WarehouseStockType.h"

namespace Tiny {


/*! \brief Информация об остатках товара.
 *
 *  \ingroup Models
 *
 */

class WarehouseStockDTO{
public:

    /*! \brief Constructor.
	 */
    WarehouseStockDTO();
    WarehouseStockDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WarehouseStockDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	WarehouseStockType getType();

	/*! \brief Set 
	 */
	void setType(WarehouseStockType  type);
	/*! \brief Get Значение остатков.
	 */
	long getCount();

	/*! \brief Set Значение остатков.
	 */
	void setCount(long  count);


    private:
    WarehouseStockType type;
    long count{};
};
}

#endif /* TINY_CPP_CLIENT_WarehouseStockDTO_H_ */
