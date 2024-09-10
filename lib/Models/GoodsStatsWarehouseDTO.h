
/*
 * GoodsStatsWarehouseDTO.h
 *
 * Информация о складе.
 */

#ifndef TINY_CPP_CLIENT_GoodsStatsWarehouseDTO_H_
#define TINY_CPP_CLIENT_GoodsStatsWarehouseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WarehouseStockDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о складе.
 *
 *  \ingroup Models
 *
 */

class GoodsStatsWarehouseDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsStatsWarehouseDTO();
    GoodsStatsWarehouseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsStatsWarehouseDTO();


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
	/*! \brief Get Информация об остатках товаров на складе.
	 */
	std::list<WarehouseStockDTO> getStocks();

	/*! \brief Set Информация об остатках товаров на складе.
	 */
	void setStocks(std::list <WarehouseStockDTO> stocks);


    private:
    long id{};
    std::string name{};
    std::list<WarehouseStockDTO> stocks;
};
}

#endif /* TINY_CPP_CLIENT_GoodsStatsWarehouseDTO_H_ */
