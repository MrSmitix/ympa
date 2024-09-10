

#include "EacVerificationResultDTO.h"

using namespace Tiny;

EacVerificationResultDTO::EacVerificationResultDTO()
{
	verificationResult = EacVerificationStatusType();
	attemptsLeft = int(0);
}

EacVerificationResultDTO::EacVerificationResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

EacVerificationResultDTO::~EacVerificationResultDTO()
{

}

void
EacVerificationResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *verificationResultKey = "verificationResult";

    if(object.has_key(verificationResultKey))
    {
        bourne::json value = object[verificationResultKey];




        EacVerificationStatusType* obj = &verificationResult;
		obj->fromJson(value.dump());

    }

    const char *attemptsLeftKey = "attemptsLeft";

    if(object.has_key(attemptsLeftKey))
    {
        bourne::json value = object[attemptsLeftKey];



        jsonToValue(&attemptsLeft, value, "int");


    }


}

bourne::json
EacVerificationResultDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["verificationResult"] = getVerificationResult().toJson();





    object["attemptsLeft"] = getAttemptsLeft();



    return object;

}

EacVerificationStatusType
EacVerificationResultDTO::getVerificationResult()
{
	return verificationResult;
}

void
EacVerificationResultDTO::setVerificationResult(EacVerificationStatusType  verificationResult)
{
	this->verificationResult = verificationResult;
}

int
EacVerificationResultDTO::getAttemptsLeft()
{
	return attemptsLeft;
}

void
EacVerificationResultDTO::setAttemptsLeft(int  attemptsLeft)
{
	this->attemptsLeft = attemptsLeft;
}



