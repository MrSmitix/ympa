
#include "ValueRestrictionDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ValueRestrictionDTO_limitingParameterId_is_assigned_from_json()
{






    bourne::json input =
    {
        "limitingParameterId", 1
    };

    ValueRestrictionDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLimitingParameterId());


}




void test_ValueRestrictionDTO_limitingParameterId_is_converted_to_json()
{



    bourne::json input =
    {
        "limitingParameterId", 1
    };

    ValueRestrictionDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["limitingParameterId"] == output["limitingParameterId"]);

}



