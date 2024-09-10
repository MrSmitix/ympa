

#include "GenerateStocksOnWarehousesReportRequest.h"

using namespace Tiny;

GenerateStocksOnWarehousesReportRequest::GenerateStocksOnWarehousesReportRequest()
{
	campaignId = long(0);
	warehouseIds = std::list<long>();
	reportDate = std::string();
	categoryIds = std::list<long>();
	hasStocks = bool(false);
}

GenerateStocksOnWarehousesReportRequest::GenerateStocksOnWarehousesReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateStocksOnWarehousesReportRequest::~GenerateStocksOnWarehousesReportRequest()
{

}

void
GenerateStocksOnWarehousesReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *warehouseIdsKey = "warehouseIds";

    if(object.has_key(warehouseIdsKey))
    {
        bourne::json value = object[warehouseIdsKey];


        std::list<long> warehouseIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            warehouseIds_list.push_back(element);
        }
        warehouseIds = warehouseIds_list;


    }

    const char *reportDateKey = "reportDate";

    if(object.has_key(reportDateKey))
    {
        bourne::json value = object[reportDateKey];




        Date* obj = &reportDate;
		obj->fromJson(value.dump());

    }

    const char *categoryIdsKey = "categoryIds";

    if(object.has_key(categoryIdsKey))
    {
        bourne::json value = object[categoryIdsKey];


        std::list<long> categoryIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            categoryIds_list.push_back(element);
        }
        categoryIds = categoryIds_list;


    }

    const char *hasStocksKey = "hasStocks";

    if(object.has_key(hasStocksKey))
    {
        bourne::json value = object[hasStocksKey];



        jsonToValue(&hasStocks, value, "bool");


    }


}

bourne::json
GenerateStocksOnWarehousesReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();





    std::list<long> warehouseIds_list = getWarehouseIds();
    bourne::json warehouseIds_arr = bourne::json::array();

    for(auto& var : warehouseIds_list)
    {
        warehouseIds_arr.append(var);
    }
    object["warehouseIds"] = warehouseIds_arr;










	object["reportDate"] = getReportDate().toJson();




    std::list<long> categoryIds_list = getCategoryIds();
    bourne::json categoryIds_arr = bourne::json::array();

    for(auto& var : categoryIds_list)
    {
        categoryIds_arr.append(var);
    }
    object["categoryIds"] = categoryIds_arr;









    object["hasStocks"] = isHasStocks();



    return object;

}

long
GenerateStocksOnWarehousesReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateStocksOnWarehousesReportRequest::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

std::list<long>
GenerateStocksOnWarehousesReportRequest::getWarehouseIds()
{
	return warehouseIds;
}

void
GenerateStocksOnWarehousesReportRequest::setWarehouseIds(std::list <long> warehouseIds)
{
	this->warehouseIds = warehouseIds;
}

Date
GenerateStocksOnWarehousesReportRequest::getReportDate()
{
	return reportDate;
}

void
GenerateStocksOnWarehousesReportRequest::setReportDate(Date  reportDate)
{
	this->reportDate = reportDate;
}

std::list<long>
GenerateStocksOnWarehousesReportRequest::getCategoryIds()
{
	return categoryIds;
}

void
GenerateStocksOnWarehousesReportRequest::setCategoryIds(std::list <long> categoryIds)
{
	this->categoryIds = categoryIds;
}

bool
GenerateStocksOnWarehousesReportRequest::isHasStocks()
{
	return hasStocks;
}

void
GenerateStocksOnWarehousesReportRequest::setHasStocks(bool  hasStocks)
{
	this->hasStocks = hasStocks;
}



