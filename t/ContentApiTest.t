=begin comment

Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::ContentApi');

my $api = WWW::OpenAPIClient::ContentApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ContentApi');

#
# get_category_content_parameters test
#
# uncomment below and update the test
#my $get_category_content_parameters_category_id = undef; # replace NULL with a proper value
#my $get_category_content_parameters_result = $api->get_category_content_parameters(category_id => $get_category_content_parameters_category_id);

#
# get_offer_cards_content_status test
#
# uncomment below and update the test
#my $get_offer_cards_content_status_business_id = undef; # replace NULL with a proper value
#my $get_offer_cards_content_status_page_token = undef; # replace NULL with a proper value
#my $get_offer_cards_content_status_limit = undef; # replace NULL with a proper value
#my $get_offer_cards_content_status_get_offer_cards_content_status_request = undef; # replace NULL with a proper value
#my $get_offer_cards_content_status_result = $api->get_offer_cards_content_status(business_id => $get_offer_cards_content_status_business_id, page_token => $get_offer_cards_content_status_page_token, limit => $get_offer_cards_content_status_limit, get_offer_cards_content_status_request => $get_offer_cards_content_status_get_offer_cards_content_status_request);

#
# update_offer_content test
#
# uncomment below and update the test
#my $update_offer_content_business_id = undef; # replace NULL with a proper value
#my $update_offer_content_update_offer_content_request = undef; # replace NULL with a proper value
#my $update_offer_content_result = $api->update_offer_content(business_id => $update_offer_content_business_id, update_offer_content_request => $update_offer_content_update_offer_content_request);


done_testing();
