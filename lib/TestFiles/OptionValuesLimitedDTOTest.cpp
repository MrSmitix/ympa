
#include "OptionValuesLimitedDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OptionValuesLimitedDTO_limitingOptionValueId_is_assigned_from_json()
{






    bourne::json input =
    {
        "limitingOptionValueId", 1
    };

    OptionValuesLimitedDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLimitingOptionValueId());


}




void test_OptionValuesLimitedDTO_limitingOptionValueId_is_converted_to_json()
{



    bourne::json input =
    {
        "limitingOptionValueId", 1
    };

    OptionValuesLimitedDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["limitingOptionValueId"] == output["limitingOptionValueId"]);

}



