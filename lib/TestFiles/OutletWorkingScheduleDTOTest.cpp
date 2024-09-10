
#include "OutletWorkingScheduleDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OutletWorkingScheduleDTO_workInHoliday_is_assigned_from_json()
{




    bourne::json input =
    {
        "workInHoliday", true
    };

    OutletWorkingScheduleDTO obj(input.dump());

    TEST_ASSERT(true == obj.isWorkInHoliday());




}




void test_OutletWorkingScheduleDTO_workInHoliday_is_converted_to_json()
{


    bourne::json input =
    {
        "workInHoliday", true
    };

    OutletWorkingScheduleDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["workInHoliday"] == output["workInHoliday"]);


}



