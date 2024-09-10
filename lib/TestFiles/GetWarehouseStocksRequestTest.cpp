
#include "GetWarehouseStocksRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetWarehouseStocksRequest_withTurnover_is_assigned_from_json()
{




    bourne::json input =
    {
        "withTurnover", true
    };

    GetWarehouseStocksRequest obj(input.dump());

    TEST_ASSERT(true == obj.isWithTurnover());




}


void test_GetWarehouseStocksRequest_archived_is_assigned_from_json()
{




    bourne::json input =
    {
        "archived", true
    };

    GetWarehouseStocksRequest obj(input.dump());

    TEST_ASSERT(true == obj.isArchived());




}




void test_GetWarehouseStocksRequest_withTurnover_is_converted_to_json()
{


    bourne::json input =
    {
        "withTurnover", true
    };

    GetWarehouseStocksRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["withTurnover"] == output["withTurnover"]);


}


void test_GetWarehouseStocksRequest_archived_is_converted_to_json()
{


    bourne::json input =
    {
        "archived", true
    };

    GetWarehouseStocksRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["archived"] == output["archived"]);


}



