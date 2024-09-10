
#include "BusinessSettingsDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BusinessSettingsDTO_onlyDefaultPrice_is_assigned_from_json()
{




    bourne::json input =
    {
        "onlyDefaultPrice", true
    };

    BusinessSettingsDTO obj(input.dump());

    TEST_ASSERT(true == obj.isOnlyDefaultPrice());




}




void test_BusinessSettingsDTO_onlyDefaultPrice_is_converted_to_json()
{


    bourne::json input =
    {
        "onlyDefaultPrice", true
    };

    BusinessSettingsDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["onlyDefaultPrice"] == output["onlyDefaultPrice"]);


}



