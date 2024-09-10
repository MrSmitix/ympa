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

use_ok('WWW::OpenAPIClient::FeedsApi');

my $api = WWW::OpenAPIClient::FeedsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::FeedsApi');

#
# get_feed test
#
# uncomment below and update the test
#my $get_feed_campaign_id = undef; # replace NULL with a proper value
#my $get_feed_feed_id = undef; # replace NULL with a proper value
#my $get_feed_result = $api->get_feed(campaign_id => $get_feed_campaign_id, feed_id => $get_feed_feed_id);

#
# get_feed_index_logs test
#
# uncomment below and update the test
#my $get_feed_index_logs_campaign_id = undef; # replace NULL with a proper value
#my $get_feed_index_logs_feed_id = undef; # replace NULL with a proper value
#my $get_feed_index_logs_limit = undef; # replace NULL with a proper value
#my $get_feed_index_logs_published_time_from = undef; # replace NULL with a proper value
#my $get_feed_index_logs_published_time_to = undef; # replace NULL with a proper value
#my $get_feed_index_logs_status = undef; # replace NULL with a proper value
#my $get_feed_index_logs_result = $api->get_feed_index_logs(campaign_id => $get_feed_index_logs_campaign_id, feed_id => $get_feed_index_logs_feed_id, limit => $get_feed_index_logs_limit, published_time_from => $get_feed_index_logs_published_time_from, published_time_to => $get_feed_index_logs_published_time_to, status => $get_feed_index_logs_status);

#
# get_feeds test
#
# uncomment below and update the test
#my $get_feeds_campaign_id = undef; # replace NULL with a proper value
#my $get_feeds_result = $api->get_feeds(campaign_id => $get_feeds_campaign_id);

#
# refresh_feed test
#
# uncomment below and update the test
#my $refresh_feed_campaign_id = undef; # replace NULL with a proper value
#my $refresh_feed_feed_id = undef; # replace NULL with a proper value
#my $refresh_feed_result = $api->refresh_feed(campaign_id => $refresh_feed_campaign_id, feed_id => $refresh_feed_feed_id);

#
# set_feed_params test
#
# uncomment below and update the test
#my $set_feed_params_campaign_id = undef; # replace NULL with a proper value
#my $set_feed_params_feed_id = undef; # replace NULL with a proper value
#my $set_feed_params_set_feed_params_request = undef; # replace NULL with a proper value
#my $set_feed_params_result = $api->set_feed_params(campaign_id => $set_feed_params_campaign_id, feed_id => $set_feed_params_feed_id, set_feed_params_request => $set_feed_params_set_feed_params_request);


done_testing();
