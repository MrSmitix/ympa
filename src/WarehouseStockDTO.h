/*
 * WarehouseStockDTO.h
 *
 * Информация об остатках товара.
 */

#ifndef _WarehouseStockDTO_H_
#define _WarehouseStockDTO_H_


#include <string>
#include "WarehouseStockType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об остатках товара.
 *
 *  \ingroup Models
 *
 */

class WarehouseStockDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	WarehouseStockDTO();
	WarehouseStockDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WarehouseStockDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	WarehouseStockType getType();

	/*! \brief Set 
	 */
	void setType(WarehouseStockType  type);
	/*! \brief Get Значение остатков.
	 */
	long long getCount();

	/*! \brief Set Значение остатков.
	 */
	void setCount(long long  count);

private:
	WarehouseStockType type;
	long long count;
	void __init();
	void __cleanup();

};
}
}

#endif /* _WarehouseStockDTO_H_ */
