
#include "OrderDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderDTO_id_is_assigned_from_json()
{






    bourne::json input =
    {
        "id", 1
    };

    OrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());


}




void test_OrderDTO_creationDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "creationDate", "hello"
    };

    OrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreationDate().c_str());






}


void test_OrderDTO_updatedAt_is_assigned_from_json()
{


    bourne::json input =
    {
        "updatedAt", "hello"
    };

    OrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUpdatedAt().c_str());






}



void test_OrderDTO_itemsTotal_is_assigned_from_json()
{








}


void test_OrderDTO_deliveryTotal_is_assigned_from_json()
{








}


void test_OrderDTO_buyerItemsTotal_is_assigned_from_json()
{








}


void test_OrderDTO_buyerTotal_is_assigned_from_json()
{








}


void test_OrderDTO_buyerItemsTotalBeforeDiscount_is_assigned_from_json()
{








}


void test_OrderDTO_buyerTotalBeforeDiscount_is_assigned_from_json()
{








}




void test_OrderDTO_fake_is_assigned_from_json()
{




    bourne::json input =
    {
        "fake", true
    };

    OrderDTO obj(input.dump());

    TEST_ASSERT(true == obj.isFake());




}






void test_OrderDTO_notes_is_assigned_from_json()
{


    bourne::json input =
    {
        "notes", "hello"
    };

    OrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNotes().c_str());






}



void test_OrderDTO_cancelRequested_is_assigned_from_json()
{




    bourne::json input =
    {
        "cancelRequested", true
    };

    OrderDTO obj(input.dump());

    TEST_ASSERT(true == obj.isCancelRequested());




}


void test_OrderDTO_expiryDate_is_assigned_from_json()
{


    bourne::json input =
    {
        "expiryDate", "hello"
    };

    OrderDTO obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExpiryDate().c_str());






}



void test_OrderDTO_id_is_converted_to_json()
{



    bourne::json input =
    {
        "id", 1
    };

    OrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);

}




void test_OrderDTO_creationDate_is_converted_to_json()
{

    bourne::json input =
    {
        "creationDate", "hello"
    };

    OrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["creationDate"] == output["creationDate"]);



}


void test_OrderDTO_updatedAt_is_converted_to_json()
{

    bourne::json input =
    {
        "updatedAt", "hello"
    };

    OrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updatedAt"] == output["updatedAt"]);



}



void test_OrderDTO_itemsTotal_is_converted_to_json()
{




}


void test_OrderDTO_deliveryTotal_is_converted_to_json()
{




}


void test_OrderDTO_buyerItemsTotal_is_converted_to_json()
{




}


void test_OrderDTO_buyerTotal_is_converted_to_json()
{




}


void test_OrderDTO_buyerItemsTotalBeforeDiscount_is_converted_to_json()
{




}


void test_OrderDTO_buyerTotalBeforeDiscount_is_converted_to_json()
{




}




void test_OrderDTO_fake_is_converted_to_json()
{


    bourne::json input =
    {
        "fake", true
    };

    OrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fake"] == output["fake"]);


}






void test_OrderDTO_notes_is_converted_to_json()
{

    bourne::json input =
    {
        "notes", "hello"
    };

    OrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["notes"] == output["notes"]);



}



void test_OrderDTO_cancelRequested_is_converted_to_json()
{


    bourne::json input =
    {
        "cancelRequested", true
    };

    OrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cancelRequested"] == output["cancelRequested"]);


}


void test_OrderDTO_expiryDate_is_converted_to_json()
{

    bourne::json input =
    {
        "expiryDate", "hello"
    };

    OrderDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expiryDate"] == output["expiryDate"]);



}


