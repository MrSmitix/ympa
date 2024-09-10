
#include "WarehouseStockDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_WarehouseStockDTO_count_is_assigned_from_json()
{






    bourne::json input =
    {
        "count", 1
    };

    WarehouseStockDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());


}




void test_WarehouseStockDTO_count_is_converted_to_json()
{



    bourne::json input =
    {
        "count", 1
    };

    WarehouseStockDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);

}


