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
package WWW::OpenAPIClient::OfferMappingsApi;

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
# get_offer_mapping_entries
#
# Список товаров в каталоге
#
# @param int $campaign_id Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param ARRAY[string] $offer_id Идентификатор товара в каталоге. (optional)
# @param ARRAY[string] $shop_sku Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  (optional)
# @param OfferMappingKindType $mapping_kind Тип маппинга. (optional)
# @param ARRAY[OfferProcessingStatusType] $status Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  (optional)
# @param ARRAY[OfferAvailabilityStatusType] $availability Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  (optional)
# @param ARRAY[int] $category_id Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  (optional)
# @param ARRAY[string] $vendor Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  (optional)
# @param string $page_token Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional)
# @param int $limit Количество значений на одной странице.  (optional)
{
    my $params = {
    'campaign_id' => {
        data_type => 'int',
        description => 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'offer_id' => {
        data_type => 'ARRAY[string]',
        description => 'Идентификатор товара в каталоге.',
        required => '0',
    },
    'shop_sku' => {
        data_type => 'ARRAY[string]',
        description => 'Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. ',
        required => '0',
    },
    'mapping_kind' => {
        data_type => 'OfferMappingKindType',
        description => 'Тип маппинга.',
        required => '0',
    },
    'status' => {
        data_type => 'ARRAY[OfferProcessingStatusType]',
        description => 'Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. ',
        required => '0',
    },
    'availability' => {
        data_type => 'ARRAY[OfferAvailabilityStatusType]',
        description => 'Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. ',
        required => '0',
    },
    'category_id' => {
        data_type => 'ARRAY[int]',
        description => 'Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке. ',
        required => '0',
    },
    'vendor' => {
        data_type => 'ARRAY[string]',
        description => 'Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. ',
        required => '0',
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
    __PACKAGE__->method_documentation->{ 'get_offer_mapping_entries' } = {
        summary => 'Список товаров в каталоге',
        params => $params,
        returns => 'GetOfferMappingEntriesResponse',
        };
}
# @return GetOfferMappingEntriesResponse
#
sub get_offer_mapping_entries {
    my ($self, %args) = @_;

    # verify the required parameter 'campaign_id' is set
    unless (exists $args{'campaign_id'}) {
      croak("Missing the required parameter 'campaign_id' when calling get_offer_mapping_entries");
    }

    # parse inputs
    my $_resource_path = '/campaigns/{campaignId}/offer-mapping-entries';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'offer_id'}) {
        $query_params->{'offer_id'} = $self->{api_client}->to_query_value($args{'offer_id'});
    }

    # query params
    if ( exists $args{'shop_sku'}) {
        $query_params->{'shop_sku'} = $self->{api_client}->to_query_value($args{'shop_sku'});
    }

    # query params
    if ( exists $args{'mapping_kind'}) {
        $query_params->{'mapping_kind'} = $self->{api_client}->to_query_value($args{'mapping_kind'});
    }

    # query params
    if ( exists $args{'status'}) {
        $query_params->{'status'} = $self->{api_client}->to_query_value($args{'status'});
    }

    # query params
    if ( exists $args{'availability'}) {
        $query_params->{'availability'} = $self->{api_client}->to_query_value($args{'availability'});
    }

    # query params
    if ( exists $args{'category_id'}) {
        $query_params->{'category_id'} = $self->{api_client}->to_query_value($args{'category_id'});
    }

    # query params
    if ( exists $args{'vendor'}) {
        $query_params->{'vendor'} = $self->{api_client}->to_query_value($args{'vendor'});
    }

    # query params
    if ( exists $args{'page_token'}) {
        $query_params->{'page_token'} = $self->{api_client}->to_query_value($args{'page_token'});
    }

    # query params
    if ( exists $args{'limit'}) {
        $query_params->{'limit'} = $self->{api_client}->to_query_value($args{'limit'});
    }

    # path params
    if ( exists $args{'campaign_id'}) {
        my $_base_variable = "{" . "campaignId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'campaign_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(OAuth )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('GetOfferMappingEntriesResponse', $response);
    return $_response_object;
}

#
# get_suggested_offer_mapping_entries
#
# Рекомендованные карточки для товаров
#
# @param int $campaign_id Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param GetSuggestedOfferMappingEntriesRequest $get_suggested_offer_mapping_entries_request  (required)
{
    my $params = {
    'campaign_id' => {
        data_type => 'int',
        description => 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'get_suggested_offer_mapping_entries_request' => {
        data_type => 'GetSuggestedOfferMappingEntriesRequest',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_suggested_offer_mapping_entries' } = {
        summary => 'Рекомендованные карточки для товаров',
        params => $params,
        returns => 'GetSuggestedOfferMappingEntriesResponse',
        };
}
# @return GetSuggestedOfferMappingEntriesResponse
#
sub get_suggested_offer_mapping_entries {
    my ($self, %args) = @_;

    # verify the required parameter 'campaign_id' is set
    unless (exists $args{'campaign_id'}) {
      croak("Missing the required parameter 'campaign_id' when calling get_suggested_offer_mapping_entries");
    }

    # verify the required parameter 'get_suggested_offer_mapping_entries_request' is set
    unless (exists $args{'get_suggested_offer_mapping_entries_request'}) {
      croak("Missing the required parameter 'get_suggested_offer_mapping_entries_request' when calling get_suggested_offer_mapping_entries");
    }

    # parse inputs
    my $_resource_path = '/campaigns/{campaignId}/offer-mapping-entries/suggestions';

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
    if ( exists $args{'campaign_id'}) {
        my $_base_variable = "{" . "campaignId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'campaign_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'get_suggested_offer_mapping_entries_request'}) {
        $_body_data = $args{'get_suggested_offer_mapping_entries_request'};
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
    my $_response_object = $self->{api_client}->deserialize('GetSuggestedOfferMappingEntriesResponse', $response);
    return $_response_object;
}

#
# update_offer_mapping_entries
#
# Добавление и редактирование товаров в каталоге
#
# @param int $campaign_id Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  (required)
# @param UpdateOfferMappingEntryRequest $update_offer_mapping_entry_request  (required)
{
    my $params = {
    'campaign_id' => {
        data_type => 'int',
        description => 'Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ',
        required => '1',
    },
    'update_offer_mapping_entry_request' => {
        data_type => 'UpdateOfferMappingEntryRequest',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_offer_mapping_entries' } = {
        summary => 'Добавление и редактирование товаров в каталоге',
        params => $params,
        returns => 'EmptyApiResponse',
        };
}
# @return EmptyApiResponse
#
sub update_offer_mapping_entries {
    my ($self, %args) = @_;

    # verify the required parameter 'campaign_id' is set
    unless (exists $args{'campaign_id'}) {
      croak("Missing the required parameter 'campaign_id' when calling update_offer_mapping_entries");
    }

    # verify the required parameter 'update_offer_mapping_entry_request' is set
    unless (exists $args{'update_offer_mapping_entry_request'}) {
      croak("Missing the required parameter 'update_offer_mapping_entry_request' when calling update_offer_mapping_entries");
    }

    # parse inputs
    my $_resource_path = '/campaigns/{campaignId}/offer-mapping-entries/updates';

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
    if ( exists $args{'campaign_id'}) {
        my $_base_variable = "{" . "campaignId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'campaign_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'update_offer_mapping_entry_request'}) {
        $_body_data = $args{'update_offer_mapping_entry_request'};
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

1;
