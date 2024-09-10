
#include "GetChatInfoDTO.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetChatInfoDTO_chatId_is_assigned_from_json()
{






    bourne::json input =
    {
        "chatId", 1
    };

    GetChatInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getChatId());


}


void test_GetChatInfoDTO_orderId_is_assigned_from_json()
{






    bourne::json input =
    {
        "orderId", 1
    };

    GetChatInfoDTO obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderId());


}




void test_GetChatInfoDTO_createdAt_is_assigned_from_json()
{








}


void test_GetChatInfoDTO_updatedAt_is_assigned_from_json()
{








}



void test_GetChatInfoDTO_chatId_is_converted_to_json()
{



    bourne::json input =
    {
        "chatId", 1
    };

    GetChatInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["chatId"] == output["chatId"]);

}


void test_GetChatInfoDTO_orderId_is_converted_to_json()
{



    bourne::json input =
    {
        "orderId", 1
    };

    GetChatInfoDTO obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["orderId"] == output["orderId"]);

}




void test_GetChatInfoDTO_createdAt_is_converted_to_json()
{




}


void test_GetChatInfoDTO_updatedAt_is_converted_to_json()
{




}


