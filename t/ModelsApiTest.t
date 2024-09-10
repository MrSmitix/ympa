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

use_ok('WWW::OpenAPIClient::ModelsApi');

my $api = WWW::OpenAPIClient::ModelsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ModelsApi');

#
# get_model test
#
# uncomment below and update the test
#my $get_model_model_id = undef; # replace NULL with a proper value
#my $get_model_region_id = undef; # replace NULL with a proper value
#my $get_model_currency = undef; # replace NULL with a proper value
#my $get_model_result = $api->get_model(model_id => $get_model_model_id, region_id => $get_model_region_id, currency => $get_model_currency);

#
# get_model_offers test
#
# uncomment below and update the test
#my $get_model_offers_model_id = undef; # replace NULL with a proper value
#my $get_model_offers_region_id = undef; # replace NULL with a proper value
#my $get_model_offers_currency = undef; # replace NULL with a proper value
#my $get_model_offers_order_by_price = undef; # replace NULL with a proper value
#my $get_model_offers_count = undef; # replace NULL with a proper value
#my $get_model_offers_page = undef; # replace NULL with a proper value
#my $get_model_offers_result = $api->get_model_offers(model_id => $get_model_offers_model_id, region_id => $get_model_offers_region_id, currency => $get_model_offers_currency, order_by_price => $get_model_offers_order_by_price, count => $get_model_offers_count, page => $get_model_offers_page);

#
# get_models test
#
# uncomment below and update the test
#my $get_models_region_id = undef; # replace NULL with a proper value
#my $get_models_get_models_request = undef; # replace NULL with a proper value
#my $get_models_currency = undef; # replace NULL with a proper value
#my $get_models_result = $api->get_models(region_id => $get_models_region_id, get_models_request => $get_models_get_models_request, currency => $get_models_currency);

#
# get_models_offers test
#
# uncomment below and update the test
#my $get_models_offers_region_id = undef; # replace NULL with a proper value
#my $get_models_offers_get_models_request = undef; # replace NULL with a proper value
#my $get_models_offers_currency = undef; # replace NULL with a proper value
#my $get_models_offers_order_by_price = undef; # replace NULL with a proper value
#my $get_models_offers_result = $api->get_models_offers(region_id => $get_models_offers_region_id, get_models_request => $get_models_offers_get_models_request, currency => $get_models_offers_currency, order_by_price => $get_models_offers_order_by_price);

#
# search_models test
#
# uncomment below and update the test
#my $search_models_query = undef; # replace NULL with a proper value
#my $search_models_region_id = undef; # replace NULL with a proper value
#my $search_models_currency = undef; # replace NULL with a proper value
#my $search_models_page = undef; # replace NULL with a proper value
#my $search_models_page_size = undef; # replace NULL with a proper value
#my $search_models_result = $api->search_models(query => $search_models_query, region_id => $search_models_region_id, currency => $search_models_currency, page => $search_models_page, page_size => $search_models_page_size);


done_testing();
