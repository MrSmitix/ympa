

#include "GoodsFeedbackStatisticsDTO.h"

using namespace Tiny;

GoodsFeedbackStatisticsDTO::GoodsFeedbackStatisticsDTO()
{
	rating = int(0);
	commentsCount = long(0);
	recommended = bool(false);
	paidAmount = long(0);
}

GoodsFeedbackStatisticsDTO::GoodsFeedbackStatisticsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoodsFeedbackStatisticsDTO::~GoodsFeedbackStatisticsDTO()
{

}

void
GoodsFeedbackStatisticsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ratingKey = "rating";

    if(object.has_key(ratingKey))
    {
        bourne::json value = object[ratingKey];



        jsonToValue(&rating, value, "int");


    }

    const char *commentsCountKey = "commentsCount";

    if(object.has_key(commentsCountKey))
    {
        bourne::json value = object[commentsCountKey];



        jsonToValue(&commentsCount, value, "long");


    }

    const char *recommendedKey = "recommended";

    if(object.has_key(recommendedKey))
    {
        bourne::json value = object[recommendedKey];



        jsonToValue(&recommended, value, "bool");


    }

    const char *paidAmountKey = "paidAmount";

    if(object.has_key(paidAmountKey))
    {
        bourne::json value = object[paidAmountKey];



        jsonToValue(&paidAmount, value, "long");


    }


}

bourne::json
GoodsFeedbackStatisticsDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["rating"] = getRating();






    object["commentsCount"] = getCommentsCount();






    object["recommended"] = isRecommended();






    object["paidAmount"] = getPaidAmount();



    return object;

}

int
GoodsFeedbackStatisticsDTO::getRating()
{
	return rating;
}

void
GoodsFeedbackStatisticsDTO::setRating(int  rating)
{
	this->rating = rating;
}

long
GoodsFeedbackStatisticsDTO::getCommentsCount()
{
	return commentsCount;
}

void
GoodsFeedbackStatisticsDTO::setCommentsCount(long  commentsCount)
{
	this->commentsCount = commentsCount;
}

bool
GoodsFeedbackStatisticsDTO::isRecommended()
{
	return recommended;
}

void
GoodsFeedbackStatisticsDTO::setRecommended(bool  recommended)
{
	this->recommended = recommended;
}

long
GoodsFeedbackStatisticsDTO::getPaidAmount()
{
	return paidAmount;
}

void
GoodsFeedbackStatisticsDTO::setPaidAmount(long  paidAmount)
{
	this->paidAmount = paidAmount;
}



