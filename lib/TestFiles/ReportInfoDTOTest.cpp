
#include "ReportInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_ReportInfoDTO_generationRequestedAt_is_assigned_from_json()
{








}


void test_ReportInfoDTO_generationFinishedAt_is_assigned_from_json()
{








}


void test_ReportInfoDTO_file_is_assigned_from_json()
{


    bourne::json input =
    {
        "file", "hello"
    };

    ReportInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFile().c_str());






}


void test_ReportInfoDTO_estimatedGenerationTime_is_assigned_from_json()
{






    bourne::json input =
    {
        "estimatedGenerationTime", 1
    };

    ReportInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEstimatedGenerationTime());


}





void test_ReportInfoDTO_generationRequestedAt_is_converted_to_json()
{




}


void test_ReportInfoDTO_generationFinishedAt_is_converted_to_json()
{




}


void test_ReportInfoDTO_file_is_converted_to_json()
{

    bourne::json input =
    {
        "file", "hello"
    };

    ReportInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["file"] == output["file"]);



}


void test_ReportInfoDTO_estimatedGenerationTime_is_converted_to_json()
{



    bourne::json input =
    {
        "estimatedGenerationTime", 1
    };

    ReportInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["estimatedGenerationTime"] == output["estimatedGenerationTime"]);

}


