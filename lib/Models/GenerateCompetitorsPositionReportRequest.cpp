

#include "GenerateCompetitorsPositionReportRequest.h"

using namespace Tiny;

GenerateCompetitorsPositionReportRequest::GenerateCompetitorsPositionReportRequest()
{
	businessId = long(0);
	categoryId = long(0);
	dateFrom = std::string();
	dateTo = std::string();
}

GenerateCompetitorsPositionReportRequest::GenerateCompetitorsPositionReportRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerateCompetitorsPositionReportRequest::~GenerateCompetitorsPositionReportRequest()
{

}

void
GenerateCompetitorsPositionReportRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *businessIdKey = "businessId";

    if(object.has_key(businessIdKey))
    {
        bourne::json value = object[businessIdKey];



        jsonToValue(&businessId, value, "long");


    }

    const char *categoryIdKey = "categoryId";

    if(object.has_key(categoryIdKey))
    {
        bourne::json value = object[categoryIdKey];



        jsonToValue(&categoryId, value, "long");


    }

    const char *dateFromKey = "dateFrom";

    if(object.has_key(dateFromKey))
    {
        bourne::json value = object[dateFromKey];




        Date* obj = &dateFrom;
		obj->fromJson(value.dump());

    }

    const char *dateToKey = "dateTo";

    if(object.has_key(dateToKey))
    {
        bourne::json value = object[dateToKey];




        Date* obj = &dateTo;
		obj->fromJson(value.dump());

    }


}

bourne::json
GenerateCompetitorsPositionReportRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["businessId"] = getBusinessId();






    object["categoryId"] = getCategoryId();







	object["dateFrom"] = getDateFrom().toJson();






	object["dateTo"] = getDateTo().toJson();


    return object;

}

long
GenerateCompetitorsPositionReportRequest::getBusinessId()
{
	return businessId;
}

void
GenerateCompetitorsPositionReportRequest::setBusinessId(long  businessId)
{
	this->businessId = businessId;
}

long
GenerateCompetitorsPositionReportRequest::getCategoryId()
{
	return categoryId;
}

void
GenerateCompetitorsPositionReportRequest::setCategoryId(long  categoryId)
{
	this->categoryId = categoryId;
}

Date
GenerateCompetitorsPositionReportRequest::getDateFrom()
{
	return dateFrom;
}

void
GenerateCompetitorsPositionReportRequest::setDateFrom(Date  dateFrom)
{
	this->dateFrom = dateFrom;
}

Date
GenerateCompetitorsPositionReportRequest::getDateTo()
{
	return dateTo;
}

void
GenerateCompetitorsPositionReportRequest::setDateTo(Date  dateTo)
{
	this->dateTo = dateTo;
}



