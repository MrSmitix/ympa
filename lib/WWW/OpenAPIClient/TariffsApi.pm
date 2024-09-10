=begin comment

Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

The version of the OpenAPI document: LATEST

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::TariffsApi;

require 5.6.0;
use strict;
use warnings;
use utf8;
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# calculate_tariffs
#
# Калькулятор стоимости услуг
#
# @param CalculateTariffsRequest $calculate_tariffs_request  (required)
{
    my $params = {
    'calculate_tariffs_request' => {
        data_type => 'CalculateTariffsRequest',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculate_tariffs' } = {
        summary => 'Калькулятор стоимости услуг',
        params => $params,
        returns => 'CalculateTariffsResponse',
        };
}
# @return CalculateTariffsResponse
#
sub calculate_tariffs {
    my ($self, %args) = @_;

    # verify the required parameter 'calculate_tariffs_request' is set
    unless (exists $args{'calculate_tariffs_request'}) {
      croak("Missing the required parameter 'calculate_tariffs_request' when calling calculate_tariffs");
    }

    # parse inputs
    my $_resource_path = '/tariffs/calculate';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    my $_body_data;
    # body params
    if ( exists $args{'calculate_tariffs_request'}) {
        $_body_data = $args{'calculate_tariffs_request'};
    }

    # authentication setting, if any
    my $auth_settings = [qw(OAuth )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('CalculateTariffsResponse', $response);
    return $_response_object;
}

1;
