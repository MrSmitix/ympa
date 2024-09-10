

#include "ReturnDecisionDTO.h"

using namespace Tiny;

ReturnDecisionDTO::ReturnDecisionDTO()
{
	returnItemId = long(0);
	count = int(0);
	comment = std::string();
	reasonType = ReturnDecisionReasonType();
	subreasonType = ReturnDecisionSubreasonType();
	decisionType = ReturnDecisionType();
	refundAmount = long(0);
	partnerCompensation = long(0);
	images = std::list<std::string>();
}

ReturnDecisionDTO::ReturnDecisionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnDecisionDTO::~ReturnDecisionDTO()
{

}

void
ReturnDecisionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *returnItemIdKey = "returnItemId";

    if(object.has_key(returnItemIdKey))
    {
        bourne::json value = object[returnItemIdKey];



        jsonToValue(&returnItemId, value, "long");


    }

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *commentKey = "comment";

    if(object.has_key(commentKey))
    {
        bourne::json value = object[commentKey];



        jsonToValue(&comment, value, "std::string");


    }

    const char *reasonTypeKey = "reasonType";

    if(object.has_key(reasonTypeKey))
    {
        bourne::json value = object[reasonTypeKey];




        ReturnDecisionReasonType* obj = &reasonType;
		obj->fromJson(value.dump());

    }

    const char *subreasonTypeKey = "subreasonType";

    if(object.has_key(subreasonTypeKey))
    {
        bourne::json value = object[subreasonTypeKey];




        ReturnDecisionSubreasonType* obj = &subreasonType;
		obj->fromJson(value.dump());

    }

    const char *decisionTypeKey = "decisionType";

    if(object.has_key(decisionTypeKey))
    {
        bourne::json value = object[decisionTypeKey];




        ReturnDecisionType* obj = &decisionType;
		obj->fromJson(value.dump());

    }

    const char *refundAmountKey = "refundAmount";

    if(object.has_key(refundAmountKey))
    {
        bourne::json value = object[refundAmountKey];



        jsonToValue(&refundAmount, value, "long");


    }

    const char *partnerCompensationKey = "partnerCompensation";

    if(object.has_key(partnerCompensationKey))
    {
        bourne::json value = object[partnerCompensationKey];



        jsonToValue(&partnerCompensation, value, "long");


    }

    const char *imagesKey = "images";

    if(object.has_key(imagesKey))
    {
        bourne::json value = object[imagesKey];


        std::list<std::string> images_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            images_list.push_back(element);
        }
        images = images_list;


    }


}

bourne::json
ReturnDecisionDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["returnItemId"] = getReturnItemId();






    object["count"] = getCount();






    object["comment"] = getComment();







	object["reasonType"] = getReasonType().toJson();






	object["subreasonType"] = getSubreasonType().toJson();






	object["decisionType"] = getDecisionType().toJson();





    object["refundAmount"] = getRefundAmount();






    object["partnerCompensation"] = getPartnerCompensation();





    std::list<std::string> images_list = getImages();
    bourne::json images_arr = bourne::json::array();

    for(auto& var : images_list)
    {
        images_arr.append(var);
    }
    object["images"] = images_arr;






    return object;

}

long
ReturnDecisionDTO::getReturnItemId()
{
	return returnItemId;
}

void
ReturnDecisionDTO::setReturnItemId(long  returnItemId)
{
	this->returnItemId = returnItemId;
}

int
ReturnDecisionDTO::getCount()
{
	return count;
}

void
ReturnDecisionDTO::setCount(int  count)
{
	this->count = count;
}

std::string
ReturnDecisionDTO::getComment()
{
	return comment;
}

void
ReturnDecisionDTO::setComment(std::string  comment)
{
	this->comment = comment;
}

ReturnDecisionReasonType
ReturnDecisionDTO::getReasonType()
{
	return reasonType;
}

void
ReturnDecisionDTO::setReasonType(ReturnDecisionReasonType  reasonType)
{
	this->reasonType = reasonType;
}

ReturnDecisionSubreasonType
ReturnDecisionDTO::getSubreasonType()
{
	return subreasonType;
}

void
ReturnDecisionDTO::setSubreasonType(ReturnDecisionSubreasonType  subreasonType)
{
	this->subreasonType = subreasonType;
}

ReturnDecisionType
ReturnDecisionDTO::getDecisionType()
{
	return decisionType;
}

void
ReturnDecisionDTO::setDecisionType(ReturnDecisionType  decisionType)
{
	this->decisionType = decisionType;
}

long
ReturnDecisionDTO::getRefundAmount()
{
	return refundAmount;
}

void
ReturnDecisionDTO::setRefundAmount(long  refundAmount)
{
	this->refundAmount = refundAmount;
}

long
ReturnDecisionDTO::getPartnerCompensation()
{
	return partnerCompensation;
}

void
ReturnDecisionDTO::setPartnerCompensation(long  partnerCompensation)
{
	this->partnerCompensation = partnerCompensation;
}

std::list<std::string>
ReturnDecisionDTO::getImages()
{
	return images;
}

void
ReturnDecisionDTO::setImages(std::list <std::string> images)
{
	this->images = images;
}



