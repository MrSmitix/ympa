

#include "GetGoodsFeedbackRequest.h"

using namespace Tiny;

GetGoodsFeedbackRequest::GetGoodsFeedbackRequest()
{
	dateTimeFrom = std::string();
	dateTimeTo = std::string();
	reactionStatus = FeedbackReactionStatusType();
	ratingValues = std::list<int>();
	modelIds = std::list<long>();
	paid = bool(false);
}

GetGoodsFeedbackRequest::GetGoodsFeedbackRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetGoodsFeedbackRequest::~GetGoodsFeedbackRequest()
{

}

void
GetGoodsFeedbackRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dateTimeFromKey = "dateTimeFrom";

    if(object.has_key(dateTimeFromKey))
    {
        bourne::json value = object[dateTimeFromKey];



        jsonToValue(&dateTimeFrom, value, "std::string");


    }

    const char *dateTimeToKey = "dateTimeTo";

    if(object.has_key(dateTimeToKey))
    {
        bourne::json value = object[dateTimeToKey];



        jsonToValue(&dateTimeTo, value, "std::string");


    }

    const char *reactionStatusKey = "reactionStatus";

    if(object.has_key(reactionStatusKey))
    {
        bourne::json value = object[reactionStatusKey];




        FeedbackReactionStatusType* obj = &reactionStatus;
		obj->fromJson(value.dump());

    }

    const char *ratingValuesKey = "ratingValues";

    if(object.has_key(ratingValuesKey))
    {
        bourne::json value = object[ratingValuesKey];


        std::list<int> ratingValues_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            ratingValues_list.push_back(element);
        }
        ratingValues = ratingValues_list;


    }

    const char *modelIdsKey = "modelIds";

    if(object.has_key(modelIdsKey))
    {
        bourne::json value = object[modelIdsKey];


        std::list<long> modelIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            modelIds_list.push_back(element);
        }
        modelIds = modelIds_list;


    }

    const char *paidKey = "paid";

    if(object.has_key(paidKey))
    {
        bourne::json value = object[paidKey];



        jsonToValue(&paid, value, "bool");


    }


}

bourne::json
GetGoodsFeedbackRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["dateTimeFrom"] = getDateTimeFrom();






    object["dateTimeTo"] = getDateTimeTo();







	object["reactionStatus"] = getReactionStatus().toJson();




    std::list<int> ratingValues_list = getRatingValues();
    bourne::json ratingValues_arr = bourne::json::array();

    for(auto& var : ratingValues_list)
    {
        ratingValues_arr.append(var);
    }
    object["ratingValues"] = ratingValues_arr;








    std::list<long> modelIds_list = getModelIds();
    bourne::json modelIds_arr = bourne::json::array();

    for(auto& var : modelIds_list)
    {
        modelIds_arr.append(var);
    }
    object["modelIds"] = modelIds_arr;









    object["paid"] = isPaid();



    return object;

}

std::string
GetGoodsFeedbackRequest::getDateTimeFrom()
{
	return dateTimeFrom;
}

void
GetGoodsFeedbackRequest::setDateTimeFrom(std::string  dateTimeFrom)
{
	this->dateTimeFrom = dateTimeFrom;
}

std::string
GetGoodsFeedbackRequest::getDateTimeTo()
{
	return dateTimeTo;
}

void
GetGoodsFeedbackRequest::setDateTimeTo(std::string  dateTimeTo)
{
	this->dateTimeTo = dateTimeTo;
}

FeedbackReactionStatusType
GetGoodsFeedbackRequest::getReactionStatus()
{
	return reactionStatus;
}

void
GetGoodsFeedbackRequest::setReactionStatus(FeedbackReactionStatusType  reactionStatus)
{
	this->reactionStatus = reactionStatus;
}

Set<int>
GetGoodsFeedbackRequest::getRatingValues()
{
	return ratingValues;
}

void
GetGoodsFeedbackRequest::setRatingValues(Set <int> ratingValues)
{
	this->ratingValues = ratingValues;
}

Set<long>
GetGoodsFeedbackRequest::getModelIds()
{
	return modelIds;
}

void
GetGoodsFeedbackRequest::setModelIds(Set <long> modelIds)
{
	this->modelIds = modelIds;
}

bool
GetGoodsFeedbackRequest::isPaid()
{
	return paid;
}

void
GetGoodsFeedbackRequest::setPaid(bool  paid)
{
	this->paid = paid;
}



