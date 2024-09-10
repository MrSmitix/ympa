
#include "GenerateReportDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GenerateReportDTO_reportId_is_assigned_from_json()
{


    bourne::json input =
    {
        "reportId", "hello"
    };

    GenerateReportDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportId().c_str());






}


void test_GenerateReportDTO_estimatedGenerationTime_is_assigned_from_json()
{






    bourne::json input =
    {
        "estimatedGenerationTime", 1
    };

    GenerateReportDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEstimatedGenerationTime());


}



void test_GenerateReportDTO_reportId_is_converted_to_json()
{

    bourne::json input =
    {
        "reportId", "hello"
    };

    GenerateReportDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reportId"] == output["reportId"]);



}


void test_GenerateReportDTO_estimatedGenerationTime_is_converted_to_json()
{



    bourne::json input =
    {
        "estimatedGenerationTime", 1
    };

    GenerateReportDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["estimatedGenerationTime"] == output["estimatedGenerationTime"]);

}


