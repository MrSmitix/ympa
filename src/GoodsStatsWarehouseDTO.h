/*
 * GoodsStatsWarehouseDTO.h
 *
 * Информация о складе.
 */

#ifndef _GoodsStatsWarehouseDTO_H_
#define _GoodsStatsWarehouseDTO_H_


#include <string>
#include "WarehouseStockDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о складе.
 *
 *  \ingroup Models
 *
 */

class GoodsStatsWarehouseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsStatsWarehouseDTO();
	GoodsStatsWarehouseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsStatsWarehouseDTO();

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
	/*! \brief Get Информация об остатках товаров на складе.
	 */
	std::list<WarehouseStockDTO> getStocks();

	/*! \brief Set Информация об остатках товаров на складе.
	 */
	void setStocks(std::list <WarehouseStockDTO> stocks);

private:
	long long id;
	std::string name;
	std::list <WarehouseStockDTO>stocks;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsStatsWarehouseDTO_H_ */
