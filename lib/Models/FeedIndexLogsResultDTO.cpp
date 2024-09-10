

#include "FeedIndexLogsResultDTO.h"

using namespace Tiny;

FeedIndexLogsResultDTO::FeedIndexLogsResultDTO()
{
	feed = FeedIndexLogsFeedDTO();
	indexLogRecords = std::list<FeedIndexLogsRecordDTO>();
	total = long(0);
}

FeedIndexLogsResultDTO::FeedIndexLogsResultDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

FeedIndexLogsResultDTO::~FeedIndexLogsResultDTO()
{

}

void
FeedIndexLogsResultDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *feedKey = "feed";

    if(object.has_key(feedKey))
    {
        bourne::json value = object[feedKey];




        FeedIndexLogsFeedDTO* obj = &feed;
		obj->fromJson(value.dump());

    }

    const char *indexLogRecordsKey = "indexLogRecords";

    if(object.has_key(indexLogRecordsKey))
    {
        bourne::json value = object[indexLogRecordsKey];


        std::list<FeedIndexLogsRecordDTO> indexLogRecords_list;
        FeedIndexLogsRecordDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            indexLogRecords_list.push_back(element);
        }
        indexLogRecords = indexLogRecords_list;


    }

    const char *totalKey = "total";

    if(object.has_key(totalKey))
    {
        bourne::json value = object[totalKey];



        jsonToValue(&total, value, "long");


    }


}

bourne::json
FeedIndexLogsResultDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["feed"] = getFeed().toJson();




    std::list<FeedIndexLogsRecordDTO> indexLogRecords_list = getIndexLogRecords();
    bourne::json indexLogRecords_arr = bourne::json::array();

    for(auto& var : indexLogRecords_list)
    {
        FeedIndexLogsRecordDTO obj = var;
        indexLogRecords_arr.append(obj.toJson());
    }
    object["indexLogRecords"] = indexLogRecords_arr;







    object["total"] = getTotal();



    return object;

}

FeedIndexLogsFeedDTO
FeedIndexLogsResultDTO::getFeed()
{
	return feed;
}

void
FeedIndexLogsResultDTO::setFeed(FeedIndexLogsFeedDTO  feed)
{
	this->feed = feed;
}

std::list<FeedIndexLogsRecordDTO>
FeedIndexLogsResultDTO::getIndexLogRecords()
{
	return indexLogRecords;
}

void
FeedIndexLogsResultDTO::setIndexLogRecords(std::list <FeedIndexLogsRecordDTO> indexLogRecords)
{
	this->indexLogRecords = indexLogRecords;
}

long
FeedIndexLogsResultDTO::getTotal()
{
	return total;
}

void
FeedIndexLogsResultDTO::setTotal(long  total)
{
	this->total = total;
}



