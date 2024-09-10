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
package WWW::OpenAPIClient::GoodsFeedbackApi;

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
# delete_goods_feedback_comment
#
# Удаление комментария к отзыву
#
# @param int $business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param DeleteGoodsFeedbackCommentRequest $delete_goods_feedback_comment_request  (required)
{
    my $params = {
    'business_id' => {
        data_type => 'int',
        description => 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'delete_goods_feedback_comment_request' => {
        data_type => 'DeleteGoodsFeedbackCommentRequest',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_goods_feedback_comment' } = {
        summary => 'Удаление комментария к отзыву',
        params => $params,
        returns => 'EmptyApiResponse',
        };
}
# @return EmptyApiResponse
#
sub delete_goods_feedback_comment {
    my ($self, %args) = @_;

    # verify the required parameter 'business_id' is set
    unless (exists $args{'business_id'}) {
      croak("Missing the required parameter 'business_id' when calling delete_goods_feedback_comment");
    }

    # verify the required parameter 'delete_goods_feedback_comment_request' is set
    unless (exists $args{'delete_goods_feedback_comment_request'}) {
      croak("Missing the required parameter 'delete_goods_feedback_comment_request' when calling delete_goods_feedback_comment");
    }

    # parse inputs
    my $_resource_path = '/businesses/{businessId}/goods-feedback/comments/delete';

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

    # path params
    if ( exists $args{'business_id'}) {
        my $_base_variable = "{" . "businessId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'business_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'delete_goods_feedback_comment_request'}) {
        $_body_data = $args{'delete_goods_feedback_comment_request'};
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
    my $_response_object = $self->{api_client}->deserialize('EmptyApiResponse', $response);
    return $_response_object;
}

#
# get_goods_feedback_comments
#
# Получение комментариев к отзыву
#
# @param int $business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param GetGoodsFeedbackCommentsRequest $get_goods_feedback_comments_request  (required)
# @param string $page_token Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
# @param int $limit Количество значений на одной странице.  (optional)
{
    my $params = {
    'business_id' => {
        data_type => 'int',
        description => 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'get_goods_feedback_comments_request' => {
        data_type => 'GetGoodsFeedbackCommentsRequest',
        description => '',
        required => '1',
    },
    'page_token' => {
        data_type => 'string',
        description => 'Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ',
        required => '0',
    },
    'limit' => {
        data_type => 'int',
        description => 'Количество значений на одной странице. ',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_goods_feedback_comments' } = {
        summary => 'Получение комментариев к отзыву',
        params => $params,
        returns => 'GetGoodsFeedbackCommentsResponse',
        };
}
# @return GetGoodsFeedbackCommentsResponse
#
sub get_goods_feedback_comments {
    my ($self, %args) = @_;

    # verify the required parameter 'business_id' is set
    unless (exists $args{'business_id'}) {
      croak("Missing the required parameter 'business_id' when calling get_goods_feedback_comments");
    }

    # verify the required parameter 'get_goods_feedback_comments_request' is set
    unless (exists $args{'get_goods_feedback_comments_request'}) {
      croak("Missing the required parameter 'get_goods_feedback_comments_request' when calling get_goods_feedback_comments");
    }

    # parse inputs
    my $_resource_path = '/businesses/{businessId}/goods-feedback/comments';

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

    # query params
    if ( exists $args{'page_token'}) {
        $query_params->{'page_token'} = $self->{api_client}->to_query_value($args{'page_token'});
    }

    # query params
    if ( exists $args{'limit'}) {
        $query_params->{'limit'} = $self->{api_client}->to_query_value($args{'limit'});
    }

    # path params
    if ( exists $args{'business_id'}) {
        my $_base_variable = "{" . "businessId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'business_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'get_goods_feedback_comments_request'}) {
        $_body_data = $args{'get_goods_feedback_comments_request'};
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
    my $_response_object = $self->{api_client}->deserialize('GetGoodsFeedbackCommentsResponse', $response);
    return $_response_object;
}

#
# get_goods_feedbacks
#
# Получение отзывов о товарах продавца
#
# @param int $business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param string $page_token Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
# @param int $limit Количество значений на одной странице.  (optional)
# @param GetGoodsFeedbackRequest $get_goods_feedback_request  (optional)
{
    my $params = {
    'business_id' => {
        data_type => 'int',
        description => 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'page_token' => {
        data_type => 'string',
        description => 'Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ',
        required => '0',
    },
    'limit' => {
        data_type => 'int',
        description => 'Количество значений на одной странице. ',
        required => '0',
    },
    'get_goods_feedback_request' => {
        data_type => 'GetGoodsFeedbackRequest',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_goods_feedbacks' } = {
        summary => 'Получение отзывов о товарах продавца',
        params => $params,
        returns => 'GetGoodsFeedbackResponse',
        };
}
# @return GetGoodsFeedbackResponse
#
sub get_goods_feedbacks {
    my ($self, %args) = @_;

    # verify the required parameter 'business_id' is set
    unless (exists $args{'business_id'}) {
      croak("Missing the required parameter 'business_id' when calling get_goods_feedbacks");
    }

    # parse inputs
    my $_resource_path = '/businesses/{businessId}/goods-feedback';

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

    # query params
    if ( exists $args{'page_token'}) {
        $query_params->{'page_token'} = $self->{api_client}->to_query_value($args{'page_token'});
    }

    # query params
    if ( exists $args{'limit'}) {
        $query_params->{'limit'} = $self->{api_client}->to_query_value($args{'limit'});
    }

    # path params
    if ( exists $args{'business_id'}) {
        my $_base_variable = "{" . "businessId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'business_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'get_goods_feedback_request'}) {
        $_body_data = $args{'get_goods_feedback_request'};
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
    my $_response_object = $self->{api_client}->deserialize('GetGoodsFeedbackResponse', $response);
    return $_response_object;
}

#
# skip_goods_feedbacks_reaction
#
# Отказ от ответа на отзывы
#
# @param int $business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param SkipGoodsFeedbackReactionRequest $skip_goods_feedback_reaction_request  (required)
{
    my $params = {
    'business_id' => {
        data_type => 'int',
        description => 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'skip_goods_feedback_reaction_request' => {
        data_type => 'SkipGoodsFeedbackReactionRequest',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'skip_goods_feedbacks_reaction' } = {
        summary => 'Отказ от ответа на отзывы',
        params => $params,
        returns => 'EmptyApiResponse',
        };
}
# @return EmptyApiResponse
#
sub skip_goods_feedbacks_reaction {
    my ($self, %args) = @_;

    # verify the required parameter 'business_id' is set
    unless (exists $args{'business_id'}) {
      croak("Missing the required parameter 'business_id' when calling skip_goods_feedbacks_reaction");
    }

    # verify the required parameter 'skip_goods_feedback_reaction_request' is set
    unless (exists $args{'skip_goods_feedback_reaction_request'}) {
      croak("Missing the required parameter 'skip_goods_feedback_reaction_request' when calling skip_goods_feedbacks_reaction");
    }

    # parse inputs
    my $_resource_path = '/businesses/{businessId}/goods-feedback/skip-reaction';

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

    # path params
    if ( exists $args{'business_id'}) {
        my $_base_variable = "{" . "businessId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'business_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'skip_goods_feedback_reaction_request'}) {
        $_body_data = $args{'skip_goods_feedback_reaction_request'};
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
    my $_response_object = $self->{api_client}->deserialize('EmptyApiResponse', $response);
    return $_response_object;
}

#
# update_goods_feedback_comment
#
# Добавление нового или изменение созданного комментария
#
# @param int $business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param UpdateGoodsFeedbackCommentRequest $update_goods_feedback_comment_request  (required)
{
    my $params = {
    'business_id' => {
        data_type => 'int',
        description => 'Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'update_goods_feedback_comment_request' => {
        data_type => 'UpdateGoodsFeedbackCommentRequest',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_goods_feedback_comment' } = {
        summary => 'Добавление нового или изменение созданного комментария',
        params => $params,
        returns => 'UpdateGoodsFeedbackCommentResponse',
        };
}
# @return UpdateGoodsFeedbackCommentResponse
#
sub update_goods_feedback_comment {
    my ($self, %args) = @_;

    # verify the required parameter 'business_id' is set
    unless (exists $args{'business_id'}) {
      croak("Missing the required parameter 'business_id' when calling update_goods_feedback_comment");
    }

    # verify the required parameter 'update_goods_feedback_comment_request' is set
    unless (exists $args{'update_goods_feedback_comment_request'}) {
      croak("Missing the required parameter 'update_goods_feedback_comment_request' when calling update_goods_feedback_comment");
    }

    # parse inputs
    my $_resource_path = '/businesses/{businessId}/goods-feedback/comments/update';

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

    # path params
    if ( exists $args{'business_id'}) {
        my $_base_variable = "{" . "businessId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'business_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'update_goods_feedback_comment_request'}) {
        $_body_data = $args{'update_goods_feedback_comment_request'};
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
    my $_response_object = $self->{api_client}->deserialize('UpdateGoodsFeedbackCommentResponse', $response);
    return $_response_object;
}

1;
