
#include "FeedIndexLogsRecordDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FeedIndexLogsRecordDTO_downloadTime_is_assigned_from_json()
{








}


void test_FeedIndexLogsRecordDTO_fileTime_is_assigned_from_json()
{








}


void test_FeedIndexLogsRecordDTO_generationId_is_assigned_from_json()
{






    bourne::json input =
    {
        "generationId", 1
    };

    FeedIndexLogsRecordDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGenerationId());


}



void test_FeedIndexLogsRecordDTO_publishedTime_is_assigned_from_json()
{








}






void test_FeedIndexLogsRecordDTO_downloadTime_is_converted_to_json()
{




}


void test_FeedIndexLogsRecordDTO_fileTime_is_converted_to_json()
{




}


void test_FeedIndexLogsRecordDTO_generationId_is_converted_to_json()
{



    bourne::json input =
    {
        "generationId", 1
    };

    FeedIndexLogsRecordDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["generationId"] == output["generationId"]);

}



void test_FeedIndexLogsRecordDTO_publishedTime_is_converted_to_json()
{




}





