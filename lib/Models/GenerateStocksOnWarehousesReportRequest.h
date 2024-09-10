
/*
 * GenerateStocksOnWarehousesReportRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef TINY_CPP_CLIENT_GenerateStocksOnWarehousesReportRequest_H_
#define TINY_CPP_CLIENT_GenerateStocksOnWarehousesReportRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include <list>

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateStocksOnWarehousesReportRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateStocksOnWarehousesReportRequest();
    GenerateStocksOnWarehousesReportRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateStocksOnWarehousesReportRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор магазина.
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор магазина.
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
	 */
	std::list<long> getWarehouseIds();

	/*! \brief Set Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
	 */
	void setWarehouseIds(std::list <long> warehouseIds);
	/*! \brief Get Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
	 */
	Date getReportDate();

	/*! \brief Set Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
	 */
	void setReportDate(Date  reportDate);
	/*! \brief Get Фильтр по категориям на Маркете (кроме модели FBY).
	 */
	std::list<long> getCategoryIds();

	/*! \brief Set Фильтр по категориям на Маркете (кроме модели FBY).
	 */
	void setCategoryIds(std::list <long> categoryIds);
	/*! \brief Get Фильтр по наличию остатков (кроме модели FBY).
	 */
	bool isHasStocks();

	/*! \brief Set Фильтр по наличию остатков (кроме модели FBY).
	 */
	void setHasStocks(bool  hasStocks);


    private:
    long campaignId{};
    std::list<long> warehouseIds;
    Date reportDate;
    std::list<long> categoryIds;
    bool hasStocks{};
};
}

#endif /* TINY_CPP_CLIENT_GenerateStocksOnWarehousesReportRequest_H_ */
