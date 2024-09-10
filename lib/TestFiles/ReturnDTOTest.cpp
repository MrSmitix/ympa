
#include "ReturnDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ReturnDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    ReturnDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}


void test_ReturnDTO_orderId_is_assigned_from_json()
{






    bourne::json input =
    {
        "orderId", 1
    };

    ReturnDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderId());


}


void test_ReturnDTO_creationDate_is_assigned_from_json()
{








}


void test_ReturnDTO_updateDate_is_assigned_from_json()
{








}






void test_ReturnDTO_refundAmount_is_assigned_from_json()
{






    bourne::json input =
    {
        "refundAmount", 1
    };

    ReturnDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRefundAmount());


}




void test_ReturnDTO_fastReturn_is_assigned_from_json()
{




    bourne::json input =
    {
        "fastReturn", true
    };

    ReturnDTO obj(input.dump());

    TEST_ASSERT(true == obj.isFastReturn());




}



void test_ReturnDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    ReturnDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}


void test_ReturnDTO_orderId_is_converted_to_json()
{



    bourne::json input =
    {
        "orderId", 1
    };

    ReturnDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderId"] == output["orderId"]);

}


void test_ReturnDTO_creationDate_is_converted_to_json()
{




}


void test_ReturnDTO_updateDate_is_converted_to_json()
{




}






void test_ReturnDTO_refundAmount_is_converted_to_json()
{



    bourne::json input =
    {
        "refundAmount", 1
    };

    ReturnDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refundAmount"] == output["refundAmount"]);

}




void test_ReturnDTO_fastReturn_is_converted_to_json()
{


    bourne::json input =
    {
        "fastReturn", true
    };

    ReturnDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fastReturn"] == output["fastReturn"]);


}


