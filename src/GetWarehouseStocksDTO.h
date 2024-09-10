/*
 * GetWarehouseStocksDTO.h
 *
 * Список складов с информацией об остатках на каждом из них.
 */

#ifndef _GetWarehouseStocksDTO_H_
#define _GetWarehouseStocksDTO_H_


#include <string>
#include "ScrollingPagerDTO.h"
#include "WarehouseOffersDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список складов с информацией об остатках на каждом из них.
 *
 *  \ingroup Models
 *
 */

class GetWarehouseStocksDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetWarehouseStocksDTO();
	GetWarehouseStocksDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetWarehouseStocksDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Страница списка складов.
	 */
	std::list<WarehouseOffersDTO> getWarehouses();

	/*! \brief Set Страница списка складов.
	 */
	void setWarehouses(std::list <WarehouseOffersDTO> warehouses);

private:
	ScrollingPagerDTO paging;
	std::list <WarehouseOffersDTO>warehouses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetWarehouseStocksDTO_H_ */
