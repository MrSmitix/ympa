
#include "UpdateMappingDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateMappingDTO_marketSku_is_assigned_from_json()
{






    bourne::json input =
    {
        "marketSku", 1
    };

    UpdateMappingDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMarketSku());


}



void test_UpdateMappingDTO_marketSku_is_converted_to_json()
{



    bourne::json input =
    {
        "marketSku", 1
    };

    UpdateMappingDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["marketSku"] == output["marketSku"]);

}


