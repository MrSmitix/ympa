

#include "FlippingPagerDTO.h"

using namespace Tiny;

FlippingPagerDTO::FlippingPagerDTO()
{
	total = int(0);
	from = int(0);
	to = int(0);
	currentPage = int(0);
	pagesCount = int(0);
	pageSize = int(0);
}

FlippingPagerDTO::FlippingPagerDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FlippingPagerDTO::~FlippingPagerDTO()
{

}

void
FlippingPagerDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "int");


    }

    const char *fromKey = "from";

    if(object.has_key(fromKey))
    {
        bourne::json value = object[fromKey];



        jsonToValue(&from, value, "int");


    }

    const char *toKey = "to";

    if(object.has_key(toKey))
    {
        bourne::json value = object[toKey];



        jsonToValue(&to, value, "int");


    }

    const char *currentPageKey = "currentPage";

    if(object.has_key(currentPageKey))
    {
        bourne::json value = object[currentPageKey];



        jsonToValue(&currentPage, value, "int");


    }

    const char *pagesCountKey = "pagesCount";

    if(object.has_key(pagesCountKey))
    {
        bourne::json value = object[pagesCountKey];



        jsonToValue(&pagesCount, value, "int");


    }

    const char *pageSizeKey = "pageSize";

    if(object.has_key(pageSizeKey))
    {
        bourne::json value = object[pageSizeKey];



        jsonToValue(&pageSize, value, "int");


    }


}

bourne::json
FlippingPagerDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["total"] = getTotal();






    object["from"] = getFrom();






    object["to"] = getTo();






    object["currentPage"] = getCurrentPage();






    object["pagesCount"] = getPagesCount();






    object["pageSize"] = getPageSize();



    return object;

}

int
FlippingPagerDTO::getTotal()
{
	return total;
}

void
FlippingPagerDTO::setTotal(int  total)
{
	this->total = total;
}

int
FlippingPagerDTO::getFrom()
{
	return from;
}

void
FlippingPagerDTO::setFrom(int  from)
{
	this->from = from;
}

int
FlippingPagerDTO::getTo()
{
	return to;
}

void
FlippingPagerDTO::setTo(int  to)
{
	this->to = to;
}

int
FlippingPagerDTO::getCurrentPage()
{
	return currentPage;
}

void
FlippingPagerDTO::setCurrentPage(int  currentPage)
{
	this->currentPage = currentPage;
}

int
FlippingPagerDTO::getPagesCount()
{
	return pagesCount;
}

void
FlippingPagerDTO::setPagesCount(int  pagesCount)
{
	this->pagesCount = pagesCount;
}

int
FlippingPagerDTO::getPageSize()
{
	return pageSize;
}

void
FlippingPagerDTO::setPageSize(int  pageSize)
{
	this->pageSize = pageSize;
}



