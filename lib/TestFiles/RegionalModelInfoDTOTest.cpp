
#include "RegionalModelInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_RegionalModelInfoDTO_regionId_is_assigned_from_json()
{






    bourne::json input =
    {
        "regionId", 1
    };

    RegionalModelInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRegionId());


}




void test_RegionalModelInfoDTO_regionId_is_converted_to_json()
{



    bourne::json input =
    {
        "regionId", 1
    };

    RegionalModelInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["regionId"] == output["regionId"]);

}


