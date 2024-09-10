

#include "ReturnInstanceDTO.h"

using namespace Tiny;

ReturnInstanceDTO::ReturnInstanceDTO()
{
	stockType = ReturnInstanceStockType();
	status = ReturnInstanceStatusType();
	cis = std::string();
	imei = std::string();
}

ReturnInstanceDTO::ReturnInstanceDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnInstanceDTO::~ReturnInstanceDTO()
{

}

void
ReturnInstanceDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *stockTypeKey = "stockType";

    if(object.has_key(stockTypeKey))
    {
        bourne::json value = object[stockTypeKey];




        ReturnInstanceStockType* obj = &stockType;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ReturnInstanceStatusType* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *cisKey = "cis";

    if(object.has_key(cisKey))
    {
        bourne::json value = object[cisKey];



        jsonToValue(&cis, value, "std::string");


    }

    const char *imeiKey = "imei";

    if(object.has_key(imeiKey))
    {
        bourne::json value = object[imeiKey];



        jsonToValue(&imei, value, "std::string");


    }


}

bourne::json
ReturnInstanceDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["stockType"] = getStockType().toJson();






	object["status"] = getStatus().toJson();





    object["cis"] = getCis();






    object["imei"] = getImei();



    return object;

}

ReturnInstanceStockType
ReturnInstanceDTO::getStockType()
{
	return stockType;
}

void
ReturnInstanceDTO::setStockType(ReturnInstanceStockType  stockType)
{
	this->stockType = stockType;
}

ReturnInstanceStatusType
ReturnInstanceDTO::getStatus()
{
	return status;
}

void
ReturnInstanceDTO::setStatus(ReturnInstanceStatusType  status)
{
	this->status = status;
}

std::string
ReturnInstanceDTO::getCis()
{
	return cis;
}

void
ReturnInstanceDTO::setCis(std::string  cis)
{
	this->cis = cis;
}

std::string
ReturnInstanceDTO::getImei()
{
	return imei;
}

void
ReturnInstanceDTO::setImei(std::string  imei)
{
	this->imei = imei;
}



