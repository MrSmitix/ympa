

#include "SetReturnDecisionRequest.h"

using namespace Tiny;

SetReturnDecisionRequest::SetReturnDecisionRequest()
{
	returnItemId = long(0);
	decisionType = ReturnRequestDecisionType();
	comment = std::string();
}

SetReturnDecisionRequest::SetReturnDecisionRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

SetReturnDecisionRequest::~SetReturnDecisionRequest()
{

}

void
SetReturnDecisionRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *returnItemIdKey = "returnItemId";

    if(object.has_key(returnItemIdKey))
    {
        bourne::json value = object[returnItemIdKey];



        jsonToValue(&returnItemId, value, "long");


    }

    const char *decisionTypeKey = "decisionType";

    if(object.has_key(decisionTypeKey))
    {
        bourne::json value = object[decisionTypeKey];




        ReturnRequestDecisionType* obj = &decisionType;
		obj->fromJson(value.dump());

    }

    const char *commentKey = "comment";

    if(object.has_key(commentKey))
    {
        bourne::json value = object[commentKey];



        jsonToValue(&comment, value, "std::string");


    }


}

bourne::json
SetReturnDecisionRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["returnItemId"] = getReturnItemId();







	object["decisionType"] = getDecisionType().toJson();





    object["comment"] = getComment();



    return object;

}

long
SetReturnDecisionRequest::getReturnItemId()
{
	return returnItemId;
}

void
SetReturnDecisionRequest::setReturnItemId(long  returnItemId)
{
	this->returnItemId = returnItemId;
}

ReturnRequestDecisionType
SetReturnDecisionRequest::getDecisionType()
{
	return decisionType;
}

void
SetReturnDecisionRequest::setDecisionType(ReturnRequestDecisionType  decisionType)
{
	this->decisionType = decisionType;
}

std::string
SetReturnDecisionRequest::getComment()
{
	return comment;
}

void
SetReturnDecisionRequest::setComment(std::string  comment)
{
	this->comment = comment;
}



