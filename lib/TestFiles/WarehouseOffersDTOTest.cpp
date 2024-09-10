
#include "WarehouseOffersDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_WarehouseOffersDTO_warehouseId_is_assigned_from_json()
{






    bourne::json input =
    {
        "warehouseId", 1
    };

    WarehouseOffersDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWarehouseId());


}




void test_WarehouseOffersDTO_warehouseId_is_converted_to_json()
{



    bourne::json input =
    {
        "warehouseId", 1
    };

    WarehouseOffersDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["warehouseId"] == output["warehouseId"]);

}



