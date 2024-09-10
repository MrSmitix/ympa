/*
 * GenerateStocksOnWarehousesReportRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _GenerateStocksOnWarehousesReportRequest_H_
#define _GenerateStocksOnWarehousesReportRequest_H_


#include <string>
#include "Date.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateStocksOnWarehousesReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateStocksOnWarehousesReportRequest();
	GenerateStocksOnWarehousesReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateStocksOnWarehousesReportRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор магазина.
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор магазина.
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
	 */
	std::list<long long> getWarehouseIds();

	/*! \brief Set Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
	 */
	void setWarehouseIds(std::list <long long> warehouseIds);
	/*! \brief Get Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
	 */
	Date getReportDate();

	/*! \brief Set Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
	 */
	void setReportDate(Date  reportDate);
	/*! \brief Get Фильтр по категориям на Маркете (кроме модели FBY).
	 */
	std::list<long long> getCategoryIds();

	/*! \brief Set Фильтр по категориям на Маркете (кроме модели FBY).
	 */
	void setCategoryIds(std::list <long long> categoryIds);
	/*! \brief Get Фильтр по наличию остатков (кроме модели FBY).
	 */
	bool getHasStocks();

	/*! \brief Set Фильтр по наличию остатков (кроме модели FBY).
	 */
	void setHasStocks(bool  hasStocks);

private:
	long long campaignId;
	std::list <long long>warehouseIds;
	Date reportDate;
	std::list <long long>categoryIds;
	bool hasStocks;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateStocksOnWarehousesReportRequest_H_ */
