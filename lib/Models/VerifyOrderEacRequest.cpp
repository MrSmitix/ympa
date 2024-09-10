

#include "VerifyOrderEacRequest.h"

using namespace Tiny;

VerifyOrderEacRequest::VerifyOrderEacRequest()
{
	code = std::string();
}

VerifyOrderEacRequest::VerifyOrderEacRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

VerifyOrderEacRequest::~VerifyOrderEacRequest()
{

}

void
VerifyOrderEacRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }


}

bourne::json
VerifyOrderEacRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();



    return object;

}

std::string
VerifyOrderEacRequest::getCode()
{
	return code;
}

void
VerifyOrderEacRequest::setCode(std::string  code)
{
	this->code = code;
}



