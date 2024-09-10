

#include "GenerateShipmentListDocumentReportRequest.h"

using namespace Tiny;

GenerateShipmentListDocumentReportRequest::GenerateShipmentListDocumentReportRequest()
{
	campaignId = long(0);
	shipmentId = long(0);
	orderIds = std::list<long>();
}

GenerateShipmentListDocumentReportRequest::GenerateShipmentListDocumentReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateShipmentListDocumentReportRequest::~GenerateShipmentListDocumentReportRequest()
{

}

void
GenerateShipmentListDocumentReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaignIdKey = "campaignId";

    if(object.has_key(campaignIdKey))
    {
        bourne::json value = object[campaignIdKey];



        jsonToValue(&campaignId, value, "long");


    }

    const char *shipmentIdKey = "shipmentId";

    if(object.has_key(shipmentIdKey))
    {
        bourne::json value = object[shipmentIdKey];



        jsonToValue(&shipmentId, value, "long");


    }

    const char *orderIdsKey = "orderIds";

    if(object.has_key(orderIdsKey))
    {
        bourne::json value = object[orderIdsKey];


        std::list<long> orderIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            orderIds_list.push_back(element);
        }
        orderIds = orderIds_list;


    }


}

bourne::json
GenerateShipmentListDocumentReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["campaignId"] = getCampaignId();






    object["shipmentId"] = getShipmentId();





    std::list<long> orderIds_list = getOrderIds();
    bourne::json orderIds_arr = bourne::json::array();

    for(auto& var : orderIds_list)
    {
        orderIds_arr.append(var);
    }
    object["orderIds"] = orderIds_arr;






    return object;

}

long
GenerateShipmentListDocumentReportRequest::getCampaignId()
{
	return campaignId;
}

void
GenerateShipmentListDocumentReportRequest::setCampaignId(long  campaignId)
{
	this->campaignId = campaignId;
}

long
GenerateShipmentListDocumentReportRequest::getShipmentId()
{
	return shipmentId;
}

void
GenerateShipmentListDocumentReportRequest::setShipmentId(long  shipmentId)
{
	this->shipmentId = shipmentId;
}

std::list<long>
GenerateShipmentListDocumentReportRequest::getOrderIds()
{
	return orderIds;
}

void
GenerateShipmentListDocumentReportRequest::setOrderIds(std::list <long> orderIds)
{
	this->orderIds = orderIds;
}



