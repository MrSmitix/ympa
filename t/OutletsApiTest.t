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

use_ok('WWW::OpenAPIClient::OutletsApi');

my $api = WWW::OpenAPIClient::OutletsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::OutletsApi');

#
# create_outlet test
#
# uncomment below and update the test
#my $create_outlet_campaign_id = undef; # replace NULL with a proper value
#my $create_outlet_change_outlet_request = undef; # replace NULL with a proper value
#my $create_outlet_result = $api->create_outlet(campaign_id => $create_outlet_campaign_id, change_outlet_request => $create_outlet_change_outlet_request);

#
# delete_outlet test
#
# uncomment below and update the test
#my $delete_outlet_campaign_id = undef; # replace NULL with a proper value
#my $delete_outlet_outlet_id = undef; # replace NULL with a proper value
#my $delete_outlet_result = $api->delete_outlet(campaign_id => $delete_outlet_campaign_id, outlet_id => $delete_outlet_outlet_id);

#
# get_outlet test
#
# uncomment below and update the test
#my $get_outlet_campaign_id = undef; # replace NULL with a proper value
#my $get_outlet_outlet_id = undef; # replace NULL with a proper value
#my $get_outlet_result = $api->get_outlet(campaign_id => $get_outlet_campaign_id, outlet_id => $get_outlet_outlet_id);

#
# get_outlets test
#
# uncomment below and update the test
#my $get_outlets_campaign_id = undef; # replace NULL with a proper value
#my $get_outlets_page_token = undef; # replace NULL with a proper value
#my $get_outlets_region_id = undef; # replace NULL with a proper value
#my $get_outlets_shop_outlet_code = undef; # replace NULL with a proper value
#my $get_outlets_region_id2 = undef; # replace NULL with a proper value
#my $get_outlets_result = $api->get_outlets(campaign_id => $get_outlets_campaign_id, page_token => $get_outlets_page_token, region_id => $get_outlets_region_id, shop_outlet_code => $get_outlets_shop_outlet_code, region_id2 => $get_outlets_region_id2);

#
# update_outlet test
#
# uncomment below and update the test
#my $update_outlet_campaign_id = undef; # replace NULL with a proper value
#my $update_outlet_outlet_id = undef; # replace NULL with a proper value
#my $update_outlet_change_outlet_request = undef; # replace NULL with a proper value
#my $update_outlet_result = $api->update_outlet(campaign_id => $update_outlet_campaign_id, outlet_id => $update_outlet_outlet_id, change_outlet_request => $update_outlet_change_outlet_request);


done_testing();
