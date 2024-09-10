

#include "FeedbackGradesDTO.h"

using namespace Tiny;

FeedbackGradesDTO::FeedbackGradesDTO()
{
	average = float(0);
	agreeCount = long(0);
	rejectCount = long(0);
	factors = std::list<FeedbackFactorDTO>();
}

FeedbackGradesDTO::FeedbackGradesDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedbackGradesDTO::~FeedbackGradesDTO()
{

}

void
FeedbackGradesDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *averageKey = "average";

    if(object.has_key(averageKey))
    {
        bourne::json value = object[averageKey];



        jsonToValue(&average, value, "long");


    }

    const char *agreeCountKey = "agreeCount";

    if(object.has_key(agreeCountKey))
    {
        bourne::json value = object[agreeCountKey];



        jsonToValue(&agreeCount, value, "long");


    }

    const char *rejectCountKey = "rejectCount";

    if(object.has_key(rejectCountKey))
    {
        bourne::json value = object[rejectCountKey];



        jsonToValue(&rejectCount, value, "long");


    }

    const char *factorsKey = "factors";

    if(object.has_key(factorsKey))
    {
        bourne::json value = object[factorsKey];


        std::list<FeedbackFactorDTO> factors_list;
        FeedbackFactorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            factors_list.push_back(element);
        }
        factors = factors_list;


    }


}

bourne::json
FeedbackGradesDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["average"] = getAverage();






    object["agreeCount"] = getAgreeCount();






    object["rejectCount"] = getRejectCount();





    std::list<FeedbackFactorDTO> factors_list = getFactors();
    bourne::json factors_arr = bourne::json::array();

    for(auto& var : factors_list)
    {
        FeedbackFactorDTO obj = var;
        factors_arr.append(obj.toJson());
    }
    object["factors"] = factors_arr;




    return object;

}

long
FeedbackGradesDTO::getAverage()
{
	return average;
}

void
FeedbackGradesDTO::setAverage(long  average)
{
	this->average = average;
}

long
FeedbackGradesDTO::getAgreeCount()
{
	return agreeCount;
}

void
FeedbackGradesDTO::setAgreeCount(long  agreeCount)
{
	this->agreeCount = agreeCount;
}

long
FeedbackGradesDTO::getRejectCount()
{
	return rejectCount;
}

void
FeedbackGradesDTO::setRejectCount(long  rejectCount)
{
	this->rejectCount = rejectCount;
}

std::list<FeedbackFactorDTO>
FeedbackGradesDTO::getFactors()
{
	return factors;
}

void
FeedbackGradesDTO::setFactors(std::list <FeedbackFactorDTO> factors)
{
	this->factors = factors;
}



